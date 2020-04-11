package io.ace.springframework.core;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorld {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println("Init Method Called");
    }

    public void destroy() {
        System.out.println("Destroy Method Called");
    }
}
