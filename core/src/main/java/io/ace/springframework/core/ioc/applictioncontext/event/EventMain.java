package io.ace.springframework.core.ioc.applictioncontext.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class EventMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmailService.class, BlackListedEventListener.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.setBlackList(Arrays.asList("kailash", "dipen"));
        emailService.sendEmail("kailash", "Hi,Kailash what's up?");
    }

}
