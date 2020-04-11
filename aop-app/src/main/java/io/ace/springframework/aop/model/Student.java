package io.ace.springframework.aop.model;

public class Student {
    private String name;
    private int age;

    public String getName() {
        System.out.println("name : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        System.out.println("age : " + age);
        return age;
    }

    public void throwPointException() throws IllegalArgumentException {
        System.out.println("Exception raised in student");
        throw new IllegalArgumentException();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
