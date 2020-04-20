package io.ace.springframewok.springjdbc;

import io.ace.springframewok.springjdbc.dao.StudentDAO;
import io.ace.springframewok.springjdbc.dao.impl.StudentDAOImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDAO studentDAO = appContext.getBean(StudentDAOImpl.class);
        //  studentDAO.createStudent(new Student("Dipen", 33));
        //  studentDAO.createStudent(new Student("Ashok", 23));

        //  studentDAO.deleteStudent(3);
        System.out.println(studentDAO.getStudent(1));

//        studentDAO.updateStudent(2, new Student("Dipen", 80));
        //System.out.println(studentDAO.getStudent(1));
        /**
         * print all students
         */
        studentDAO.getStudents().forEach(System.out::println);
    }
}
