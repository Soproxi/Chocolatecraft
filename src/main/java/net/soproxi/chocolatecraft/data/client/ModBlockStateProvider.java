package net.soproxi.chocolatecraft.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.soproxi.chocolatecraft.ChocolateCraft;
import net.soproxi.chocolatecraft.setup.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ChocolateCraft.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.MILK_CHOCOLATE_BLOCK.get());
        simpleBlock(ModBlocks.DARK_CHOCOLATE_BLOCK.get());
        simpleBlock(ModBlocks.WHITE_CHOCOLATE_BLOCK.get());
        simpleBlock(ModBlocks.CHOCOLATE_ORE.get());
    }
}
