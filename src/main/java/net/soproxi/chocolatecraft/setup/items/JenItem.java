package net.soproxi.chocolatecraft.setup.items;

import com.sun.javafx.geom.Vec3d;
import com.sun.jna.platform.KeyboardUtils;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.command.arguments.BlockPosArgument;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockPosWrapper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.soproxi.chocolatecraft.ChocolateCraft;
import net.soproxi.chocolatecraft.setup.ModSounds;
import net.soproxi.chocolatecraft.setup.util.KeyboardUtil;

import javax.annotation.Nullable;
import java.util.List;

public class JenItem extends Item {

    public JenItem() {
        super(new Item.Properties().group(ChocolateCraft.CHOCOLATECRAFT_GROUP).maxDamage(4));
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardUtil.isHoldingShift()) {
            tooltip.add(new StringTextComponent("\u00A7c"+"A relic from an ancient cult, It makes weird noises when you stroke it."));
        } else {
            tooltip.add(new StringTextComponent("\u00A7c"+"Hold " + "Shift" + " For More Info"));
        }
    }


    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack item = playerIn.getHeldItem(handIn);
        worldIn.playSound(playerIn, playerIn.getPosition(), ModSounds.JEN_SOUND.get(), SoundCategory.VOICE, 1.0f, 1.0f);
        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
    }

}
