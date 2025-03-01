package corgiaoc.byg.common.world.feature.overworld.mushrooms.util;

import corgiaoc.byg.common.world.feature.config.BYGMushroomConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class BYGHugeMushroom {
    @Nullable
    protected abstract ConfiguredFeature<BYGMushroomConfig, ?> getHugeMushroomFeature(Random random);

    public boolean withSpawner(ISeedReader worldIn, ChunkGenerator chunkGenerator, BlockPos pos, BlockState blockUnder, Random random) {
        ConfiguredFeature<BYGMushroomConfig, ?> abstractMushroomFeature = this.getHugeMushroomFeature(random);
        if (abstractMushroomFeature == null) {
            return false;
        } else {
            worldIn.setBlock(pos, Blocks.AIR.defaultBlockState(), 4);
            abstractMushroomFeature.config.forcePlacement();
            if (abstractMushroomFeature.place(worldIn, chunkGenerator, random, pos)) {
                return true;
            } else {
                worldIn.setBlock(pos, blockUnder, 4);
                return false;
            }
        }
    }


    public static abstract class Massive extends BYGHugeMushroom {
        public static boolean canMassiveMushroomSpawnAt(BlockState blockUnder, IBlockReader worldIn, BlockPos pos, int xOffset, int zOffset) {
            Block block = blockUnder.getBlock();
            return block == worldIn.getBlockState(pos.offset(xOffset, 0, zOffset)).getBlock() && block == worldIn.getBlockState(pos.offset(xOffset + 1, 0, zOffset)).getBlock() && block == worldIn.getBlockState(pos.offset(xOffset, 0, zOffset + 1)).getBlock() && block == worldIn.getBlockState(pos.offset(xOffset + 1, 0, zOffset + 1)).getBlock();
        }

        public boolean withSpawner(ISeedReader worldIn, ChunkGenerator chunkGenerator, BlockPos pos, BlockState blockUnder, Random random) {
            for (int i = 0; i >= -1; --i) {
                for (int j = 0; j >= -1; --j) {
                    if (canMassiveMushroomSpawnAt(blockUnder, worldIn, pos, i, j)) {
                        return this.massiveMushroom(worldIn, chunkGenerator, pos, blockUnder, random, i, j);
                    }
                }
            }

            return super.withSpawner(worldIn, chunkGenerator, pos, blockUnder, random);
        }

        @Nullable
        protected abstract ConfiguredFeature<BYGMushroomConfig, ?> getMassiveMushroomFeature(Random random);

        public boolean massiveMushroom(ISeedReader worldIn, ChunkGenerator chunkGenerator, BlockPos pos, BlockState blockUnder, Random random, int xOffset, int zOffset) {
            ConfiguredFeature<BYGMushroomConfig, ?> abstractMushroomFeature = this.getMassiveMushroomFeature(random);
            if (abstractMushroomFeature == null) {
                return false;
            } else {
                BlockState blockstate = Blocks.AIR.defaultBlockState();
                worldIn.setBlock(pos.offset(xOffset, 0, zOffset), blockstate, 4);
                worldIn.setBlock(pos.offset(xOffset + 1, 0, zOffset), blockstate, 4);
                worldIn.setBlock(pos.offset(xOffset, 0, zOffset + 1), blockstate, 4);
                worldIn.setBlock(pos.offset(xOffset + 1, 0, zOffset + 1), blockstate, 4);
                abstractMushroomFeature.config.forcePlacement();
                if (abstractMushroomFeature.place(worldIn, chunkGenerator, random, pos.offset(xOffset, 0, zOffset))) {
                    return true;
                } else {
                    worldIn.setBlock(pos.offset(xOffset, 0, zOffset), blockUnder, 4);
                    worldIn.setBlock(pos.offset(xOffset + 1, 0, zOffset), blockUnder, 4);
                    worldIn.setBlock(pos.offset(xOffset, 0, zOffset + 1), blockUnder, 4);
                    worldIn.setBlock(pos.offset(xOffset + 1, 0, zOffset + 1), blockUnder, 4);
                    return false;
                }
            }
        }

    }
}