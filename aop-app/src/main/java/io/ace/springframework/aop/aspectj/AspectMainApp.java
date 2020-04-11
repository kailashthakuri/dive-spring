package io.ace.springframework.aop.aspectj;

import io.ace.springframework.aop.model.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appoConfig = new ClassPathXmlApplicationContext("aspectConfig.xml");
        Student st = appoConfig.getBean(Student.class);
        st.getName();
        st.getAge();
        try {
            st.throwPointException();
        } catch (IllegalArgumentException e) {

        }
    }
}
