package io.ace.springframework.transaction;

import io.ace.springframework.transaction.dao.StudentDAO;
import io.ace.springframework.transaction.model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationConfig.xml");
        StudentDAO studentDAO = (StudentDAO) appContext.getBean("studentDAO");

        Person person = new Person();
        person.setName("Dipen");
        person.setAge(12);
        person.setMarks(34);
        person.setYear(2018);
        studentDAO.createRecord(person);

        studentDAO.getAllRecords().forEach(System.out::println);
    }

}
