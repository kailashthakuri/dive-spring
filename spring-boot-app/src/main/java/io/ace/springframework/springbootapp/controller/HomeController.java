package io.ace.springframework.springbootapp.controller;

import io.ace.springframework.springbootapp.dto.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/")
public class HomeController {


    @Autowired
    MessageSource messageSource;

    @GetMapping
    public String root() {
        String greeting = messageSource.getMessage("Greeting", new Object[0], Locale.getDefault());
        return greeting + " You are welcome!";
    }

    @GetMapping("/searchdto")
    public ResponseEntity getSearchDTO() {
        SearchDTO<String> searchDTO = new SearchDTO();
        searchDTO.setKey("Name");
        searchDTO.setValue("Kailash");
        return ResponseEntity.ok(searchDTO);
    }

}
