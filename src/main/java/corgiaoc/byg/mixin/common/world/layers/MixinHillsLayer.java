package corgiaoc.byg.mixin.common.world.layers;

import corgiaoc.byg.common.world.biome.BYGBiome;
import corgiaoc.byg.core.world.BYGBiomes;
import corgiaoc.byg.util.LayerRandomWeightedListUtil;
import net.minecraft.util.WeightedList;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.layer.HillsLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
@Mixin(HillsLayer.class)
public abstract class MixinHillsLayer {

    private static final List<Biome> topOceanList = new ArrayList<>();


    @Inject(method = "applyPixel",
            at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/world/gen/INoiseRandom;nextRandom(I)I"),
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILHARD)
    private void injectBYGSubBiomes(INoiseRandom rand, IArea area1, IArea area2, int x, int z, CallbackInfoReturnable<Integer> cir, int i, int j, int k) {
        if (rand.nextRandom(9) == 0 || k == 0) {
            int l = i;
            Biome biome = WorldGenRegistries.BIOME.byId(i);
            if (topOceanList.contains(biome))
                l = WorldGenRegistries.BIOME.getId(BYGBiomes.TROPICAL_ISLAND);
            cir.setReturnValue(l);
        }
        if (BYGBiome.BIOME_TO_HILLS_LIST.size() > 0) {
            if (rand.nextRandom(3) == 0 || k == 0) {
                int l = i;
                Biome biome = WorldGenRegistries.BIOME.byId(i);
                if (biome != null) {
                    if (BYGBiome.BIOME_TO_HILLS_LIST.containsKey(i)) {
                        Biome hill = getHillBiomeValue(BYGBiome.BIOME_TO_HILLS_LIST.get(i), rand);
                        if (hill != null) {
                            l = WorldGenRegistries.BIOME.getId(hill);
                        }
                    }
                }
                cir.setReturnValue(l);
            }
        }
    }

    @Nullable
    private static Biome getHillBiomeValue(WeightedList<Biome> biomeHolder, INoiseRandom layerRandom) {
        if (biomeHolder.entries.size() > 0) {
            return LayerRandomWeightedListUtil.getBiome(biomeHolder, layerRandom);
        }
        else {
            return null;
        }
    }


    static {
        topOceanList.add(WorldGenRegistries.BIOME.getOrThrow(Biomes.DEEP_OCEAN));
        topOceanList.add(WorldGenRegistries.BIOME.getOrThrow(Biomes.DEEP_LUKEWARM_OCEAN));
        topOceanList.add(WorldGenRegistries.BIOME.getOrThrow(Biomes.DEEP_WARM_OCEAN));
    }
}
