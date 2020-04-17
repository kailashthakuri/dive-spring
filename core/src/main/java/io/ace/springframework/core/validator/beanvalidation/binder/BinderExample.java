package io.ace.springframework.core.validator.beanvalidation.binder;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class BinderExample {

    public static void main(String[] args) {
        Foo target = new Foo();
        DataBinder dataBinder = new DataBinder(target);
        dataBinder.setValidator(new FooValidator());

        dataBinder.validate();
        BindingResult bindingResult = dataBinder.getBindingResult();
        System.out.println(bindingResult);
    }
}
