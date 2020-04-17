package io.ace.springframework.core.ioc.applictioncontext.event.annotation;

import io.ace.springframework.core.ioc.applictioncontext.event.EmailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AnnotationEventMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmailService.class, AnnotationBlackListEventListener.class);
        EmailService emailService = context.getBean(EmailService.class);
        emailService.setBlackList(Arrays.asList("kailash", "dipen"));
        emailService.sendEmail("kailash", "Hi,Kailash what's up?");
    }

}
