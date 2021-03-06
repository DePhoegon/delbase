package com.dephoegon.delbase.aid.block.colorshift.grav;

import com.dephoegon.delbase.aid.block.stock.gravBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import org.jetbrains.annotations.NotNull;

public class solidSandBlock extends gravBlock {
    public solidSandBlock(int dustColorIn, Properties properties, String normToolTip, String shiftToolTip, String ctrlToolTip) {
        super(dustColorIn, properties, normToolTip, shiftToolTip, ctrlToolTip, false);
    }
    @Override
    public boolean canSustainPlant(@NotNull BlockState state, @NotNull BlockGetter world, BlockPos pos, @NotNull Direction facing, net.minecraftforge.common.IPlantable plantable) {
        BlockState plant = plantable.getPlant(world, pos.relative(facing));
        net.minecraftforge.common.PlantType type = plantable.getPlantType(world, pos.relative(facing));
        if (plant.getBlock() == Blocks.CACTUS)
            return true;
        if (plant.getBlock() == Blocks.SUGAR_CANE) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                BlockState blockState1 = world.getBlockState(pos.relative(direction));
                FluidState fluidState = world.getFluidState(pos.relative(direction));
                if (fluidState.is(FluidTags.WATER) || blockState1.is(Blocks.FROSTED_ICE)) {
                    return true;
                }
            }
        }
        return net.minecraftforge.common.PlantType.DESERT.equals(type);
    }
}
