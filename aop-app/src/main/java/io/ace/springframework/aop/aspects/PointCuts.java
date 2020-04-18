package io.ace.springframework.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class PointCuts {
    @Pointcut("execution(public * *(..))")
    public void anyPublicMethods() {
    }
}
