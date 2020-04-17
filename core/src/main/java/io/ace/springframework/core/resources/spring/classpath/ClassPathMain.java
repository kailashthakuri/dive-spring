package io.ace.springframework.core.resources.spring.classpath;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassPathMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classConfig.xml"}, Messenger.class);
        Messenger messenger = context.getBean(Messenger.class);
        System.out.println(messenger.getMessage());
    }
}
