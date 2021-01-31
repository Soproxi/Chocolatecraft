package net.soproxi.chocolatecraft.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.soproxi.chocolatecraft.ChocolateCraft;


import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> CHOCOLATE_ORE = register("chocolate_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3,10).harvestLevel(2).sound(SoundType.STONE).setRequiresTool()));

    // CHOCOLATE STORAGE BLOCKS
    public static final RegistryObject<Block> MILK_CHOCOLATE_BLOCK = register("milk_chocolate_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3,10).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> DARK_CHOCOLATE_BLOCK = register("dark_chocolate_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL).setRequiresTool()));
    public static final RegistryObject<Block> WHITE_CHOCOLATE_BLOCK = register("white_chocolate_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).sound(SoundType.METAL).setRequiresTool()));


    // CROPS
    public static final RegistryObject<Block> SOY_BEAN_CROP = register("soy_bean_crop", () ->
            new Block(AbstractBlock.Properties.create(Material.PLANTS).hardnessAndResistance(0f).doesNotBlockMovement().tickRandomly().sound(SoundType.PLANT)));


    static void register() {}

    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)));
        return ret;
    }
}
