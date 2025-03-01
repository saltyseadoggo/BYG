package corgiaoc.byg.common.properties.vanilla;

import corgiaoc.byg.BYG;
import corgiaoc.byg.core.BYGItems;
import net.minecraft.block.ComposterBlock;
import net.minecraft.util.IItemProvider;

public class BYGCompostables {
    public static void compostibleBlocks(float chance, IItemProvider item) {
        ComposterBlock.COMPOSTABLES.put(item.asItem(), chance);
    }

    public static void compostablesBYG() {
        BYG.LOGGER.debug("BYG: Adding Compostible Blocks...");

        //Leaves
        compostibleBlocks(0.3f, BYGItems.ASPEN_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BAOBAB_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BLOOMING_WITCH_HAZEL_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BLUE_ENCHANTED_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BLUE_SPRUCE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BROWN_BIRCH_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BROWN_OAK_LEAVES);
        compostibleBlocks(0.3f, BYGItems.CIKA_LEAVES);
        compostibleBlocks(0.3f, BYGItems.CYPRESS_LEAVES);
        compostibleBlocks(0.3f, BYGItems.EBONY_LEAVES);
        compostibleBlocks(0.3f, BYGItems.FIR_LEAVES);
        compostibleBlocks(0.3f, BYGItems.FLOWERING_ORCHARD_LEAVES);
        compostibleBlocks(0.3f, BYGItems.FLOWERING_PALO_VERDE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.GREEN_ENCHANTED_LEAVES);
        compostibleBlocks(0.3f, BYGItems.HOLLY_BERRY_LEAVES);
        compostibleBlocks(0.3f, BYGItems.HOLLY_LEAVES);
        compostibleBlocks(0.3f, BYGItems.JACARANDA_LEAVES);
        compostibleBlocks(0.3f, BYGItems.MAHOGANY_LEAVES);
        compostibleBlocks(0.3f, BYGItems.MANGROVE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.ORANGE_BIRCH_LEAVES);
        compostibleBlocks(0.3f, BYGItems.ORANGE_OAK_LEAVES);
        compostibleBlocks(0.3f, BYGItems.ORANGE_SPRUCE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.ORCHARD_LEAVES);
        compostibleBlocks(0.3f, BYGItems.PALO_VERDE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.PINE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.PINK_CHERRY_LEAVES);
        compostibleBlocks(0.3f, BYGItems.RAINBOW_EUCALYPTUS_LEAVES);
        compostibleBlocks(0.3f, BYGItems.REDWOOD_LEAVES);
        compostibleBlocks(0.3f, BYGItems.RED_MAPLE_LEAVES);
        compostibleBlocks(0.6f, BYGItems.RIPE_ORCHARD_LEAVES);
        compostibleBlocks(0.3f, BYGItems.SILVER_MAPLE_LEAVES);
        compostibleBlocks(0.6f, BYGItems.SKYRIS_LEAVES_GREEN_APPLE);
        compostibleBlocks(0.3f, BYGItems.SKYRIS_LEAVES);
        compostibleBlocks(0.3f, BYGItems.WHITE_CHERRY_LEAVES);
        compostibleBlocks(0.3f, BYGItems.WILLOW_LEAVES);
        compostibleBlocks(0.3f, BYGItems.WITCH_HAZEL_LEAVES);
        compostibleBlocks(0.3f, BYGItems.YELLOW_BIRCH_LEAVES);
        compostibleBlocks(0.3f, BYGItems.YELLOW_SPRUCE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.RED_SPRUCE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.PALM_LEAVES);
        compostibleBlocks(0.3f, BYGItems.BROWN_ZELKOVA_LEAVES);
        compostibleBlocks(0.3f, BYGItems.ETHER_LEAVES);
        compostibleBlocks(0.3f, BYGItems.NIGHTSHADE_LEAVES);
        compostibleBlocks(0.3f, BYGItems.LAMENT_LEAVES);
        compostibleBlocks(0.3f, BYGItems.WITHERING_OAK_LEAVES);

        //Saplings
        compostibleBlocks(0.3f, BYGItems.ASPEN_SAPLING);
        compostibleBlocks(0.3f, BYGItems.BAOBAB_SAPLING);
        compostibleBlocks(0.3f, BYGItems.BLUE_ENCHANTED_SAPLING);
        compostibleBlocks(0.3f, BYGItems.BLUE_SPRUCE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.BROWN_BIRCH_SAPLING);
        compostibleBlocks(0.3f, BYGItems.BROWN_OAK_SAPLING);
        compostibleBlocks(0.3f, BYGItems.CIKA_SAPLING);
        compostibleBlocks(0.3f, BYGItems.CYPRESS_SAPLING);
        compostibleBlocks(0.3f, BYGItems.EBONY_SAPLING);
        compostibleBlocks(0.3f, BYGItems.FIR_SAPLING);
        compostibleBlocks(0.3f, BYGItems.GREEN_ENCHANTED_SAPLING);
        compostibleBlocks(0.3f, BYGItems.HOLLY_SAPLING);
        compostibleBlocks(0.3f, BYGItems.JACARANDA_SAPLING);
        compostibleBlocks(0.3f, BYGItems.MAHOGANY_SAPLING);
        compostibleBlocks(0.3f, BYGItems.MANGROVE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.ORANGE_BIRCH_SAPLING);
        compostibleBlocks(0.3f, BYGItems.ORANGE_OAK_SAPLING);
        compostibleBlocks(0.3f, BYGItems.ORANGE_SPRUCE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.ORCHARD_SAPLING);
        compostibleBlocks(0.3f, BYGItems.PALO_VERDE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.PINE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.PINK_CHERRY_SAPLING);
        compostibleBlocks(0.3f, BYGItems.RAINBOW_EUCALYPTUS_SAPLING);
        compostibleBlocks(0.3f, BYGItems.REDWOOD_SAPLING);
        compostibleBlocks(0.3f, BYGItems.RED_MAPLE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.SILVER_MAPLE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.SKYRIS_SAPLING);
        compostibleBlocks(0.3f, BYGItems.WHITE_CHERRY_SAPLING);
        compostibleBlocks(0.3f, BYGItems.WILLOW_SAPLING);
        compostibleBlocks(0.3f, BYGItems.WITCH_HAZEL_SAPLING);
        compostibleBlocks(0.3f, BYGItems.YELLOW_BIRCH_SAPLING);
        compostibleBlocks(0.3f, BYGItems.YELLOW_SPRUCE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.RED_SPRUCE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.PALM_SAPLING);
        compostibleBlocks(0.3f, BYGItems.BROWN_ZELKOVA_SAPLING);
        compostibleBlocks(0.3f, BYGItems.ETHER_SAPLING);
        compostibleBlocks(0.3f, BYGItems.NIGHTSHADE_SAPLING);
        compostibleBlocks(0.3f, BYGItems.LAMENT_SAPLING);
        compostibleBlocks(0.3f, BYGItems.WITHERING_OAK_SAPLING);

        //Flowers
        compostibleBlocks(0.65f, BYGItems.ALLIUM_FLOWER_BUSH);
        compostibleBlocks(0.65f, BYGItems.ALPINE_BELLFLOWER);
        compostibleBlocks(0.65f, BYGItems.AMARANTH);
        compostibleBlocks(0.65f, BYGItems.ANGELICA);
        compostibleBlocks(0.65f, BYGItems.AZALEA);
        compostibleBlocks(0.65f, BYGItems.BEGONIA);
        compostibleBlocks(0.65f, BYGItems.BISTORT);
        compostibleBlocks(0.65f, BYGItems.BLACK_ROSE);
        compostibleBlocks(0.65f, BYGItems.BLUE_SAGE);
        compostibleBlocks(0.65f, BYGItems.CALIFORNIA_POPPY);
        compostibleBlocks(0.65f, BYGItems.CROCUS);
        compostibleBlocks(0.65f, BYGItems.CYAN_AMARANTH);
        compostibleBlocks(0.65f, BYGItems.CYAN_ROSE);
        compostibleBlocks(0.65f, BYGItems.CYAN_TULIP);
        compostibleBlocks(0.65f, BYGItems.DAFFODIL);
        compostibleBlocks(0.65f, BYGItems.DELPHINIUM);
        compostibleBlocks(0.65f, BYGItems.FAIRY_SLIPPER);
        compostibleBlocks(0.65f, BYGItems.FIRECRACKER_FLOWER_BUSH);
        compostibleBlocks(0.65f, BYGItems.FOXGLOVE);
        compostibleBlocks(0.65f, BYGItems.GOLDEN_SPINED_CACTUS);
        compostibleBlocks(0.65f, BYGItems.GREEN_TULIP);
        compostibleBlocks(0.65f, BYGItems.GUZMANIA);
        compostibleBlocks(0.65f, BYGItems.INCAN_LILY);
        compostibleBlocks(0.65f, BYGItems.IRIS);
        compostibleBlocks(0.65f, BYGItems.JAPANESE_ORCHID);
        compostibleBlocks(0.65f, BYGItems.KOVAN_FLOWER);
        compostibleBlocks(0.65f, BYGItems.LAZARUS_BELLFLOWER);
        compostibleBlocks(0.65f, BYGItems.LOLIPOP_FLOWER);
        compostibleBlocks(0.65f, BYGItems.MAGENTA_AMARANTH);
        compostibleBlocks(0.65f, BYGItems.MAGENTA_TULIP);
        compostibleBlocks(0.65f, BYGItems.ORANGE_DAISY);
        compostibleBlocks(0.65f, BYGItems.ORSIRIA_ROSE);
        compostibleBlocks(0.65f, BYGItems.PEACH_LEATHER_FLOWER);
        compostibleBlocks(0.65f, BYGItems.PINK_ALLIUM);
        compostibleBlocks(0.65f, BYGItems.PINK_ALLIUM_FLOWER_BUSH);
        compostibleBlocks(0.65f, BYGItems.PINK_ANEMONE);
        compostibleBlocks(0.65f, BYGItems.PINK_DAFFODIL);
        compostibleBlocks(0.65f, BYGItems.PINK_ORCHID);
        compostibleBlocks(0.65f, BYGItems.PRAIRIE_GRASS);
        compostibleBlocks(0.65f, BYGItems.PROTEA_FLOWER);
        compostibleBlocks(0.65f, BYGItems.PURPLE_AMARANTH);
        compostibleBlocks(0.65f, BYGItems.PURPLE_ORCHID);
        compostibleBlocks(0.65f, BYGItems.PURPLE_SAGE);
        compostibleBlocks(0.65f, BYGItems.PURPLE_TULIP);
        compostibleBlocks(0.65f, BYGItems.RED_CORNFLOWER);
        compostibleBlocks(0.65f, BYGItems.RED_ORCHID);
        compostibleBlocks(0.65f, BYGItems.RICHEA);
        compostibleBlocks(0.65f, BYGItems.ROSE);
        compostibleBlocks(0.65f, BYGItems.SILVER_VASE_FLOWER);
        compostibleBlocks(0.65f, BYGItems.SNOWDROPS);
        compostibleBlocks(0.65f, BYGItems.TORCH_GINGER);
        compostibleBlocks(0.65f, BYGItems.VIOLET_LEATHER_FLOWER);
        compostibleBlocks(0.65f, BYGItems.WHITE_ANEMONE);
        compostibleBlocks(0.65f, BYGItems.WHITE_SAGE);
        compostibleBlocks(0.65f, BYGItems.WINTER_CYCLAMEN);
        compostibleBlocks(0.65f, BYGItems.WINTER_ROSE);
        compostibleBlocks(0.65f, BYGItems.WINTER_SCILLA);
        compostibleBlocks(0.65f, BYGItems.YELLOW_DAFFODIL);
        compostibleBlocks(0.65f, BYGItems.YELLOW_TULIP);
        compostibleBlocks(0.65f, BYGItems.THEREAL_BELLFLOWER);
        compostibleBlocks(0.65f, BYGItems.VERMILION_SCULK_GROWTH);
        compostibleBlocks(0.65f, BYGItems.SHULKREN_MOSS_BLANKET);
        compostibleBlocks(0.65f, BYGItems.SHULKREN_VINE);
        compostibleBlocks(0.65f, BYGItems.LAMENT_VINE);
        compostibleBlocks(0.65f, BYGItems.SKYRIS_VINE);
        compostibleBlocks(0.65f, BYGItems.WHALING_VINES);
        compostibleBlocks(0.65f, BYGItems.EMBUR_GEL_VINES);

        //Mushroom Blocks
        compostibleBlocks(0.85f, BYGItems.GREEN_MUSHROOM_BLOCK);
        compostibleBlocks(0.85f, BYGItems.MILKCAP_MUSHROOM_BLOCK);
        compostibleBlocks(0.85f, BYGItems.BLEWIT_MUSHROOM_BLOCK);
        compostibleBlocks(0.85f, BYGItems.PUFF_MUSHROOM_BLOCK);
        compostibleBlocks(0.85f, BYGItems.WHITE_MUSHROOM_STEM);
        compostibleBlocks(0.85f, BYGItems.BROWN_MUSHROOM_STEM);
        compostibleBlocks(0.85f, BYGItems.SOUL_SHROOM_STEM);
        compostibleBlocks(0.85f, BYGItems.SOUL_SHROOM_BLOCK);
        compostibleBlocks(0.85f, BYGItems.DEATH_CAP_MUSHROOM_BLOCK);
        compostibleBlocks(0.85f, BYGItems.SHULKREN_WART_BLOCK);
        compostibleBlocks(0.85f, BYGItems.SYTHIAN_WART_BLOCK);
        compostibleBlocks(0.85f, BYGItems.PURPLE_SHROOMLIGHT);
        compostibleBlocks(0.85f, BYGItems.PURPLE_BULBIS_SHELL);
        compostibleBlocks(0.85f, BYGItems.BULBIS_SHELL);

        //Foods
        compostibleBlocks(0.65f, BYGItems.CRIMSON_BERRIES);
        compostibleBlocks(0.65f, BYGItems.GREEN_APPLE);
        compostibleBlocks(0.65f, BYGItems.GREEN_MUSHSHROOM);
        compostibleBlocks(0.65f, BYGItems.BLACK_PUFF);
        compostibleBlocks(0.65f, BYGItems.WEEPING_MILKCAP);
        compostibleBlocks(0.65f, BYGItems.WOOD_BLEWIT);
        compostibleBlocks(0.65f, BYGItems.NIGHTSHADE_BERRIES);
        compostibleBlocks(0.65f, BYGItems.BLUE_BERRY);
        compostibleBlocks(0.65f, BYGItems.SHULKREN_FUNGUS);
        compostibleBlocks(0.65f, BYGItems.SYTHIAN_FUNGUS);
        compostibleBlocks(0.65f, BYGItems.EMBUR_WART);
        compostibleBlocks(0.65f, BYGItems.DEATH_CAP);
        compostibleBlocks(0.65f, BYGItems.SOUL_SHROOM);
        compostibleBlocks(0.65f, BYGItems.BAOBAB_FRUIT);
        compostibleBlocks(0.65f, BYGItems.BULBIS_ODDITY);
        compostibleBlocks(0.65f, BYGItems.PURPLE_BULBIS_ODDITY);

        //Plants
        compostibleBlocks(0.65f, BYGItems.FLOWER_PATCH);
        compostibleBlocks(0.65f, BYGItems.CLOVER_PATCH);
        compostibleBlocks(0.65f, BYGItems.LEAF_PILE);
        compostibleBlocks(0.65f, BYGItems.SYTHIAN_STALK_BLOCK);
        compostibleBlocks(0.65f, BYGItems.CATTAIL);
        compostibleBlocks(0.65f, BYGItems.REEDS);
        compostibleBlocks(0.65f, BYGItems.HORSEWEED);
        compostibleBlocks(0.65f, BYGItems.MINI_CACTUS);
        compostibleBlocks(0.65f, BYGItems.PRICKLY_PEAR_CACTUS);
        compostibleBlocks(0.65f, BYGItems.WINTER_SUCCULENT);
        compostibleBlocks(0.35f, BYGItems.SHORT_GRASS);
        compostibleBlocks(0.75f, BYGItems.POISON_IVY);
        compostibleBlocks(0.65f, BYGItems.TINY_LILYPADS);
        compostibleBlocks(0.65f, BYGItems.ENDER_LILY);
        compostibleBlocks(0.65f, BYGItems.EMBUR_LILY);

        BYG.LOGGER.info("BYG: Compostible Blocks Added!");
    }
}
