package net.soproxi.chocolatecraft.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.soproxi.chocolatecraft.ChocolateCraft;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_CHOCOLATE = forge("ores/chocolate");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_CHOCOLATE = forge("storage_blocks/chocolate");

         private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
         }

         private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(ChocolateCraft.MOD_ID, path).toString());
         }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_CHOCOLATE = forge("ores/chocolate");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_CHOCOLATE = forge("storage_blocks/chocolate");

        public static final ITag.INamedTag<Item> BARS_CHOCOLATE = forge("bars/chocolate");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(ChocolateCraft.MOD_ID, path).toString());
        }

    }
}
