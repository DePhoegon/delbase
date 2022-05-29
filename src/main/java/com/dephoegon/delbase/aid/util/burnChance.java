package com.dephoegon.delbase.aid.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.*;
import org.jetbrains.annotations.NotNull;

import static net.minecraft.world.level.block.StairBlock.SHAPE;
import static net.minecraft.world.level.block.state.properties.BlockStateProperties.*;

public class burnChance {
    private static boolean ashReplaceRNG() {
        return randomNum(8) < 3;
    } //used to control % odds for replacing blocks/spawning fire
    private static boolean threshHold(int cap, int thresh) { return randomNum(cap) > thresh; }
    public static void rngBurn(@NotNull BlockGetter world, @NotNull BlockState burningBlock, @NotNull BlockState ashBlock, BlockPos pos, int burnThreshHold, int burnCap){
        // Double Comparison is used to avoid drastic failure.  (they should always match, but if for some reason it manages to pull the wrong blockstate, it won't break the game.
        boolean genBlock;
        boolean waterlogged = false;
        if (burningBlock.getBlock() instanceof WallBlock && ashBlock.getBlock() instanceof WallBlock) {
            if (threshHold(burnCap, burnThreshHold)) {
                WallSide east = burningBlock.getValue(EAST_WALL);
                WallSide west = burningBlock.getValue(WEST_WALL);
                WallSide north = burningBlock.getValue(NORTH_WALL);
                WallSide south = burningBlock.getValue(SOUTH_WALL);
                boolean up = burningBlock.getValue(WallBlock.UP);
                if (ashReplaceRNG()){
                    
                    ((Level) world).setBlockAndUpdate(pos, ashBlock.setValue(WallBlock.WATERLOGGED, waterlogged).setValue(WallBlock.EAST_WALL, east).setValue(WallBlock.WEST_WALL, west).setValue(WallBlock.NORTH_WALL, north).setValue(WallBlock.SOUTH_WALL, south).setValue(WallBlock.UP, up));
                } // chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof StairBlock && ashBlock.getBlock() instanceof StairBlock) {
            if (threshHold(burnCap, burnThreshHold)) {
                Direction facing = burningBlock.getValue(StairBlock.FACING);
                Half half = burningBlock.getValue(StairBlock.HALF);
                StairsShape shape = burningBlock.getValue(SHAPE);
                if (ashReplaceRNG()) {
                    
                    ((Level) world).setBlockAndUpdate(pos, ashBlock.setValue(StairBlock.FACING, facing).setValue(StairBlock.HALF, half).setValue(SHAPE, shape).setValue(StairBlock.WATERLOGGED, waterlogged));
                }// chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof SlabBlock && ashBlock.getBlock() instanceof SlabBlock) {
            if (threshHold(burnCap,burnThreshHold)) {
                SlabType type = burningBlock.getValue(SlabBlock.TYPE);
                if (ashReplaceRNG()) {
                    
                    ((Level) world).setBlockAndUpdate(pos, ashBlock.setValue(SlabBlock.TYPE, type).setValue(SlabBlock.WATERLOGGED, waterlogged));
                } // chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof RotatedPillarBlock && ashBlock.getBlock() instanceof RotatedPillarBlock) {
            if (threshHold(burnCap, burnThreshHold)) {
                Direction.Axis axis = burningBlock.getValue(AXIS);
                if(ashReplaceRNG()) {
                    ((Level) world).setBlockAndUpdate(pos, ashBlock.setValue(AXIS, axis));
                } // chance to replace block with supplied ashBlock.
            }
        }
        if (burningBlock.getBlock() instanceof FenceBlock && ashBlock.getBlock() instanceof FenceBlock) {
            if (threshHold(burnCap, burnThreshHold)) {
                Boolean east = burningBlock.getValue(CrossCollisionBlock.EAST);
                Boolean west = burningBlock.getValue(CrossCollisionBlock.WEST);
                Boolean south = burningBlock.getValue(CrossCollisionBlock.SOUTH);
                Boolean north = burningBlock.getValue(CrossCollisionBlock.NORTH);
                if (ashReplaceRNG()){
                    ((Level) world).setBlockAndUpdate(pos, ashBlock.setValue(CrossCollisionBlock.EAST, east).setValue(CrossCollisionBlock.WEST, west).setValue(CrossCollisionBlock.NORTH, north).setValue(CrossCollisionBlock.SOUTH, south));
                }
            }
        }
        if (burningBlock.getBlock() instanceof FenceGateBlock && ashBlock.getBlock() instanceof FenceGateBlock) {
            if (threshHold(burnCap, burnThreshHold)) {
                Boolean open = burningBlock.getValue(OPEN);
                Boolean powered = burningBlock.getValue(POWERED);
                Boolean inWall = burningBlock.getValue(IN_WALL);
                Direction facing = burningBlock.getValue(HorizontalDirectionalBlock.FACING);
                if (ashReplaceRNG()) {
                    ((Level) world).setBlockAndUpdate(pos, ashBlock.setValue(OPEN, open).setValue(POWERED, powered).setValue(IN_WALL, inWall).setValue(HorizontalDirectionalBlock.FACING, facing));
                }
            }
        }
        genBlock = !(burningBlock.getBlock() instanceof WallBlock) && !(burningBlock.getBlock() instanceof StairBlock) &&
                !(burningBlock.getBlock() instanceof SlabBlock) && !(burningBlock.getBlock() instanceof RotatedPillarBlock) &&
                !(ashBlock.getBlock() instanceof WallBlock) && !(ashBlock.getBlock() instanceof StairBlock) &&
                !(ashBlock.getBlock() instanceof SlabBlock) && !(ashBlock.getBlock() instanceof RotatedPillarBlock &&
                !(burningBlock.getBlock() instanceof FenceBlock) && !(burningBlock.getBlock() instanceof FenceGateBlock));
        if (genBlock) {
            if (ashReplaceRNG()) {
                BlockState defaultBlock = ashBlock.getBlock().defaultBlockState();
                ((Level) world).setBlockAndUpdate(pos, defaultBlock);
            } // chance to replace block with supplied ashBlock.
        }
    }
    private static int randomNum(int max){ return (int) (Math.random()*(max- 1 +1)+ 1); }
}
