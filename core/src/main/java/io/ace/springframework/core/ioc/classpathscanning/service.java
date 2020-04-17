package io.ace.springframework.core.ioc.classpathscanning;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Here the component annotationbased is meta-annotationbased(annotationbased that can be supplied to another annotationbased).
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Component
@Documented
public @interface service {
}
