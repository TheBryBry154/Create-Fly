package evy.evy.createflyfabricnew;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PhysicsStickItem extends Item {
    public PhysicsStickItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        PlayerEntity player = context.getPlayer();

        if (!world.isClient && player != null) {
            BlockState state = world.getBlockState(pos);
            PhysicsEngine.addPhysicsToBlock(world, pos, state);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}
