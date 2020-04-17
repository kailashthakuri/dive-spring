package io.ace.springframework.core.ioc.classpathscanning;

public class TestBean {
    private String namme;
    private Integer value;

    public TestBean() {
    }

    public TestBean(String namme) {
        this.namme = namme;
    }

    public TestBean(String namme, Integer value) {
        this.namme = namme;
        this.value = value;
    }

    public String getNamme() {
        return namme;
    }

    public void setNamme(String namme) {
        this.namme = namme;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
