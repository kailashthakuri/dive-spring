package io.ace.springframework.core.spel.beandefination;

import org.springframework.beans.factory.annotation.Value;

public class PropertyValueTestBean {


    private String defaulLocale;

    public String getDefaulLocale() {
        return defaulLocale;
    }


    @Value("#{systemProperties['user.country']}")
    public void setDefaulLocale(String defaulLocale) {
        this.defaulLocale = defaulLocale;
    }
}
