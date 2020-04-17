package io.ace.springframework.core.validator.validator;

import io.ace.springframework.core.validator.model.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person person = (Person) target;
        if (person.getAge() < 0) {
            errors.rejectValue("age", "negativevalue");
        }
        if (person.getAge() > 60) {
            errors.rejectValue("age", "age.too.old");
        }
    }
}
