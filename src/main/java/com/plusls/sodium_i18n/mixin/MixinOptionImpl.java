package com.plusls.sodium_i18n.mixin;

import me.jellysquid.mods.sodium.client.gui.options.OptionImpl;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = OptionImpl.class, remap = false)
public class MixinOptionImpl {
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), ordinal = 0)
    private static String i18nName(String name) {
        return I18n.translate(name);
    }

    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), ordinal = 1)
    private static String i18nTooltip(String tooltip) {
        return I18n.translate(tooltip);
    }
}
