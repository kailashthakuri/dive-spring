package io.ace.springframework.core.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCollectionApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("beansCollection.xml");
        JavaCollection javaCollection = appContext.getBean(JavaCollection.class);
        System.out.println("Java List ----------------------------");
        javaCollection.getAddressList().forEach(System.out::println);
        System.out.println("Java Set ----------------------------");
        javaCollection.getAddressSet().forEach(System.out::println);
        System.out.println("Java Map ----------------------------");
        javaCollection.getAddressMap().forEach((key, value) -> System.out.println("Key : " + key + " ,Value :  " + value));
        System.out.println("Java Props ----------------------------");
        javaCollection.getAddressProps().forEach((key, value) -> System.out.println("Key : " + key + " ,Value :  " + value));
    }
}
