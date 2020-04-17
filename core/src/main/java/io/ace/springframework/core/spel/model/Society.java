package io.ace.springframework.core.spel.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Society {
    private String name;

    public static final String Advisor = "advisors";
    public static final String President = "president";

    private List<Inventor> inventors = new ArrayList<>();

    private Map officers = new HashMap();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Inventor> getInventors() {
        return inventors;
    }

    public void setInventors(List<Inventor> inventors) {
        this.inventors = inventors;
    }

    public Map getOfficers() {
        return officers;
    }

    public void setOfficers(Map officers) {
        this.officers = officers;
    }

    public boolean isMember(String name) {
        return this.inventors.stream()
                .anyMatch(inventor -> inventor.getName().equalsIgnoreCase(name));
    }
}
