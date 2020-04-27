package io.ace.springframework.mvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

@Controller
@RequestMapping("/")
public class HomeController {

    @ResponseBody
    public String getHomePage() {
        return "Hello World";
    }


    @ResponseBody
    @RequestMapping("throw")
    public String throwError() {
        throw new RuntimeException();
    }


    @ExceptionHandler({FileSystemAlreadyExistsException.class})
    public ResponseEntity<String> handle(IOException ex) {
        return null;
    }

}
