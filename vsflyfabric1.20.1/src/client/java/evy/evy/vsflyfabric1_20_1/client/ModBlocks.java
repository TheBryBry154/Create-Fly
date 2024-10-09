package evy.evy.vsflyfabric1_20_1.client;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
public class ModBlocks {
    public static final String MOD_ID = "vsflyfabric1_20_1"; // Your mod ID
    // Define your blocks
    public static final Block VSFLY_MAGNET_BLOCK = createBlock("vsfly_magnet_block", MapColor.IRON_GRAY, 4.0f, BlockSoundGroup.METAL);
    public static final Block VSFLY_BALLOON_BLOCK = createBlock("vsfly_balloon_block", MapColor.WHITE, 1.0f, BlockSoundGroup.WOOL);
    public static final Block VSFLY_ANCHOR_BASE_BLOCK = createBlock("vsfly_anchor_base_block", MapColor.STONE_GRAY, 3.0f, BlockSoundGroup.STONE);
    public static final Block VSFLY_BURNER_BLOCK = createBlock("vsfly_burner_block", MapColor.IRON_GRAY, 4.0f, BlockSoundGroup.METAL);
    public static final Block VSFLY_NAVIGATION_TABLE_BLOCK = createBlock("vsfly_navigation_table_block", MapColor.OAK_TAN, 2.5f, BlockSoundGroup.WOOD);
    public static final Block VSFLY_CALIBRATED_BED_BLOCK = createBlock("vsfly_calibrated_bed_block", MapColor.WHITE, 0.2f, BlockSoundGroup.WOOL);
    private static Block createBlock(String name, MapColor mapColor, float strength, BlockSoundGroup soundGroup) {
        return new Block(FabricBlockSettings.of().strength(strength).sounds(soundGroup)); // Set the map color here
    }
    private static void setBlock(String vsflyBalloonBlock) {
    }
    private static void registerBlock(String name, Block block) {
        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, name), block);
        System.out.println("Registered " + name);
    }
}