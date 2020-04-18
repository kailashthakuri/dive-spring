package io.ace.springframework.aop.aspects;


import io.ace.springframework.aop.model.Account;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ValidationAspect {

    /*
    first way
    */

    @Before("io.ace.springframework.aop.aspects.SystemArchitecture.dataAccessOperation() && args(account)")
    public void validateAccount(Account account) {
        // here we can validate account object.
    }

    /*
    second way
    */
    @Pointcut("io.ace.springframework.aop.aspects.SystemArchitecture.dataAccessOperation() && args(account)")
    public void accoutDataAccessOperation(Account account) {

    }

    @Before("accoutDataAccessOperation(account)")
    public void validateAccount1(Account account) {

    }


}
