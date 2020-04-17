package io.ace.springframework.core.validator.beanvalidation.binder;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class FooValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Foo.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //Write you validation code here
    }
}
