package io.ace.springframework.aop.schemabased;

/**
 * want to make this java object as aspect by defining it as aspect in xml configuration.
 */

public class CustomLogging {

    public void beforeAdvice() {
        System.out.println("CustommLogging#beforeAdvice method called");
    }

    public void afterAdvice() {
        System.out.println("CustommLogging#AfterAdvice method called");
    }

}
