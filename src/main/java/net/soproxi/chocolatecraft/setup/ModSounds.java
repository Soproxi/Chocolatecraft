package net.soproxi.chocolatecraft.setup;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.soproxi.chocolatecraft.ChocolateCraft;

public class ModSounds {

    //Jen Sounds
    public static final RegistryObject<SoundEvent> JEN_SOUND = Registration.SOUNDS.register("jen_sound", () ->
            new SoundEvent(new ResourceLocation(ChocolateCraft.MOD_ID, "item.jen_sound")));

    static void register() {}
}
