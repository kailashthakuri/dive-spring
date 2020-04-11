package io.ace.springframework.core.javabased;


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
