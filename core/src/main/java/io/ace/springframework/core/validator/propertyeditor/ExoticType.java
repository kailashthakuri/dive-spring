package io.ace.springframework.core.validator.propertyeditor;

public class ExoticType {

    private String name;
    private String category;

    public ExoticType(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExoticType{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
