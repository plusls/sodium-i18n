package com.plusls.sodium_i18n.mixin;

import com.plusls.sodium_i18n.I18nControlValueFormatter;
import me.jellysquid.mods.sodium.client.gui.SodiumGameOptionPages;
import me.jellysquid.mods.sodium.client.gui.options.control.ControlValueFormatter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@SuppressWarnings("UnresolvedMixinReference")
@Mixin(value = SodiumGameOptionPages.class, remap = false)
public class MixinSodiumGameOptionPages {
    @Redirect(method = "lambda$general$0", at = @At(value = "INVOKE", target = "Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;quantity(Ljava/lang/String;)Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;", ordinal = 0))
    private static ControlValueFormatter i18nQuantity(String name) {
        return I18nControlValueFormatter.quantity(name);
    }

    @Redirect(method = "lambda$general$3", at = @At(value = "INVOKE", target = "Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;brightness()Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;", ordinal = 0))
    private static ControlValueFormatter i18nBrightness() {
        return I18nControlValueFormatter.brightness();
    }

    @Redirect(method = "lambda$general$8", at = @At(value = "INVOKE", target = "Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;guiScale()Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;", ordinal = 0))
    private static ControlValueFormatter i18nGuiScale() {
        return I18nControlValueFormatter.guiScale();
    }

    @Redirect(method = "lambda$general$13", at = @At(value = "INVOKE", target = "Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;fpsLimit()Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;", ordinal = 0))
    private static ControlValueFormatter i18nFpsLimit() {
        return I18nControlValueFormatter.fpsLimit();
    }

    @Redirect(method = "lambda$quality$34", at = @At(value = "INVOKE", target = "Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;quantityOrDisabled(Ljava/lang/String;Ljava/lang/String;)Lme/jellysquid/mods/sodium/client/gui/options/control/ControlValueFormatter;", ordinal = 0))
    private static ControlValueFormatter i18nQuantityOrDisabled(String name, String disableText) {
        return I18nControlValueFormatter.quantityOrDisabled(name, disableText);
    }


}
