package corgiaoc.byg.common.world.biome.overworld.sub.hills;

import corgiaoc.byg.common.world.biome.BYGSubBiome;
import corgiaoc.byg.common.world.biome.BYGDefaultBiomeFeatures;
import corgiaoc.byg.common.world.biome.BiomeUtil;
import corgiaoc.byg.core.world.util.WorldGenRegistrationHelper;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;

public class AlpineFoothills extends BYGSubBiome {
    static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = WorldGenRegistrationHelper.createConfiguredSurfaceBuilder("alpine_foothills", new ConfiguredSurfaceBuilder<>(SurfaceBuilder.GIANT_TREE_TAIGA, new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState())));
    static final Biome.RainType PRECIPATATION = Biome.RainType.SNOW;
    static final Biome.Category CATEGORY = Biome.Category.EXTREME_HILLS;
    static final float DEPTH = 3.5F;
    static final float SCALE = 0.15F;
    static final float TEMPERATURE = -0.25F;
    static final float DOWNFALL = 0.6F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;

    static final Biome.Climate WEATHER = new Biome.Climate(PRECIPATATION, TEMPERATURE, Biome.TemperatureModifier.NONE, DOWNFALL);
    static final MobSpawnInfo.Builder SPAWN_SETTINGS = new MobSpawnInfo.Builder().setPlayerCanSpawn();
    static final BiomeGenerationSettings.Builder GENERATION_SETTINGS = (new BiomeGenerationSettings.Builder()).surfaceBuilder(SURFACE_BUILDER);

    public AlpineFoothills() {
        super(WEATHER, CATEGORY, DEPTH, SCALE, (new BiomeAmbience.Builder()).waterColor(WATER_COLOR).waterFogColor(WATER_FOG_COLOR).fogColor(12638463).skyColor(BiomeUtil.calcSkyColor(0.8F)).ambientMoodSound(MoodSoundAmbience.LEGACY_CAVE_SETTINGS).build(), GENERATION_SETTINGS.build(), SPAWN_SETTINGS.build());
    }

    @Override
    public Biome getRiver() {
        return this.getBiome();
    }

    @Override
    public BiomeDictionary.Type[] getBiomeDictionary() {
        return new BiomeDictionary.Type[]{BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY};
    }

    static {
        DefaultBiomeFeatures.addDefaultOverworldLandStructures(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addSurfaceFreezing(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addBluffTrees(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addAlpineBellflower(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultCarvers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultMonsterRoom(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addFerns(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultUndergroundVariety(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultOres(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultSoftDisks(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultFlowers(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addTaigaGrass(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultMushrooms(GENERATION_SETTINGS);
        DefaultBiomeFeatures.addDefaultExtraVegetation(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addGrass(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addWinterSucculent(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addWinterSucculent(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addWinterScilla(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addWinterRose(GENERATION_SETTINGS);
        BYGDefaultBiomeFeatures.addBYGMushrooms(GENERATION_SETTINGS);
        SPAWN_SETTINGS.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.RABBIT, 10, 2, 3));
        SPAWN_SETTINGS.addSpawn(EntityClassification.CREATURE, new MobSpawnInfo.Spawners(EntityType.POLAR_BEAR, 1, 1, 2));
        SPAWN_SETTINGS.addSpawn(EntityClassification.AMBIENT, new MobSpawnInfo.Spawners(EntityType.BAT, 10, 8, 8));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SPIDER, 100, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE, 95, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.CREEPER, 100, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SLIME, 100, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.ENDERMAN, 10, 1, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.WITCH, 5, 1, 1));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.SKELETON, 20, 4, 4));
        SPAWN_SETTINGS.addSpawn(EntityClassification.MONSTER, new MobSpawnInfo.Spawners(EntityType.STRAY, 80, 4, 4));

    }
}

