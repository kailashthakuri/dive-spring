package io.ace.springframework.core.validator.validator;

import io.ace.springframework.core.validator.model.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class AddressValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return Customer.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "country", "country.empty");
        ValidationUtils.rejectIfEmpty(errors, "district", "district.empty");
    }
}
