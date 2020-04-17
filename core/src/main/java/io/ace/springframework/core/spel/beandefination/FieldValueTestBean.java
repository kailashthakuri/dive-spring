package io.ace.springframework.core.spel.beandefination;

import org.springframework.beans.factory.annotation.Value;

public class FieldValueTestBean {

    @Value("#{systemProperties['user.country']}")
    private String defaultLocale;

    public String getDefaultLocale() {
        return defaultLocale;
    }

    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
}
