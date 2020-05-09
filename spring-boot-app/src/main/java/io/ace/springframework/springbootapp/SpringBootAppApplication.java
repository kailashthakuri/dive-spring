package io.ace.springframework.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


// Ctrl+f9
// Ctrl+Shift+f9
// Ctrl+Shift+ A
@SpringBootApplication
@EntityScan(basePackages = "io.ace.springframework.springbootapp.entity")
public class SpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootAppApplication.class);
        application.run(args);

//        SpringApplication.run(SpringBootAppApplication.class, args);
    }

}
