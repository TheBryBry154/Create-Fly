package evy.evy.vsflyfabric1_20_1;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.joml.Vector3d;
import org.joml.Vector3dc;
import org.valkyrienskies.core.api.ships.Ship;
import org.valkyrienskies.core.api.ships.ServerShip;
import org.valkyrienskies.core.api.ships.properties.ShipTransform;
import org.valkyrienskies.mod.common.VSGameUtilsKt;

import java.util.List;

public class VsflyMagnetBlock extends Block {
    public VsflyMagnetBlock(FabricBlockSettings fabricBlockSettings) {
        super(fabricBlockSettings
                .instrument(Instrument.IRON_XYLOPHONE)
                .requiresTool()
                .strength(5.0F, 10.0F)
                .sounds(BlockSoundGroup.METAL));
    }

    // Method to attract nearby ship entities
    public void attractNearbyBlocks(World world, BlockPos pos) {
        // Get all ship entities in the area
        Box box = new Box(
                pos.getX() - 10, pos.getY() - 10, pos.getZ() - 10,
                pos.getX() + 10, pos.getY() + 10, pos.getZ() + 10
        );
        Iterable<org.valkyrienskies.core.api.ships.Ship> ships = VSGameUtilsKt.getShipsIntersecting(world, box);

        for (org.valkyrienskies.core.api.ships.Ship ship : ships) {
            if (!(ship instanceof ServerShip)) continue;

            // Get the ship's position
            Vector3dc shipPos = ship.getTransform().getPositionInWorld();
            double distanceSquared = shipPos.distanceSquared(pos.getX(), pos.getY(), pos.getZ());

            if (distanceSquared < 16.0) { // Check if within attraction range (4 blocks)
                // Calculate the force to apply toward the magnet block
                double attractionForce = 0.05; // Adjust strength of attraction

                // Calculate direction vector
                Vector3d direction = new Vector3d(
                        pos.getX() - shipPos.x(),
                        pos.getY() - shipPos.y(),
                        pos.getZ() - shipPos.z()
                ).normalize();

                // Apply force towards the magnet block
                Vector3d force = direction.mul(attractionForce);
                Ship.applyInvariantForce(force);
            }
        }
    }

    public interface Ship {
        static void applyInvariantForce(Vector3d force) {

        }

        ShipTransform getTransform();
    }
    // This method should be called when the block is added
    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean moved) {
        super.onBlockAdded(state, world, pos, oldState, moved);
        if (!world.isClient()) {
            attractNearbyBlocks(world, pos);
        }
    }
}
