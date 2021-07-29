package com.plusls.sodium_i18n.mixin;

import me.jellysquid.mods.sodium.client.gui.SodiumOptionsGUI;
import net.minecraft.client.resource.language.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = SodiumOptionsGUI.class, remap = false)
public class MixinSodiumOptionsGUI {

    @ModifyConstant(method = "renderOptionTooltip", constant = @Constant(stringValue = "Performance Impact: "))
    private static String i18nPerformanceImpact(String value) {
        return I18n.translate(value);
    }
}
