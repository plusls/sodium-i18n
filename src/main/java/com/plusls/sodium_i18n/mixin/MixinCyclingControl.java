package com.plusls.sodium_i18n.mixin;

import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@SuppressWarnings("UnresolvedMixinReference")
@Mixin(targets = "me.jellysquid.mods.sodium.client.gui.options.control.CyclingControl$CyclingControlElement", remap = false)
public class MixinCyclingControl {
    @ModifyVariable(method = "method_25394", at = @At(value = "INVOKE", target = "Lme/jellysquid/mods/sodium/client/gui/options/control/CyclingControl$CyclingControlElement;getStringWidth(Ljava/lang/String;)I", shift = At.Shift.BEFORE, ordinal = 0), ordinal = 0)
    private String doI18n(String name) {
        return I18n.translate(name);
        //return null;
    }
}
