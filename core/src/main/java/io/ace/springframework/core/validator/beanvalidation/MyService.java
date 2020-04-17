package io.ace.springframework.core.validator.beanvalidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

@Service
public class MyService {

    @Autowired
    Validator validator;
}
