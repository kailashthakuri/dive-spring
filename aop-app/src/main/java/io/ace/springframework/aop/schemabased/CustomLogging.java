package io.ace.springframework.aop.schemabased;

public class CustomLogging {

    public void beforeAdvice() {
        System.out.println("CustommLogging#beforeAdvice method called");
    }

    public void afterAdvice() {
        System.out.println("CustommLogging#AfterAdvice method called");
    }

}
