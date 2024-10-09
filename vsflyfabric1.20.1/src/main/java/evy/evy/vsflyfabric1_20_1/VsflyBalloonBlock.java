package evy.evy.vsflyfabric1_20_1;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;

public class VsflyBalloonBlock extends Block {
    public VsflyBalloonBlock(FabricBlockSettings fabricBlockSettings) {
        super(AbstractBlock.Settings.create()
                .instrument(Instrument.FLUTE)
                .strength(0.5F, 0.5F)
                .sounds(BlockSoundGroup.WOOL));
    }

    // Add lifting behavior
}
