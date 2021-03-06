package net.soproxi.chocolatecraft.setup;

import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.soproxi.chocolatecraft.ChocolateCraft;

public class ModItems {
    // CHOCOLATE BARS
    public static final RegistryObject<Item> MILK_CHOCOLATE_BAR = Registration.ITEMS.register("milk_chocolate_bar", () ->
            new Item(new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
                    .food(new Food.Builder().effect(() -> new EffectInstance(Effects.SPEED, 400, 1), 1.0f).hunger(6).saturation(0.4f).build())));

    public static final RegistryObject<Item> DARK_CHOCOLATE_BAR = Registration.ITEMS.register("dark_chocolate_bar", () ->
            new Item(new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
                    .food(new Food.Builder().effect(() -> new EffectInstance(Effects.STRENGTH, 400, 1), 1.0f).hunger(6).saturation(0.4f).build())));

    public static final RegistryObject<Item> WHITE_CHOCOLATE_BAR = Registration.ITEMS.register("white_chocolate_bar", () ->
            new Item(new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
                    .food(new Food.Builder().effect(() -> new EffectInstance(Effects.JUMP_BOOST, 400, 1), 1.0f).hunger(6).saturation(0.4f).build())));


    // CHOCOLATE MINING
    public static final RegistryObject<Item> RAW_CHOCOLATE_ORE = Registration.ITEMS.register("raw_chocolate_ore", () ->
            new Item(new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
            .food(new Food.Builder().fastToEat().hunger(1).saturation(0.1f).build())));

    // CROPS
    public static final RegistryObject<Item> SOY_BEAN = Registration.ITEMS.register("soy_bean", () ->
            new BlockItem(ModBlocks.SOY_BEAN_CROP.get(), new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
            .food(new Food.Builder().fastToEat().hunger(1).saturation(0.1f).effect(() -> new EffectInstance(Effects.POISON, 100, 1), 1.0f).build())));

    public static final RegistryObject<Item> PEANUT = Registration.ITEMS.register("peanut", () ->
            new BlockItem(ModBlocks.PEANUT_CROP.get(), new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
            .food(new Food.Builder().fastToEat().hunger(1).saturation(0.1f).build())));

    // COCOA BUTTER
    public static final RegistryObject<Item> COCOA_BUTTER = Registration.ITEMS.register("cocoa_butter", () ->
            new Item(new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP)
                    .food(new Food.Builder().hunger(1).saturation(0.1f).build())));


    // FLUID STUFF
    public static final RegistryObject<Item> SOY_MILK_BUCKET = Registration.ITEMS.register("soy_milk_bucket", () ->
            new BucketItem(() -> ModFluids.soy_milk, new Item.Properties().containerItem(Items.BUCKET).group(ChocolateCraft.CHOCOLATECRAFT_GROUP).maxStackSize(1)));


    //SILLY STUFF


    static void register() {}
}
