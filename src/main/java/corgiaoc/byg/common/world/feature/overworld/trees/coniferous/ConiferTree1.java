package corgiaoc.byg.common.world.feature.overworld.trees.coniferous;

import com.mojang.serialization.Codec;
import corgiaoc.byg.common.world.feature.config.BYGTreeConfig;
import corgiaoc.byg.common.world.feature.overworld.trees.util.BYGAbstractTreeFeature;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.ISeedReader;

import java.util.Random;
import java.util.Set;

public class ConiferTree1 extends BYGAbstractTreeFeature<BYGTreeConfig> {

    public ConiferTree1(Codec<BYGTreeConfig> configIn) {
        super(configIn);
    }

    protected boolean generate(Set<BlockPos> changedBlocks, ISeedReader worldIn, Random rand, BlockPos pos, MutableBoundingBox boundsIn, boolean isSapling, BYGTreeConfig config) {

        int randTreeHeight = config.getMinHeight() + rand.nextInt(config.getMaxPossibleHeight());
        BlockPos.Mutable mutable = new BlockPos.Mutable().set(pos);

        if (pos.getY() + randTreeHeight + 1 < worldIn.getMaxBuildHeight()) {
            if (!isDesiredGroundwDirtTag(worldIn, pos.below(), config)) {
                return false;
            } else if (!this.isAnotherTreeNearby(worldIn, pos, randTreeHeight, 0, isSapling)) {
                return false;
            } else if (!this.doesSaplingHaveSpaceToGrow(worldIn, pos, randTreeHeight, 5, 5, 5, isSapling)) {
                return false;
            } else {
                buildTrunkBase(pos, changedBlocks, worldIn, config, rand, boundsIn, mutable.set(pos).immutable());

                for (int buildTrunk = 0; buildTrunk <= randTreeHeight; buildTrunk++) {
                    placeTrunk(config, rand, changedBlocks, worldIn, mutable, boundsIn);
                    mutable.move(Direction.UP);
                }
                mutable.set(pos);

                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 11, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 11, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 11, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 10, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 10, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 10, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 10, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 10, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 10, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 9, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 9, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 9, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 9, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 9, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 8, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 8, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 8, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 8, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 8, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 8, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 7, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 7, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 7, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 7, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 7, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 6, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 6, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 6, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 6, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 6, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 6, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 5, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 5, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 5, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 5, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 5, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 4, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 4, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 4, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 4, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 4, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 4, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 4, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 4, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 4, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 4, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 4, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 4, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 3, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 3, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 2, -3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 2, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 2, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 2, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 2, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 2, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 2, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 2, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 2, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 2, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-3, randTreeHeight - 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(3, randTreeHeight - 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight - 2, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 2, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 2, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 2, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight - 2, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 2, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 2, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 2, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 2, 3), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 1, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight - 1, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight - 1, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight - 1, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight, -2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-2, randTreeHeight, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(2, randTreeHeight, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight, 2), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 1, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight + 1, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 1, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight + 1, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 1, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 2, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 3, -1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(-1, randTreeHeight + 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(1, randTreeHeight + 3, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 3, 1), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 4, 0), boundsIn);
                placeLeaves(config, rand, changedBlocks, worldIn, mutable.set(pos).move(0, randTreeHeight + 5, 0), boundsIn);
            }
        }
        return true;
    }
}