package evy.evy.createflyfabricnew.client;

import evy.evy.createflyfabricnew.PhysicsUpdatePacket;
import evy.evy.createflyfabricnew.PhysicsStickItem;
import evy.evy.createflyfabricnew.PhysicsEngine;
import evy.evy.createflyfabricnew.PhysicsTickHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PhysicsMod implements ModInitializer {
    public static final String MOD_ID = "physicsmod";
    public static final Item PHYSICS_STICK = new PhysicsStickItem(new FabricItemSettings());
    public static final Identifier PHYSICS_UPDATE_PACKET_ID = new Identifier(MOD_ID, "physics_update");

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "physics_stick"), PHYSICS_STICK);
        PhysicsTickHandler.register();

        ServerPlayNetworking.registerGlobalReceiver(PHYSICS_UPDATE_PACKET_ID, (server, player, handler, buf, responseSender) -> {
            PhysicsUpdatePacket packet = PhysicsUpdatePacket.read(buf);
            server.execute(() -> {
                // Update physics object on server
                PhysicsEngine.updatePhysicsObject(packet.getPos(), packet.getX(), packet.getY(), packet.getZ());
            });
        });
    }
}
