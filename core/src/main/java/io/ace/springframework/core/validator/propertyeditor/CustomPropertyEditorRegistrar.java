package io.ace.springframework.core.validator.propertyeditor;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

/**
 * Second Way
 * Another  way to register your custom property editor.
 * you can register as many custom property editor as you want.
 * but you have to inject this class  to the  CustomEditorConfigurer.
 */
public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar {

    @Override
    public void registerCustomEditors(PropertyEditorRegistry propertyEditorRegistry) {
        propertyEditorRegistry.registerCustomEditor(ExoticType.class, new ExoticTypeEditor());
        // you can register as many custom property editors  as required here.
    }
}
