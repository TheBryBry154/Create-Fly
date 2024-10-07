package evy.evy.createflyfabricnew;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PhysicsMod implements ModInitializer {
    public static final String MOD_ID = "physicsmod";
    public static final Item PHYSICS_STICK = new PhysicsStickItem(new FabricItemSettings());

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "physics_stick"), PHYSICS_STICK);
    }
}
