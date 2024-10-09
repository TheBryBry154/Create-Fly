package evy.evy.vsflyfabric1_20_1;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.valkyrienskies.mod.common.VSGameUtilsKt;

public class Vsflyfabric1_20_1 implements ModInitializer {

    public static final String MOD_ID = "vsflyfabric1_20_1";

    public static final Item VSFLY_ANCHOR_ROPE_ITEM = new VsflyAnchorRopeItem(new FabricItemSettings());

    @Override
    public void onInitialize() {
        // Register Blocks
        ModBlocks.registerModBlocks();

        // Register Items
        registerItem("vsfly_anchor_rope_item", VSFLY_ANCHOR_ROPE_ITEM);

        // Register Block Items
        registerBlockItem("vsfly_magnet_block", ModBlocks.VSFLY_MAGNET_BLOCK);
        registerBlockItem("vsfly_balloon_block", ModBlocks.VSFLY_BALLOON_BLOCK);
        registerBlockItem("vsfly_anchor_base_block", ModBlocks.VSFLY_ANCHOR_BASE_BLOCK);
        registerBlockItem("vsfly_burner_block", ModBlocks.VSFLY_BURNER_BLOCK);
        registerBlockItem("vsfly_navigation_table_block", ModBlocks.VSFLY_NAVIGATION_TABLE_BLOCK);
        registerBlockItem("vsfly_calibrated_bed_block", ModBlocks.VSFLY_CALIBRATED_BED_BLOCK);
    }

    private void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, name), item);
    }
}
