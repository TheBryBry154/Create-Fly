package evy.evy.createflyfabricnew.client;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class PhysicsEngine {
    private static final Map<BlockPos, PhysicsObject> physicsObjects = new HashMap<>();

    public static void addPhysicsToBlock(World world, BlockPos pos, BlockState state) {
        if (!physicsObjects.containsKey(pos)) {
            PhysicsObject object = new PhysicsObject(world, pos, state);
            physicsObjects.put(pos, object);
        }
    }

    public static void update() {
        for (PhysicsObject object : physicsObjects.values()) {
            object.update();
        }
    }

    public static Collection<PhysicsObject> getPhysicsObjects() {
        return physicsObjects.values();
    }

    public static void updatePhysicsObject(BlockPos pos, double x, double y, double z) {
    }

    public static class PhysicsObject {
        private final World world;
        private BlockPos pos;
        private final BlockState state;
        private double velocityY = 0;

        public PhysicsObject(World world, BlockPos pos, BlockState state) {
            this.world = world;
            this.pos = pos;
            this.state = state;
        }

        public void update() {
            // Simple gravity simulation
            velocityY -= 0.05;
            BlockPos newPos = pos.down();

            if (world.getBlockState(newPos).isAir()) {
                world.setBlockState(pos, world.getBlockState(newPos));
                world.setBlockState(newPos, state);
                pos = newPos;
            } else {
                velocityY = 0;
            }
        }

        public double getX() {
            return pos.getX();
        }

        public double getY() {
            return pos.getY();
        }

        public double getZ() {
            return pos.getZ();
        }

        public BlockState getBlockState() {
            return state;
        }
    }
}
