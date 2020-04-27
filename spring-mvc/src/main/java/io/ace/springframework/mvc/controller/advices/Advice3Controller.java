package io.ace.springframework.mvc.controller.advices;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.AbstractController;

/*
 Target all Controllers assignable to specific classes.
 */
@ControllerAdvice(assignableTypes = {AbstractController.class})
public class Advice3Controller {
}
