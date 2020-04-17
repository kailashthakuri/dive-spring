package io.ace.springframework.core.ioc.applictioncontext.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Example {

    @Autowired
    private MessageSource messageSource;


    public void executeEngMessage() {
        String message = this.messageSource.getMessage("field.required", new Object[]{"First Name"}, "This Field", Locale.getDefault());
        System.out.println(message);
    }

    public void executeBritishMessage() {
        String message = this.messageSource.getMessage("field.required", new Object[]{"First Name"}, "This Field", Locale.UK);
        System.out.println(message);
    }

}
