package io.ace.springframework.mvc.controller.advices;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

/*
 target all Controllers annotated with @RestController
 */
@ControllerAdvice(annotations = RestController.class)
public class Advice2Controller {

}
