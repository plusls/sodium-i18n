package com.plusls.sodium_i18n.mixin;

import me.jellysquid.mods.sodium.client.gui.options.OptionImpact;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = OptionImpact.class, remap = false)
public class MixinOptionImpact {
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), ordinal = 0)
    private static String i18nText(String text) {
        return I18n.translate(text);
    }
}
