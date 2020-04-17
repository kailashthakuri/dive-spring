package io.ace.springframework.core.validator.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class MyConstraintValidator implements ConstraintValidator {

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }

    @Override
    public void initialize(Annotation constraintAnnotation) {

    }
}