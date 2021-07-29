package com.plusls.sodium_i18n;

import me.jellysquid.mods.sodium.client.gui.options.control.ControlValueFormatter;
import net.minecraft.client.resource.language.I18n;

public interface I18nControlValueFormatter {
    static ControlValueFormatter guiScale() {
        return (v) -> {
            return v == 0 ? I18n.translate("Auto") : v + "x";
        };
    }

    static ControlValueFormatter fpsLimit() {
        return (v) -> {
            return v == 260 ? I18n.translate("Unlimited") : v + " FPS";
        };
    }

    static ControlValueFormatter brightness() {
        return (v) -> {
            if (v == 0) {
                return I18n.translate("Moody");
            } else {
                return v == 100 ? I18n.translate("Bright") : v + "%";
            }
        };
    }

    static ControlValueFormatter quantity(String name) {
        return (v) -> {
            return v + " " + I18n.translate(name);
        };
    }

    static ControlValueFormatter quantityOrDisabled(String name, String disableText) {
        return (v) -> {
            return v == 0 ? I18n.translate(disableText) : v + " " + I18n.translate(name);
        };
    }
}
