package com.plusls.sodium_i18n.mixin;

import me.jellysquid.mods.sodium.client.gui.widgets.FlatButtonWidget;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = FlatButtonWidget.class, remap = false)
public class MixinFlatButtonWidget {
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), ordinal = 0)
    private static String i18nLabel(String label) {
        return I18n.translate(label);
    }
}
