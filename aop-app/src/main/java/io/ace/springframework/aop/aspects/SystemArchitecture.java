package io.ace.springframework.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SystemArchitecture {

    @Pointcut("within(io.ace.springframework.aop.controller..*)")
    public void inWebLayer() {
    }


    @Pointcut("within(io.ace.springframework.aop.service..*)")
    public void inService() {
    }

    @Pointcut("within(io.ace.springframework.aop.dao..*)")
    public void inDataAccessLayer() {
    }

    @Pointcut("execution(* io.ace.springframework.aop..service.*.*(..))")
    public void businessService() {

    }

    @Pointcut("execution(* io.ace.springframework.aop.dao.*.*(..))")
    public void dataAccessOperation() {
    }

}
