package com.plusls.sodium_i18n;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.Version;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class SodiumI18nMixinPlugin implements IMixinConfigPlugin {
    @Override
    public void onLoad(String mixinPackage) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        Optional<ModContainer> modContainerOptional = FabricLoader.getInstance().getModContainer("sodium");
        if (modContainerOptional.isPresent()) {
            ModContainer modContainer = modContainerOptional.get();
            Version version = modContainer.getMetadata().getVersion();

            if (mixinClassName.endsWith("SodiumGameOptionPages")) {
                if (!version.getFriendlyString().contains("IRIS4")) {
                    return false;
                }
            } else if (mixinClassName.endsWith("SodiumGameOptionPagesOld")) {
                if (version.getFriendlyString().contains("IRIS4")) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }

    @Override
    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {

    }
}
