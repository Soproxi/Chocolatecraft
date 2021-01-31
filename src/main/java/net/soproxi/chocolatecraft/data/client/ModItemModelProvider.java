package net.soproxi.chocolatecraft.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.soproxi.chocolatecraft.ChocolateCraft;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ChocolateCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("milk_chocolate_block", modLoc("block/milk_chocolate_block"));
        withExistingParent("chocolate_ore", modLoc("block/chocolate_ore"));
        withExistingParent("dark_chocolate_block", modLoc("block/dark_chocolate_block"));
        withExistingParent("white_chocolate_block", modLoc("block/white_chocolate_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "milk_chocolate_bar");
        builder(itemGenerated, "raw_chocolate_ore");
        builder(itemGenerated, "dark_chocolate_bar");
        builder(itemGenerated, "white_chocolate_bar");
        builder(itemGenerated, "soy_bean");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
