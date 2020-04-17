package io.ace.springframework.core.spel.beandefination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class ParameterValueTestBean {
    private String defaulLocale;

    public String getDefaulLocale() {
        return defaulLocale;
    }

    @Autowired
    public void setDefaulLocale(@Value("#{systemProperties['user.country']}") String defaulLocale) {
        this.defaulLocale = defaulLocale;
    }
}
