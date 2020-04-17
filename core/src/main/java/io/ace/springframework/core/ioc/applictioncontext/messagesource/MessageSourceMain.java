package io.ace.springframework.core.ioc.applictioncontext.messagesource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class MessageSourceMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageSourceConfig.class, Example.class);
        MessageSource messageSource = context.getBean(MessageSource.class);

        String message = messageSource.getMessage("message", null, "Default", Locale.getDefault());
        System.out.println(message);


        Example example = context.getBean(Example.class);
        example.executeEngMessage();
        example.executeBritishMessage();
    }
}
