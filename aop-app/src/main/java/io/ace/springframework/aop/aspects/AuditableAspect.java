package io.ace.springframework.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * This matches the execution of methods annotated with @Auditable annotation.
 */
@Component
@Aspect
public class AuditableAspect {
    @Before("io.ace.springframework.aop.aspects.PointCuts.anyPublicMethods() && @annotation(auditable)")
    public void audit(Auditable auditable) {
    }
}
