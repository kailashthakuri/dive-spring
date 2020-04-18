package io.ace.springframework.aop.exception;

public class PessimisticLockingFailureException extends RuntimeException {
    public PessimisticLockingFailureException() {
    }

    public PessimisticLockingFailureException(String message) {
        super(message);
    }
}
