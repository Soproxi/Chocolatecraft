package net.soproxi.chocolatecraft.setup;

import net.minecraft.fluid.Fluid;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ITag;
import net.soproxi.chocolatecraft.setup.fluids.FluidSoyMilk;

public class ModFluids {

    public static final FluidSoyMilk.Source soy_milk = null;
    public static final FluidSoyMilk.Flowing flowing_soy_milk = null;

    public static class Fluids {
        public static final ITag.INamedTag<Fluid> SOY_MILK = createTag("soy_milk");

        private static ITag.INamedTag<Fluid> createTag(String name) {
            return FluidTags.makeWrapperTag("chocolatecraft:" + name);
        }
    }

    static void register() {}
}
