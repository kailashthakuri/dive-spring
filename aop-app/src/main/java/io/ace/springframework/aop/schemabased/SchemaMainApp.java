package io.ace.springframework.aop.schemabased;

import io.ace.springframework.aop.model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchemaMainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student st = appContext.getBean(Student.class);
        st.getName();
    }
}
