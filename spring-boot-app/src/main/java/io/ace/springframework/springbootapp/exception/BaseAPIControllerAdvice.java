package io.ace.springframework.springbootapp.exception;

import io.ace.springframework.springbootapp.api.BaseAPIController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice(basePackageClasses = BaseAPIController.class)
public class BaseAPIControllerAdvice extends ResponseEntityExceptionHandler {

}
