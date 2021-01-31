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
        withExistingParent("chocolate_block", modLoc("block/chocolate_block"));
        withExistingParent("chocolate_ore", modLoc("block/chocolate_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "milk_chocolate_bar");
        builder(itemGenerated, "raw_chocolate_ore");
        builder(itemGenerated, "dark_chocolate_bar");
        builder(itemGenerated, "white_chocolate_bar");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
