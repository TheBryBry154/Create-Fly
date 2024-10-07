package evy.evy.createflyfabricnew.client;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;

public class PhysicsUpdatePacket {
    private final BlockPos pos;
    private final double x, y, z;

    public PhysicsUpdatePacket(BlockPos pos, double x, double y, double z) {
        this.pos = pos;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void write(PacketByteBuf buf) {
        buf.writeBlockPos(pos);
        buf.writeDouble(x);
        buf.writeDouble(y);
        buf.writeDouble(z);
    }

    public static PhysicsUpdatePacket read(PacketByteBuf buf) {
        BlockPos pos = buf.readBlockPos();
        double x = buf.readDouble();
        double y = buf.readDouble();
        double z = buf.readDouble();
        return new PhysicsUpdatePacket(pos, x, y, z);
    }

    public BlockPos getPos() {
        return pos;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
}
