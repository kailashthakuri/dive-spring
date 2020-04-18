package io.ace.springframework.aop.aspects;


import io.ace.springframework.aop.exception.PessimisticLockingFailureException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
@Aspect
/**
 * The execution of the business services can sometimes fail due to concurrency issues.(for eg deadlock loser)
 * if the operation is retired , it is likely to succeed on the next try.
 * For the business services where it is approriate to retry in such conditions(idempotent operations that does not
 * need to go back to user to conflict resolution), we need transparently retry operation to avoid client seeing
 * PessimisticLockingFailureException
 */
public class ConcurrentOperationExecutor implements Ordered {


    private static int DEFAULT_MAX_RETRIES = 3;
    private int maxRetries = DEFAULT_MAX_RETRIES;

    /*
     here, the preceding of aspect is  higher than transaction so there will be fresh transaction  each time
     we retry.
     */

    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int getOrder() {
        return order;
    }


    @Around("io.ace.springframework.aop.aspects.SystemArchitecture.busienssService()")
    public Object doConcurrentOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockFailureException;
        do {
            numAttempts++;
            try {
                return proceedingJoinPoint.proceed();
            } catch (PessimisticLockingFailureException ex) {
                lockFailureException = ex;
            }

        } while (numAttempts <= maxRetries);
        throw lockFailureException;
    }
}
