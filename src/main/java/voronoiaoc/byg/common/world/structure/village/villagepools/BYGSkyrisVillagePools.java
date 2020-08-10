//package voronoiaoc.byg.common.world.structure.village.villagepools;
//
//import com.google.common.collect.ImmutableList;
//import com.mojang.datafixers.util.Pair;
//import net.minecraft.block.Blocks;
//import net.minecraft.structure.pool.*;
//import net.minecraft.structure.processor.RuleStructureProcessor;
//import net.minecraft.structure.processor.StructureProcessor;
//import net.minecraft.structure.processor.StructureProcessorRule;
//import net.minecraft.structure.rule.AlwaysTrueRuleTest;
//import net.minecraft.structure.rule.BlockMatchRuleTest;
//import net.minecraft.structure.rule.RandomBlockMatchRuleTest;
//import net.minecraft.structure.rule.TagMatchRuleTest;
//import net.minecraft.tag.BlockTags;
//import net.minecraft.util.Identifier;
//import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
//import net.minecraft.world.gen.feature.Feature;
//
//@SuppressWarnings("deprecation")
//public class BYGSkyrisVillagePools {
//    public static void init() {
//        ImmutableList<StructureProcessor> immutablelist = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new StructureProcessorRule(new BlockMatchRuleTest(Blocks.TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new StructureProcessorRule(new BlockMatchRuleTest(Blocks.WALL_TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.SAND, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.SAND, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.SAND, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.SAND, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.SAND, 0.08F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MELON_STEM.getDefaultState()))));
//        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/town_centers"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/town_centers/skyris_meeting_point_1"), 98), new Pair<>(new SinglePoolElement("byg:village/skyris/town_centers/skyris_meeting_point_1"), 98), new Pair<>(new SinglePoolElement("byg:village/skyris/town_centers/skyris_meeting_point_2"), 98), new Pair<>(new SinglePoolElement("byg:village/skyris/town_centers/skyris_meeting_point_2", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/town_centers/skyris_meeting_point_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/town_centers/skyris_meeting_point_1", immutablelist), 1)), StructurePool.Projection.RIGID));
//        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/streets"), new Identifier("byg:village/skyris/terminators"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_corner_1"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_corner_2"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_straight_1"), 4), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_straight_2"), 4), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_straight_3"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_crossroad_1"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_crossroad_2"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_crossroad_3"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_square_1"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_square_2"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/streets/s_turn_1"), 3)), StructurePool.Projection.TERRAIN_MATCHING));
////        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/zombie/streets"), new Identifier("byg:village/skyris/zombie/terminators"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/corner_01"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/corner_02"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/straight_01"), 4), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/straight_02"), 4), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/straight_03"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/crossroad_01"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/crossroad_02"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/crossroad_03"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/square_01"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/square_02"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/streets/turn_01"), 3)), StructurePool.Projection.TERRAIN_MATCHING));
//        ImmutableList<StructureProcessor> immutablelist1 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MELON_STEM.getDefaultState()))));
//        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/houses"), new Identifier("byg:village/skyris/terminators"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_1"), 8), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_2"), 8), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_3"), 8), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_4"), 6), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_5"), 6), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_6"), 6), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_1"), 8), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_small_house_2"), 8), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_medium_house_1"), 6), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_medium_house_2"), 8), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_butcher_shop_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_tool_smith_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_fletcher_house_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_shepherd_house_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_armorer_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_fisher_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_tannery_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_cartographer_house_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_library_1"), 1), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_mason_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_weaponsmith_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_temple_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_temple_2"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_large_farm_1", immutablelist1), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_farm_1", immutablelist1), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_farm_2", immutablelist1), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_animal_pen_1"), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_animal_pen_2"), 2), Pair.of(EmptyPoolElement.INSTANCE, 5)), StructurePool.Projection.RIGID));
////        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/zombie/houses"), new Identifier("byg:village/skyris/zombie/terminators"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_2", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_3", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_4", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_5", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_6", immutablelist), 1), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_7", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_small_house_8", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_medium_house_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/houses/skyris_medium_house_2", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_butcher_shop_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_tool_smith_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_fletcher_house_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_shepherd_house_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_armorer_1", immutablelist), 1), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_fisher_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_tannery_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_cartographer_house_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_library_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_mason_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_weaponsmith_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_temple_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_temple_2", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_large_farm_1", immutablelist), 7), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_farm_1", immutablelist), 4), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_farm_2", immutablelist), 4), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_animal_pen_1", immutablelist), 2), new Pair<>(new SinglePoolElement("byg:village/skyris/houses/skyris_animal_pen_2", immutablelist), 2), Pair.of(EmptyPoolElement.INSTANCE, 5)), StructurePool.Projection.RIGID));
//        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/terminators"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/terminators/s_terminator_01"), 1), new Pair<>(new SinglePoolElement("byg:village/skyris/terminators/s_terminator_02"), 1)), StructurePool.Projection.TERRAIN_MATCHING));
////        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/zombie/terminators"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/terminators/terminator_01"), 1), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/terminators/terminator_02"), 1)), StructurePool.Projection.TERRAIN_MATCHING));
//        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/decor"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/skyris_lamp_1"), 10), new Pair<>(new FeaturePoolElement(Feature.BLOCK_PILE.configure(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 2), Pair.of(EmptyPoolElement.INSTANCE, 10)), StructurePool.Projection.RIGID));
////        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/zombie/decor"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/skyris_lamp_1", immutablelist), 10), new Pair<>(new FeaturePoolElement(Feature.RANDOM_PATCH.configure(DefaultBiomeFeatures.CACTUS_CONFIG)), 4), new Pair<>(new FeaturePoolElement(Feature.BLOCK_PILE.configure(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 4), Pair.of(EmptyPoolElement.INSTANCE, 10)), StructurePool.Projection.RIGID));
//        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/villagers"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/villagers/unemployed"), 5), new Pair<>(new SinglePoolElement("byg:village/skyris/villagers/baby"), 3), new Pair<>(new SinglePoolElement("byg:village/skyris/villagers/unemployed"), 10)), StructurePool.Projection.RIGID));
////        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("byg:village/skyris/zombie/villagers"), new Identifier("empty"), ImmutableList.of(new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/villagers/nitwit"), 1), new Pair<>(new SinglePoolElement("byg:village/skyris/zombie/villagers/unemployed"), 10)), StructurePool.Projection.RIGID));
//    }
//}
