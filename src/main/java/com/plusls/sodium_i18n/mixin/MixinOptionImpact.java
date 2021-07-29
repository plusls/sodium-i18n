package com.plusls.sodium_i18n.mixin;

import me.jellysquid.mods.sodium.client.gui.options.OptionImpact;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = OptionImpact.class, remap = false)
public class MixinOptionImpact {
    @Final
    @Shadow
    private String text;
    @Redirect(method = "toDisplayString", at = @At(value = "FIELD", target = "Lme/jellysquid/mods/sodium/client/gui/options/OptionImpact;text:Ljava/lang/String;", ordinal = 0))
    private String i18nText(OptionImpact optionImpact) {
        return I18n.translate(text);
    }
}
