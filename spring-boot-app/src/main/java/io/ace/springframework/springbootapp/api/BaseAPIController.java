package io.ace.springframework.springbootapp.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class BaseAPIController {

    @Autowired
    MessageSource messageSource;

    @GetMapping
    public String root() {
        String greeting = messageSource.getMessage("Greeting", new Object[0], Locale.getDefault());
        return greeting + " You are welcome!";
    }

    @GetMapping("/test")
    public ResponseEntity getSearchDTO() {
        throw new RuntimeException();
    }

}
