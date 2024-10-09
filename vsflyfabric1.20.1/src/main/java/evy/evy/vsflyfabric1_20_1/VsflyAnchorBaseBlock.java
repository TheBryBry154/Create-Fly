package evy.evy.vsflyfabric1_20_1;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
public class VsflyAnchorBaseBlock extends Block {
    public VsflyAnchorBaseBlock(FabricBlockSettings fabricBlockSettings) {
        super(AbstractBlock.Settings.create()
                .instrument(Instrument.BASEDRUM)
                .requiresTool()
                .strength(3.0F, 9.0F)
                .sounds(BlockSoundGroup.STONE));
    }
    // Implement anchor logic
}