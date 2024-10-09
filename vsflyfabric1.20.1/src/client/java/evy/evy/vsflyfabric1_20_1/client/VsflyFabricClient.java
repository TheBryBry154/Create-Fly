package evy.evy.vsflyfabric1_20_1.client;

import evy.evy.vsflyfabric1_20_1.*;
import evy.evy.vsflyfabric1_20_1.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

import static evy.evy.vsflyfabric1_20_1.ModBlocks.*;

public class VsflyFabricClient implements ClientModInitializer {

    private static KeyBinding navigationKeyBinding;

    @Override
    public void onInitializeClient() {
        // Register the blocks
        // ModBlocks.registerModBlocks();

        // Set render layers for blocks
        BlockRenderLayerMap.INSTANCE.putBlock(VSFLY_BALLOON_BLOCK, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(VSFLY_MAGNET_BLOCK, RenderLayer.getSolid());
        BlockRenderLayerMap.INSTANCE.putBlock(VSFLY_ANCHOR_BASE_BLOCK, RenderLayer.getSolid());
        BlockRenderLayerMap.INSTANCE.putBlock(VSFLY_BURNER_BLOCK, RenderLayer.getCutout());

        // Register screen handlers
        HandledScreens.register(ModScreenHandlers.NAVIGATION_TABLE_SCREEN_HANDLER, VsflyNavigationTableScreen::new);

        // Register custom key bindings
        navigationKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.vsflyfabric1_20_1.navtable",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_N,
                "category.vsflyfabric1_20_1.navigation"
        ));

        // Key binding logic
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (navigationKeyBinding.wasPressed()) {
                // Logic for key press
                // Uncomment the line below to open the navigation table screen when the key is pressed
                // client.setScreen(new VsflyNavigationTableScreen());
            }
        });

        // Register Items
        //registerItem("vsfly_anchor_rope_item", Vsflyfabric1_20_1.VSFLY_ANCHOR_ROPE_ITEM); // Ensure this item is defined and initialized properly
    }

    private void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(Vsflyfabric1_20_1.MOD_ID, name), item);
    }
}
