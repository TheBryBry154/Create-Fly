package evy.evy.vsflyfabric1_20_1;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;
public class VsflyBurnerBlock extends Block {
    public VsflyBurnerBlock(FabricBlockSettings fabricBlockSettings) {
        super(AbstractBlock.Settings.create()
                .instrument(Instrument.BASEDRUM)
                .requiresTool()
                .strength(4.0F, 10.0F)
                .sounds(BlockSoundGroup.STONE));
    }
    // Implement burning and heat generation logic
}