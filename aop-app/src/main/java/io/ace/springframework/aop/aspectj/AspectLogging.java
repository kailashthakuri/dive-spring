package io.ace.springframework.aop.aspectj;

import org.aspectj.lang.annotation.*;

@Aspect
public class AspectLogging {

    @Pointcut("execution(* io.ace.springframework.aop.model.*.*(..))")
    public void selectAll() {
    }

    @Before("selectAll()")
    public void beforeAdvice() {
        System.out.println("Before Advice Executed");
    }

    @After("selectAll()")
    public void afterAdvice() {
        System.out.println("After Advice Executed");
    }

    @AfterThrowing("selectAll()")
    public void afterThrowing() {
        System.out.println("After Throwing Advice Executed");
    }

    @AfterReturning("selectAll()")
    public void afterReturning() {
        System.out.println("After Returning Executed");
    }


}
