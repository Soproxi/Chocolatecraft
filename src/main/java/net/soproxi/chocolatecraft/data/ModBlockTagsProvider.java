package net.soproxi.chocolatecraft.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.soproxi.chocolatecraft.ChocolateCraft;
import net.soproxi.chocolatecraft.setup.ModBlocks;
import net.soproxi.chocolatecraft.setup.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ChocolateCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.ORES_CHOCOLATE)
                .add(ModBlocks.CHOCOLATE_ORE.get());
        getOrCreateBuilder(Tags.Blocks.ORES)
                .addTag(ModTags.Blocks.ORES_CHOCOLATE);
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_CHOCOLATE)
                .add(ModBlocks.CHOCOLATE_BLOCK.get());
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS)
                .addTag(ModTags.Blocks.STORAGE_BLOCKS_CHOCOLATE);
    }
}
