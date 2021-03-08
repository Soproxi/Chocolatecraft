package net.soproxi.chocolatecraft.setup.fluids;


import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fluids.FluidAttributes;
import net.soproxi.chocolatecraft.ChocolateCraft;
import net.soproxi.chocolatecraft.setup.ModBlocks;
import net.soproxi.chocolatecraft.setup.ModFluids;
import net.soproxi.chocolatecraft.setup.ModItems;
import net.soproxi.chocolatecraft.setup.Registration;


public abstract class FluidSoyMilk extends FlowingFluid {
    @Override
    public Fluid getFlowingFluid() {
        return ModFluids.flowing_soy_milk.getFlowingFluid();
    }

    @Override
    public Fluid getStillFluid() {
        return ModFluids.soy_milk.getStillFluid();
    }

    @Override
    protected boolean canSourcesMultiply() {
        return false;
    }

    @Override
    protected void beforeReplacingBlock(IWorld worldIn, BlockPos pos, BlockState state) {
    }

    @Override
    protected int getSlopeFindDistance(IWorldReader worldIn) {
        return 4;
    }

    @Override
    protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
        return 3;
    }

    @Override
    public Item getFilledBucket() {
        return ModItems.SOY_MILK_BUCKET.get();
    }

    @Override
    protected boolean canDisplace(FluidState fluidState, IBlockReader blockReader, BlockPos pos, Fluid fluid, Direction direction) {
        return direction == Direction.DOWN && !fluid.isIn(ModFluids.Tags.SOY_MILK);
    }

    @Override
    public int getTickRate(IWorldReader p_205569_1_) {
        return 60;
    }

    @Override
    protected float getExplosionResistance() {
        return 100;
    }

    @Override
    protected BlockState getBlockState(FluidState state) {
        return ModBlocks.SOY_MILK.get().getDefaultState().with(FlowingFluidBlock.LEVEL, Integer.valueOf(getLevelFromState(state)));
    }

    @Override
    public boolean isEquivalentTo(Fluid fluidIn) {
        return fluidIn == ModFluids.soy_milk || fluidIn == ModFluids.flowing_soy_milk;
    }

    @Override
    protected FluidAttributes createAttributes() {
        return FluidAttributes.builder(new ResourceLocation(ChocolateCraft.MOD_ID, "block/soy_milk_still"),new ResourceLocation(ChocolateCraft.MOD_ID, "block/soy_milk_flowing"))
                .translationKey("block.chocolatecraft.soy_milk")
                .build(this);

    }

    public static class Flowing extends FluidSoyMilk {

        @Override
        protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(FluidSoyMilk.LEVEL_1_8);
        }
    }

    public static class Source extends  FluidSoyMilk {
        @Override
        public boolean isSource(FluidState state) {
            return true;
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }
    }
}
