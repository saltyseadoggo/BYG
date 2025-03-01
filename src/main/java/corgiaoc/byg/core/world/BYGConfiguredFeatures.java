package corgiaoc.byg.core.world;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import corgiaoc.byg.common.properties.blocks.BlueBerryBush;
import corgiaoc.byg.common.properties.blocks.end.TheriumCrystalBlock;
import corgiaoc.byg.common.properties.blocks.nether.crimson.CrimsonBerryBushBlock;
import corgiaoc.byg.common.world.decorator.config.AtOrBelowSeaLevelCountExtraConfig;
import corgiaoc.byg.common.world.feature.blockplacer.DoubleBlockPlacer;
import corgiaoc.byg.common.world.feature.config.*;
import corgiaoc.byg.config.BYGWorldConfig;
import corgiaoc.byg.core.BYGBlocks;
import net.minecraft.block.AbstractTopPlantBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.*;

import static corgiaoc.byg.core.world.util.WorldGenRegistrationHelper.createConfiguredFeature;

public class BYGConfiguredFeatures {

    /***********************************************************Configured Features***********************************************************/

    public static final ConfiguredFeature<?, ?> ALLIUM_BUSH = createConfiguredFeature("allium_bush", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ALLIUM_FLOWER_BUSH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ALLIUM_PINK_BUSH = createConfiguredFeature("pink_allium_bush", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ALLIUM_FLOWER_BUSH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ALLIUM_TALL_BUSH = createConfiguredFeature("tall_allium_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_ALLIUM.defaultBlockState()), new DoublePlantBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ALLIUM_TALL_PINK_BUSH = createConfiguredFeature("tall_pink_allium_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_PINK_ALLIUM.defaultBlockState()), new DoublePlantBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> AMARANTH = createConfiguredFeature("amaranth", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.AMARANTH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> AMARANTH_MAGENTA = createConfiguredFeature("magenta_amaranth", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.MAGENTA_AMARANTH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> AMARANTH_ORANGE = createConfiguredFeature("orange_amaranth", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ORANGE_AMARANTH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> AMARANTH_PURPLE = createConfiguredFeature("purple_amaranth", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_AMARANTH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> AMARANTH_CYAN = createConfiguredFeature("cyan_amaranth", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CYAN_AMARANTH.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> SHORT_GRASS = createConfiguredFeature("short_grass_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SHORT_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(24).build()));
    public static final ConfiguredFeature<?, ?> NYLIUM_SOUL_FIRE_PATCH = createConfiguredFeature("nylium_soul_fire_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SOUL_FIRE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(Blocks.SOUL_SOIL, BYGBlocks.NYLIUM_SOUL_SOIL, BYGBlocks.BRIMSTONE, BYGBlocks.FROST_MAGMA)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> BORIC_FIRE_PATCH = createConfiguredFeature("boric_fire_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BORIC_FIRE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.BRIMSTONE, BYGBlocks.BRIMSTONE, BYGBlocks.BRIMSTONE, BYGBlocks.FROST_MAGMA)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> MAGMA_FIRE_PATCH = createConfiguredFeature("magma_fire_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.FIRE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MAGMATIC_STONE, Blocks.MAGMA_BLOCK, BYGBlocks.QUARTZITE_SAND)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> SUBZERO_ASH = createConfiguredFeature("subzero_ash", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SUBZERO_ASH.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.SUBZERO_ASH_BLOCK, BYGBlocks.FROST_MAGMA)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> SUBZERO_ASH_BLOCK = createConfiguredFeature("subzero_ash_block", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SUBZERO_ASH_BLOCK.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.SUBZERO_ASH_BLOCK, BYGBlocks.FROST_MAGMA)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> QUARTZ_CRYSTAL = createConfiguredFeature("quartz_crystal", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.QUARTZ_CRYSTAL.defaultBlockState(), ImmutableList.of(BYGBlocks.QUARTZITE_SAND.defaultBlockState(), BYGBlocks.RAW_QUARTZ_BLOCK.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.QUARTZITE_SAND.defaultBlockState(), BYGBlocks.RAW_QUARTZ_BLOCK.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> CRYPTIC_FIRE_PATCH = createConfiguredFeature("cryptic_fire_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CRYPTIC_FIRE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.CRYPTIC_STONE, BYGBlocks.CRYPTIC_MAGMA_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> CRYPTIC_VENT = createConfiguredFeature("cryptic_vent", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CRYPTIC_VENT.defaultBlockState()), new SimpleBlockPlacer())).tries(24).whitelist(ImmutableSet.of(BYGBlocks.CRYPTIC_STONE, BYGBlocks.CRYPTIC_MAGMA_BLOCK)).build()));
    public static final ConfiguredFeature<?, ?> TALL_CRYPTIC_VENT = createConfiguredFeature("tall_cryptic_vent", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_CRYPTIC_VENT.defaultBlockState()), new DoubleBlockPlacer())).tries(24).whitelist(ImmutableSet.of(BYGBlocks.CRYPTIC_STONE, BYGBlocks.CRYPTIC_MAGMA_BLOCK)).build()));

    public static final ConfiguredFeature<?, ?> BEEHIVES = createConfiguredFeature("beehives", BYGFeatures.BEEHIVE.configured(new NoFeatureConfig()).range(256).squared().count(10));
    public static final ConfiguredFeature<?, ?> ETHER_BULBS = createConfiguredFeature("ether_bulbs", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.ETHER_BULB.defaultBlockState(), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(BYGBlocks.ETHER_LEAVES.defaultBlockState()))).range(256).squared().count(55));

    //Giant Flowers
    public static final ConfiguredFeature<GiantFlowerConfig, ?> GIANT_ANGELICA_FLOWER = createConfiguredFeature("giant_angelica", BYGFeatures.GIANT_ANGELICA_FLOWER.configured(new GiantFlowerConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.WHITE_PETAL).setMaxHeight(18).setMinHeight(12).build()));
    public static final ConfiguredFeature<GiantFlowerConfig, ?> GIANT_DANDELION_FLOWER = createConfiguredFeature("giant_dandelion", BYGFeatures.GIANT_DANDELION_FLOWER.configured(new GiantFlowerConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.RED_PETAL).setPetal2Block(BYGBlocks.YELLOW_PETAL).setMaxHeight(12).setMinHeight(6).build()));
    public static final ConfiguredFeature<GiantFlowerConfig, ?> GIANT_IRIS_FLOWER = createConfiguredFeature("giant_iris", BYGFeatures.GIANT_IRIS_FLOWER.configured(new GiantFlowerConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.PURPLE_PETAL).setPetal2Block(BYGBlocks.YELLOW_PETAL).setMaxHeight(12).setMinHeight(6).build()));
    public static final ConfiguredFeature<GiantFlowerConfig, ?> GIANT_ROSE_FLOWER = createConfiguredFeature("giant_rose", BYGFeatures.GIANT_ROSE_FLOWER.configured(new GiantFlowerConfig.Builder().setStemBlock(BYGBlocks.PLANT_STEM).setPetalBlock(BYGBlocks.RED_PETAL).setMaxHeight(12).setMinHeight(6).build()));


    public static final ConfiguredFeature<?, ?> MINI_CACTI = createConfiguredFeature("mini_cacti", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.MINI_CACTUS.defaultBlockState()), new SimpleBlockPlacer())).tries(4).build()));
    public static final ConfiguredFeature<?, ?> HORSEWEED = createConfiguredFeature("horse_weed", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.HORSEWEED.defaultBlockState()), new SimpleBlockPlacer())).tries(4).build()));
    public static final ConfiguredFeature<?, ?> TINY_LILY_PAD = createConfiguredFeature("tiny_lily_pad", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TINY_LILYPADS.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> WATER_SILK = createConfiguredFeature("water_silk", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WATER_SILK.defaultBlockState()), new SimpleBlockPlacer())).tries(128).build()));
    public static final ConfiguredFeature<?, ?> WINTER_SUCCULENT = createConfiguredFeature("winter_succulent", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_SUCCULENT.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> BEACH_GRASS = createConfiguredFeature("beach_grass_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BEACH_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(20).build()));
    public static final ConfiguredFeature<?, ?> BEACH_SHORT_GRASS_PATCH = createConfiguredFeature("short_beach_grass_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SHORT_BEACH_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(20).build()));
    public static final ConfiguredFeature<?, ?> WILTED_GRASS_PATCH = createConfiguredFeature("wilted_grass_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WILTED_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> LEAF_PILE = createConfiguredFeature("leaf_pile", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.LEAF_PILE.defaultBlockState()), new SimpleBlockPlacer())).tries(14).build()));
    public static final ConfiguredFeature<?, ?> CLOVER_PATCH = createConfiguredFeature("clover_patch", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CLOVER_PATCH.defaultBlockState()), new SimpleBlockPlacer())).tries(14).build()));
    public static final ConfiguredFeature<?, ?> FLOWER_PATCH = createConfiguredFeature("flower_patch", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FLOWER_PATCH.defaultBlockState()), new SimpleBlockPlacer())).tries(14).build()));
    public static final ConfiguredFeature<?, ?> WEED_GRASS_PATCH = createConfiguredFeature("weed_grass_patch", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WEED_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).noProjection().build()));
    public static final ConfiguredFeature<?, ?> WINTER_GRASS_PATCH = createConfiguredFeature("winter_grass_patch", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> CALIFORNIA_POPPY = createConfiguredFeature("california_poppy", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CALIFORNIA_POPPY.defaultBlockState()), new SimpleBlockPlacer())).tries(10).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> BLACK_PUFF = createConfiguredFeature("black_puff", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLACK_PUFF.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).noProjection().build()));
    public static final ConfiguredFeature<?, ?> WEEPING_MILKCAP = createConfiguredFeature("weeping_milkcap", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WEEPING_MILKCAP.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).noProjection().build()));
    public static final ConfiguredFeature<?, ?> WOOD_BLEWIT = createConfiguredFeature("wood_blewit", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WOOD_BLEWIT.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).noProjection().build()));
    public static final ConfiguredFeature<?, ?> GREEN_MUSHROOM = createConfiguredFeature("green_mushroom", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GREEN_MUSHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).noProjection().build()));
    public static final ConfiguredFeature<?, ?> BEGONIA = createConfiguredFeature("begonia", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BEGONIA.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> BISTORT = createConfiguredFeature("bistort", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BISTORT.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> GUZMANIA = createConfiguredFeature("guzmania", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GUZMANIA.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> INCAN_LILY = createConfiguredFeature("incan_lily", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.INCAN_LILY.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> LAZARUS_BELLFLOWER = createConfiguredFeature("lazarus_bellflower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.LAZARUS_BELLFLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> TORCH_GINGER = createConfiguredFeature("torch_ginger", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TORCH_GINGER.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> RICHEA = createConfiguredFeature("richea", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RICHEA.defaultBlockState()), new SimpleBlockPlacer())).tries(10).build()));
    public static final ConfiguredFeature<?, ?> JAPANESE_ORCHID = createConfiguredFeature("japanese_orchid", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.JAPANESE_ORCHID.defaultBlockState()), new DoublePlantBlockPlacer())).tries(10).noProjection().build()));
    public static final ConfiguredFeature<?, ?> AZALEA = createConfiguredFeature("azalea", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.AZALEA.defaultBlockState()), new DoublePlantBlockPlacer())).tries(48).noProjection().build()));
    public static final ConfiguredFeature<?, ?> PRAIRIE_GRASS_PATCH = createConfiguredFeature("prairie_grass_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PRAIRIE_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> PRAIRIE_TALL_GRASS_PATCH = createConfiguredFeature("tall_prairie_grass_patch", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_PRAIRIE_GRASS.defaultBlockState()), new DoublePlantBlockPlacer())).tries(100).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> BLUE_GLOWSHROOM = createConfiguredFeature("blue_glowshroom", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLUE_GLOWSHROOM.defaultBlockState()), new SimpleBlockPlacer())).tries(18).noProjection().build()));
    public static final ConfiguredFeature<?, ?> PURPLE_GLOWSHROOM = createConfiguredFeature("purple_glowshroom", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_GLOWSHROOM.defaultBlockState()), new SimpleBlockPlacer())).tries(18).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ROSE_BUSH = createConfiguredFeature("rose_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.ROSE_BUSH.defaultBlockState()), new DoublePlantBlockPlacer())).tries(48).noProjection().build()));


    public static final ConfiguredFeature<?, ?> PRICKLY_PEAR_CACTI = createConfiguredFeature("prickly_pear_cacti", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PRICKLY_PEAR_CACTUS.defaultBlockState()), new SimpleBlockPlacer())).tries(5).build()));
    public static final ConfiguredFeature<?, ?> GOLDEN_SPINED_CACTI = createConfiguredFeature("golden_spined_cacti", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GOLDEN_SPINED_CACTUS.defaultBlockState()), new SimpleBlockPlacer())).tries(5).build()));

    public static final ConfiguredFeature<?, ?> PINK_CHERRY_FOLIAGE = createConfiguredFeature("pink_cherry_foliage", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_CHERRY_FOLIAGE.defaultBlockState()), new SimpleBlockPlacer())).tries(24).build()));
    public static final ConfiguredFeature<?, ?> WHITE_CHERRY_FOLIAGE = createConfiguredFeature("white_cherry_foliage", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WHITE_CHERRY_FOLIAGE.defaultBlockState()), new SimpleBlockPlacer())).tries(24).build()));

    public static final ConfiguredFeature<?, ?> WARPED_CACTI = createConfiguredFeature("warped_cacti", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WARPED_CACTUS.defaultBlockState()), new ColumnBlockPlacer(1, 3))).tries(10).noProjection().build()));
    public static final ConfiguredFeature<?, ?> WARPED_BUSH = createConfiguredFeature("warped_bush", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.WARPED_BUSH.defaultBlockState(), ImmutableList.of(BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> WARPED_CORAL = createConfiguredFeature("warped_coral", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.WARPED_CORAL.defaultBlockState(), ImmutableList.of(BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> WARPED_CORAL_FAN = createConfiguredFeature("warped_coral_fan", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.WARPED_CORAL_FAN.defaultBlockState(), ImmutableList.of(BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()))));

    public static final ConfiguredFeature<?, ?> CHAINS = createConfiguredFeature("chains", BYGFeatures.CHAIN.configured(new ChainConfig.Builder().setMinLength(6).setMaxLength(10).setXAxisBlock(BYGBlocks.SOAPSTONE).setZAxisBlock(BYGBlocks.SOAPSTONE).setWhitelist(ImmutableList.of(Blocks.NETHERRACK)).build()).range(128).squared().count(4));

    public static final ConfiguredFeature<?, ?> SCORCHED_BUSH = createConfiguredFeature("scorched_bush", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.SCORCHED_BUSH.defaultBlockState(), ImmutableList.of(BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.CRYPTIC_STONE.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState(), BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState(), BYGBlocks.MAGMATIC_STONE.defaultBlockState(), Blocks.MAGMA_BLOCK.defaultBlockState(), Blocks.SOUL_SAND.defaultBlockState(), Blocks.SOUL_SOIL.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState(), BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState(), BYGBlocks.MAGMATIC_STONE.defaultBlockState(), Blocks.MAGMA_BLOCK.defaultBlockState(), BYGBlocks.CRYPTIC_STONE.defaultBlockState(), Blocks.SOUL_SAND.defaultBlockState(), Blocks.SOUL_SOIL.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> SCORCHED_GRASS = createConfiguredFeature("scorched_grass", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.SCORCHED_GRASS.defaultBlockState(), ImmutableList.of(BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.CRYPTIC_STONE.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState(), BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState(), BYGBlocks.MAGMATIC_STONE.defaultBlockState(), Blocks.MAGMA_BLOCK.defaultBlockState(), Blocks.SOUL_SAND.defaultBlockState(), Blocks.SOUL_SOIL.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState(), BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState(), BYGBlocks.MAGMATIC_STONE.defaultBlockState(), Blocks.MAGMA_BLOCK.defaultBlockState(), BYGBlocks.CRYPTIC_STONE.defaultBlockState(), Blocks.SOUL_SAND.defaultBlockState(), Blocks.SOUL_SOIL.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> WAILING_GRASS = createConfiguredFeature("wailing_grass", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.WAILING_GRASS.defaultBlockState(), ImmutableList.of(BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState(), Blocks.SOUL_SAND.defaultBlockState(), Blocks.SOUL_SOIL.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState(), Blocks.SOUL_SAND.defaultBlockState(), Blocks.SOUL_SOIL.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> WAILING_VINE = createConfiguredFeature("wailing_vine", BYGFeatures.WAILING_VINES.configured(DecoratedFeatureConfig.NONE));

    public static final ConfiguredFeature<?, ?> LAMENT_SPROUTS = createConfiguredFeature("lament_sprouts", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.LAMENT_SPROUTS.defaultBlockState(), ImmutableList.of(BYGBlocks.OVERGROWN_NETHERRACK.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState()))));

    public static final ConfiguredFeature<?, ?> BLUE_BERRY_BUSH = createConfiguredFeature("blue_berry_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLUEBERRY_BUSH.defaultBlockState().setValue(BlueBerryBush.AGE, 3)), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ROSE = createConfiguredFeature("rose", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ROSE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ANGELICA = createConfiguredFeature("angelica", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ANGELICA.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> CROCUS = createConfiguredFeature("crocus", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CROCUS.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> IRIS = createConfiguredFeature("iris", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IRIS.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ANEMONE_WHITE = createConfiguredFeature("white_anemone", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WHITE_ANEMONE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ANEMONE_PINK = createConfiguredFeature("pink_anemone", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ANEMONE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ROSE_WINTER = createConfiguredFeature("winter_rose", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_ROSE.defaultBlockState()), new SimpleBlockPlacer())).tries(48).whitelist(ImmutableSet.of(Blocks.SNOW_BLOCK, Blocks.GRASS_BLOCK, Blocks.SNOW)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> SNOWDROP = createConfiguredFeature("snowdrop", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SNOWDROPS.defaultBlockState()), new SimpleBlockPlacer())).tries(48).whitelist(ImmutableSet.of(Blocks.SNOW_BLOCK, Blocks.GRASS_BLOCK, Blocks.SNOW)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ALLIUM_PINK = createConfiguredFeature("pink_allium", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ALLIUM.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> DAISY_ORANGE = createConfiguredFeature("orange_daisy", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ORANGE_DAISY.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> CORNFLOWER_RED = createConfiguredFeature("red_cornflower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RED_CORNFLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> SAGE_WHITE = createConfiguredFeature("white_sage", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WHITE_SAGE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> SAGE_PURPLE = createConfiguredFeature("purple_sage", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_SAGE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> DELPHINIUM = createConfiguredFeature("delphinium", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.DELPHINIUM.defaultBlockState()), new DoublePlantBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> FOXGLOVE = createConfiguredFeature("foxglove", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FOXGLOVE.defaultBlockState()), new DoublePlantBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> DAFFODIL_YELLOW = createConfiguredFeature("yellow_daffodil", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.YELLOW_DAFFODIL.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> PUMPKIN = createConfiguredFeature("pumpkin", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.PUMPKIN.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, Blocks.PODZOL, Blocks.COARSE_DIRT, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ALPINE_BELLFLOWER = createConfiguredFeature("alpine_bellflower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ALPINE_BELLFLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> WINTER_SCILLA = createConfiguredFeature("winter_scilla", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.WINTER_SCILLA.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> KOVAN_FLOWER = createConfiguredFeature("kovan_flower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.KOVAN_FLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> FIRECRACKER_BUSH = createConfiguredFeature("firecracker_bush", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FIRECRACKER_FLOWER_BUSH.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> NETHER_BRISTLE = createConfiguredFeature("nether_bristle", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.NETHER_BRISTLE.defaultBlockState()), new DoublePlantBlockPlacer())).whitelist(ImmutableSet.of(BYGBlocks.OVERGROWN_NETHERRACK)).tries(1).noProjection().build()));

    public static final ConfiguredFeature<?, ?> TULIP_GREEN = createConfiguredFeature("green_tulip", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.GREEN_TULIP.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> TULIP_CYAN = createConfiguredFeature("cyan_tulip", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CYAN_TULIP.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> TULIP_MAGENTA = createConfiguredFeature("magenta_tulip", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.MAGENTA_TULIP.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> TULIP_PURPLE = createConfiguredFeature("purple_tulip", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_TULIP.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> TULIP_YELLOW = createConfiguredFeature("yellow_tulip", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.YELLOW_TULIP.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.PODZOL, Blocks.GRASS_BLOCK)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> REED = createConfiguredFeature("reed", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.REEDS.defaultBlockState()), new DoublePlantBlockPlacer())).tries(64).noProjection().needWater().build()));
    public static final ConfiguredFeature<?, ?> CATTAIL = createConfiguredFeature("cattail", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CATTAIL.defaultBlockState()), new DoublePlantBlockPlacer())).tries(64).noProjection().needWater().build()));

    public static final ConfiguredFeature<?, ?> GLOWCANE_BLUE = createConfiguredFeature("blue_glowcane", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLUE_GLOWCANE.defaultBlockState()), new ColumnBlockPlacer(2, 3))).tries(32).xspread(4).yspread(0).zspread(4).noProjection().build()));
    public static final ConfiguredFeature<?, ?> GLOWCANE_PURPLE = createConfiguredFeature("purple_glowcane", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_GLOWCANE.defaultBlockState()), new ColumnBlockPlacer(2, 3))).tries(32).xspread(4).yspread(0).zspread(4).noProjection().build()));
    public static final ConfiguredFeature<?, ?> GLOWCANE_RED = createConfiguredFeature("red_glowcane", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RED_GLOWCANE.defaultBlockState()), new ColumnBlockPlacer(2, 3))).tries(32).xspread(4).yspread(0).zspread(4).noProjection().build()));
    public static final ConfiguredFeature<?, ?> GLOWCANE_PINK = createConfiguredFeature("pink_glowcane", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_GLOWCANE.defaultBlockState()), new ColumnBlockPlacer(2, 3))).tries(32).xspread(4).yspread(0).zspread(4).noProjection().build()));

    public static final ConfiguredFeature<?, ?> LOLIPOP_FLOWER = createConfiguredFeature("lolipop_flower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.LOLIPOP_FLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ORCHID_RED = createConfiguredFeature("red_orchid", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.RED_ORCHID.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ORCHID_PINK = createConfiguredFeature("pink_orchid", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_ORCHID.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ORCHID_PURPLE = createConfiguredFeature("purple_orchid", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_ORCHID.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> LEATHER_FLOWER_PEACH = createConfiguredFeature("peach_leather_flower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PEACH_LEATHER_FLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> LEATHER_FLOWER_VIOLET = createConfiguredFeature("violet_leather_flower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.VIOLET_LEATHER_FLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> DAFFODIL_PINK = createConfiguredFeature("pink_daffodil", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PINK_DAFFODIL.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> DAFFODIL = createConfiguredFeature("daffodil", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.DAFFODIL.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ROSE_BLACK = createConfiguredFeature("black_rose", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BLACK_ROSE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ROSE_CYAN = createConfiguredFeature("cyan_rose", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CYAN_ROSE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ROSE_OSIRIA = createConfiguredFeature("osiria_rose", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ORSIRIA_ROSE.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> FAIRY_SLIPPER = createConfiguredFeature("fairy_slipper", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FAIRY_SLIPPER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.MEADOW_GRASSBLOCK, BYGBlocks.OVERGROWN_DACITE, BYGBlocks.OVERGROWN_STONE, Blocks.GRASS_BLOCK)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> IVIS_ROOTS = createConfiguredFeature("ivis_roots", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IVIS_ROOTS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> IVIS_SPROUT = createConfiguredFeature("ivis_sprout", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IVIS_SPROUT.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));

    public static final ConfiguredFeature<?, ?> BULBIS_SPROUTS = createConfiguredFeature("bulbis_sprouts", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BULBIS_SPROUTS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> CRYPTIC_BRAMBLE = createConfiguredFeature("cryptic_bramble", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.CRYPTIC_BRAMBLE.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));

    public static final ConfiguredFeature<?, ?> BULBIS_ODDITY = createConfiguredFeature("bulbis_oddity", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BULBIS_ODDITY.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> PURPLE_BULBIS_ODDITY = createConfiguredFeature("purple_bulbis_oddity", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_BULBIS_ODDITY.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));

    public static final ConfiguredFeature<?, ?> BULBIS_ANOMALY = createConfiguredFeature("bulbis_anomaly", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.BULBIS_ANOMALY.defaultBlockState()), new DoublePlantBlockPlacer())).tries(48).noProjection().build()));
    public static final ConfiguredFeature<?, ?> PURPLE_BULBIS_ANOMALY = createConfiguredFeature("purple_bulbis_anomaly", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.PURPLE_BULBIS_ANOMALY.defaultBlockState()), new DoublePlantBlockPlacer())).tries(48).noProjection().build()));

    public static final ConfiguredFeature<?, ?> TALL_ETHER_GRASS = createConfiguredFeature("tall_ether_grass", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_ETHER_GRASS.defaultBlockState()), new DoublePlantBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> ETHER_GRASS = createConfiguredFeature("ether_grass", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ETHER_GRASS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> ETHER_BUSH = createConfiguredFeature("ether_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ETHER_BUSH.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> THEREAL_BELLFLOWER = createConfiguredFeature("thereal_bellflower", Feature.FLOWER.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.THEREAL_BELLFLOWER.defaultBlockState()), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.ETHER_PHYLIUM, BYGBlocks.NIGHTSHADE_PHYLIUM, BYGBlocks.IVIS_PHYLIUM, Blocks.GRASS_BLOCK)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ETHER_FOLIAGE = createConfiguredFeature("ether_foliage", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ETHER_FOLIAGE.defaultBlockState()), new SimpleBlockPlacer())).tries(24).build()));

    public static final ConfiguredFeature<?, ?> NIGHTSHADE_SPROUTS = createConfiguredFeature("nightshade_sprouts", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.NIGHTSHADE_SPROUTS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> NIGHTSHADE_ROOTS = createConfiguredFeature("nightshade_roots", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.NIGHTSHADE_ROOTS.defaultBlockState()), new DoublePlantBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> NIGHTSHADE_BERRY_BUSH = createConfiguredFeature("nightshade_berry_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.NIGHTSHADE_BERRY_BUSH.defaultBlockState().setValue(BlueBerryBush.AGE, Integer.valueOf(3))), new SimpleBlockPlacer())).tries(64).whitelist(ImmutableSet.of(BYGBlocks.NIGHTSHADE_PHYLIUM, BYGBlocks.ETHER_PHYLIUM, BYGBlocks.IVIS_PHYLIUM)).noProjection().build()));

    public static final ConfiguredFeature<?, ?> ODDITY_CACTUS = createConfiguredFeature("oddity_cactus", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ODDITY_CACTUS.defaultBlockState()), new ColumnBlockPlacer(1, 4))).tries(10).noProjection().build()));
    public static final ConfiguredFeature<?, ?> ODDITY_BUSH = createConfiguredFeature("oddity_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ODDITY_BUSH.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> VERMILION_SCULK_GROWTH = createConfiguredFeature("vermilion_sculk_growth", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.VERMILION_SCULK_GROWTH.defaultBlockState(), ImmutableList.of(BYGBlocks.VERMILION_SCULK.defaultBlockState(), BYGBlocks.ETHER_STONE.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.VERMILION_SCULK.defaultBlockState(), BYGBlocks.ETHER_STONE.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> THERIUM_CRYSTAL = createConfiguredFeature("therium_crystal", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.THERIUM_CRYSTAL.defaultBlockState().setValue(TheriumCrystalBlock.AGE, 1), ImmutableList.of(BYGBlocks.THERIUM_BLOCK.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.THERIUM_BLOCK.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> VERMILION_SCULK_TENDRILS = createConfiguredFeature("vermilion_sculk_tendrils", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.VERMILION_SCULK_TENDRILS.defaultBlockState(), ImmutableList.of(BYGBlocks.VERMILION_SCULK.defaultBlockState(), BYGBlocks.ETHER_STONE.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.VERMILION_SCULK.defaultBlockState(), BYGBlocks.ETHER_STONE.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> SHULKREN_MOSS = createConfiguredFeature("shulkren_moss_blanket", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.SHULKREN_MOSS_BLANKET.defaultBlockState(), ImmutableList.of(BYGBlocks.SHULKREN_PHYLIUM.defaultBlockState(), BYGBlocks.ETHER_PHYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), BYGBlocks.SHULKREN_PHYLIUM.defaultBlockState(), BYGBlocks.ETHER_PHYLIUM.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> SHULKREN_FUNGUS = createConfiguredFeature("shulkren_fungus", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SHULKREN_FUNGUS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));

    public static final ConfiguredFeature<?, ?> IMPARIUS_MUSHROOM = createConfiguredFeature("imparius_mushroom", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IMPARIUS_MUSHROOM.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> FUNGAL_IMPARIUS = createConfiguredFeature("fungal_imparius", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.FUNGAL_IMPARIUS.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));
    public static final ConfiguredFeature<?, ?> IMPARIUS_BUSH = createConfiguredFeature("imparius_bush", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.IMPARIUS_BUSH.defaultBlockState()), new SimpleBlockPlacer())).tries(32).build()));

    public static final ConfiguredFeature<?, ?> EMBUR_ROOTS = createConfiguredFeature("embur_roots", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.EMBUR_ROOTS.defaultBlockState(), ImmutableList.of(BYGBlocks.EMBUR_NYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.EMBUR_NYLIUM.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> EMBUR_ROOTS_TALL = createConfiguredFeature("tall_embur_roots", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_EMBUR_ROOTS.defaultBlockState()), new DoublePlantBlockPlacer())).tries(1).whitelist(ImmutableSet.of(BYGBlocks.EMBUR_NYLIUM)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> EMBUR_GEL_VINE = createConfiguredFeature("embur_gel_vine", BYGFeatures.HANGING_COLUMN.configured(new HangingColumnConfig.Builder().setBlock(BYGBlocks.EMBUR_GEL_VINES).setMinLength(3).setMaxLength(3).setWhitelist(ImmutableList.of(BYGBlocks.EMBUR_GEL_BLOCK)).build()));
    public static final ConfiguredFeature<?, ?> EMBUR_WART = createConfiguredFeature("embur_wart", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.EMBUR_WART.defaultBlockState(), ImmutableList.of(BYGBlocks.EMBUR_NYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.EMBUR_NYLIUM.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> EMBUR_SPROUT = createConfiguredFeature("embur_sprout", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.EMBUR_SPROUTS.defaultBlockState(), ImmutableList.of(BYGBlocks.EMBUR_NYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.EMBUR_NYLIUM.defaultBlockState()))));

    public static final ConfiguredFeature<?, ?> CRIMSON_ROOTS_TALL = createConfiguredFeature("tall_crimson_roots", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.TALL_EMBUR_ROOTS.defaultBlockState()), new DoublePlantBlockPlacer())).tries(1).whitelist(ImmutableSet.of(BYGBlocks.OVERGROWN_CRIMSON_BLACKSTONE)).noProjection().build()));
    public static final ConfiguredFeature<?, ?> CRIMSON_BERRY_BUSH = createConfiguredFeature("crimson_berry_bush", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.CRIMSON_BERRY_BUSH.defaultBlockState().setValue(CrimsonBerryBushBlock.AGE, 3), ImmutableList.of(BYGBlocks.OVERGROWN_CRIMSON_BLACKSTONE.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.OVERGROWN_CRIMSON_BLACKSTONE.defaultBlockState(), Blocks.BLACKSTONE.defaultBlockState()))));

    public static final ConfiguredFeature<?, ?> SYTHIAN_ROOTS = createConfiguredFeature("sythian_root", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.SYTHIAN_ROOTS.defaultBlockState(), ImmutableList.of(BYGBlocks.SYTHIAN_NYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.SYTHIAN_NYLIUM.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> SYTHIAN_SPROUT = createConfiguredFeature("sythian_sprout", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.SYTHIAN_SPROUT.defaultBlockState(), ImmutableList.of(BYGBlocks.SYTHIAN_NYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.SYTHIAN_NYLIUM.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> SYTHIAN_FUNGUS = createConfiguredFeature("sythian_fungus", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.SYTHIAN_FUNGUS.defaultBlockState(), ImmutableList.of(BYGBlocks.SYTHIAN_NYLIUM.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState(), Blocks.NETHERRACK.defaultBlockState(), BYGBlocks.SYTHIAN_NYLIUM.defaultBlockState()))));
    public static final ConfiguredFeature<?, ?> SOUL_SHROOM = createConfiguredFeature("soul_shroom", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.SOUL_SHROOM.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).noProjection().build()));
    public static final ConfiguredFeature<?, ?> DEATH_CAP = createConfiguredFeature("death_cap", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.DEATH_CAP.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(64).noProjection().build()));

    public static final ConfiguredFeature<?, ?> DEAD_SEA_SPIKE = createConfiguredFeature("dead_sea_spike", BYGFeatures.POINTY_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ROCKY_STONE.defaultBlockState(), 5).add(Blocks.STONE.defaultBlockState(), 3).add(Blocks.ANDESITE.defaultBlockState(), 2)).setSeed(65).build()));
    public static final ConfiguredFeature<?, ?> DEAD_SEA_SPIKE_TALL = createConfiguredFeature("dead_sea_tall_spike", BYGFeatures.POINTY_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ROCKY_STONE.defaultBlockState(), 5).add(Blocks.STONE.defaultBlockState(), 3).add(Blocks.ANDESITE.defaultBlockState(), 2)).setSeed(85).build()));
    public static final ConfiguredFeature<?, ?> IVIS_SPIKES = createConfiguredFeature("ivis_spikes1", BYGFeatures.TALL_POINTED_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.OBSIDIAN.defaultBlockState(), 24).add(Blocks.CRYING_OBSIDIAN.defaultBlockState(), 1)).setSeed(120).setHeightMultiplier(0.4).build()));
    public static final ConfiguredFeature<?, ?> IVIS_SPIKES2 = createConfiguredFeature("ivis_spikes2", BYGFeatures.TALL_POINTED_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.OBSIDIAN.defaultBlockState(), 24).add(Blocks.CRYING_OBSIDIAN.defaultBlockState(), 1)).setSeed(15676).setHeightMultiplier(0.8).build()));

    public static final ConfiguredFeature<?, ?> END_STONE_BRICK_SPIKE = createConfiguredFeature("end_stone_brick_spike1", BYGFeatures.TALL_POINTED_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.END_STONE_BRICKS.defaultBlockState(), 24).add(Blocks.END_STONE.defaultBlockState(), 1)).setSeed(120).setHeightMultiplier(0.3).build()));
    public static final ConfiguredFeature<?, ?> END_STONE_BRICK_SPIKE2 = createConfiguredFeature("end_stone_brick_spike2", BYGFeatures.TALL_POINTED_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.END_STONE_BRICKS.defaultBlockState(), 24).add(Blocks.END_STONE.defaultBlockState(), 1)).setSeed(15676).setHeightMultiplier(0.4).build()));
    public static final ConfiguredFeature<?, ?> END_STONE_BOULDER = createConfiguredFeature("end_stone_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.END_STONE.defaultBlockState(), 3).add(Blocks.END_STONE_BRICKS.defaultBlockState(), 2)).setMinStackHeight(1).setMaxHeight(1).setMinRadius(4).setMaxRadius(8).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> PURPUR_SPIKES = createConfiguredFeature("purpur_spikes1", BYGFeatures.TALL_POINTED_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.PURPUR_STONE.defaultBlockState(), 24).add(BYGBlocks.PURPUR_STONE.defaultBlockState(), 1)).setSeed(120).setHeightMultiplier(0.5).build()));
    public static final ConfiguredFeature<?, ?> PURPUR_SPIKES2 = createConfiguredFeature("purpur_spikes2", BYGFeatures.TALL_POINTED_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.PURPUR_STONE.defaultBlockState(), 24).add(BYGBlocks.PURPUR_STONE.defaultBlockState(), 1)).setSeed(15676).setHeightMultiplier(0.4).build()));


    public static final ConfiguredFeature<?, ?> VALLE_DE_LUNA_POINTY_ROCK = createConfiguredFeature("valle_de_luna_pointy_rock", BYGFeatures.POINTY_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.WHITE_SAND.defaultBlockState(), 5).add(BYGBlocks.WHITE_CUT_SANDSTONE.defaultBlockState(), 5)).setSeed(88).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(28, 0.1F, 1))));
    public static final ConfiguredFeature<?, ?> VALLE_DE_LUNA_POINTY_ROCK_LARGE = createConfiguredFeature("valle_de_luna_pointy_rock_large", BYGFeatures.POINTY_ROCK.configured(new PointyRockConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.WHITE_SAND.defaultBlockState(), 5).add(BYGBlocks.WHITE_SMOOTH_SANDSTONE.defaultBlockState(), 5)).setSeed(100).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(4, 0.1F, 1))));


    public static final ConfiguredFeature<?, ?> ORE_PERVADED_NETHERRACK = createConfiguredFeature("ore_pervaded_netherrack", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BYGBlocks.PERVADED_NETHERRACK.defaultBlockState(), 14)).decorated(Features.Placements.RANGE_10_20_ROOFED).squared().count(14));
    public static final ConfiguredFeature<?, ?> ORE_ANTHRACITE = createConfiguredFeature("ore_anthracite", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BYGBlocks.ANTHRACITE_ORE.defaultBlockState(), 14)).decorated(Features.Placements.RANGE_10_20_ROOFED).squared().count(12));
    public static final ConfiguredFeature<?, ?> ORE_LIGNITE = createConfiguredFeature("ore_lignite", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BYGBlocks.LIGNITE_ORE.defaultBlockState(), 14)).decorated(Features.Placements.RANGE_10_20_ROOFED).squared().count(16));
    public static final ConfiguredFeature<?, ?> ORE_CRYPTIC_REDSTONE = createConfiguredFeature("ore_cryptic_redstone", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BYGBlocks.CRYPTIC_REDSTONE_ORE.defaultBlockState(), 14)).decorated(Features.Placements.RANGE_10_20_ROOFED).squared().count(12));

    public static final ConfiguredFeature<?, ?> MOSSY_STONE_BOULDER = createConfiguredFeature("mossy_stone_boulder", Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(BYGBlocks.MOSSY_STONE.defaultBlockState())));
    public static final ConfiguredFeature<?, ?> ROCKY_STONE_BOULDER = createConfiguredFeature("rocky_stone_boulder", Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(BYGBlocks.ROCKY_STONE.defaultBlockState())));
    public static final ConfiguredFeature<?, ?> BLACKSTONE_BOULDER = createConfiguredFeature("blackstone_boulder", Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(Blocks.BLACKSTONE.defaultBlockState())));
    public static final ConfiguredFeature<?, ?> ORANGE_TERRACOTTA_BOULDER = createConfiguredFeature("orange_terracotta_boulder", Feature.FOREST_ROCK.configured(new BlockStateFeatureConfig(Blocks.ORANGE_TERRACOTTA.defaultBlockState())));

    public static final ConfiguredFeature<?, ?> SHATTERED_FLOATING_ISLAND1 = createConfiguredFeature("shattered_floating_island1", BYGFeatures.SHATTERED_FLOATING_ISLAND1.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(11).setMaxRadius(13).build()));
    public static final ConfiguredFeature<?, ?> SHATTERED_FLOATING_ISLAND2 = createConfiguredFeature("shattered_floating_island2", BYGFeatures.SHATTERED_FLOATING_ISLAND2.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(11).setMaxRadius(13).build()));
    public static final ConfiguredFeature<?, ?> SHATTERED_FLOATING_ISLAND3 = createConfiguredFeature("shattered_floating_island3", BYGFeatures.SHATTERED_FLOATING_ISLAND3.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(11).setMaxRadius(13).build()));
    public static final ConfiguredFeature<?, ?> SHATTERED_FLOATING_ISLAND4 = createConfiguredFeature("shattered_floating_island4", BYGFeatures.SHATTERED_FLOATING_ISLAND4.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(13).setMaxRadius(17).build()));

    public static final ConfiguredFeature<?, ?> FLOATING_ISLAND1 = createConfiguredFeature("floating_island1", BYGFeatures.FLOATING_ISLAND1.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(11).setMaxRadius(13).build()));
    public static final ConfiguredFeature<?, ?> FLOATING_ISLAND2 = createConfiguredFeature("floating_island2", BYGFeatures.FLOATING_ISLAND2.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(11).setMaxRadius(13).build()));
    public static final ConfiguredFeature<?, ?> FLOATING_ISLAND3 = createConfiguredFeature("floating_island3", BYGFeatures.FLOATING_ISLAND3.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(11).setMaxRadius(13).build()));
    public static final ConfiguredFeature<?, ?> FLOATING_ISLAND4 = createConfiguredFeature("floating_island4", BYGFeatures.FLOATING_ISLAND4.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(13).setMaxRadius(17).build()));
    public static final ConfiguredFeature<?, ?> FLOATING_ISLAND5 = createConfiguredFeature("floating_island5", BYGFeatures.FLOATING_ISLAND5.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.VERMILION_SCULK).setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinRadius(13).setMaxRadius(17).build()));

    public static final ConfiguredFeature<?, ?> FLOATING_DESERT_ISLAND1 = createConfiguredFeature("floating_desert_island1", BYGFeatures.FLOATING_ISLAND1.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.END_SAND).setBlock(new WeightedBlockStateProvider().add(Blocks.END_STONE_BRICKS.defaultBlockState(), 20).add(Blocks.END_STONE.defaultBlockState(), 2)).setMinRadius(12).setMaxRadius(19).build()));
    public static final ConfiguredFeature<?, ?> FLOATING_DESERT_ISLAND2 = createConfiguredFeature("floating_desert_island2", BYGFeatures.FLOATING_ISLAND2.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.END_SAND).setBlock(new WeightedBlockStateProvider().add(Blocks.END_STONE_BRICKS.defaultBlockState(), 20).add(Blocks.END_STONE.defaultBlockState(), 2)).setMinRadius(12).setMaxRadius(20).build()));
    public static final ConfiguredFeature<?, ?> FLOATING_DESERT_ISLAND3 = createConfiguredFeature("floating_desert_island3", BYGFeatures.FLOATING_ISLAND3.configured(new FloatingIslandConfig.Builder().setTopBlock(BYGBlocks.END_SAND).setBlock(new WeightedBlockStateProvider().add(Blocks.END_STONE_BRICKS.defaultBlockState(), 20).add(Blocks.END_STONE.defaultBlockState(), 2)).setMinRadius(12).setMaxRadius(21).build()));

    public static final ConfiguredFeature<PumpkinConfig, ?> PUMPKIN1 = createConfiguredFeature("pumpkin1", BYGFeatures.LARGE_PUMPKIN1.configured(new PumpkinConfig.Builder().setPumpkinBlock(Blocks.PUMPKIN).build()));
    public static final ConfiguredFeature<PumpkinConfig, ?> PUMPKIN2 = createConfiguredFeature("pumpkin2", BYGFeatures.LARGE_PUMPKIN2.configured(new PumpkinConfig.Builder().setPumpkinBlock(Blocks.PUMPKIN).setStemBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).build()));


    /***********************************************************Configured & Decorated Features***********************************************************/

    public static final ConfiguredFeature<?, ?> FROST_MAGMA_LAKE = createConfiguredFeature("frost_magma_lake", BYGFeatures.FROSTED_LAKE.configured(new BlockStateFeatureConfig(BYGBlocks.FROST_MAGMA.defaultBlockState())).decorated(Placement.WATER_LAKE.configured(new ChanceConfig(4))));
    public static final ConfiguredFeature<?, ?> WARPED_CORAL_PLANT = createConfiguredFeature("warped_coral_plant", BYGFeatures.HUGE_WARPED_CORAL_PLANT.configured(new WhitelistedSimpleBlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.WARPED_CORAL_BLOCK.defaultBlockState()), ImmutableList.of(BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState(), BYGBlocks.NYLIUM_SOUL_SAND.defaultBlockState()))).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(2, 0.2F, 1))));
    public static final ConfiguredFeature<?, ?> SYTHIAN_STALK = createConfiguredFeature("sythian_stalk", BYGFeatures.SYTHIAN_STALK.configured(new ProbabilityConfig(0.9F)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10, 0.5F, 8))));
    public static final ConfiguredFeature<?, ?> EMBUR_LILY = createConfiguredFeature("embur_lily", Feature.SIMPLE_BLOCK.configured(new BlockWithContextConfig(BYGBlocks.EMBUR_LILY.defaultBlockState(), ImmutableList.of(Blocks.LAVA.defaultBlockState()), ImmutableList.of(Blocks.AIR.defaultBlockState()), ImmutableList.of(Blocks.LAVA.defaultBlockState()))).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(2, 0.5F, 2))));
    public static final ConfiguredFeature<?, ?> WIDE_WATER_LAKE = createConfiguredFeature("wide_water_lake", BYGFeatures.WIDE_LAKE.configured(new SimpleBlockProviderConfig(new SimpleBlockStateProvider(Blocks.WATER.defaultBlockState()))).decorated(BYGDecorators.ANY_WATER_OR_SOLID_SURFACE.configured(new FeatureSpreadConfig(4))));
    public static final ConfiguredFeature<?, ?> END_LAKE = createConfiguredFeature("end_lake", BYGFeatures.END_LAKE.configured(IFeatureConfig.NONE).decorated(Placement.WATER_LAKE.configured(new ChanceConfig(4))));
    public static final ConfiguredFeature<?, ?> BULBIS_WATER_LAKE = createConfiguredFeature("bulbis_water_lake", BYGFeatures.WIDE_LAKE.configured(new SimpleBlockProviderConfig(new SimpleBlockStateProvider(Blocks.WATER.defaultBlockState()))).decorated(BYGDecorators.ANY_WATER_OR_SOLID_SURFACE.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> STACKED_BOULDERS = createConfiguredFeature("stacked_boulders", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.STONE.defaultBlockState(), 3).add(Blocks.DIORITE.defaultBlockState(), 2)).setMinStackHeight(10).setMaxHeight(15).setMinRadius(8).setMaxRadius(28).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.15F, 1))));
    public static final ConfiguredFeature<?, ?> GRASSLAND_BOULDER = createConfiguredFeature("grassland_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ROCKY_STONE.defaultBlockState(), 3).add(BYGBlocks.MOSSY_STONE.defaultBlockState(), 2)).setMinStackHeight(1).setMaxHeight(1).setMinRadius(8).setMaxRadius(12).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
    public static final ConfiguredFeature<?, ?> GRANITE_BOULDER = createConfiguredFeature("granite_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.GRANITE.defaultBlockState(), 3).add(Blocks.POLISHED_GRANITE.defaultBlockState(), 2)).setMinStackHeight(1).setMaxHeight(1).setMinRadius(5).setMaxRadius(9).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
    public static final ConfiguredFeature<?, ?> ARCH = createConfiguredFeature("arch", BYGFeatures.ARCH.configured(new SimpleBlockProviderConfig(new SimpleBlockStateProvider(Blocks.DIAMOND_BLOCK.defaultBlockState()))).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.015F, 1))));
    public static final ConfiguredFeature<?, ?> ARCH2 = createConfiguredFeature("arch2", BYGFeatures.ARCH.configured(new SimpleBlockProviderConfig(new SimpleBlockStateProvider(Blocks.EMERALD_BLOCK.defaultBlockState()))).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.015F, 1))));
    public static final ConfiguredFeature<?, ?> CRYPTIC_CAVES = createConfiguredFeature("cryptic_caves", BYGFeatures.NOISY_CAVE_SPHERE.configured((new NoisySphereConfig.Builder().setMinXRadius(20).setMaxXRadius(30).setMinYRadius(10).setMaxYRadius(16).setMinZRadius(14).setMaxZRadius(20).setBlock(Blocks.CAVE_AIR).build())).range(55).squared().count(2));
    public static final ConfiguredFeature<?, ?> IRON_SURFACE_DEPOSIT = createConfiguredFeature("iron_surface_deposit", BYGFeatures.MINERAL_DEPOSIT.configured((new NoisySphereConfig.Builder().setMinXRadius(6).setMaxXRadius(14).setMinYRadius(4).setMaxYRadius(9).setMinZRadius(4).setMaxZRadius(7).setBlock(Blocks.IRON_ORE).build())).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.05F, 2))));
    public static final ConfiguredFeature<?, ?> ETHER_STONE_BOULDER = createConfiguredFeature("ether_stone_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.ETHER_STONE.defaultBlockState(), 20).add(BYGBlocks.LIGNITE_ORE.defaultBlockState(), 2)).setMinStackHeight(1).setMaxHeight(1).setMinRadius(8).setMaxRadius(12).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.1F, 1))));
    public static final ConfiguredFeature<?, ?> ENDER_LILY = createConfiguredFeature("ender_lily", Feature.RANDOM_PATCH.configured((new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlocks.ENDER_LILY.defaultBlockState()), SimpleBlockPlacer.INSTANCE)).tries(10).build()).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(4));

    public static final ConfiguredFeature<?, ?> CRYPTIC_SPIKE = createConfiguredFeature("cryptic_spike", BYGFeatures.SPIKE.configured(new SimpleBlockProviderConfig(new WeightedBlockStateProvider().add(BYGBlocks.CRYPTIC_STONE.defaultBlockState(), 5).add(BYGBlocks.CRYPTIC_MAGMA_BLOCK.defaultBlockState(), 5))).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.18F, 1))));
    public static final ConfiguredFeature<?, ?> BLACK_ICE_SNOW = createConfiguredFeature("black_ice_snow", BYGFeatures.ICE_SNOW.configured(new Simple2BlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.BLACK_ICE.defaultBlockState()), new SimpleBlockStateProvider(Blocks.SNOW.defaultBlockState()))).decorated(Placement.NOPE.configured(new NoPlacementConfig())));
    public static final ConfiguredFeature<?, ?> BULBIS_GARDENS_CAVES = createConfiguredFeature("bulbis_gardens_caves", BYGFeatures.NOISY_CAVE_SPHERE_WATER.configured((new NoisySphereConfig.Builder().setMinXRadius(20).setMaxXRadius(30).setMinYRadius(10).setMaxYRadius(16).setMinZRadius(14).setMaxZRadius(20).setBlock(Blocks.CAVE_AIR).build())).range(55).squared().count(2));
    public static final ConfiguredFeature<?, ?> CANYON_RIVER = createConfiguredFeature("ahhhh", BYGFeatures.CANYON_RIVER.configured(new NoFeatureConfig()).decorated(Placement.NOPE.configured(new NoPlacementConfig())));

    public static final ConfiguredFeature<?, ?> THERIUM_CRYSTAL_DEPOSIT = createConfiguredFeature("therium_crystal_deposit", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.THERIUM_BLOCK.defaultBlockState(), 20).add(BYGBlocks.ETHER_STONE.defaultBlockState(), 2)).setMinStackHeight(0).setMaxHeight(0).setMinRadius(4).setMaxRadius(5).build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.015F, 1))));

    public static final ConfiguredFeature<?, ?> RED_ROCK_BOULDER = createConfiguredFeature("red_rock_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.RED_ROCK.defaultBlockState(), 3).add(BYGBlocks.RED_ROCK.defaultBlockState(), 9).add(Blocks.RED_CONCRETE.defaultBlockState(), 1)).setMinStackHeight(7).setMaxHeight(12).setMinRadius(8).setMaxRadius(12).build()));
    public static final ConfiguredFeature<?, ?> WHITE_SANDSTONE_BOULDER = createConfiguredFeature("white_sandstone_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(BYGBlocks.WHITE_SANDSTONE.defaultBlockState(), 3).add(BYGBlocks.WHITE_SMOOTH_SANDSTONE.defaultBlockState(), 2).add(BYGBlocks.WHITE_SMOOTH_SANDSTONE.defaultBlockState(), 3).add(BYGBlocks.WHITE_SAND.defaultBlockState(), 5)).setMinStackHeight(3).setMaxHeight(12).setMinRadius(13).setMaxRadius(20).setRadiusDivisor(1.1).flattenTopBoulder().build()).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.04F, 1))));
    public static final ConfiguredFeature<?, ?> TERRACOTTA_BOULDER = createConfiguredFeature("terracotta_boulder", BYGFeatures.STACKABLE_BOULDERS.configured(new BoulderConfig.Builder().setBlock(new WeightedBlockStateProvider().add(Blocks.TERRACOTTA.defaultBlockState(), 3).add(Blocks.TERRACOTTA.defaultBlockState(), 3).add(Blocks.RED_TERRACOTTA.defaultBlockState(), 7)).setMinStackHeight(7).setMaxHeight(12).setMinRadius(8).setMaxRadius(12).build()));


    public static final ConfiguredFeature<?, ?> RIVER = createConfiguredFeature("river_aheehee", BYGFeatures.HUH.configured(DecoratedFeatureConfig.NONE).decorated(Placement.NOPE.configured(new NoPlacementConfig())));
    public static final ConfiguredFeature<?, ?> VOLCANO = createConfiguredFeature("volcano", BYGFeatures.VOLCANO.configured(new SimpleBlockProviderConfig(new WeightedBlockStateProvider().add(Blocks.BLACKSTONE.defaultBlockState(), 4).add(Blocks.BLACK_CONCRETE.defaultBlockState(), 3).add(Blocks.STONE.defaultBlockState(), 2).add(BYGBlocks.MAGMATIC_STONE.defaultBlockState(), 1))).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.025F, 1))));
    public static final ConfiguredFeature<?, ?> PURPUR_PEAK = createConfiguredFeature("purpur_peak", BYGFeatures.PURPUR_PEAK.configured(new SimpleBlockProviderConfig(new WeightedBlockStateProvider().add(BYGBlocks.PURPUR_STONE.defaultBlockState(), 10))).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.25F, 1))));
    public static final ConfiguredFeature<?, ?> BASALT_DELTA = createConfiguredFeature("delta", Feature.DELTA_FEATURE.configured(new BasaltDeltasFeature(Blocks.WATER.defaultBlockState(), Blocks.WATER.defaultBlockState(), FeatureSpread.of(3, 4), FeatureSpread.of(0, 2))).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(2))));
    public static final ConfiguredFeature<?, ?> SMALL_BASALT_COLUMN = createConfiguredFeature("small_basalt_columns", Feature.BASALT_COLUMNS.configured(new ColumnConfig(FeatureSpread.fixed(1), FeatureSpread.of(1, 1))).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> LARGE_BASALT_COLUMN = createConfiguredFeature("large_basalt_columns", Feature.BASALT_COLUMNS.configured(new ColumnConfig(FeatureSpread.of(2, 1), FeatureSpread.of(1, 1))).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));

    /***********************************************************Configured Placement***********************************************************/

    public static final ConfiguredFeature<?, ?> BULBIS_SPROUT_PLANT = createConfiguredFeature("bulbis_sprout_plant", BULBIS_SPROUTS.decorated(Features.Placements.FIRE).count(5));

    public static final ConfiguredFeature<?, ?> CALIFORNIA_POPPIES = createConfiguredFeature("california_poppies", CALIFORNIA_POPPY.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WINTER_SUCCLULENTS = createConfiguredFeature("winter_succulents", WINTER_SUCCULENT.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> HORSEWEEDS = createConfiguredFeature("horseweeds", HORSEWEED.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> BLACKSTONE_BOULDERS = createConfiguredFeature("blackstone_boulders", BLACKSTONE_BOULDER.decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.3F, 3))));
    public static final ConfiguredFeature<?, ?> ROCKY_STONE_BOULDERS = createConfiguredFeature("rocky_stone_boulders", ROCKY_STONE_BOULDER.decorated(Features.Placements.HEIGHTMAP_SQUARE).countRandom(2));
    public static final ConfiguredFeature<?, ?> MOSSY_STONE_BOULDERS = createConfiguredFeature("mossy_stone_boulders", MOSSY_STONE_BOULDER.decorated(Features.Placements.HEIGHTMAP_SQUARE).countRandom(2));
    public static final ConfiguredFeature<?, ?> ORANGE_TERRACOTTA_BOULDERS = createConfiguredFeature("orange_terracotta_boulders", ORANGE_TERRACOTTA_BOULDER.decorated(Features.Placements.HEIGHTMAP_SQUARE).countRandom(2));
    public static final ConfiguredFeature<?, ?> FIRECRACKER_BUSHES = createConfiguredFeature("firecracker_bushes", FIRECRACKER_BUSH.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> PUMPKINS = createConfiguredFeature("pumpkins", PUMPKIN.decorated(Features.Placements.ADD_32).count(8));
    public static final ConfiguredFeature<?, ?> BLUE_BERRY_BUSHES = createConfiguredFeature("blue_berry_bushes", BLUE_BERRY_BUSH.decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE));
    public static final ConfiguredFeature<?, ?> LUSH_BLUE_BERRY_BUSHES = createConfiguredFeature("lush_blue_berry_bushes", BLUE_BERRY_BUSH.decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).chance(12));
    public static final ConfiguredFeature<?, ?> SHORT_GRASSES = createConfiguredFeature("short_grass", SHORT_GRASS.decorated(Features.Placements.ADD_32).count(10));
    public static final ConfiguredFeature<?, ?> EMBUR_SPROUTS = createConfiguredFeature("embur_sprouts", EMBUR_SPROUT.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(30))));
    public static final ConfiguredFeature<?, ?> NYLIUM_SOUL_FIRE = createConfiguredFeature("nylium_soul_fire", NYLIUM_SOUL_FIRE_PATCH.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> CRYPTIC_FIRE = createConfiguredFeature("cryptic_fire", CRYPTIC_FIRE_PATCH.decorated(Features.Placements.FIRE).count(2));
    public static final ConfiguredFeature<?, ?> MAGMA_FIRE = createConfiguredFeature("magma_fire", MAGMA_FIRE_PATCH.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> BORIC_FIRE = createConfiguredFeature("boric_fire", BORIC_FIRE_PATCH.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> QUARTZ_CRYSTALS = createConfiguredFeature("quartz_crystals", QUARTZ_CRYSTAL.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(50))));
    public static final ConfiguredFeature<?, ?> EMBUR_GEL_VINES = createConfiguredFeature("embur_gel_vines", EMBUR_GEL_VINE.range(128).squared().count(100));
    public static final ConfiguredFeature<?, ?> CRYPTIC_BRAMBLES = createConfiguredFeature("cryptic_brambles", CRYPTIC_BRAMBLE.decorated(Features.Placements.FIRE).count(1));


    /***********************************************************Configured Random Selector Features***********************************************************/

    public static final ConfiguredFeature<?, ?> RANDOM_ALLIUM_FLOWER = createConfiguredFeature("allium_flowers", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ALLIUM_TALL_BUSH.weighted(0.25F),
            ALLIUM_TALL_PINK_BUSH.weighted(0.25F),
            ALLIUM_BUSH.weighted(0.25F)),
            ALLIUM_PINK_BUSH)).decorated(Features.Placements.FIRE).count(60));

    public static final ConfiguredFeature<?, ?> RANDOM_AMARANTH_FLOWER = createConfiguredFeature("amaranth_flowers", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            AMARANTH.weighted(0.2F),
            AMARANTH_CYAN.weighted(0.2F),
            AMARANTH_MAGENTA.weighted(0.2F),
            AMARANTH_ORANGE.weighted(0.2F)),
            AMARANTH_PURPLE)).decorated(Features.Placements.FIRE).count(60));

    public static final ConfiguredFeature<?, ?> RANDOM_ROSE_FIELD_FLOWER = createConfiguredFeature("rose_field_flower", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ROSE_OSIRIA.weighted(0.25F),
            ROSE.weighted(0.25F)),
            ROSE_BUSH)).decorated(Features.Placements.FIRE).count(60));

    public static final ConfiguredFeature<?, ?> RANDOM_DESERT_PLANTS = createConfiguredFeature("desert_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            MINI_CACTI.weighted(0.3F),
            PRICKLY_PEAR_CACTI.weighted(0.3F),
            GOLDEN_SPINED_CACTI.weighted(0.3F)),
            FIRECRACKER_BUSH)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_LUNA_BOULDERS = createConfiguredFeature("luna_boulders", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RED_ROCK_BOULDER.weighted(0.5F)),
            TERRACOTTA_BOULDER)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(0, 0.3F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_PRAIRIE_GRASS = createConfiguredFeature("prairie_grasses", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PRAIRIE_GRASS_PATCH.weighted(0.92F)),
            PRAIRIE_TALL_GRASS_PATCH)).decorated(Features.Placements.FIRE).count(60));

    public static final ConfiguredFeature<?, ?> RANDOM_BEACH_GRASS = createConfiguredFeature("beach_grasses", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BEACH_GRASS.weighted(0.50F)),
            BEACH_SHORT_GRASS_PATCH)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWCANE = createConfiguredFeature("glowcane", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            GLOWCANE_BLUE.weighted(0.25F),
            GLOWCANE_PINK.weighted(0.25F),
            GLOWCANE_PURPLE.weighted(0.25F)),
            GLOWCANE_RED)).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(60));

    public static final ConfiguredFeature<?, ?> RANDOM_BYG_GRASS = createConfiguredFeature("grass", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHORT_GRASS.weighted(0.50F)),
            Features.PATCH_GRASS_NORMAL)).decorated(Features.Placements.ADD_32).count(10));

    public static final ConfiguredFeature<?, ?> RANDOM_BYG_FERN_GRASS = createConfiguredFeature("fern_grass", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHORT_GRASS.weighted(0.50F)),
            Features.PATCH_TAIGA_GRASS)).decorated(Features.Placements.ADD_32).count(10));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWSHROOM = createConfiguredFeature("glowshrooms", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_GLOWSHROOM.weighted(0.50F)),
            PURPLE_GLOWSHROOM)).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).chance(4));

    public static final ConfiguredFeature<?, ?> RANDOM_MUSHROOM = createConfiguredFeature("mushrooms", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLACK_PUFF.weighted(0.50F),
            WOOD_BLEWIT.weighted(0.50F),
            WEEPING_MILKCAP.weighted(0.50F)),
            GREEN_MUSHROOM)).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).chance(4));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWSTONE_GARDEN_VEGETATION = createConfiguredFeature("glowstone_garden_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SOUL_SHROOM.weighted(0.2F),
            DEATH_CAP.weighted(0.2F)),
            NETHER_BRISTLE)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(4)).count(1)));

    public static final ConfiguredFeature<?, ?> RANDOM_CRIMSON_GARDEN_VEGETATION = createConfiguredFeature("crimson_garden_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_ROOTS_TALL.weighted(0.45F),
            CRIMSON_ROOTS_TALL.weighted(0.8F)),
            CRIMSON_BERRY_BUSH)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(25))));

    public static final ConfiguredFeature<?, ?> RANDOM_EMBUR_BOG_PLANT = createConfiguredFeature("embur_bog_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_ROOTS_TALL.weighted(0.45F),
            EMBUR_ROOTS.weighted(0.5F)),
            EMBUR_WART)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_SUBZERO_ASH_PATCH = createConfiguredFeature("subzero_ashes", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SUBZERO_ASH.weighted(0.6F)),
            SUBZERO_ASH_BLOCK)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(3))));

    public static final ConfiguredFeature<?, ?> WEEPING_ROOTS = createConfiguredFeature("weeping_roots", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(Blocks.GLOWSTONE).setBlock(BYGBlocks.WEEPING_ROOTS_PLANT).setEndBlock(BYGBlocks.WEEPING_ROOTS.defaultBlockState().setValue(AbstractTopPlantBlock.AGE, 23)).setWhitelist(ImmutableList.of(Blocks.NETHERRACK, Blocks.GLOWSTONE, Blocks.BLACKSTONE)).build()).range(128).squared().count(80));
    public static final ConfiguredFeature<?, ?> WEEPING_VINES = createConfiguredFeature("weeping_vines", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(Blocks.GLOWSTONE).setBlock(Blocks.WEEPING_VINES_PLANT).setEndBlock(Blocks.WEEPING_VINES.defaultBlockState().setValue(AbstractTopPlantBlock.AGE, 23)).setWhitelist(ImmutableList.of(Blocks.NETHERRACK, Blocks.GLOWSTONE, Blocks.BLACKSTONE)).build()).range(128).squared().count(80));
    public static final ConfiguredFeature<?, ?> SOUL_SOIL_PILLARS = createConfiguredFeature("soul_soil_pillars", BYGFeatures.PILLARS.configured(new SimpleBlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.NYLIUM_SOUL_SOIL.defaultBlockState()))).range(128).squared().count(50));
    public static final ConfiguredFeature<?, ?> FROST_MAGMA_PILLARS = createConfiguredFeature("frost_magma_pillars", BYGFeatures.PILLARS.configured((new SimpleBlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.FROST_MAGMA.defaultBlockState())))).range(128).squared().count(50));
    public static final ConfiguredFeature<?, ?> MAGMA_PILLARS = createConfiguredFeature("magma_pillars", BYGFeatures.PILLARS.configured((new SimpleBlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.MAGMATIC_STONE.defaultBlockState())))).range(128).squared().count(65));
    public static final ConfiguredFeature<?, ?> BRIMSTONE_PILLARS = createConfiguredFeature("brimstone_pillars", BYGFeatures.PILLARS.configured((new SimpleBlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.BRIMSTONE.defaultBlockState())))).range(128).squared().count(80));
    public static final ConfiguredFeature<?, ?> QUARTZ_COLUMNS = createConfiguredFeature("quartz_columns", BYGFeatures.QUARTZ_COLUMNS.configured(new ColumnConfig(FeatureSpread.fixed(1), FeatureSpread.of(1, 3))).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(4))));

    public static final ConfiguredFeature<?, ?> RANDOM_SYTHIAN_PLANT = createConfiguredFeature("sythian_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SYTHIAN_SPROUT.weighted(0.5F),
            SYTHIAN_ROOTS.weighted(0.46F)),
            SYTHIAN_FUNGUS)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> HANGING_SOUL_SHROOM_SPORES = createConfiguredFeature("hanging_soul_shroom_spores", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setBlock(BYGBlocks.SOUL_SHROOM_SPORE).setEndBlock(BYGBlocks.SOUL_SHROOM_SPORE_END.defaultBlockState().setValue(AbstractTopPlantBlock.AGE, 23)).setMinLength(1).setMaxLength(8).setWhitelist(ImmutableList.of(Blocks.SOUL_SOIL, Blocks.SOUL_SAND, BYGBlocks.NYLIUM_SOUL_SAND, BYGBlocks.NYLIUM_SOUL_SAND)).build()).range(128).squared().count(45));
    public static final ConfiguredFeature<?, ?> HANGING_SYTHIAN_ROOTS = createConfiguredFeature("hanging_sythian_roots", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setBlock(BYGBlocks.HANGING_SYTHIAN_ROOTS_PLANT.defaultBlockState()).setEndBlock(BYGBlocks.HANGING_SYTHIAN_ROOTS.defaultBlockState().setValue(AbstractTopPlantBlock.AGE, 23)).setMinLength(1).setMaxLength(8).setWhitelist(ImmutableList.of(Blocks.NETHERRACK, BYGBlocks.SYTHIAN_WART_BLOCK)).build()).range(128).squared().count(80));
    public static final ConfiguredFeature<?, ?> MOSSY_NETHERRACK_PILLARS = createConfiguredFeature("mossy_netherrack_pillars", BYGFeatures.PILLARS.configured(new SimpleBlockProviderConfig(new SimpleBlockStateProvider(BYGBlocks.MOSSY_NETHERRACK.defaultBlockState()))).range(128).squared().count(50));
    public static final ConfiguredFeature<?, ?> SYTHIAN_FUNGUS_PILLARS = createConfiguredFeature("sythian_fungus_pillars", BYGFeatures.PILLARS.configured(new SimpleBlockProviderConfig(new WeightedBlockStateProvider().add(BYGBlocks.SYTHIAN_HYPHAE.defaultBlockState(), 9).add(BYGBlocks.SYTHIAN_HYPHAE.defaultBlockState(), 1))).range(128).squared().count(50));
    public static final ConfiguredFeature<?, ?> HANGING_BONE_FEATURE = createConfiguredFeature("hanging_bone", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(Blocks.BONE_BLOCK).setBlock(BYGBlocks.HANGING_BONE).setMinLength(1).setMaxLength(8).setWhitelist(ImmutableList.of(BYGBlocks.QUARTZITE_SAND, Blocks.BONE_BLOCK)).build()).range(128).squared().count(70));
    public static final ConfiguredFeature<?, ?> LAMENT_VINE_FEATURE = createConfiguredFeature("lament_vine", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(Blocks.NETHERRACK).setBlock(BYGBlocks.LAMENT_VINE_PLANT).setEndBlock(BYGBlocks.LAMENT_VINE.defaultBlockState().setValue(AbstractTopPlantBlock.AGE, 23)).setMinLength(1).setMaxLength(8).setWhitelist(ImmutableList.of(Blocks.NETHERRACK)).build()).range(128).squared().count(70));


    public static final ConfiguredFeature<?, ?> HANGING_THERIUM_LANTERNS = createConfiguredFeature("hanging_therium_lanterns", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(BYGBlocks.ETHER_STONE).setBlock(Blocks.CHAIN.defaultBlockState()).setEndBlock(BYGBlocks.THERIUM_LANTERN.defaultBlockState().setValue(LanternBlock.HANGING, true)).setMinLength(1).setMaxLength(8).setWhitelist(ImmutableList.of(BYGBlocks.ETHER_STONE)).build()).range(256).squared().count(80));
    public static final ConfiguredFeature<?, ?> HANGING_SHULKREN_VINE = createConfiguredFeature("hanging_shulkren_vine", BYGFeatures.HANGING_FEATURE.configured(new HangingColumnWithBaseConfig.Builder().setBaseBlock(Blocks.END_STONE).setBlock(BYGBlocks.SHULKREN_VINE_PLANT.defaultBlockState()).setEndBlock(BYGBlocks.SHULKREN_VINE.defaultBlockState().setValue(AbstractTopPlantBlock.AGE, 23)).setMinLength(1).setMaxLength(8).setWhitelist(ImmutableList.of(Blocks.END_STONE, BYGBlocks.SHULKREN_PHYLIUM)).build()).range(256).squared().count(80));

    public static final ConfiguredFeature<?, ?> RANDOM_JUNGLE_FLOWERS = createConfiguredFeature("jungle_flowers", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BISTORT.weighted(0.50F),
            GUZMANIA.weighted(0.50F),
            BEGONIA.weighted(0.50F),
            LAZARUS_BELLFLOWER.weighted(0.50F),
            RICHEA.weighted(0.50F),
            TORCH_GINGER.weighted(0.50F)),
            INCAN_LILY)).decorated(Features.Placements.ADD_32).count(5));


    public static final ConfiguredFeature<?, ?> AZALEAS = createConfiguredFeature("azaleas", AZALEA.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> SUNFLOWERS = createConfiguredFeature("sunflowers",  Features.PATCH_SUNFLOWER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> JAPANESE_ORCHIDS = createConfiguredFeature("japanese_orchids",  Features.PATCH_SUNFLOWER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> DELPHINIUMS = createConfiguredFeature("delphiniums",  DELPHINIUM.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WILTED_GRASS = createConfiguredFeature("wilted_grass",  WILTED_GRASS_PATCH.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WEED_GRASS = createConfiguredFeature("weed_grass",  WEED_GRASS_PATCH.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WINTER_GRASS = createConfiguredFeature("winter_grass",  WINTER_GRASS_PATCH.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> LEAF_PILES = createConfiguredFeature("leaf_piles",  LEAF_PILE.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WAILING_VINES = createConfiguredFeature("wailing_vines",  WAILING_VINE.range(128).squared().count(100));
    public static final ConfiguredFeature<?, ?> ROSES = createConfiguredFeature("roses",  ROSE.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> ANGELICAS = createConfiguredFeature("angelicas",  ANGELICA.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> CROCUSES = createConfiguredFeature("crocuses",  CROCUS.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> IRISES = createConfiguredFeature("irises",  IRIS.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WINTER_ROSES = createConfiguredFeature("winter_roses",  ROSE_WINTER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> SNOWDROPS = createConfiguredFeature("snowdrops",  SNOWDROP.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> PINK_ALLIUMS = createConfiguredFeature("pink_alliums",  ALLIUM_PINK.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> ORANGE_DAISIES = createConfiguredFeature("orange_daises",  DAISY_ORANGE.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> RED_CORNFLOWERS = createConfiguredFeature("red_cornflowers",  CORNFLOWER_RED.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> FOXGLOVES = createConfiguredFeature("foxgloves",  FOXGLOVE.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> YELLOW_DAFFODILS = createConfiguredFeature("yellow_daffodils",  DAFFODIL_YELLOW.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> ALPINE_BELLFLOWERS = createConfiguredFeature("alpine_bellflowers",  ALPINE_BELLFLOWER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> WINTER_SCILLAS = createConfiguredFeature("winter_scillas",  WINTER_SCILLA.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> KOVAN_FLOWERS = createConfiguredFeature("kovan_flowers",  KOVAN_FLOWER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> REEDS = createConfiguredFeature("reeds",  REED.decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> CATTAILS = createConfiguredFeature("cattails",  CATTAIL.decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(20));
    public static final ConfiguredFeature<?, ?> LOLIPOP_FLOWERS = createConfiguredFeature("lolipop_flowers",  LOLIPOP_FLOWER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> BLACK_ROSES = createConfiguredFeature("black_roses",  ROSE_BLACK.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> CYAN_ROSES = createConfiguredFeature("cyan_roses",  ROSE_CYAN.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> OSIRIA_ROSES = createConfiguredFeature("osiria_roses",  ROSE_OSIRIA.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> FAIRY_SLIPPERS = createConfiguredFeature("fairy_slippers",  FAIRY_SLIPPER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> NIGHTSHADE_BERRY_BUSHES = createConfiguredFeature("nightshade_berry_bushes",  NIGHTSHADE_BERRY_BUSH.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(1));
    public static final ConfiguredFeature<?, ?> THEREAL_BELLFLOWERS = createConfiguredFeature("thereal_bellflowers",  THEREAL_BELLFLOWER.decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));
    public static final ConfiguredFeature<?, ?> ETHER_FOLIAGES = createConfiguredFeature("ether_foliages",  ETHER_FOLIAGE.decorated(Features.Placements.FIRE).count(5));
    public static final ConfiguredFeature<?, ?> VERMILION_SCULK_GROWTHS = createConfiguredFeature("vermilion_sculk_growths",  VERMILION_SCULK_GROWTH.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(45))));
    public static final ConfiguredFeature<?, ?> VERMILION_SCULK_TENDRIL = createConfiguredFeature("vermilion_sculk_tendril",  VERMILION_SCULK_TENDRILS.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(80))));
    public static final ConfiguredFeature<?, ?> THERIUM_CRYSTALS = createConfiguredFeature("therium_crystals",  THERIUM_CRYSTAL.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(65))));
    public static final ConfiguredFeature<?, ?> SHULKREN_MOSSES = createConfiguredFeature("shulkren_mosses",  SHULKREN_MOSS.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(45))));
    public static final ConfiguredFeature<?, ?> SHULKREN_FUNGI = createConfiguredFeature("shulkren_fungi",  SHULKREN_FUNGUS.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));

    public static final ConfiguredFeature<?, ?> FUNGI_IMPARIUS = createConfiguredFeature("fungi_imparius",  FUNGAL_IMPARIUS.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> IMPARIUS_MUSHROOMS = createConfiguredFeature("mushrooms_imparius",  IMPARIUS_MUSHROOM.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(1))));
    public static final ConfiguredFeature<?, ?> IMPARIUS_BUSHES = createConfiguredFeature("imparius_bushes",  IMPARIUS_BUSH.decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(5))));

    public static final ConfiguredFeature<?, ?> RANDOM_SWAMP_PLANTS = createConfiguredFeature("swamp_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            TINY_LILY_PAD.weighted(0.50F)),
            WATER_SILK)).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(3));

    public static final ConfiguredFeature<?, ?> RANDOM_LILY_PADS = createConfiguredFeature("lily_pads", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            TINY_LILY_PAD.weighted(0.50F)),
            Features.PATCH_WATERLILLY)).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(3));

    public static final ConfiguredFeature<?, ?> RANDOM_CLOVER_FLOWER_PATCH = createConfiguredFeature("clover_flower_patch", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CLOVER_PATCH.weighted(0.5F)),
            FLOWER_PATCH)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_CHERRY_FOLIAGE = createConfiguredFeature("cherry_foliage", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WHITE_CHERRY_FOLIAGE.weighted(0.5F)),
            PINK_CHERRY_FOLIAGE)).decorated(Features.Placements.ADD_32).count(20));

    public static final ConfiguredFeature<?, ?> RANDOM_WARPED_DESERT_VEGETATION = createConfiguredFeature("warped_desert_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WARPED_BUSH.weighted(0.25F),
            WARPED_CORAL.weighted(0.25F),
            WARPED_CORAL_FAN.weighted(0.25F)),
            WARPED_CACTI)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(16))));

    public static final ConfiguredFeature<?, ?> RANDOM_SCORCHED_PLANT = createConfiguredFeature("scorched_plant", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SCORCHED_GRASS.weighted(0.6F)),
            SCORCHED_BUSH)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_LAMENT_VEGETATION = createConfiguredFeature("lament_vegetation", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SCORCHED_BUSH.weighted(0.2F),
            SCORCHED_GRASS.weighted(0.2F)),
            LAMENT_SPROUTS)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_WAILING_VEGETATION = createConfiguredFeature("wailing_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SCORCHED_BUSH.weighted(0.2F),
            SCORCHED_GRASS.weighted(0.2F)),
            WAILING_GRASS)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(50))));

    public static final ConfiguredFeature<?, ?> RANDOM_ANEMONE = createConfiguredFeature("anemones", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ANEMONE_PINK.weighted(0.5F)),
            ANEMONE_WHITE)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_SAGE = createConfiguredFeature("sages", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SAGE_PURPLE.weighted(0.5F)),
            SAGE_WHITE)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_TULIP = createConfiguredFeature("tulips", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            TULIP_MAGENTA.weighted(0.5F),
            TULIP_YELLOW.weighted(0.5F),
            TULIP_PURPLE.weighted(0.5F),
            TULIP_CYAN.weighted(0.5F)),
            TULIP_GREEN)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(4));

    public static final ConfiguredFeature<?, ?> RANDOM_ORCHID = createConfiguredFeature("orchids", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ORCHID_PINK.weighted(0.5F),
            ORCHID_PURPLE.weighted(0.5F)),
            ORCHID_RED)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_LEATHER_FLOWER = createConfiguredFeature("leather_flowers", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            LEATHER_FLOWER_PEACH.weighted(0.5F)),
            LEATHER_FLOWER_VIOLET)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_DAFFODILS = createConfiguredFeature("daffodils", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DAFFODIL.weighted(0.5F)),
            DAFFODIL_PINK)).decorated(Features.Placements.ADD_32).decorated(Features.Placements.HEIGHTMAP_DOUBLE_SQUARE).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_IVIS_PLANTS = createConfiguredFeature("ivis_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            IVIS_ROOTS.weighted(0.5F)),
            IVIS_SPROUT)).decorated(Features.Placements.FIRE).count(5));

    public static final ConfiguredFeature<?, ?> RANDOM_BULBIS_ODDITY = createConfiguredFeature("bulbis_oddities", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BULBIS_ODDITY.weighted(0.5F)),
            PURPLE_BULBIS_ODDITY)).decorated(Features.Placements.FIRE).count(1));

    public static final ConfiguredFeature<?, ?> RANDOM_BULBIS_ANOMALY = createConfiguredFeature("bulbis_anomalies", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BULBIS_ANOMALY.weighted(0.5F)),
            PURPLE_BULBIS_ANOMALY)).decorated(Features.Placements.FIRE).count(1));

    public static final ConfiguredFeature<?, ?> RANDOM_ETHER_PLANT = createConfiguredFeature("ether_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            TALL_ETHER_GRASS.weighted(0.35F),
            ETHER_BUSH.weighted(0.2F)),
            ETHER_GRASS)).decorated(Features.Placements.FIRE).count(8));

    public static final ConfiguredFeature<?, ?> RANDOM_NIGHTSHADE_PLANT = createConfiguredFeature("nightshade_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            NIGHTSHADE_ROOTS.weighted(0.35F)),
            NIGHTSHADE_SPROUTS)).decorated(Features.Placements.FIRE).count(5));

    public static final ConfiguredFeature<?, ?> RANDOM_ODDITY_PLANT = createConfiguredFeature("oddity_plants", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ODDITY_CACTUS.weighted(0.5F)),
            ODDITY_BUSH)).decorated(Placement.COUNT_MULTILAYER.configured(new FeatureSpreadConfig(16))));

    public static final ConfiguredFeature<?, ?> RANDOM_CRYPTIC_VENT = createConfiguredFeature("rs_cryptic_vent", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CRYPTIC_VENT.weighted(0.50F)),
            TALL_CRYPTIC_VENT)).decorated(Features.Placements.ADD_32).count(2));

    public static final ConfiguredFeature<?, ?> RANDOM_DEAD_SEA_SPIKE = createConfiguredFeature("dead_sea_spikes", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEAD_SEA_SPIKE.weighted(0.75F)),
            DEAD_SEA_SPIKE_TALL)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(28, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_PUMPKIN_PATCH = createConfiguredFeature("large_pumpkin", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PUMPKIN.weighted(0.45F),
            PUMPKIN1.weighted(0.4F)),
            PUMPKIN2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.3F, 1))));


    /***********************************************************Configured Tree Features********************************************************/

    public static final ConfiguredFeature<?, ?> DUMMY_TREE = createConfiguredFeature("dummy_trees", BYGFeatures.DUMMY_TREE.configured(DecoratedFeatureConfig.NONE).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(new AtSurfaceWithExtraConfig(10000, 0.4F, 8))));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ARAUCARIA_TREE1 = createConfiguredFeature("araucaria_tree1", BYGFeatures.ARAUCARIA_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.ARAUCARIA_LEAVES).setMaxHeight(24).setMinHeight(16).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ARAUCARIA_TREE2 = createConfiguredFeature("araucaria_tree2", BYGFeatures.ARAUCARIA_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.ARAUCARIA_LEAVES).setMaxHeight(24).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ANCIENT_TREE1 = createConfiguredFeature("ancient_tree1", BYGFeatures.ANCIENT_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).setMaxHeight(25).setMinHeight(15).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ANCIENT_TREE2 = createConfiguredFeature("ancient_tree2", BYGFeatures.ANCIENT_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(25).setMinHeight(15).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ANCIENT_TREE3 = createConfiguredFeature("ancient_tree3", BYGFeatures.ANCIENT_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.SILVER_MAPLE_LEAVES).setMaxHeight(25).setMinHeight(15).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ASPEN_SHRUB1 = createConfiguredFeature("aspen_shrub1", BYGFeatures.SHRUB1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ASPEN_SHRUB2 = createConfiguredFeature("aspen_shrub2", BYGFeatures.SHRUB2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMinHeight(1).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ASPEN_TREE1 = createConfiguredFeature("aspen_tree1", BYGFeatures.ASPEN_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMaxHeight(10).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ASPEN_TREE2 = createConfiguredFeature("aspen_tree2", BYGFeatures.ASPEN_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMaxHeight(16).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ASPEN_TREE3 = createConfiguredFeature("aspen_tree3", BYGFeatures.ASPEN_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ASPEN_LOG).setLeavesBlock(BYGBlocks.ASPEN_LEAVES).setMaxHeight(16).setMinHeight(9).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> BAOBAB_TREE1 = createConfiguredFeature("baobab_tree1", BYGFeatures.BAOBAB_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BAOBAB_LOG).setLeavesBlock(BYGBlocks.BAOBAB_LEAVES).setMaxHeight(28).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BAOBAB_TREE2 = createConfiguredFeature("baobab_tree2", BYGFeatures.BAOBAB_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BAOBAB_LOG).setLeavesBlock(BYGBlocks.BAOBAB_LEAVES).setMaxHeight(28).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BAOBAB_TREE3 = createConfiguredFeature("baobab_tree3", BYGFeatures.BAOBAB_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BAOBAB_LOG).setLeavesBlock(BYGBlocks.BAOBAB_LEAVES).setMaxHeight(28).setMinHeight(20).build()));

    //Birch
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_TREE1 = createConfiguredFeature("birch_tree1", BYGFeatures.BIRCH_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).setMaxHeight(11).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_TREE2 = createConfiguredFeature("birch_tree2", BYGFeatures.BIRCH_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).setMaxHeight(13).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_TREE3 = createConfiguredFeature("birch_tree3", BYGFeatures.BIRCH_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).setMaxHeight(28).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_TREE4 = createConfiguredFeature("birch_tree4", BYGFeatures.BIRCH_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).setMaxHeight(11).setMinHeight(8).build()));


    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_BROWN_TREE1 = createConfiguredFeature("brown_birch_tree1", BYGFeatures.BIRCH_TREE1.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE1.config).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_BROWN_TREE2 = createConfiguredFeature("brown_birch_tree2", BYGFeatures.BIRCH_TREE2.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE2.config).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_BROWN_TREE3 = createConfiguredFeature("brown_birch_tree3", BYGFeatures.BIRCH_TREE3.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE3.config).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_BROWN_TREE4 = createConfiguredFeature("brown_birch_tree4", BYGFeatures.BIRCH_TREE4.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE4.config).setLeavesBlock(BYGBlocks.BROWN_BIRCH_LEAVES).build()));


    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_ORANGE_TREE1 = createConfiguredFeature("orange_birch_tree1", BYGFeatures.BIRCH_TREE1.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE1.config).setLeavesBlock(BYGBlocks.ORANGE_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_ORANGE_TREE2 = createConfiguredFeature("orange_birch_tree2", BYGFeatures.BIRCH_TREE2.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE2.config).setLeavesBlock(BYGBlocks.ORANGE_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_ORANGE_TREE3 = createConfiguredFeature("orange_birch_tree3", BYGFeatures.BIRCH_TREE3.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE3.config).setLeavesBlock(BYGBlocks.ORANGE_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_ORANGE_TREE4 = createConfiguredFeature("orange_birch_tree4", BYGFeatures.BIRCH_TREE4.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE4.config).setLeavesBlock(BYGBlocks.ORANGE_BIRCH_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_RED_TREE1 = createConfiguredFeature("red_birch_tree1", BYGFeatures.BIRCH_TREE1.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE1.config).setLeavesBlock(BYGBlocks.RED_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_RED_TREE2 = createConfiguredFeature("red_birch_tree2", BYGFeatures.BIRCH_TREE2.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE2.config).setLeavesBlock(BYGBlocks.RED_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_RED_TREE3 = createConfiguredFeature("red_birch_tree3", BYGFeatures.BIRCH_TREE3.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE3.config).setLeavesBlock(BYGBlocks.RED_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_RED_TREE4 = createConfiguredFeature("red_birch_tree4", BYGFeatures.BIRCH_TREE4.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE4.config).setLeavesBlock(BYGBlocks.RED_BIRCH_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_YELLOW_TREE1 = createConfiguredFeature("yellow_birch_tree1", BYGFeatures.BIRCH_TREE1.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE1.config).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_YELLOW_TREE2 = createConfiguredFeature("yellow_birch_tree2", BYGFeatures.BIRCH_TREE2.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE2.config).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_YELLOW_TREE3 = createConfiguredFeature("yellow_birch_tree3", BYGFeatures.BIRCH_TREE3.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE3.config).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_YELLOW_TREE4 = createConfiguredFeature("yellow_birch_tree4", BYGFeatures.BIRCH_TREE4.configured(new BYGTreeConfig.Builder().copy(BIRCH_TREE4.config).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> BLUFF_TREE1 = createConfiguredFeature("bluff_tree1", BYGFeatures.BLUFF_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(21).setMinHeight(17).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BLUFF_TREE2 = createConfiguredFeature("bluff_tree2", BYGFeatures.BLUFF_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(11).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BLUFF_TREE3 = createConfiguredFeature("bluff_tree3", BYGFeatures.BLUFF_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(21).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_BOREAL_TREE1 = createConfiguredFeature("birch_boreal_tree1", BYGFeatures.BOREAL_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(BYGBlocks.YELLOW_BIRCH_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BIRCH_YELLOW_BOREAL_TREE1 = createConfiguredFeature("birch_yellow_boreal_tree1", BYGFeatures.BOREAL_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.BIRCH_LOG).setLeavesBlock(Blocks.BIRCH_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BOREAL_TREE2 = createConfiguredFeature("boreal_tree2", BYGFeatures.BOREAL_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(15).setMinHeight(11).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> CHERRY_PINK_TREE1 = createConfiguredFeature("pink_cherry_tree1", BYGFeatures.CHERRY_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.PINK_CHERRY_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CHERRY_PINK_TREE2 = createConfiguredFeature("pink_cherry_tree2", BYGFeatures.CHERRY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.PINK_CHERRY_LEAVES).setMaxHeight(13).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CHERRY_WHITE_TREE1 = createConfiguredFeature("white_cherry_tree1", BYGFeatures.CHERRY_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.WHITE_CHERRY_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CHERRY_WHITE_TREE2 = createConfiguredFeature("white_cherry_tree2", BYGFeatures.CHERRY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CHERRY_LOG).setLeavesBlock(BYGBlocks.WHITE_CHERRY_LEAVES).setMaxHeight(13).setMinHeight(8).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> CIKA_TREE1 = createConfiguredFeature("cika_tree1", BYGFeatures.CIKA_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CIKA_LOG).setLeavesBlock(BYGBlocks.CIKA_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CIKA_TREE2 = createConfiguredFeature("cika_tree2", BYGFeatures.CIKA_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CIKA_LOG).setLeavesBlock(BYGBlocks.CIKA_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CIKA_TREE3 = createConfiguredFeature("cika_tree3", BYGFeatures.CIKA_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CIKA_LOG).setLeavesBlock(BYGBlocks.CIKA_LEAVES).setMaxHeight(21).setMinHeight(14).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE1 = createConfiguredFeature("conifer_tree1", BYGFeatures.CONIFER_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(25).setMinHeight(19).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE2 = createConfiguredFeature("conifer_tree2", BYGFeatures.CONIFER_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(30).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE3 = createConfiguredFeature("conifer_tree3", BYGFeatures.CONIFER_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(35).setMinHeight(26).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE4 = createConfiguredFeature("conifer_tree4", BYGFeatures.CONIFER_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(35).setMinHeight(25).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE5 = createConfiguredFeature("conifer_tree5", BYGFeatures.CONIFER_TREE5.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(21).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE6 = createConfiguredFeature("conifer_tree6", BYGFeatures.CONIFER_TREE6.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(17).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE7 = createConfiguredFeature("conifer_tree7", BYGFeatures.CONIFER_TREE7.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(28).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CONIFER_TREE8 = createConfiguredFeature("conifer_tree8", BYGFeatures.CONIFER_TREE8.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.FIR_LOG).setLeavesBlock(BYGBlocks.FIR_LEAVES).setMaxHeight(28).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> CYPRESS_TREE1 = createConfiguredFeature("cypress_tree1", BYGFeatures.CYPRESS_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CYPRESS_LOG).setLeavesBlock(BYGBlocks.CYPRESS_LEAVES).setMaxHeight(30).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CYPRESS_TREE2 = createConfiguredFeature("cypress_tree2", BYGFeatures.CYPRESS_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CYPRESS_LOG).setLeavesBlock(BYGBlocks.CYPRESS_LEAVES).setMaxHeight(30).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> CYPRESS_TREE3 = createConfiguredFeature("cypress_tree3", BYGFeatures.CYPRESS_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.CYPRESS_LOG).setLeavesBlock(BYGBlocks.CYPRESS_LEAVES).setMaxHeight(30).setMinHeight(20).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> DEAD_HAZEL_TREE1 = createConfiguredFeature("dead_hazel_tree1", BYGFeatures.DEAD_HAZEL_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.defaultBlockState(), 1).add(BYGBlocks.WITCH_HAZEL_LEAVES.defaultBlockState(), 4)).setMaxHeight(15).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DEAD_HAZEL_TREE2 = createConfiguredFeature("dead_hazel_tree2", BYGFeatures.DEAD_HAZEL_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.defaultBlockState(), 1).add(BYGBlocks.WITCH_HAZEL_LEAVES.defaultBlockState(), 4)).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DEAD_HAZEL_TREE3 = createConfiguredFeature("dead_hazel_tree3", BYGFeatures.DEAD_HAZEL_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.defaultBlockState(), 1).add(BYGBlocks.WITCH_HAZEL_LEAVES.defaultBlockState(), 4)).setMaxHeight(16).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DEAD_HAZEL_TREE4 = createConfiguredFeature("dead_hazel_tree4", BYGFeatures.DEAD_HAZEL_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITCH_HAZEL_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.BLOOMING_WITCH_HAZEL_LEAVES.defaultBlockState(), 1).add(BYGBlocks.WITCH_HAZEL_LEAVES.defaultBlockState(), 4)).setMaxHeight(7).setMinHeight(5).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_SEASONAL_SHRUB = createConfiguredFeature("seasonal_deciduous_shrub", BYGFeatures.SHRUB1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMinHeight(2).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_TREE1 = createConfiguredFeature("deciduous_tree1", BYGFeatures.DECIDUOUS_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(19).setMinHeight(14).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_TREE2 = createConfiguredFeature("deciduous_tree2", BYGFeatures.DECIDUOUS_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(22).setMinHeight(17).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_TREE3 = createConfiguredFeature("deciduous_tree3", BYGFeatures.DECIDUOUS_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(21).setMinHeight(16).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_TREE4 = createConfiguredFeature("deciduous_tree4", BYGFeatures.DECIDUOUS_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(21).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_RED_TREE1 = createConfiguredFeature("deciduous_red_tree1", BYGFeatures.DECIDUOUS_TREE1.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE1.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_RED_TREE2 = createConfiguredFeature("deciduous_red_tree2", BYGFeatures.DECIDUOUS_TREE2.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE2.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_RED_TREE3 = createConfiguredFeature("deciduous_red_tree3", BYGFeatures.DECIDUOUS_TREE3.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE3.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_RED_TREE4 = createConfiguredFeature("deciduous_red_tree4", BYGFeatures.DECIDUOUS_TREE4.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE4.config).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_ORANGE_TREE1 = createConfiguredFeature("deciduous_orange_tree1", BYGFeatures.DECIDUOUS_TREE1.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE1.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_ORANGE_TREE2 = createConfiguredFeature("deciduous_orange_tree2", BYGFeatures.DECIDUOUS_TREE2.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE2.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_ORANGE_TREE3 = createConfiguredFeature("deciduous_orange_tree3", BYGFeatures.DECIDUOUS_TREE3.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE3.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_ORANGE_TREE4 = createConfiguredFeature("deciduous_orange_tree4", BYGFeatures.DECIDUOUS_TREE4.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE4.config).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_BROWN_TREE1 = createConfiguredFeature("deciduous_brown_tree1", BYGFeatures.DECIDUOUS_TREE1.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE1.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_BROWN_TREE2 = createConfiguredFeature("deciduous_brown_tree2", BYGFeatures.DECIDUOUS_TREE2.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE2.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_BROWN_TREE3 = createConfiguredFeature("deciduous_brown_tree3", BYGFeatures.DECIDUOUS_TREE3.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE3.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> DECIDUOUS_BROWN_TREE4 = createConfiguredFeature("deciduous_brown_tree4", BYGFeatures.DECIDUOUS_TREE4.configured(new BYGTreeConfig.Builder().copy(DECIDUOUS_TREE4.config).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> EBONY_BUSH1 = createConfiguredFeature("ebony_bush1", BYGFeatures.EBONY_BUSH1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(28).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> EBONY_TREE1 = createConfiguredFeature("ebony_tree1", BYGFeatures.EBONY_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(13).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> EBONY_TREE2 = createConfiguredFeature("ebony_tree2", BYGFeatures.EBONY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.EBONY_LOG).setLeavesBlock(BYGBlocks.EBONY_LEAVES).setMaxHeight(17).setMinHeight(11).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_BLUE_TREE1 = createConfiguredFeature("blue_enchanted_tree1", BYGFeatures.ENCHANTED_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_BLUE_TREE2 = createConfiguredFeature("blue_enchanted_tree2", BYGFeatures.ENCHANTED_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(26).setMinHeight(19).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_BLUE_TREE3 = createConfiguredFeature("blue_enchanted_tree3", BYGFeatures.ENCHANTED_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_GREEN_TREE1 = createConfiguredFeature("green_enchanted_tree1", BYGFeatures.ENCHANTED_TREE1.configured(new BYGTreeConfig.Builder().copy(ENCHANTED_BLUE_TREE1.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_GREEN_TREE2 = createConfiguredFeature("green_enchanted_tree2", BYGFeatures.ENCHANTED_TREE2.configured(new BYGTreeConfig.Builder().copy(ENCHANTED_BLUE_TREE2.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_GREEN_TREE3 = createConfiguredFeature("green_enchanted_tree3", BYGFeatures.ENCHANTED_TREE3.configured(new BYGTreeConfig.Builder().copy(ENCHANTED_BLUE_TREE3.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_BLUE_GROVE_TREE1 = createConfiguredFeature("blue_enchanted_grove_tree1", BYGFeatures.ENCHANTED_GROVE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.BLUE_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.BLUE_ENCHANTED_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ENCHANTED_GREEN_GROVE_TREE1 = createConfiguredFeature("green_enchanted_grove_tree1", BYGFeatures.ENCHANTED_GROVE_TREE1.configured(new BYGTreeConfig.Builder().copy(ENCHANTED_BLUE_TREE1.config).setTrunkBlock(BYGBlocks.GREEN_ENCHANTED_LOG).setLeavesBlock(BYGBlocks.GREEN_ENCHANTED_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> HOLLY_TREE1 = createConfiguredFeature("holly_tree1", BYGFeatures.HOLLY_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.HOLLY_BERRY_LEAVES.defaultBlockState(), 1).add(BYGBlocks.HOLLY_LEAVES.defaultBlockState(), 10)).setMaxHeight(23).setMinHeight(17).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> HOLLY_TREE2 = createConfiguredFeature("holly_tree2", BYGFeatures.HOLLY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.HOLLY_BERRY_LEAVES.defaultBlockState(), 1).add(BYGBlocks.HOLLY_LEAVES.defaultBlockState(), 10)).setMaxHeight(15).setMinHeight(10).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> HOLLY_TREE3 = createConfiguredFeature("holly_tree3", BYGFeatures.HOLLY_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.HOLLY_BERRY_LEAVES.defaultBlockState(), 1).add(BYGBlocks.HOLLY_LEAVES.defaultBlockState(), 10)).setMaxHeight(25).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> HOLLY_TREE4 = createConfiguredFeature("holly_tree4", BYGFeatures.HOLLY_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.HOLLY_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.HOLLY_BERRY_LEAVES.defaultBlockState(), 1).add(BYGBlocks.HOLLY_LEAVES.defaultBlockState(), 10)).setMaxHeight(14).setMinHeight(9).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> JACARANDA_TREE1 = createConfiguredFeature("jacaranda_tree1", BYGFeatures.JACARANDA_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.JACARANDA_LOG).setLeavesBlock(BYGBlocks.JACARANDA_LEAVES).setMaxHeight(15).setMinHeight(9).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> JACARANDA_TREE2 = createConfiguredFeature("jacaranda_tree2", BYGFeatures.JACARANDA_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.JACARANDA_LOG).setLeavesBlock(BYGBlocks.JACARANDA_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> INDIGO_JACARANDA_TREE1 = createConfiguredFeature("indigo_jacaranda_tree1", BYGFeatures.JACARANDA_TREE1.configured(new BYGTreeConfig.Builder().copy(JACARANDA_TREE1.config).setLeavesBlock(BYGBlocks.INDIGO_JACARANDA_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> INDIGO_JACARANDA_TREE2 = createConfiguredFeature("indigo_jacaranda_tree2", BYGFeatures.JACARANDA_TREE2.configured(new BYGTreeConfig.Builder().copy(JACARANDA_TREE2.config).setLeavesBlock(BYGBlocks.INDIGO_JACARANDA_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> JOSHUA_TREE1 = createConfiguredFeature("joshua_tree1", BYGFeatures.JOSHUA_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.RIPE_JOSHUA_LEAVES.defaultBlockState(), 1).add(BYGBlocks.JOSHUA_LEAVES.defaultBlockState(), 10)).setMaxHeight(6).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> JOSHUA_TREE2 = createConfiguredFeature("joshua_tree2", BYGFeatures.JOSHUA_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.RIPE_JOSHUA_LEAVES.defaultBlockState(), 1).add(BYGBlocks.JOSHUA_LEAVES.defaultBlockState(), 10)).setMaxHeight(6).setMinHeight(3).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> MANGROVE_TREE1 = createConfiguredFeature("mangrove_tree1", BYGFeatures.MANGROVE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(15).setMinHeight(10).setWhitelist(ImmutableList.of(BYGBlocks.MOSSY_STONE)).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MANGROVE_TREE2 = createConfiguredFeature("mangrove_tree2", BYGFeatures.MANGROVE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(17).setMinHeight(11).setWhitelist(ImmutableList.of(BYGBlocks.MOSSY_STONE)).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MANGROVE_TREE3 = createConfiguredFeature("mangrove_tree3", BYGFeatures.MANGROVE_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(16).setMinHeight(12).setWhitelist(ImmutableList.of(BYGBlocks.MOSSY_STONE)).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MANGROVE_TREE4 = createConfiguredFeature("mangrove_tree4", BYGFeatures.MANGROVE_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(15).setMinHeight(10).setWhitelist(ImmutableList.of(BYGBlocks.MOSSY_STONE)).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MANGROVE_TREE5 = createConfiguredFeature("mangrove_tree5", BYGFeatures.MANGROVE_TREE5.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MANGROVE_LOG).setLeavesBlock(BYGBlocks.MANGROVE_LEAVES).setMaxHeight(17).setMinHeight(11).setWhitelist(ImmutableList.of(BYGBlocks.MOSSY_STONE)).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> MAPLE_RED_TREE1 = createConfiguredFeature("red_maple_tree1", BYGFeatures.MAPLE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.RED_MAPLE_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAPLE_RED_TREE2 = createConfiguredFeature("red_maple_tree2", BYGFeatures.MAPLE_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.RED_MAPLE_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAPLE_SILVER_TREE1 = createConfiguredFeature("silver_maple_tree1", BYGFeatures.MAPLE_TREE2.configured(new BYGTreeConfig.Builder().copy(MAPLE_RED_TREE1.config).setLeavesBlock(BYGBlocks.SILVER_MAPLE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAPLE_SILVER_TREE2 = createConfiguredFeature("silver_maple_tree2", BYGFeatures.MAPLE_TREE3.configured(new BYGTreeConfig.Builder().copy(MAPLE_RED_TREE2.config).setLeavesBlock(BYGBlocks.SILVER_MAPLE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAPLE_TREE1 = createConfiguredFeature("maple_tree1", BYGFeatures.MAPLE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAPLE_LOG).setLeavesBlock(BYGBlocks.MAPLE_LEAVES).setMaxHeight(10).setMinHeight(5).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> MEADOW_TREE1 = createConfiguredFeature("meadow_tree1", BYGFeatures.MEADOW_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MEADOW_TREE2 = createConfiguredFeature("meadow_tree2", BYGFeatures.MEADOW_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).setMaxHeight(9).setMinHeight(4).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MEADOW_TREE3 = createConfiguredFeature("meadow_tree3", BYGFeatures.MEADOW_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.DARK_OAK_LEAVES).setMaxHeight(9).setMinHeight(4).build()));

    //Oak
    public static final ConfiguredFeature<BYGTreeConfig, ?> OAK_TREE1 = createConfiguredFeature("oak_tree1", BYGFeatures.OAK_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> OAK_TREE2 = createConfiguredFeature("oak_tree2", BYGFeatures.OAK_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> OAK_TREE3 = createConfiguredFeature("oak_tree3", BYGFeatures.OAK_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> OAK_TREE_LARGE1 = createConfiguredFeature("large_oak_tree1", BYGFeatures.OAK_TREE_LARGE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> OAK_TREE_LARGE2 = createConfiguredFeature("large_oak_tree2", BYGFeatures.OAK_TREE_LARGE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> OAK_TREE_LARGE3 = createConfiguredFeature("large_oak_tree3", BYGFeatures.OAK_TREE_LARGE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(18).setMinHeight(13).setDiskBlock(Blocks.PODZOL).setDiskRadius(3).build()));

    //Red Oak
    public static final ConfiguredFeature<BYGTreeConfig, ?> RED_OAK_TREE1 = createConfiguredFeature("red_oak_tree1", BYGFeatures.OAK_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> RED_OAK_TREE2 = createConfiguredFeature("red_oak_tree2", BYGFeatures.OAK_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> RED_OAK_TREE3 = createConfiguredFeature("red_oak_tree3", BYGFeatures.OAK_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> RED_OAK_TREE_LARGE1 = createConfiguredFeature("large_red_oak_tree1", BYGFeatures.OAK_TREE_LARGE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> RED_OAK_TREE_LARGE2 = createConfiguredFeature("large_red_oak_tree2", BYGFeatures.OAK_TREE_LARGE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> RED_OAK_TREE_LARGE3 = createConfiguredFeature("large_red_oak_tree3", BYGFeatures.OAK_TREE_LARGE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.RED_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).setDiskBlock(Blocks.PODZOL).setDiskRadius(3).build()));

    //Brown Oak
    public static final ConfiguredFeature<BYGTreeConfig, ?> BROWN_OAK_TREE1 = createConfiguredFeature("brown_oak_tree1", BYGFeatures.OAK_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BROWN_OAK_TREE2 = createConfiguredFeature("brown_oak_tree2", BYGFeatures.OAK_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BROWN_OAK_TREE3 = createConfiguredFeature("brown_oak_tree3", BYGFeatures.OAK_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BROWN_OAK_TREE_LARGE1 = createConfiguredFeature("large_brown_oak_tree1", BYGFeatures.OAK_TREE_LARGE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BROWN_OAK_TREE_LARGE2 = createConfiguredFeature("large_brown_oak_tree2", BYGFeatures.OAK_TREE_LARGE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> BROWN_OAK_TREE_LARGE3 = createConfiguredFeature("large_brown_oak_tree3", BYGFeatures.OAK_TREE_LARGE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.BROWN_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).setDiskBlock(Blocks.PODZOL).setDiskRadius(3).build()));

    //Orange Oak
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORANGE_OAK_TREE1 = createConfiguredFeature("orange_oak_tree1", BYGFeatures.OAK_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORANGE_OAK_TREE2 = createConfiguredFeature("orange_oak_tree2", BYGFeatures.OAK_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORANGE_OAK_TREE3 = createConfiguredFeature("orange_oak_tree3", BYGFeatures.OAK_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORANGE_OAK_TREE_LARGE1 = createConfiguredFeature("large_orange_oak_tree1", BYGFeatures.OAK_TREE_LARGE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORANGE_OAK_TREE_LARGE2 = createConfiguredFeature("large_orange_oak_tree2", BYGFeatures.OAK_TREE_LARGE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORANGE_OAK_TREE_LARGE3 = createConfiguredFeature("large_orange_oak_tree3", BYGFeatures.OAK_TREE_LARGE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(BYGBlocks.ORANGE_OAK_LEAVES).setMaxHeight(18).setMinHeight(13).setDiskBlock(Blocks.PODZOL).setDiskRadius(3).build()));

    //Orchard
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORCHARD_TREE1 = createConfiguredFeature("orchard_tree1", BYGFeatures.ORCHARD_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.ORCHARD_LEAVES.defaultBlockState(), 10).add(BYGBlocks.FLOWERING_ORCHARD_LEAVES.defaultBlockState(), 1).add(BYGBlocks.RIPE_ORCHARD_LEAVES.defaultBlockState(), 1)).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORCHARD_TREE2 = createConfiguredFeature("orchard_tree2", BYGFeatures.ORCHARD_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.ORCHARD_LEAVES.defaultBlockState(), 10).add(BYGBlocks.FLOWERING_ORCHARD_LEAVES.defaultBlockState(), 1).add(BYGBlocks.RIPE_ORCHARD_LEAVES.defaultBlockState(), 1)).setMaxHeight(26).setMinHeight(21).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ORCHARD_TREE3 = createConfiguredFeature("orchard_tree3", BYGFeatures.ORCHARD_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.ORCHARD_LEAVES.defaultBlockState(), 10).add(BYGBlocks.FLOWERING_ORCHARD_LEAVES.defaultBlockState(), 1).add(BYGBlocks.RIPE_ORCHARD_LEAVES.defaultBlockState(), 1)).setMaxHeight(12).setMinHeight(9).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> PALM_TREE1 = createConfiguredFeature("palm_tree1", BYGFeatures.PALM_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PALM_TREE2 = createConfiguredFeature("palm_tree2", BYGFeatures.PALM_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PALM_TREE3 = createConfiguredFeature("palm_tree3", BYGFeatures.PALM_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PALM_TREE4 = createConfiguredFeature("palm_tree4", BYGFeatures.PALM_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PALM_LOG).setLeavesBlock(BYGBlocks.PALM_LEAVES).setMaxHeight(5).setMinHeight(3).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> PINE_LARGE_TREE1 = createConfiguredFeature("large_pine_tree1", BYGFeatures.PINE_LARGE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(28).setMinHeight(23).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PINE_LARGE_TREE2 = createConfiguredFeature("large_pine_tree2", BYGFeatures.PINE_LARGE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(31).setMinHeight(26).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PINE_TREE1 = createConfiguredFeature("pine_tree1", BYGFeatures.PINE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(20).setMinHeight(15).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PINE_TREE2 = createConfiguredFeature("pine_tree2", BYGFeatures.PINE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PINE_LOG).setLeavesBlock(BYGBlocks.PINE_LEAVES).setMaxHeight(21).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> PALO_VERDE_TREE1 = createConfiguredFeature("palo_verde_tree1", BYGFeatures.PALO_VERDE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PALO_VERDE_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.PALO_VERDE_LEAVES.defaultBlockState(), 6).add(BYGBlocks.FLOWERING_PALO_VERDE_LEAVES.defaultBlockState(), 1)).setMaxHeight(1).setMinHeight(1).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> PALO_VERDE_TREE2 = createConfiguredFeature("palo_verde_tree2", BYGFeatures.PALO_VERDE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.PALO_VERDE_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.PALO_VERDE_LEAVES.defaultBlockState(), 6).add(BYGBlocks.FLOWERING_PALO_VERDE_LEAVES.defaultBlockState(), 1)).setMaxHeight(2).setMinHeight(1).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> RAINBOW_TREE1 = createConfiguredFeature("rainbow_eucalyptus_tree1", BYGFeatures.RAINBOW_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LOG).setLeavesBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LEAVES).setMaxHeight(32).setMinHeight(27).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> RAINBOW_LARGE_TREE1 = createConfiguredFeature("large_rainbow_eucalyptus_tree1", BYGFeatures.RAINBOW_LARGE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LOG).setLeavesBlock(BYGBlocks.RAINBOW_EUCALYPTUS_LEAVES).setMaxHeight(19).setMinHeight(16).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> REDWOOD_TREE1 = createConfiguredFeature("redwood_tree1", BYGFeatures.REDWOOD_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.REDWOOD_LOG).setLeavesBlock(BYGBlocks.REDWOOD_LEAVES).setMaxHeight(37).setMinHeight(36).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> REDWOOD_TREE2 = createConfiguredFeature("redwood_tree2", BYGFeatures.REDWOOD_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.REDWOOD_LOG).setLeavesBlock(BYGBlocks.REDWOOD_LEAVES).setMaxHeight(34).setMinHeight(31).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> REDWOOD_TREE3 = createConfiguredFeature("redwood_tree3", BYGFeatures.REDWOOD_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.REDWOOD_LOG).setLeavesBlock(BYGBlocks.REDWOOD_LEAVES).setMaxHeight(25).setMinHeight(18).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SHRUB = createConfiguredFeature("shrub", BYGFeatures.SHRUB1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SHRUB_MEADOW = createConfiguredFeature("meadow_shrub1", BYGFeatures.SHRUB1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(1).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SHRUB_MEADOW2 = createConfiguredFeature("meadow_shrub2", BYGFeatures.SHRUB2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.DARK_OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(1).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SHRUB_PRAIRIE1 = createConfiguredFeature("prairie_shrub1", BYGFeatures.SHRUB1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(1).setMaxHeight(2).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SHRUB_PRAIRIE2 = createConfiguredFeature("prairie_shrub2", BYGFeatures.SHRUB2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMinHeight(1).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SKYRIS_TREE1 = createConfiguredFeature("skyris_tree1", BYGFeatures.SKYRIS_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.defaultBlockState(), 1).add(BYGBlocks.SKYRIS_LEAVES.defaultBlockState(), 8)).setMaxHeight(9).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SKYRIS_TREE2 = createConfiguredFeature("skyris_tree2", BYGFeatures.SKYRIS_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.defaultBlockState(), 1).add(BYGBlocks.SKYRIS_LEAVES.defaultBlockState(), 8)).setMaxHeight(6).setMinHeight(3).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SKYRIS_TREE3 = createConfiguredFeature("skyris_tree3", BYGFeatures.SKYRIS_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.defaultBlockState(), 1).add(BYGBlocks.SKYRIS_LEAVES.defaultBlockState(), 8)).setMaxHeight(8).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SKYRIS_TREE4 = createConfiguredFeature("skyris_tree4", BYGFeatures.SKYRIS_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.defaultBlockState(), 1).add(BYGBlocks.SKYRIS_LEAVES.defaultBlockState(), 8)).setMaxHeight(8).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SKYRIS_TREE5 = createConfiguredFeature("skyris_tree5", BYGFeatures.SKYRIS_TREE5.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.SKYRIS_LOG).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.SKYRIS_LEAVES_GREEN_APPLE.defaultBlockState(), 1).add(BYGBlocks.SKYRIS_LEAVES.defaultBlockState(), 8)).setMaxHeight(8).setMinHeight(6).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE1 = createConfiguredFeature("spruce_tree1", BYGFeatures.SPRUCE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(17).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE2 = createConfiguredFeature("spruce_tree2", BYGFeatures.SPRUCE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(17).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE3 = createConfiguredFeature("spruce_tree3", BYGFeatures.SPRUCE_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(16).setMinHeight(12).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE4 = createConfiguredFeature("spruce_tree4", BYGFeatures.SPRUCE_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(17).setMinHeight(12).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE_MEDIUM1 = createConfiguredFeature("spruce_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(24).setMinHeight(19).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE_MEDIUM2 = createConfiguredFeature("spruce_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(25).setMinHeight(20).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE_MEDIUM3 = createConfiguredFeature("spruce_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(26).setMinHeight(21).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE_MEDIUM4 = createConfiguredFeature("spruce_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(25).setMinHeight(19).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_TREE_LARGE1 = createConfiguredFeature("spruce_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.SPRUCE_LOG).setLeavesBlock(Blocks.SPRUCE_LEAVES).setMaxHeight(55).setMinHeight(40).build()));

    //Yellow Spruce
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE1 = createConfiguredFeature("spruce_yellow_tree1", BYGFeatures.SPRUCE_TREE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE2 = createConfiguredFeature("spruce_yellow_tree2", BYGFeatures.SPRUCE_TREE2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE3 = createConfiguredFeature("spruce_yellow_tree3", BYGFeatures.SPRUCE_TREE3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE4 = createConfiguredFeature("spruce_yellow_tree4", BYGFeatures.SPRUCE_TREE4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM1 = createConfiguredFeature("spruce_yellow_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM2 = createConfiguredFeature("spruce_yellow_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM3 = createConfiguredFeature("spruce_yellow_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE_MEDIUM4 = createConfiguredFeature("spruce_yellow_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_YELLOW_TREE_LARGE1 = createConfiguredFeature("spruce_yellow_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.YELLOW_SPRUCE_LEAVES).build()));

    //Orange Spruce
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE1 = createConfiguredFeature("spruce_orange_tree1", BYGFeatures.SPRUCE_TREE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE2 = createConfiguredFeature("spruce_orange_tree2", BYGFeatures.SPRUCE_TREE2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE3 = createConfiguredFeature("spruce_orange_tree3", BYGFeatures.SPRUCE_TREE3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE4 = createConfiguredFeature("spruce_orange_tree4", BYGFeatures.SPRUCE_TREE4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM1 = createConfiguredFeature("spruce_orange_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM2 = createConfiguredFeature("spruce_orange_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM3 = createConfiguredFeature("spruce_orange_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE_MEDIUM4 = createConfiguredFeature("spruce_orange_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_ORANGE_TREE_LARGE1 = createConfiguredFeature("spruce_orange_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.ORANGE_SPRUCE_LEAVES).build()));

    //Red Spruce
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE1 = createConfiguredFeature("spruce_red_tree1", BYGFeatures.SPRUCE_TREE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE2 = createConfiguredFeature("spruce_red_tree2", BYGFeatures.SPRUCE_TREE2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE3 = createConfiguredFeature("spruce_red_tree3", BYGFeatures.SPRUCE_TREE3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE4 = createConfiguredFeature("spruce_red_tree4", BYGFeatures.SPRUCE_TREE4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE_MEDIUM1 = createConfiguredFeature("spruce_red_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE_MEDIUM2 = createConfiguredFeature("spruce_red_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE_MEDIUM3 = createConfiguredFeature("spruce_red_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE_MEDIUM4 = createConfiguredFeature("spruce_red_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_RED_TREE_LARGE1 = createConfiguredFeature("spruce_red_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.RED_SPRUCE_LEAVES).build()));

    //Blue Spruce
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE1 = createConfiguredFeature("spruce_blue_tree1", BYGFeatures.SPRUCE_TREE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE1.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE2 = createConfiguredFeature("spruce_blue_tree2", BYGFeatures.SPRUCE_TREE2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE2.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE3 = createConfiguredFeature("spruce_blue_tree3", BYGFeatures.SPRUCE_TREE3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE3.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE4 = createConfiguredFeature("spruce_blue_tree4", BYGFeatures.SPRUCE_TREE4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE4.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE_MEDIUM1 = createConfiguredFeature("spruce_blue_tree_medium1", BYGFeatures.SPRUCE_TREE_MEDIUM1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM1.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE_MEDIUM2 = createConfiguredFeature("spruce_blue_tree_medium2", BYGFeatures.SPRUCE_TREE_MEDIUM2.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM2.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE_MEDIUM3 = createConfiguredFeature("spruce_blue_tree_medium3", BYGFeatures.SPRUCE_TREE_MEDIUM3.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM3.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE_MEDIUM4 = createConfiguredFeature("spruce_blue_tree_medium4", BYGFeatures.SPRUCE_TREE_MEDIUM4.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_MEDIUM4.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> SPRUCE_BLUE_TREE_LARGE1 = createConfiguredFeature("spruce_blue_tree_large1", BYGFeatures.SPRUCE_TREE_LARGE1.configured(new BYGTreeConfig.Builder().copy(SPRUCE_TREE_LARGE1.config).setLeavesBlock(BYGBlocks.BLUE_SPRUCE_LEAVES).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> TROPICAL_SHRUB1 = createConfiguredFeature("tropical_shrub1", BYGFeatures.SHRUB1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMinHeight(2).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> MAHOGANY_TREE1 = createConfiguredFeature("mahogany_tree1", BYGFeatures.MAHOGANY_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAHOGANY_TREE2 = createConfiguredFeature("mahogany_tree2", BYGFeatures.MAHOGANY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(14).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAHOGANY_TREE3 = createConfiguredFeature("mahogany_tree3", BYGFeatures.MAHOGANY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(18).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAHOGANY_TREE4 = createConfiguredFeature("mahogany_tree4", BYGFeatures.MAHOGANY_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(24).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> MAHOGANY_TREE5 = createConfiguredFeature("mahogany_tree5", BYGFeatures.MAHOGANY_TREE5.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.MAHOGANY_LOG).setLeavesBlock(BYGBlocks.MAHOGANY_LEAVES).setMaxHeight(31).setMinHeight(25).build()));


    public static final ConfiguredFeature<BYGTreeConfig, ?> WOODLANDS_TREE1 = createConfiguredFeature("woodlands_tree1", BYGFeatures.WOODLANDS_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(Blocks.OAK_LOG).setLeavesBlock(Blocks.OAK_LEAVES).setMaxHeight(5).setMinHeight(25).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_DEAD_TREE1 = createConfiguredFeature("dead_willow_tree1", BYGFeatures.WILLOW_DEAD_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_M_TREE1 = createConfiguredFeature("mutated_willow_tree1", BYGFeatures.WILLOW_M_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(11).setMinHeight(6).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_M_TREE2 = createConfiguredFeature("mutated_willow_tree2", BYGFeatures.WILLOW_M_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_TREE1 = createConfiguredFeature("willow_tree1", BYGFeatures.WILLOW_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(14).setMinHeight(8).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_TREE2 = createConfiguredFeature("willow_tree2", BYGFeatures.WILLOW_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_TREE3 = createConfiguredFeature("willow_tree3", BYGFeatures.WILLOW_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(12).setMinHeight(7).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WILLOW_TREE4 = createConfiguredFeature("willow_tree4", BYGFeatures.WILLOW_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WILLOW_LOG).setLeavesBlock(BYGBlocks.WILLOW_LEAVES).setMaxHeight(21).setMinHeight(13).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ZELKOVA_TREE1 = createConfiguredFeature("zelkova_tree1", BYGFeatures.ZELKOVA_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.ZELKOVA_LEAVES).setMaxHeight(20).setMinHeight(13).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ZELKOVA_TREE2 = createConfiguredFeature("zelkova_tree2", BYGFeatures.ZELKOVA_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.ZELKOVA_LEAVES).setMaxHeight(28).setMinHeight(18).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ZELKOVA_TREE3 = createConfiguredFeature("zelkova_tree3", BYGFeatures.ZELKOVA_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.ZELKOVA_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ZELKOVA_BROWN_TREE1 = createConfiguredFeature("zelkova_brown_tree1", BYGFeatures.ZELKOVA_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.BROWN_ZELKOVA_LEAVES).setMaxHeight(21).setMinHeight(11).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ZELKOVA_BROWN_TREE2 = createConfiguredFeature("zelkova_brown_tree2", BYGFeatures.ZELKOVA_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.BROWN_ZELKOVA_LEAVES).setMaxHeight(20).setMinHeight(10).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ZELKOVA_BROWN_TREE3 = createConfiguredFeature("zelkova_brown_tree3", BYGFeatures.ZELKOVA_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ZELKOVA_LOG).setLeavesBlock(BYGBlocks.BROWN_ZELKOVA_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    //Mushrooms
    public static final ConfiguredFeature<BYGMushroomConfig, ?> GREEN_MUSHROOM_HUGE = createConfiguredFeature("huge_green_mushroom", BYGFeatures.GREEN_MUSHROOM_HUGE.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.WHITE_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.GREEN_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> WOOD_BLEWIT_HUGE = createConfiguredFeature("huge_wood_blewit", BYGFeatures.WOOD_BLEWIT_HUGE.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.BLEWIT_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> WEEPING_MILKCAP_HUGE = createConfiguredFeature("huge_weeping_milkcap", BYGFeatures.WEEPING_MILKCAP_HUGE.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.MILKCAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BLACK_PUFF_HUGE = createConfiguredFeature("huge_black_puff", BYGFeatures.BLACK_PUFF_HUGE.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.PUFF_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BLUE_GLOWSHROOM_HUGE = createConfiguredFeature("huge_blue_glowshroom", BYGFeatures.BLUE_GLOWSHROOM_HUGE.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.YELLOW_GLOWSHROOM_STEM).setMushroomBlock(BYGBlocks.BLUE_GLOWSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_GLOWSHROOM_HUGE = createConfiguredFeature("huge_purple_glowshroom", BYGFeatures.PURPLE_GLOWSHROOM_HUGE.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.RED_GLOWSHROOM_STEM).setMushroomBlock(BYGBlocks.PURPLE_GLOWSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    //Mini Mushrooms
    public static final ConfiguredFeature<?, ?> GREEN_MUSHROOM_MINI = createConfiguredFeature("mini_green_mushroom", BYGFeatures.MINI_GREEN_MUSHROOM.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.WHITE_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.GREEN_MUSHROOM_BLOCK).setMinHeight(3).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> WOOD_BLEWIT_MINI = createConfiguredFeature("mini_wood_blewit", BYGFeatures.MINI_WOOD_BLEWIT.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.BLEWIT_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> WEEPING_MILKCAP_MINI = createConfiguredFeature("mini_weeping_milkcap", BYGFeatures.MINI_WEEPING_MILKCAP.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.MILKCAP_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> BLACK_PUFF_MINI = createConfiguredFeature("mini_black_puff", BYGFeatures.MINI_BLACK_PUFF.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BROWN_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.PUFF_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> RED_MUSHROOM_MINI = createConfiguredFeature("mini_red_mushroom", BYGFeatures.MINI_RED_MUSHROOM.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(Blocks.RED_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));
    public static final ConfiguredFeature<?, ?> BROWN_MUSHROOM_MINI = createConfiguredFeature("mini_brown_mushroom", BYGFeatures.MINI_BROWN_MUSHROOM.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(Blocks.BROWN_MUSHROOM_BLOCK).setMinHeight(2).setMaxHeight(3).build()));


    //Nether Mushrooms
    public static final ConfiguredFeature<BYGMushroomConfig, ?> EMBUR_MUSHROOM = createConfiguredFeature("embur_mushroom1", BYGFeatures.EMBUR_MUSHROOM.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.EMBUR_PEDU).setMushroomBlock(BYGBlocks.EMBUR_GEL_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> EMBUR_MUSHROOM2 = createConfiguredFeature("embur_mushroom2", BYGFeatures.EMBUR_MUSHROOM2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.EMBUR_PEDU).setMushroomBlock(BYGBlocks.EMBUR_GEL_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> CRIMSON_FUNGUS1 = createConfiguredFeature("crimson_fungus1", BYGFeatures.CRIMSON_FUNGUS_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.CRIMSON_STEM).setMushroomBlock(Blocks.NETHER_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> CRIMSON_FUNGUS2 = createConfiguredFeature("crimson_fungus2", BYGFeatures.CRIMSON_FUNGUS_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.CRIMSON_STEM).setMushroomBlock(Blocks.NETHER_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> WARPED_FUNGUS1 = createConfiguredFeature("warped_fungus1", BYGFeatures.WARPED_FUNGUS_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.WARPED_STEM).setMushroomBlock(Blocks.WARPED_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> WARPED_FUNGUS2 = createConfiguredFeature("warped_fungus2", BYGFeatures.WARPED_FUNGUS_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.WARPED_STEM).setMushroomBlock(Blocks.WARPED_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> SYTHIAN_FUNGUS_TREE1 = createConfiguredFeature("sythian_fungus_tree1", BYGFeatures.SYTHIAN_FUNGUS_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> SYTHIAN_FUNGUS_TREE2 = createConfiguredFeature("sythian_fungus_tree2", BYGFeatures.SYTHIAN_FUNGUS_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> SYTHIAN_FUNGUS_TREE3 = createConfiguredFeature("sythian_fungus_tree3", BYGFeatures.SYTHIAN_FUNGUS_TREE3.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> SYTHIAN_FUNGUS_TREE4 = createConfiguredFeature("sythian_fungus_tree4", BYGFeatures.SYTHIAN_FUNGUS_TREE4.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SYTHIAN_STEM).setMushroomBlock(BYGBlocks.SYTHIAN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> SOUL_SHROOM_TREE1 = createConfiguredFeature("soul_shroom_tree1", BYGFeatures.SOUL_SHROOM_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SOUL_SHROOM_STEM).setMushroomBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> SOUL_SHROOM_TREE2 = createConfiguredFeature("soul_shroom_tree2", BYGFeatures.SOUL_SHROOM_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SOUL_SHROOM_STEM).setMushroomBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> SOUL_SHROOM_TREE3 = createConfiguredFeature("soul_shroom_tree3", BYGFeatures.SOUL_SHROOM_TREE3.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.SOUL_SHROOM_STEM).setMushroomBlock(BYGBlocks.SOUL_SHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> DEATH_CAP_TREE1 = createConfiguredFeature("death_cap_tree1", BYGFeatures.DEATH_CAP_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> DEATH_CAP_TREE2 = createConfiguredFeature("death_cap_tree2", BYGFeatures.DEATH_CAP_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> DEATH_CAP_TREE3 = createConfiguredFeature("death_cap_tree3", BYGFeatures.DEATH_CAP_TREE3.configured(new BYGMushroomConfig.Builder().setStemBlock(Blocks.MUSHROOM_STEM).setMushroomBlock(BYGBlocks.DEATH_CAP_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    //Nether Trees
    public static final ConfiguredFeature<BYGTreeConfig, ?> LAMENT_TWISTY_TREE1 = createConfiguredFeature("lament_twisty_tree1", BYGFeatures.LAMENT_TWISTY_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> LAMENT_TWISTY_TREE2 = createConfiguredFeature("lament_twisty_tree2", BYGFeatures.LAMENT_TWISTY_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> LAMENT_TWISTY_TREE3 = createConfiguredFeature("lament_twisty_tree3", BYGFeatures.LAMENT_TWISTY_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> LAMENT_WEEPING_TREE1 = createConfiguredFeature("lament_weeping_tree1", BYGFeatures.LAMENT_WEEPING_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).setWhitelist(ImmutableList.of(Blocks.LAVA)).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> LAMENT_WEEPING_TREE2 = createConfiguredFeature("lament_weeping_tree2", BYGFeatures.LAMENT_WEEPING_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).setWhitelist(ImmutableList.of(Blocks.LAVA)).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> LAMENT_WEEPING_TREE3 = createConfiguredFeature("lament_weeping_tree3", BYGFeatures.LAMENT_WEEPING_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.LAMENT_LOG).setLeavesBlock(BYGBlocks.LAMENT_LEAVES).setMaxHeight(30).setMinHeight(22).setWhitelist(ImmutableList.of(Blocks.LAVA)).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> WITHERING_OAK_TREE1 = createConfiguredFeature("withering_oak_tree1", BYGFeatures.WITHERING_OAK_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WITHERING_OAK_TREE2 = createConfiguredFeature("withering_oak_tree2", BYGFeatures.WITHERING_OAK_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WITHERING_OAK_TREE3 = createConfiguredFeature("withering_oak_tree3", BYGFeatures.WITHERING_OAK_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> WITHERING_OAK_TREE4 = createConfiguredFeature("withering_oak_tree4", BYGFeatures.WITHERING_OAK_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.WITHERING_OAK_LOG).setLeavesBlock(BYGBlocks.WITHERING_OAK_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    //End Mushrooms
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_BUSH1 = createConfiguredFeature("bulbis_bush1", BYGFeatures.BULBIS_BUSH1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE1 = createConfiguredFeature("bulbis_tree1", BYGFeatures.BULBIS_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE2 = createConfiguredFeature("bulbis_tree2", BYGFeatures.BULBIS_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE3 = createConfiguredFeature("bulbis_tree3", BYGFeatures.BULBIS_TREE3.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE4 = createConfiguredFeature("bulbis_tree4", BYGFeatures.BULBIS_TREE4.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE5 = createConfiguredFeature("bulbis_tree5", BYGFeatures.BULBIS_TREE5.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE6 = createConfiguredFeature("bulbis_tree6", BYGFeatures.BULBIS_TREE6.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> BULBIS_TREE7 = createConfiguredFeature("bulbis_tree7", BYGFeatures.BULBIS_TREE7.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_BUSH1 = createConfiguredFeature("purple_bulbis_bush1", BYGFeatures.BULBIS_BUSH1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE1 = createConfiguredFeature("purple_bulbis_tree1", BYGFeatures.BULBIS_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE2 = createConfiguredFeature("purple_bulbis_tree2", BYGFeatures.BULBIS_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE3 = createConfiguredFeature("purple_bulbis_tree3", BYGFeatures.BULBIS_TREE3.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE4 = createConfiguredFeature("purple_bulbis_tree4", BYGFeatures.BULBIS_TREE4.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE5 = createConfiguredFeature("purple_bulbis_tree5", BYGFeatures.BULBIS_TREE5.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE6 = createConfiguredFeature("purple_bulbis_tree6", BYGFeatures.BULBIS_TREE6.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> PURPLE_BULBIS_TREE7 = createConfiguredFeature("purple_bulbis_tree7", BYGFeatures.BULBIS_TREE7.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.BULBIS_WOOD).setMushroomBlock(BYGBlocks.PURPLE_BULBIS_SHELL).setMinHeight(6).setMaxHeight(12).build()));

    //End Trees
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_BUSH1 = createConfiguredFeature("ether_bush1", BYGFeatures.ETHER_BUSH1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_BUSH2 = createConfiguredFeature("ether_bush2", BYGFeatures.ETHER_BUSH2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE1 = createConfiguredFeature("ether_tree1", BYGFeatures.ETHER_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE2 = createConfiguredFeature("ether_tree2", BYGFeatures.ETHER_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE3 = createConfiguredFeature("ether_tree3", BYGFeatures.ETHER_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE4 = createConfiguredFeature("ether_tree4", BYGFeatures.ETHER_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE5 = createConfiguredFeature("ether_tree5", BYGFeatures.ETHER_TREE5.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_LOG).setLeavesBlock(BYGBlocks.ETHER_LEAVES).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE_DEAD1 = createConfiguredFeature("ether_tree_dead1", BYGFeatures.DEAD_ETHER_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_WOOD).setLeavesBlock(Blocks.AIR).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE_DEAD2 = createConfiguredFeature("ether_tree_dead2", BYGFeatures.DEAD_ETHER_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_WOOD).setLeavesBlock(Blocks.AIR).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> ETHER_TREE_DEAD3 = createConfiguredFeature("ether_tree_dead3", BYGFeatures.DEAD_ETHER_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(BYGBlocks.ETHER_WOOD).setLeavesBlock(Blocks.AIR).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> NIGHTSHADE_BUSH1 = createConfiguredFeature("nightshade_bush1", BYGFeatures.NIGHTSHADE_BUSH1.configured(new BYGTreeConfig.Builder().setTrunkBlock(new WeightedBlockStateProvider().add(BYGBlocks.NIGHTSHADE_LOG.defaultBlockState(), 9).add(BYGBlocks.IMBUED_NIGHTSHADE_LOG.defaultBlockState(), 1)).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.FLOWERING_NIGHTSHADE_LEAVES.defaultBlockState(), 3).add(BYGBlocks.NIGHTSHADE_LEAVES.defaultBlockState(), 8)).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> NIGHTSHADE_BUSH2 = createConfiguredFeature("nightshade_bush2", BYGFeatures.NIGHTSHADE_BUSH2.configured(new BYGTreeConfig.Builder().setTrunkBlock(new WeightedBlockStateProvider().add(BYGBlocks.NIGHTSHADE_LOG.defaultBlockState(), 9).add(BYGBlocks.IMBUED_NIGHTSHADE_LOG.defaultBlockState(), 1)).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.FLOWERING_NIGHTSHADE_LEAVES.defaultBlockState(), 3).add(BYGBlocks.NIGHTSHADE_LEAVES.defaultBlockState(), 8)).setMaxHeight(30).setMinHeight(22).build()));

    public static final ConfiguredFeature<BYGTreeConfig, ?> NIGHTSHADE_TREE1 = createConfiguredFeature("nightshade_tree1", BYGFeatures.NIGHTSHADE_TREE1.configured(new BYGTreeConfig.Builder().setTrunkBlock(new WeightedBlockStateProvider().add(BYGBlocks.NIGHTSHADE_LOG.defaultBlockState(), 9).add(BYGBlocks.IMBUED_NIGHTSHADE_LOG.defaultBlockState(), 1)).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.FLOWERING_NIGHTSHADE_LEAVES.defaultBlockState(), 3).add(BYGBlocks.NIGHTSHADE_LEAVES.defaultBlockState(), 8)).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> NIGHTSHADE_TREE2 = createConfiguredFeature("nightshade_tree2", BYGFeatures.NIGHTSHADE_TREE2.configured(new BYGTreeConfig.Builder().setTrunkBlock(new WeightedBlockStateProvider().add(BYGBlocks.NIGHTSHADE_LOG.defaultBlockState(), 9).add(BYGBlocks.IMBUED_NIGHTSHADE_LOG.defaultBlockState(), 1)).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.FLOWERING_NIGHTSHADE_LEAVES.defaultBlockState(), 3).add(BYGBlocks.NIGHTSHADE_LEAVES.defaultBlockState(), 8)).setMaxHeight(30).setMinHeight(22).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> NIGHTSHADE_TREE3 = createConfiguredFeature("nightshade_tree3", BYGFeatures.NIGHTSHADE_TREE3.configured(new BYGTreeConfig.Builder().setTrunkBlock(new WeightedBlockStateProvider().add(BYGBlocks.NIGHTSHADE_LOG.defaultBlockState(), 9).add(BYGBlocks.IMBUED_NIGHTSHADE_LOG.defaultBlockState(), 1)).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.FLOWERING_NIGHTSHADE_LEAVES.defaultBlockState(), 3).add(BYGBlocks.NIGHTSHADE_LEAVES.defaultBlockState(), 8)).setMaxHeight(30).setMinHeight(33).build()));
    public static final ConfiguredFeature<BYGTreeConfig, ?> NIGHTSHADE_TREE4 = createConfiguredFeature("nightshade_tree4", BYGFeatures.NIGHTSHADE_TREE4.configured(new BYGTreeConfig.Builder().setTrunkBlock(new WeightedBlockStateProvider().add(BYGBlocks.NIGHTSHADE_LOG.defaultBlockState(), 9).add(BYGBlocks.IMBUED_NIGHTSHADE_LOG.defaultBlockState(), 1)).setLeavesBlock(new WeightedBlockStateProvider().add(BYGBlocks.FLOWERING_NIGHTSHADE_LEAVES.defaultBlockState(), 3).add(BYGBlocks.NIGHTSHADE_LEAVES.defaultBlockState(), 8)).setMaxHeight(30).setMinHeight(44).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> SHULKREN_TREE1 = createConfiguredFeature("shulkren_tree1", BYGFeatures.SHULKREN_TREE1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.WHITE_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.SHULKREN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> SHULKREN_TREE2 = createConfiguredFeature("shulkren_tree2", BYGFeatures.SHULKREN_TREE2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.WHITE_MUSHROOM_STEM).setMushroomBlock(BYGBlocks.SHULKREN_WART_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> IMPARIUS_MUSHROOM1 = createConfiguredFeature("imparius_mushroom1", BYGFeatures.IMPARIUS_MUSHROOM1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.IMPARIUS_STEM).setMushroomBlock(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> IMPARIUS_MUSHROOM2 = createConfiguredFeature("imparius_mushroom2", BYGFeatures.IMPARIUS_MUSHROOM2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.IMPARIUS_STEM).setMushroomBlock(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> IMPARIUS_MUSHROOM3 = createConfiguredFeature("imparius_mushroom3", BYGFeatures.IMPARIUS_MUSHROOM3.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.IMPARIUS_STEM).setMushroomBlock(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> IMPARIUS_MUSHROOM4 = createConfiguredFeature("imparius_mushroom4", BYGFeatures.IMPARIUS_MUSHROOM4.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.IMPARIUS_STEM).setMushroomBlock(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> IMPARIUS_MUSHROOM5 = createConfiguredFeature("imparius_mushroom5", BYGFeatures.IMPARIUS_MUSHROOM5.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.IMPARIUS_STEM).setMushroomBlock(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> IMPARIUS_MUSHROOM6 = createConfiguredFeature("imparius_mushroom6", BYGFeatures.IMPARIUS_MUSHROOM6.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.IMPARIUS_STEM).setMushroomBlock(BYGBlocks.IMPARIUS_MUSHROOM_BLOCK).setMinHeight(6).setMaxHeight(12).build()));

    public static final ConfiguredFeature<BYGMushroomConfig, ?> FUNGAL_IMPARIUS1 = createConfiguredFeature("fungal_imparius1", BYGFeatures.FUNGAL_IMPARIUS1.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.FUNGAL_IMPARIUS_STEM).setMushroomBlock(BYGBlocks.FUNGAL_IMPARIUS_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> FUNGAL_IMPARIUS2 = createConfiguredFeature("fungal_imparius2", BYGFeatures.FUNGAL_IMPARIUS2.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.FUNGAL_IMPARIUS_STEM).setMushroomBlock(BYGBlocks.FUNGAL_IMPARIUS_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> FUNGAL_IMPARIUS3 = createConfiguredFeature("fungal_imparius3", BYGFeatures.FUNGAL_IMPARIUS3.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.FUNGAL_IMPARIUS_STEM).setMushroomBlock(BYGBlocks.FUNGAL_IMPARIUS_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> FUNGAL_IMPARIUS4 = createConfiguredFeature("fungal_imparius4", BYGFeatures.FUNGAL_IMPARIUS4.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.FUNGAL_IMPARIUS_STEM).setMushroomBlock(BYGBlocks.FUNGAL_IMPARIUS_BLOCK).setMinHeight(6).setMaxHeight(12).build()));
    public static final ConfiguredFeature<BYGMushroomConfig, ?> FUNGAL_IMPARIUS5 = createConfiguredFeature("fungal_imparius5", BYGFeatures.FUNGAL_IMPARIUS5.configured(new BYGMushroomConfig.Builder().setStemBlock(BYGBlocks.FUNGAL_IMPARIUS_STEM).setMushroomBlock(BYGBlocks.FUNGAL_IMPARIUS_BLOCK).setMinHeight(6).setMaxHeight(12).build()));


    /***********************************************************Configured Placement***********************************************************/

    public static final ConfiguredFeature<?, ?> SHRUBLAND_SHRUB = createConfiguredFeature("shrubland_shrub", SHRUB.decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));


    /***********************************************************Random Selectors***********************************************************/

    public static final ConfiguredFeature<?, ?> RANDOM_ANCIENT_TREE = createConfiguredFeature("ancient_forest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.DARK_OAK.weighted(0.3F),
            ANCIENT_TREE1.weighted(0.20F),
            ANCIENT_TREE2.weighted(0.20F)),
            ANCIENT_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(16, 0.4F, 8))));

    public static final ConfiguredFeature<?, ?> RANDOM_BAYOU_TREE = createConfiguredFeature("bayou_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WILLOW_DEAD_TREE1.weighted(0.1F),
            WILLOW_TREE1.weighted(0.25F),
            WILLOW_TREE2.weighted(0.25F),
            WILLOW_TREE3.weighted(0.25F)),
            WILLOW_TREE4)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(8, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_BAYOU_TREE = createConfiguredFeature("sparse_bayou_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WILLOW_TREE1.weighted(0.25F),
            WILLOW_TREE2.weighted(0.25F),
            WILLOW_TREE3.weighted(0.25F)),
            WILLOW_TREE4)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CORAL_MANGROVE = createConfiguredFeature("mg_coral", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            Feature.CORAL_TREE.configured(IFeatureConfig.NONE).weighted(0.25F),
            Feature.CORAL_MUSHROOM.configured(IFeatureConfig.NONE).weighted(0.25F)),
            Feature.CORAL_CLAW.configured(IFeatureConfig.NONE))).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(25, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLUFF_TREE = createConfiguredFeature("bluff_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE1.weighted(0.05F),
            PINE_TREE2.weighted(0.05F),
            BLUFF_TREE1.weighted(0.3F),
            BLUFF_TREE2.weighted(0.3F),
            BLUFF_TREE3.weighted(0.25F)),
            CONIFER_TREE6)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(12, 0.3F, -4))));

    public static final ConfiguredFeature<?, ?> RANDOM_BOREAL_TREE = createConfiguredFeature("boreal_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_YELLOW_BOREAL_TREE1.weighted(0.3F),
            BIRCH_BOREAL_TREE1.weighted(0.3F)),
            BOREAL_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(18, 0.5F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BOREAL_SPARSE_TREE = createConfiguredFeature("sparse_boreal_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_YELLOW_BOREAL_TREE1.weighted(0.3F),
            BIRCH_BOREAL_TREE1.weighted(0.3F)),
            BOREAL_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLACK_FOREST_TREE = createConfiguredFeature("black_forest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_TREE3.weighted(0.05F),
            ASPEN_TREE2.weighted(0.05F),
            CONIFER_TREE6.weighted(0.05F),
            CONIFER_TREE7.weighted(0.05F),
            PINE_LARGE_TREE1.weighted(0.5F),
            PINE_LARGE_TREE2.weighted(0.5F),
            PINE_TREE1.weighted(0.5F)),
            PINE_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(30, 0.4F, -5))));

    public static final ConfiguredFeature<?, ?> RANDOM_BLACK_FOREST_SPARSE_TREE = createConfiguredFeature("sparse_black_forest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_LARGE_TREE1.weighted(0.45F),
            PINE_LARGE_TREE2.weighted(0.45F),
            PINE_TREE1.weighted(0.4F)),
            PINE_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CIKA_TREE = createConfiguredFeature("cika_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CIKA_TREE2.weighted(0.2F),
            CIKA_TREE3.weighted(0.1F)),
            CIKA_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_CONIFER_TREE = createConfiguredFeature("conifer_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CONIFER_TREE1.weighted(0.06F),
            CONIFER_TREE2.weighted(0.5F),
            CONIFER_TREE3.weighted(0.04F),
            CONIFER_TREE4.weighted(0.2F),
            CONIFER_TREE5.weighted(0.2F),
            CONIFER_TREE6.weighted(0.2F),
            CONIFER_TREE7.weighted(0.1F)),
            CONIFER_TREE8)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(18, 0.4F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_CONIFER_SPARSE_TREE = createConfiguredFeature("sparse_conifer_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CONIFER_TREE1.weighted(0.06F),
            CONIFER_TREE2.weighted(0.5F),
            CONIFER_TREE3.weighted(0.04F),
            CONIFER_TREE4.weighted(0.2F),
            CONIFER_TREE5.weighted(0.2F),
            CONIFER_TREE6.weighted(0.2F),
            CONIFER_TREE7.weighted(0.1F)),
            CONIFER_TREE8)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CRAG_GARDEN_TREE = createConfiguredFeature("crag_garden_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_TREE1.weighted(0.2F),
            RAINBOW_TREE1.weighted(0.2F),
            Features.BAMBOO.weighted(0.05F),
            RAINBOW_LARGE_TREE1.weighted(0.1F)),
            MAHOGANY_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(30, 0.4F, 8))));

    public static final ConfiguredFeature<?, ?> RANDOM_CYPRESS_TREE = createConfiguredFeature("cypress_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CYPRESS_TREE1.weighted(0.5F),
            CYPRESS_TREE2.weighted(0.4F)),
            CYPRESS_TREE3)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(5, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_TREE = createConfiguredFeature("deciduous_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_TREE1.weighted(0.25F),
            DECIDUOUS_TREE2.weighted(0.25F),
            DECIDUOUS_TREE3.weighted(0.25F)),
            DECIDUOUS_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_RED_TREE = createConfiguredFeature("deciduous_red_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_RED_TREE1.weighted(0.25F),
            DECIDUOUS_RED_TREE2.weighted(0.25F),
            DECIDUOUS_RED_TREE3.weighted(0.25F)),
            DECIDUOUS_RED_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_ORANGE_TREE = createConfiguredFeature("deciduous_orange_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_ORANGE_TREE1.weighted(0.25F),
            DECIDUOUS_ORANGE_TREE2.weighted(0.25F),
            DECIDUOUS_ORANGE_TREE3.weighted(0.25F)),
            DECIDUOUS_ORANGE_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_BROWN_TREE = createConfiguredFeature("deciduous_brown_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_BROWN_TREE1.weighted(0.25F),
            DECIDUOUS_BROWN_TREE2.weighted(0.25F),
            DECIDUOUS_BROWN_TREE3.weighted(0.25F)),
            DECIDUOUS_BROWN_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_DECIDUOUS_SPARSE_TREE = createConfiguredFeature("sparse_deciduous_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_TREE1.weighted(0.25F),
            DECIDUOUS_TREE2.weighted(0.25F),
            DECIDUOUS_TREE3.weighted(0.25F)),
            DECIDUOUS_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DOVER_TREE = createConfiguredFeature("dover_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_LARGE_TREE1.weighted(0.25F),
            PINE_LARGE_TREE2.weighted(0.25F)),
            SPRUCE_TREE_LARGE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_EUCALYPTUS_TREE = createConfiguredFeature("eucalyptus_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_TREE1.weighted(0.1F)),
            RAINBOW_LARGE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(8, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_JACARANDA_TREE = createConfiguredFeature("jacaranda_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            JACARANDA_TREE2.weighted(0.3F),
            INDIGO_JACARANDA_TREE2.weighted(0.3F),
            INDIGO_JACARANDA_TREE1.weighted(0.3F)),
            JACARANDA_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(25, 0.1F, -5))));

    public static final ConfiguredFeature<?, ?> RANDOM_JACARANDA_SPARSE_TREE = createConfiguredFeature("sparse_jacaranda_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            INDIGO_JACARANDA_TREE1.weighted(0.3F)),
            JACARANDA_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MAPLE_TREE = createConfiguredFeature("maple_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            MAPLE_RED_TREE1.weighted(0.4F),
            MAPLE_RED_TREE2.weighted(0.03F),
            MAPLE_SILVER_TREE1.weighted(0.2F),
            MAPLE_SILVER_TREE2.weighted(0.1F)),
            MAPLE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(5, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MAPLE_SPARSE_TREE = createConfiguredFeature("sparse_maple_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            MAPLE_TREE1.weighted(0.06F),
            MAPLE_RED_TREE1.weighted(0.5F),
            MAPLE_TREE1.weighted(0.04F),
            MAPLE_SILVER_TREE1.weighted(0.2F),
            MAPLE_SILVER_TREE2.weighted(0.1F)),
            MAPLE_RED_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_NORTHERN_FOREST_TREE = createConfiguredFeature("northern_forest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE1.weighted(0.5F)),
            PINE_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PRAIRIE_TREE = createConfiguredFeature("prairie_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_PRAIRIE1.weighted(0.4F),
            SHRUB_PRAIRIE2.weighted(0.4F),
            Features.FANCY_OAK_BEES_002.weighted(0.1F)),
            Features.FANCY_OAK)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_REDWOOD_TREE = createConfiguredFeature("redwood_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            REDWOOD_TREE1.weighted(0.55F),
            REDWOOD_TREE2.weighted(0.1F)),
            REDWOOD_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_REDWOOD_SPARSE_TREE = createConfiguredFeature("sparse_redwood_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            REDWOOD_TREE1.weighted(0.55F),
            REDWOOD_TREE2.weighted(0.1F)),
            REDWOOD_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_SHRUB = createConfiguredFeature("seasonal_shrubs", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB.weighted(0.4F)),
            DECIDUOUS_SEASONAL_SHRUB)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(5, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_DECIDUOUS_SPARSE_TREE = createConfiguredFeature("sparse_seasonal_deciduous_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DECIDUOUS_RED_TREE1.weighted(0.2F),
            DECIDUOUS_ORANGE_TREE1.weighted(0.2F),
            DECIDUOUS_SEASONAL_SHRUB.weighted(0.2F),
            DECIDUOUS_BROWN_TREE1.weighted(0.2F)),
            DECIDUOUS_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_TAIGA_MISC_TREE = createConfiguredFeature("seasonal_taiga_misc_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PINE_TREE1.weighted(0.25F),
            PINE_TREE2.weighted(0.25F),
            ASPEN_TREE2.weighted(0.25F)),
            ASPEN_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_SEASONAL_TREE_GIANT = createConfiguredFeature("spruce_seasonal_giant_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_RED_TREE_LARGE1.weighted(0.25F),
            SPRUCE_ORANGE_TREE_LARGE1.weighted(0.25F),
            SPRUCE_YELLOW_TREE_LARGE1.weighted(0.25F)),
            SPRUCE_TREE_LARGE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_TREE = createConfiguredFeature("spruce_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_TREE1.weighted(0.06F),
            SPRUCE_TREE2.weighted(0.5F),
            SPRUCE_TREE3.weighted(0.04F),
            SPRUCE_TREE4.weighted(0.2F),
            SPRUCE_TREE_MEDIUM1.weighted(0.2F),
            SPRUCE_TREE_MEDIUM2.weighted(0.2F),
            SPRUCE_TREE_MEDIUM3.weighted(0.2F),
            SPRUCE_TREE_MEDIUM4.weighted(0.1F)),
            SPRUCE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_YELLOW_TREE = createConfiguredFeature("spruce_yellow_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_YELLOW_TREE1.weighted(0.06F),
            SPRUCE_YELLOW_TREE2.weighted(0.5F),
            SPRUCE_YELLOW_TREE3.weighted(0.04F),
            SPRUCE_YELLOW_TREE4.weighted(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM1.weighted(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM2.weighted(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM3.weighted(0.2F),
            SPRUCE_YELLOW_TREE_MEDIUM4.weighted(0.1F)),
            SPRUCE_YELLOW_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_ORANGE_TREE = createConfiguredFeature("spruce_orange_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_ORANGE_TREE1.weighted(0.06F),
            SPRUCE_ORANGE_TREE2.weighted(0.5F),
            SPRUCE_ORANGE_TREE3.weighted(0.04F),
            SPRUCE_ORANGE_TREE4.weighted(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM1.weighted(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM2.weighted(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM3.weighted(0.2F),
            SPRUCE_ORANGE_TREE_MEDIUM4.weighted(0.1F)),
            SPRUCE_ORANGE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_RED_TREE = createConfiguredFeature("spruce_red_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_RED_TREE1.weighted(0.06F),
            SPRUCE_RED_TREE2.weighted(0.5F),
            SPRUCE_RED_TREE3.weighted(0.04F),
            SPRUCE_RED_TREE4.weighted(0.2F),
            SPRUCE_RED_TREE_MEDIUM1.weighted(0.2F),
            SPRUCE_RED_TREE_MEDIUM2.weighted(0.2F),
            SPRUCE_RED_TREE_MEDIUM3.weighted(0.2F),
            SPRUCE_RED_TREE_MEDIUM4.weighted(0.1F)),
            SPRUCE_RED_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_BLUE_TREE = createConfiguredFeature("spruce_blue_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_BLUE_TREE1.weighted(0.06F),
            SPRUCE_BLUE_TREE2.weighted(0.5F),
            SPRUCE_BLUE_TREE3.weighted(0.04F),
            SPRUCE_BLUE_TREE4.weighted(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM1.weighted(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM2.weighted(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM3.weighted(0.2F),
            SPRUCE_BLUE_TREE_MEDIUM4.weighted(0.1F)),
            SPRUCE_BLUE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPRUCE_BLUE_TREE_GIANT = createConfiguredFeature("spruce_blue_tree_giant", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SPRUCE_BLUE_TREE_LARGE1.weighted(0.5F)),
            SPRUCE_TREE_LARGE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_RAINFOREST_FUNGAL_TREE = createConfiguredFeature("fungal_rainforest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_LARGE_TREE1.weighted(0.1F),
            RAINBOW_TREE1.weighted(0.1F),
            MAHOGANY_TREE5.weighted(0.1F),
            TROPICAL_SHRUB1.weighted(0.1F),
            MAHOGANY_TREE2.weighted(0.2F),
            MAHOGANY_TREE3.weighted(0.2F),
            MAHOGANY_TREE4.weighted(0.15F)),
            MAHOGANY_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(20, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> RANDOM_RAINFOREST_SPARSE_TREE = createConfiguredFeature("sparse_rainforest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_LARGE_TREE1.weighted(0.1F),
            RAINBOW_TREE1.weighted(0.1F),
            MAHOGANY_TREE5.weighted(0.1F),
            TROPICAL_SHRUB1.weighted(0.1F),
            MAHOGANY_TREE2.weighted(0.2F),
            MAHOGANY_TREE3.weighted(0.2F),
            MAHOGANY_TREE4.weighted(0.15F)),
            MAHOGANY_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_RAINFOREST_TREE = createConfiguredFeature("rainforest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RAINBOW_LARGE_TREE1.weighted(0.1F),
            RAINBOW_TREE1.weighted(0.1F),
            MAHOGANY_TREE5.weighted(0.1F),
            TROPICAL_SHRUB1.weighted(0.1F),
            MAHOGANY_TREE2.weighted(0.2F),
            MAHOGANY_TREE3.weighted(0.2F),
            MAHOGANY_TREE4.weighted(0.15F)),
            MAHOGANY_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(20, 0.3F, 5))));

    public static final ConfiguredFeature<?, ?> RANDOM_STONE_FOREST_TREE = createConfiguredFeature("stone_forest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            EBONY_TREE1.weighted(0.1F),
            EBONY_TREE2.weighted(0.1F),
            Features.JUNGLE_BUSH.weighted(0.1F),
            DECIDUOUS_TREE1.weighted(0.1F)),
            DECIDUOUS_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(20, 0.3F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_SKYRIS_TREE = createConfiguredFeature("skyris_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SKYRIS_TREE1.weighted(0.15F),
            SKYRIS_TREE5.weighted(0.25F),
            SKYRIS_TREE2.weighted(0.15F),
            SKYRIS_TREE3.weighted(0.25F)),
            SKYRIS_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.45F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_SKYRIS_TREE = createConfiguredFeature("sparse_skyris_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SKYRIS_TREE1.weighted(0.15F),
            SKYRIS_TREE5.weighted(0.25F),
            SKYRIS_TREE2.weighted(0.15F),
            SKYRIS_TREE3.weighted(0.25F)),
            SKYRIS_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BAOBAB_TREE = createConfiguredFeature("baobab_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            Features.ACACIA.weighted(0.15F),
            BAOBAB_TREE1.weighted(0.35F),
            BAOBAB_TREE2.weighted(0.35F)),
            BAOBAB_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.6F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_ARAUCARIA_TREE = createConfiguredFeature("araucaria_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ARAUCARIA_TREE2.weighted(0.5F)),
            ARAUCARIA_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ARAUCARIA_TREE = createConfiguredFeature("sparse_araucaria_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ARAUCARIA_TREE2.weighted(0.5F)),
            ARAUCARIA_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_BROWN_ZELKOVA_TREE = createConfiguredFeature("brown_zelkova_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ZELKOVA_BROWN_TREE3.weighted(0.35F),
            ZELKOVA_BROWN_TREE2.weighted(0.35F)),
            ZELKOVA_BROWN_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MEADOW_SHRUB = createConfiguredFeature("meadow_shrubs", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_MEADOW.weighted(0.1F)),
            SHRUB_PRAIRIE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MEADOW_TREE = createConfiguredFeature("meadow_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            MEADOW_TREE1.weighted(0.2F),
            MEADOW_TREE2.weighted(0.1F)),
            MEADOW_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.5F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_GROVE_TREE = createConfiguredFeature("grove_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_YELLOW_BOREAL_TREE1.weighted(0.5F)),
            BIRCH_BOREAL_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ENCHANTED_GROVE_TREE = createConfiguredFeature("enchanted_grove_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ENCHANTED_BLUE_GROVE_TREE1.weighted(0.5F)),
            ENCHANTED_GREEN_GROVE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_GIANT_FLOWER = createConfiguredFeature("giant_flowers", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            GIANT_ANGELICA_FLOWER.weighted(0.2F),
            GIANT_DANDELION_FLOWER.weighted(0.2F),
            GIANT_IRIS_FLOWER.weighted(0.5F)),
            GIANT_ROSE_FLOWER)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MARSH_TREE = createConfiguredFeature("marsh_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_PRAIRIE2.weighted(0.2F),
            SHRUB_PRAIRIE1.weighted(0.1F)),
            Features.SWAMP_TREE)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(3, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ENCHANTED_TREE = createConfiguredFeature("enchanted_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ENCHANTED_BLUE_TREE2.weighted(0.2F),
            ENCHANTED_BLUE_TREE3.weighted(0.2F),
            ENCHANTED_GREEN_TREE1.weighted(0.2F),
            ENCHANTED_GREEN_TREE2.weighted(0.2F),
            ENCHANTED_GREEN_TREE3.weighted(0.1F)),
            ENCHANTED_BLUE_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(10, 0.4F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_GLOWSHROOM_BAYOU_TREE = createConfiguredFeature("glowshroom_bayou_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WILLOW_DEAD_TREE1.weighted(0.2F),
            WILLOW_M_TREE1.weighted(0.2F),
            WILLOW_M_TREE2.weighted(0.2F),
            WILLOW_TREE3.weighted(0.2F),
            WILLOW_TREE4.weighted(0.2F),
            WILLOW_TREE2.weighted(0.1F)),
            WILLOW_TREE1)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(8, 0.4F, 3))));

    public static final ConfiguredFeature<?, ?> RANDOM_ASPEN_TREE = createConfiguredFeature("aspen_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_TREE2.weighted(0.50F),
            ASPEN_TREE3.weighted(0.25F)),
            ASPEN_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(15, 0.5F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_ASPEN_SHRUB = createConfiguredFeature("aspen_shrubs", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_SHRUB1.weighted(0.1F)),
            ASPEN_SHRUB2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ASPEN_TREE = createConfiguredFeature("sparse_aspen_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ASPEN_TREE2.weighted(0.2F),
            ASPEN_TREE3.weighted(0.1F)),
            ASPEN_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ZELKOVA_TREE = createConfiguredFeature("zelkova_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ZELKOVA_TREE2.weighted(0.2F),
            ZELKOVA_TREE3.weighted(0.1F)),
            ZELKOVA_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(15, 0.4F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ZELKOVA_TREE = createConfiguredFeature("sparse_zelkova_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ZELKOVA_TREE2.weighted(0.2F),
            ZELKOVA_TREE3.weighted(0.1F)),
            ZELKOVA_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PALO_VERDE_TREE = createConfiguredFeature("palo_verde_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PALO_VERDE_TREE1.weighted(0.5F)),
            PALO_VERDE_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_JOSHUA_TREE = createConfiguredFeature("joshua_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            JOSHUA_TREE1.weighted(0.5F)),
            JOSHUA_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SHRUB = createConfiguredFeature("prairie_shrubs", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHRUB_PRAIRIE1.weighted(0.1F)),
            SHRUB_PRAIRIE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PALM_TREE = createConfiguredFeature("sparse_palm_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PALM_TREE4.weighted(0.05F),
            PALM_TREE3.weighted(0.35F),
            PALM_TREE2.weighted(0.35F)),
            PALM_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DENSE_PALM_TREE = createConfiguredFeature("palm_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PALM_TREE4.weighted(0.05F),
            PALM_TREE3.weighted(0.35F),
            PALM_TREE2.weighted(0.35F)),
            PALM_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(7, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_CHERRY_TREE = createConfiguredFeature("cherry_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CHERRY_PINK_TREE1.weighted(0.2F),
            CHERRY_PINK_TREE2.weighted(0.2F),
            CHERRY_WHITE_TREE1.weighted(0.1F)),
            CHERRY_WHITE_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(14, 0.4F, -1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_CHERRY_TREE = createConfiguredFeature("sparse_cherry_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            CHERRY_PINK_TREE1.weighted(0.2F),
            CHERRY_PINK_TREE2.weighted(0.2F),
            CHERRY_WHITE_TREE1.weighted(0.1F)),
            CHERRY_WHITE_TREE2)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WITCH_HAZEL_TREE = createConfiguredFeature("witch_hazel_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEAD_HAZEL_TREE1.weighted(0.2F),
            DEAD_HAZEL_TREE2.weighted(0.2F),
            DEAD_HAZEL_TREE3.weighted(0.1F)),
            DEAD_HAZEL_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(14, 0.3F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_WITCH_HAZEL_TREE = createConfiguredFeature("sparse_witch_hazel_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEAD_HAZEL_TREE1.weighted(0.2F),
            DEAD_HAZEL_TREE2.weighted(0.2F),
            DEAD_HAZEL_TREE3.weighted(0.1F)),
            DEAD_HAZEL_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_EBONY_TREE = createConfiguredFeature("ebony_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            EBONY_TREE1.weighted(0.2F),
            EBONY_TREE2.weighted(0.2F),
            EBONY_BUSH1.weighted(0.1F)),
            EBONY_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(10, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_HOLLY_TREE = createConfiguredFeature("holly_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            HOLLY_TREE1.weighted(0.2F),
            HOLLY_TREE2.weighted(0.2F),
            HOLLY_TREE3.weighted(0.1F)),
            HOLLY_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(25, 0.4F, 5))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_HOLLY_TREE = createConfiguredFeature("sparse_holly_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            HOLLY_TREE1.weighted(0.2F),
            HOLLY_TREE2.weighted(0.2F),
            HOLLY_TREE3.weighted(0.1F)),
            HOLLY_TREE4)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.4F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MANGROVE_TREE = createConfiguredFeature("mangrove_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            MANGROVE_TREE1.weighted(0.2F),
            MANGROVE_TREE2.weighted(0.2F),
            MANGROVE_TREE3.weighted(0.2F),
            MANGROVE_TREE4.weighted(0.1F)),
            MANGROVE_TREE5)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(15, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MANGROVE_SPARSE_TREE = createConfiguredFeature("sparse_mangrove_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            MANGROVE_TREE1.weighted(0.2F),
            MANGROVE_TREE2.weighted(0.2F),
            MANGROVE_TREE3.weighted(0.2F),
            MANGROVE_TREE4.weighted(0.1F)),
            MANGROVE_TREE5)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ORCHARD_TREE = createConfiguredFeature("orchard_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ORCHARD_TREE1.weighted(0.3F),
            ORCHARD_TREE2.weighted(0.3F)),
            ORCHARD_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_WOODLAND_TREE = createConfiguredFeature("woodland_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WOODLANDS_TREE1.weighted(0.1F)),
            WOODLANDS_TREE1)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.35F, 2))));


    public static final ConfiguredFeature<?, ?> RANDOM_OAK_TREE = createConfiguredFeature("oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            OAK_TREE1.weighted(0.3F),
            OAK_TREE2.weighted(0.2F),
            OAK_TREE3.weighted(0.2F),
            OAK_TREE_LARGE1.weighted(0.1F),
            OAK_TREE_LARGE2.weighted(0.1F)),
            OAK_TREE_LARGE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_RED_OAK_TREE = createConfiguredFeature("red_oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RED_OAK_TREE1.weighted(0.3F),
            RED_OAK_TREE2.weighted(0.2F),
            RED_OAK_TREE3.weighted(0.2F),
            RED_OAK_TREE_LARGE1.weighted(0.1F),
            RED_OAK_TREE_LARGE2.weighted(0.1F)),
            RED_OAK_TREE_LARGE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_RED_OAK_TREE = createConfiguredFeature("sparse_red_oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            RED_OAK_TREE1.weighted(0.3F),
            RED_OAK_TREE2.weighted(0.2F),
            RED_OAK_TREE3.weighted(0.2F),
            RED_OAK_TREE_LARGE1.weighted(0.1F),
            RED_OAK_TREE_LARGE2.weighted(0.1F)),
            RED_OAK_TREE_LARGE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_BROWN_OAK_TREE = createConfiguredFeature("brown_oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BROWN_OAK_TREE1.weighted(0.3F),
            BROWN_OAK_TREE2.weighted(0.2F),
            BROWN_OAK_TREE3.weighted(0.2F),
            BROWN_OAK_TREE_LARGE1.weighted(0.1F),
            BROWN_OAK_TREE_LARGE2.weighted(0.1F)),
            BROWN_OAK_TREE_LARGE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_ORANGE_OAK_TREE = createConfiguredFeature("orange_oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ORANGE_OAK_TREE1.weighted(0.3F),
            ORANGE_OAK_TREE2.weighted(0.2F),
            ORANGE_OAK_TREE3.weighted(0.2F),
            ORANGE_OAK_TREE_LARGE1.weighted(0.1F),
            ORANGE_OAK_TREE_LARGE2.weighted(0.1F)),
            ORANGE_OAK_TREE_LARGE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.4F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SEASONAL_BIRCH_FOREST_TREE = createConfiguredFeature("seasonal_birch_forest_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BIRCH_BROWN_TREE1.weighted(0.06F),
            BIRCH_BROWN_TREE2.weighted(0.06F),
            BIRCH_BROWN_TREE3.weighted(0.06F),
            BIRCH_ORANGE_TREE1.weighted(0.06F),
            BIRCH_ORANGE_TREE2.weighted(0.06F),
            BIRCH_ORANGE_TREE3.weighted(0.06F),
            BIRCH_RED_TREE1.weighted(0.06F),
            BIRCH_RED_TREE2.weighted(0.06F),
            BIRCH_RED_TREE3.weighted(0.06F),
            BIRCH_YELLOW_TREE1.weighted(0.06F),
            BIRCH_YELLOW_TREE2.weighted(0.1F)),
            BIRCH_YELLOW_TREE3)).decorated(Features.Placements.HEIGHTMAP_SQUARE).decorated(Placement.COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(8, 0.3F, -2))));

    public static final ConfiguredFeature<?, ?> RANDOM_HUGE_GLOWSHROOM = createConfiguredFeature("huge_glowshroom", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BLUE_GLOWSHROOM_HUGE.weighted(0.1F)),
            PURPLE_GLOWSHROOM_HUGE)).decorated(Placement.DARK_OAK_TREE.configured(IPlacementConfig.NONE)));

    public static final ConfiguredFeature<?, ?> RANDOM_SOUL_SHROOM_TREES = createConfiguredFeature("soul_shroom_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SOUL_SHROOM_TREE3.weighted(0.35F),
            SOUL_SHROOM_TREE2.weighted(0.35F)),
            SOUL_SHROOM_TREE1)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(8, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DEATH_CAP_TREES = createConfiguredFeature("death_cap_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            DEATH_CAP_TREE3.weighted(0.35F),
            DEATH_CAP_TREE2.weighted(0.35F)),
            DEATH_CAP_TREE1)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(8, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_MINI_MUSHROOMS = createConfiguredFeature("mini_mushrooms", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            GREEN_MUSHROOM_MINI.weighted(0.16F),
            RED_MUSHROOM_MINI.weighted(0.16F),
            BROWN_MUSHROOM_MINI.weighted(0.16F),
            WOOD_BLEWIT_MINI.weighted(0.16F),
            WEEPING_MILKCAP_MINI.weighted(0.16F)),
            BLACK_PUFF_MINI)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(7, 0.5F, 4))));

    public static final ConfiguredFeature<?, ?> RANDOM_HUGE_MUSHROOM = createConfiguredFeature("huge_mushrooms", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            GREEN_MUSHROOM_HUGE.weighted(0.4F),
            WOOD_BLEWIT_HUGE.weighted(0.4F),
            WEEPING_MILKCAP_HUGE.weighted(0.4F)),
            BLACK_PUFF_HUGE)).decorated(Placement.DARK_OAK_TREE.configured(IPlacementConfig.NONE)));

    public static final ConfiguredFeature<?, ?> RANDOM_EMBUR_MUSHROOM = createConfiguredFeature("embur_mushrooms", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            EMBUR_MUSHROOM.weighted(0.5F)),
            EMBUR_MUSHROOM2)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(2, 0.5F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_FUNGUS = createConfiguredFeature("fungi", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WARPED_FUNGUS1.weighted(0.15F),
            WARPED_FUNGUS2.weighted(0.15F),
            CRIMSON_FUNGUS1.weighted(0.4F)),
            CRIMSON_FUNGUS2)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SYTHIAN_FUNGUS = createConfiguredFeature("sythian_fungi_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SYTHIAN_FUNGUS_TREE1.weighted(0.25F),
            SYTHIAN_FUNGUS_TREE2.weighted(0.25F),
            SYTHIAN_FUNGUS_TREE3.weighted(0.25F)),
            SYTHIAN_FUNGUS_TREE4)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(12, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WITHERING_OAK_TREE = createConfiguredFeature("withering_oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WITHERING_OAK_TREE4.weighted(0.25F),
            WITHERING_OAK_TREE3.weighted(0.25F),
            WITHERING_OAK_TREE2.weighted(0.25F)),
            WITHERING_OAK_TREE1)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(12, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_WITHERING_OAK_TREE = createConfiguredFeature("sparse_withering_oak_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            WITHERING_OAK_TREE3.weighted(0.25F)),
            WITHERING_OAK_TREE1)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_TWISTY_LAMENT_TREE = createConfiguredFeature("twisty_lament_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            LAMENT_TWISTY_TREE3.weighted(0.35F),
            LAMENT_TWISTY_TREE2.weighted(0.35F)),
            LAMENT_TWISTY_TREE1)).decorated(BYGDecorators.UNDERGROUND_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(12, 0.5F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_WEEPING_LAMENT_TREE = createConfiguredFeature("weeping_lament_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            LAMENT_WEEPING_TREE3.weighted(0.35F),
            LAMENT_WEEPING_TREE2.weighted(0.35F)),
            LAMENT_WEEPING_TREE1)).decorated(BYGDecorators.AT_OR_BELOW_SEA_LEVEL.configured(
            new AtOrBelowSeaLevelCountExtraConfig(8, 0.5F, 2, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_BULBIS_TREE = createConfiguredFeature("bulbis_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BULBIS_BUSH1.weighted(0.1F),
            BULBIS_TREE1.weighted(0.15F),
            BULBIS_TREE2.weighted(0.15F),
            BULBIS_TREE3.weighted(0.1F),
            BULBIS_TREE4.weighted(0.15F),
            BULBIS_TREE5.weighted(0.15F),
            BULBIS_TREE6.weighted(0.1F)),
            BULBIS_TREE7)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.1F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_BULBIS_TREE = createConfiguredFeature("sparse_bulbis_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            BULBIS_BUSH1.weighted(0.1F),
            BULBIS_TREE1.weighted(0.15F),
            BULBIS_TREE2.weighted(0.15F),
            BULBIS_TREE3.weighted(0.1F),
            BULBIS_TREE4.weighted(0.15F),
            BULBIS_TREE5.weighted(0.15F),
            BULBIS_TREE6.weighted(0.1F)),
            BULBIS_TREE7)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_PURPLE_BULBIS_TREE = createConfiguredFeature("purple_bulbis_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PURPLE_BULBIS_BUSH1.weighted(0.1F),
            PURPLE_BULBIS_TREE1.weighted(0.15F),
            PURPLE_BULBIS_TREE2.weighted(0.15F),
            PURPLE_BULBIS_TREE3.weighted(0.1F),
            PURPLE_BULBIS_TREE4.weighted(0.15F),
            PURPLE_BULBIS_TREE5.weighted(0.15F),
            PURPLE_BULBIS_TREE6.weighted(0.1F)),
            PURPLE_BULBIS_TREE7)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.3F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_PURPLE_BULBIS_TREE = createConfiguredFeature("sparse_purple_bulbis_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            PURPLE_BULBIS_BUSH1.weighted(0.1F),
            PURPLE_BULBIS_TREE1.weighted(0.15F),
            PURPLE_BULBIS_TREE2.weighted(0.15F),
            PURPLE_BULBIS_TREE3.weighted(0.1F),
            PURPLE_BULBIS_TREE4.weighted(0.15F),
            PURPLE_BULBIS_TREE5.weighted(0.15F),
            PURPLE_BULBIS_TREE6.weighted(0.1F)),
            PURPLE_BULBIS_TREE7)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_NIGHTSHADE_TREE = createConfiguredFeature("nightshade_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            NIGHTSHADE_TREE1.weighted(0.15F),
            NIGHTSHADE_TREE2.weighted(0.3F),
            NIGHTSHADE_TREE3.weighted(0.3F)),
            NIGHTSHADE_TREE4)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_NIGHTSHADE_BUSH = createConfiguredFeature("nightshade_bushes", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            NIGHTSHADE_BUSH1.weighted(0.7F)),
            NIGHTSHADE_BUSH2)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ETHER_TREE = createConfiguredFeature("ether_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ETHER_TREE1.weighted(0.15F),
            ETHER_TREE2.weighted(0.15F),
            ETHER_TREE3.weighted(0.15F),
            ETHER_TREE5.weighted(0.15F)),
            ETHER_TREE4)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SPARSE_ETHER_TREE = createConfiguredFeature("sparse_ether_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ETHER_TREE1.weighted(0.4F),
            ETHER_TREE2.weighted(0.4F),
            ETHER_TREE3.weighted(0.05F),
            ETHER_TREE5.weighted(0.05F)),
            ETHER_TREE4)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.35F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_ETHER_BUSH = createConfiguredFeature("ether_bushes", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ETHER_BUSH1.weighted(0.7F)),
            ETHER_BUSH2)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_SHULKREN_TREE = createConfiguredFeature("shulkren_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHULKREN_TREE1.weighted(0.7F)),
            SHULKREN_TREE2)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(4, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_IMPARIUS_MUSHROOM = createConfiguredFeature("imparius_mushrooms", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            IMPARIUS_MUSHROOM3.weighted(0.25F),
            IMPARIUS_MUSHROOM4.weighted(0.25F),
            IMPARIUS_MUSHROOM5.weighted(0.25F)),
            IMPARIUS_MUSHROOM6)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_IMPARIUS_MUSHROOM_SHRUBS = createConfiguredFeature("imparius_mushroom_shrubs", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            IMPARIUS_MUSHROOM1.weighted(0.5F)),
            IMPARIUS_MUSHROOM2)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.1F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_FUNGAL_IMPARIUS = createConfiguredFeature("fungal_impariuses", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            FUNGAL_IMPARIUS1.weighted(0.25F),
            FUNGAL_IMPARIUS2.weighted(0.25F),
            FUNGAL_IMPARIUS3.weighted(0.25F),
            FUNGAL_IMPARIUS4.weighted(0.25F)),
            FUNGAL_IMPARIUS5)).decorated(BYGDecorators.OCEAN_FLOOR_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(0, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DEAD_ETHER_TREE = createConfiguredFeature("dead_ether_trees", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            ETHER_TREE_DEAD1.weighted(0.35F),
            ETHER_TREE_DEAD2.weighted(0.35F)),
            ETHER_TREE_DEAD3)).decorated(BYGDecorators.MOTION_BLOCKING_NO_LEAVES_COUNT_EXTRA.configured(
            new AtSurfaceWithExtraConfig(1, 0.3F, 2))));

    public static final ConfiguredFeature<?, ?> RANDOM_DESERT_END_ISLAND = createConfiguredFeature("floating_desert_end_islands", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            FLOATING_DESERT_ISLAND1.weighted(0.35F),
            FLOATING_DESERT_ISLAND2.weighted(0.35F)),
            FLOATING_DESERT_ISLAND3)).decorated(BYGDecorators.ISLAND.configured(
            new AtSurfaceWithExtraConfig(0, 0.2F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_ISLAND = createConfiguredFeature("floating_islands", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            FLOATING_ISLAND1.weighted(0.25F),
            FLOATING_ISLAND2.weighted(0.25F),
            FLOATING_ISLAND3.weighted(0.25F)),
            FLOATING_ISLAND5)).decorated(BYGDecorators.ISLAND.configured(
            new AtSurfaceWithExtraConfig(0, 0.13F, 1))));

    public static final ConfiguredFeature<?, ?> RANDOM_SHATTERED_ISLAND = createConfiguredFeature("shattered_floating_islands", Feature.RANDOM_SELECTOR.configured(new MultipleRandomFeatureConfig(ImmutableList.of(
            SHATTERED_FLOATING_ISLAND1.weighted(0.25F),
            SHATTERED_FLOATING_ISLAND2.weighted(0.25F),
            SHATTERED_FLOATING_ISLAND2.weighted(0.25F)),
            SHATTERED_FLOATING_ISLAND4)).decorated(BYGDecorators.ISLAND.configured(
            new AtSurfaceWithExtraConfig(0, 0.13F, 1))));

    //Initialize these later so our blocks don't throw NPEs initializing other configured features in this class.
    public static class SpreadableBlockConfigs {
        public static final BlockStateProvidingFeatureConfig EMBUR_ROOTS = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.EMBUR_ROOTS.defaultBlockState(), 50).add(BYGBlocks.EMBUR_SPROUTS.defaultBlockState(), 35).add(BYGBlocks.EMBUR_WART.defaultBlockState(), 11));
        public static final BlockStateProvidingFeatureConfig MEADOW_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.CLOVER_PATCH.defaultBlockState(), 15).add(Blocks.GRASS.defaultBlockState(), 30).add(Blocks.PINK_TULIP.defaultBlockState(), 15).add(BYGBlocks.MAGENTA_TULIP.defaultBlockState(), 15).add(BYGBlocks.CYAN_TULIP.defaultBlockState(), 15).add(BYGBlocks.WHITE_ANEMONE.defaultBlockState(), 15).add(BYGBlocks.ROSE.defaultBlockState(), 10));
        public static final BlockStateProvidingFeatureConfig SYTHIAN_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.SYTHIAN_ROOTS.defaultBlockState(), 50).add(BYGBlocks.SYTHIAN_SPROUT.defaultBlockState(), 50).add(BYGBlocks.SYTHIAN_FUNGUS.defaultBlockState(), 11));
        public static final BlockStateProvidingFeatureConfig IVIS_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.IVIS_ROOTS.defaultBlockState(), 50).add(BYGBlocks.IVIS_SPROUT.defaultBlockState(), 50));
        public static final BlockStateProvidingFeatureConfig OVERGROWN_BLACKSTONE_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(Blocks.CRIMSON_ROOTS.defaultBlockState(), 80).add(Blocks.CRIMSON_FUNGUS.defaultBlockState(), 15).add(BYGBlocks.CRIMSON_BERRY_BUSH.defaultBlockState(), 5));
        public static final BlockStateProvidingFeatureConfig OVERGROWN_NETHERRACK_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(Blocks.NETHER_SPROUTS.defaultBlockState(), 90).add(BYGBlocks.SOUL_SHROOM.defaultBlockState(), 5).add(BYGBlocks.DEATH_CAP.defaultBlockState(), 5));
        public static final BlockStateProvidingFeatureConfig MYCELIUM_NETHERRACK_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.SOUL_SHROOM.defaultBlockState(), 50).add(BYGBlocks.DEATH_CAP.defaultBlockState(), 50));
        public static final BlockStateProvidingFeatureConfig ETHER_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.ETHER_GRASS.defaultBlockState(), 50).add(BYGBlocks.ETHER_BUSH.defaultBlockState(), 45).add(BYGBlocks.THEREAL_BELLFLOWER.defaultBlockState(), 5));
        public static final BlockStateProvidingFeatureConfig NIGHTSHADE_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.NIGHTSHADE_SPROUTS.defaultBlockState(), 50).add(BYGBlocks.NIGHTSHADE_SPROUTS.defaultBlockState(), 50));
        public static final BlockStateProvidingFeatureConfig VERMILION_SCULK_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.VERMILION_SCULK_GROWTH.defaultBlockState(), 50).add(BYGBlocks.VERMILION_SCULK_GROWTH.defaultBlockState(), 45).add(BYGBlocks.VERMILION_SCULK_GROWTH.defaultBlockState(), 5));
        public static final BlockStateProvidingFeatureConfig BULBIS_CONFIG = new BlockStateProvidingFeatureConfig((new WeightedBlockStateProvider()).add(BYGBlocks.BULBIS_SPROUTS.defaultBlockState(), 50).add(BYGBlocks.BULBIS_SPROUTS.defaultBlockState(), 45).add(BYGBlocks.BULBIS_SPROUTS.defaultBlockState(), 5));
    }

    //Initialize these later to ensure config values were read.
    public static class OreConfigs {
        public static final ConfiguredFeature<?, ?> ORE_AMETRINE = createConfiguredFeature("ore_ametrine", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlocks.AMETRINE_ORE.defaultBlockState(), BYGWorldConfig.AMETRINE_GEN_SIZE.get())).range(BYGWorldConfig.AMETRINE_GEN_Y.get()).squared().count(BYGWorldConfig.AMETRINE_GEN_PER_CHUNK.get()));
        public static final ConfiguredFeature<?, ?> ORE_PENDORITE = createConfiguredFeature("ore_pendorite", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlocks.PENDORITE_ORE.defaultBlockState(), BYGWorldConfig.PENDORITE_GEN_SIZE.get())).range(BYGWorldConfig.PENDORITE_GEN_Y.get()).squared().count(BYGWorldConfig.PENDORITE_GEN_PER_CHUNK.get()));

        public static final ConfiguredFeature<?, ?> ORE_ROCKY_STONE = createConfiguredFeature("ore_rocky_stone", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlocks.ROCKY_STONE.defaultBlockState(), BYGWorldConfig.ROCKY_STONE_GEN_SIZE.get())).range(BYGWorldConfig.ROCKY_STONE_GEN_Y.get()).squared().count(BYGWorldConfig.ROCKY_STONE_GEN_PER_CHUNK.get()));
        public static final ConfiguredFeature<?, ?> ORE_SCORIA_STONE = createConfiguredFeature("ore_scoria_stone", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlocks.SCORIA_STONE.defaultBlockState(), BYGWorldConfig.SCORIA_STONE_GEN_SIZE.get())).range(BYGWorldConfig.SCORIA_STONE_GEN_Y.get()).squared().count(BYGWorldConfig.SCORIA_STONE_GEN_PER_CHUNK.get()));
        public static final ConfiguredFeature<?, ?> ORE_SOAP_STONE = createConfiguredFeature("ore_soap_stone", Feature.ORE.configured(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlocks.SOAPSTONE.defaultBlockState(), BYGWorldConfig.SOAP_STONE_GEN_SIZE.get())).range(BYGWorldConfig.SOAP_STONE_GEN_Y.get()).squared().count(BYGWorldConfig.SOAP_STONE_GEN_PER_CHUNK.get()));

    }
}
