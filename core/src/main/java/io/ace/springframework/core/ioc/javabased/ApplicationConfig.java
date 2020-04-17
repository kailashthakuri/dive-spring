package io.ace.springframework.core.ioc.javabased;


import io.ace.springframework.core.ioc.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public SpellCheckerJava spellCheckerJava() {
        return new SpellCheckerJava();
    }

    @Bean
    public TextEditorJava textEditorJava() {
        return new TextEditorJava();
    }
}
