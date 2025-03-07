package corgiaoc.byg.common.world.feature.overworld.trees.palo_verde;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class PaloVerdeTree2 extends BYGAbstractTreeFeature<BYGTreeConfig> {

    public PaloVerdeTree2(Codec<BYGTreeConfig> configIn) {
        super(configIn);
    }


    public boolean generate(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeConfig config) {

        int randTreeHeight = rand.nextInt(config.getMaxPossibleHeight()) + config.getMinHeight();
        //Positions
        int posX = pos.getX();
        int posY = pos.getY();
        int posZ = pos.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < worldIn.getMaxBuildHeight()) {
            if (worldIn.getBlockState(pos.below()).getBlock() != Blocks.GRASS_BLOCK && (worldIn.getBlockState(pos.below()).getBlock() != Blocks.RED_SAND && worldIn.getBlockState(pos.below()).getBlock() != Blocks.COARSE_DIRT)) {
                return false;
            } else {
                buildTrunkBase(pos, changedBlocks, worldIn, config, rand, boundsIn, pos);

                Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);
                int posY1 = 2 - rand.nextInt(1);
                int posX1 = posX;
                int posZ1 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;


                for (int buildTrunk = 0; buildTrunk < randTreeHeight; ++buildTrunk) {

                    int logplacer = posY + buildTrunk;
                    int logplacer2 = posY + randTreeHeight;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                    BlockPos blockpos2 = new BlockPos(posX1, logplacer2, posZ1);

                    //Sets Logs
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos1, boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.east().north(), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.east(2).north(), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.east(3).north(2).above(), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.east(4).north().above(2), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.south().west(), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.south(2).west(), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.south(3).west(2).above(), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.south(3).west(2).above(2), boundsIn);
                    placeTrunk(config, rand, changedBlocks, worldIn, blockpos2.south(3).west(3).above(3), boundsIn);
                }


                int leavessquarespos = 2;
                for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                    for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {

                        int posX2 = posX1 - 2;
                        int posZ2 = posZ1 + 3;

                        int posX3 = posX1 + 4;
                        int posZ3 = posZ1 - 2;

                        //Bottom Leaves
                        placeLeaves(config, rand, worldIn, posX2 + posXLeafWidth, topTrunkHeight + 4, posZ2 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX2 + posXLeafWidth - 2, topTrunkHeight + 4, posZ2 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX2 + posXLeafWidth - 1, topTrunkHeight + 4, posZ2 + posZLeafWidthL0 + 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX2 + posXLeafWidth - 1, topTrunkHeight + 4, posZ2 + posZLeafWidthL0 - 1, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX3 + posXLeafWidth, topTrunkHeight + 3, posZ3 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX3 + posXLeafWidth - 2, topTrunkHeight + 3, posZ3 + posZLeafWidthL0, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX3 + posXLeafWidth - 1, topTrunkHeight + 3, posZ3 + posZLeafWidthL0 + 1, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX3 + posXLeafWidth - 1, topTrunkHeight + 3, posZ3 + posZLeafWidthL0 - 1, boundsIn, changedBlocks);

                        //3x3
                        if (posXLeafWidth <= 1 && posZLeafWidthL0 <= 1 && posZLeafWidthL0 >= -1 && posXLeafWidth >= -1) {

                            placeLeaves(config, rand, worldIn, posX2 + posXLeafWidth - 1, topTrunkHeight + 5, posZ2 + posZLeafWidthL0, boundsIn, changedBlocks);

                            placeLeaves(config, rand, worldIn, posX3 + posXLeafWidth - 1, topTrunkHeight + 4, posZ3 + posZLeafWidthL0, boundsIn, changedBlocks);
                        }

                        //2x3
                        if (posXLeafWidth <= 0 && posZLeafWidthL0 <= 1 && posZLeafWidthL0 >= -1 && posXLeafWidth >= -1) {
                        }

                        //Top Leaves

                        //Bottom Leaves
                        placeLeaves(config, rand, worldIn, posX2 - 1, topTrunkHeight + 5, posZ2 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX2 - 3, topTrunkHeight + 5, posZ2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX2 + 1, topTrunkHeight + 5, posZ2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX2 - 1, topTrunkHeight + 5, posZ2 - 2, boundsIn, changedBlocks);

                        placeLeaves(config, rand, worldIn, posX3 - 1, topTrunkHeight + 4, posZ3 + 2, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX3 - 3, topTrunkHeight + 4, posZ3, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX3 + 1, topTrunkHeight + 4, posZ3, boundsIn, changedBlocks);
                        placeLeaves(config, rand, worldIn, posX3 - 1, topTrunkHeight + 4, posZ3 - 2, boundsIn, changedBlocks);

                    }
                }
            }

            return true;
        } else {
            return false;
        }
    }
}