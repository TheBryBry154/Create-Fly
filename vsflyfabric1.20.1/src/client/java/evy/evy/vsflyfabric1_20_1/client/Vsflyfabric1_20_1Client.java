package evy.evy.vsflyfabric1_20_1.client;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
public class Vsflyfabric1_20_1Client implements ClientModInitializer {
    public static final String MOD_ID = "vsflyfabric1_20_1";
    @Override
    public void onInitializeClient() {
        // Register any client-side renderers or effects
        registerBlockRenderers();
    }
    private void registerBlockRenderers() {
        // You can register custom renderers or effects for your blocks here.
        // Example: BlockRenderRegistry.INSTANCE.registerBlockRenderer(...)
    }
}