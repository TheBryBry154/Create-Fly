package evy.evy.vsflyfabric1_20_1;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.enums.Instrument;
import net.minecraft.sound.BlockSoundGroup;

public class VsflyCalibratedBedBlock extends Block {
    public VsflyCalibratedBedBlock(FabricBlockSettings fabricBlockSettings) {
        super(AbstractBlock.Settings.create()
                .instrument(Instrument.HARP)
                .strength(0.8F, 0.8F)
                .sounds(BlockSoundGroup.WOOD));
    }

    // Implement bed respawn logic
}
