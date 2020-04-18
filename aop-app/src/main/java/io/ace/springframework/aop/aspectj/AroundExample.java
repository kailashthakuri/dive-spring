package io.ace.springframework.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundExample {


    @Around("io.ace.springframework.aop.aspects.SystemArchitecture.businessService()")
    public Object doBasicProfiling(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object retValue = proceedingJoinPoint.proceed();
        return retValue;
    }

}
