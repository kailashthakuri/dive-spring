package io.ace.springframework.core.ioc.extensionpoint;

import io.ace.springframework.core.ioc.Messenger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessorMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("extensionContext.xml");
        Messenger messenger = applicationContext.getBean(Messenger.class);
        System.out.println(messenger.getMessage());
    }
}
