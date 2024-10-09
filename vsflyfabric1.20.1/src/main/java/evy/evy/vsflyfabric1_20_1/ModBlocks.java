package evy.evy.vsflyfabric1_20_1;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.block.MapColor;
public class ModBlocks {
    public static final Block VSFLY_MAGNET_BLOCK = new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.IRON_GRAY)
            .strength(4.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL));
    public static final Block VSFLY_BALLOON_BLOCK = new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.WHITE)
            .strength(1.0f)
            .sounds(BlockSoundGroup.WOOL)
            .nonOpaque());
    public static final Block VSFLY_ANCHOR_BASE_BLOCK = new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.STONE_GRAY)
            .strength(3.0f, 9.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE));
    public static final Block VSFLY_BURNER_BLOCK = new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.IRON_GRAY)
            .strength(4.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.METAL));
    public static final Block VSFLY_NAVIGATION_TABLE_BLOCK = new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.OAK_TAN)
            .strength(2.5f)
            .sounds(BlockSoundGroup.WOOD));
    public static final Block VSFLY_CALIBRATED_BED_BLOCK = new Block(AbstractBlock.Settings.create()
            .mapColor(MapColor.WHITE)
            .strength(0.2f)
            .sounds(BlockSoundGroup.WOOL)
            .nonOpaque());
    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks...");
        Registry.register(Registries.BLOCK, new Identifier(Vsflyfabric1_20_1.MOD_ID, "vsfly_magnet_block"), VSFLY_MAGNET_BLOCK);
        System.out.println("Registered VSFLY_MAGNET_BLOCK");
        Registry.register(Registries.BLOCK, new Identifier(Vsflyfabric1_20_1.MOD_ID, "vsfly_balloon_block"), VSFLY_BALLOON_BLOCK);
        System.out.println("Registered VSFLY_BALLOON_BLOCK");
        Registry.register(Registries.BLOCK, new Identifier(Vsflyfabric1_20_1.MOD_ID, "vsfly_anchor_base_block"), VSFLY_ANCHOR_BASE_BLOCK);
        System.out.println("Registered VSFLY_ANCHOR_BASE_BLOCK");
        Registry.register(Registries.BLOCK, new Identifier(Vsflyfabric1_20_1.MOD_ID, "vsfly_burner_block"), VSFLY_BURNER_BLOCK);
        System.out.println("Registered VSFLY_BURNER_BLOCK");
        Registry.register(Registries.BLOCK, new Identifier(Vsflyfabric1_20_1.MOD_ID, "vsfly_navigation_table_block"), VSFLY_NAVIGATION_TABLE_BLOCK);
        System.out.println("Registered VSFLY_NAVIGATION_TABLE_BLOCK");
        Registry.register(Registries.BLOCK, new Identifier(Vsflyfabric1_20_1.MOD_ID, "vsfly_calibrated_bed_block"), VSFLY_CALIBRATED_BED_BLOCK);
        System.out.println("Registered VSFLY_CALIBRATED_BED_BLOCK");
    }
}