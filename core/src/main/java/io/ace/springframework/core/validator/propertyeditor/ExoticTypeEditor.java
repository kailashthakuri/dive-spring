package io.ace.springframework.core.validator.propertyeditor;

import java.beans.PropertyEditorSupport;

/**
 * since  you have putted ExoticTypeEditor in the same directory with ExoticType with Editor suffix,
 * so it automatically gets register.
 * don't need register  ExoticTypeEditor explicitly.
 */


public class ExoticTypeEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new ExoticType(text.toUpperCase(), "Something"));
    }
}
