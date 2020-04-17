package io.ace.springframework.core.ioc.javabased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedMainApp {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
//        applicationContext.register(ApplicationConfig.class);
//        applicationContext.refresh();
//        Student student = applicationContext.getBean(Student.class);
//        student.setName("kailash");
//        System.out.println(student.getName());

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        TextEditorJava textEditor = appContext.getBean(TextEditorJava.class);
        textEditor.spellCheck();
    }
}
