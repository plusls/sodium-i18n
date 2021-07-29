package com.plusls.sodium_i18n.mixin;

import me.jellysquid.mods.sodium.client.gui.options.OptionPage;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(value = OptionPage.class, remap = false)
public class MixinOptionPage {
    @ModifyVariable(method = "<init>", at = @At(value = "HEAD"), ordinal = 0)
    private static String i18nName(String name) {
        return I18n.translate(name);
    }
}
