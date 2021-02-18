package net.soproxi.chocolatecraft.setup;

import net.minecraft.data.FluidTagsProvider;
import net.minecraft.fluid.Fluid;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.Tag;
import net.soproxi.chocolatecraft.setup.fluids.FluidSoyMilk;

public class ModFluids {

    public static final FluidSoyMilk.Source soy_milk = null;
    public static final FluidSoyMilk.Flowing flowing_soy_milk = null;


    public static class Tags {
        public static final ITag.INamedTag<Fluid> SOY_MILK = createTag("soy_milk");

        private static ITag.INamedTag<Fluid> createTag(String name) {
            return FluidTags.makeWrapperTag("chocolatecraft:" + name);
        }
    }

    static void register() {}
}
