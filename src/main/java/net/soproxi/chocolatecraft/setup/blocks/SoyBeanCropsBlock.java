package net.soproxi.chocolatecraft.setup.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.soproxi.chocolatecraft.setup.ModItems;

public class SoyBeanCropsBlock extends CropsBlock {

    private static final VoxelShape[] SHAPES = new VoxelShape[] {Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,2.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,3.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,4.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,5.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,6.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,7.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,8.0D,16.0D),
            Block.makeCuboidShape(0.0D,0.0D,0.0D,16.0D,9.0D,16.0D),};

    public SoyBeanCropsBlock(Properties builder) {
        super(builder);
    }

    @Override
    protected IItemProvider getSeedsItem() {
        return ModItems.SOY_BEAN.get();
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(ModItems.SOY_BEAN.get());
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES[state.get(this.getAgeProperty())];
    }
}
