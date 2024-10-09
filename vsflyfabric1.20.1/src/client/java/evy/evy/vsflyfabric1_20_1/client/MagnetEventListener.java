package evy.evy.vsflyfabric1_20_1.client;

import evy.evy.vsflyfabric1_20_1.Vsflyfabric1_20_1;
import evy.evy.vsflyfabric1_20_1.VsflyMagnetBlock; // Adjust path as necessary
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.client.MinecraftClient;
import net.minecraft.particle.ParticleTypes;

public class MagnetEventListener implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        registerEvents();
    }

    private void registerEvents() {
        UseBlockCallback.EVENT.register(this::onBlockUse);
    }

    private ActionResult onBlockUse(PlayerEntity player, World world, Hand hand, BlockHitResult hit) {
        BlockPos pos = hit.getBlockPos();
        BlockState state = world.getBlockState(pos);

        if (state.getBlock() instanceof VsflyMagnetBlock) {
            // Handle the interaction with the magnet block here
            spawnBlockPlaceParticles(pos);
            // You can also implement additional logic for magnet behavior if needed

            return ActionResult.SUCCESS; // Return success if handled
        }
        return ActionResult.PASS; // Continue the event chain for other blocks
    }

    private void spawnBlockPlaceParticles(BlockPos pos) {
        spawnAttractionParticles(new Vec3d(pos.getX(), pos.getY(), pos.getZ()));
    }

    private void spawnAttractionParticles(Vec3d position) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world != null) {
            client.world.addParticle(ParticleTypes.ENCHANTED_HIT,
                    position.x, position.y, position.z,
                    0, 0, 0); // Adjust particle velocity as necessary
        }
    }
}
