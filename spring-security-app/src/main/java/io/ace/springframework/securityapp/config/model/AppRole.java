package io.ace.springframework.securityapp.config.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum AppRole {
    USER("USER"), ADMIN("ADMIN"), ANONYMOUS("ANONYMOUS");

    private String name;

    AppRole(String name) {
        this.name = name;
    }

    public static String[] getAllRoles() {
        List<String> collect = Arrays.stream(AppRole.values())
                .map(appRole -> appRole.name)
                .collect(Collectors.toList());
        return collect.toArray(new String[collect.size()]);
    }

}
