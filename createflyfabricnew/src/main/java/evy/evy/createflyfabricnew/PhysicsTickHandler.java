package evy.evy.createflyfabricnew;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class PhysicsTickHandler implements ServerTickEvents.EndTick {
    @Override
    public void onEndTick(net.minecraft.server.MinecraftServer server) {
        PhysicsEngine.update();
    }

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(new PhysicsTickHandler());
    }
}