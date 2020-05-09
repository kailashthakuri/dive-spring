package io.ace.springframework.springbootapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(CustomDataSource.class)
public class ApplicationConfig {


}
