package evy.evy.vsflyfabric1_20_1;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
public class VsflyNavigationTableBlock extends Block {
    public VsflyNavigationTableBlock(FabricBlockSettings fabricBlockSettings) {
        super(AbstractBlock.Settings.create()
                .instrument(Instrument.BANJO)
                .strength(2.5F, 3.5F)
                .sounds(BlockSoundGroup.WOOD));
    }
    // Implement the navigation logic and GUI handling
}