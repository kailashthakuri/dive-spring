package io.ace.springframewok.springjdbc;

import io.ace.springframewok.springjdbc.config.ApplicationConfig;
import io.ace.springframewok.springjdbc.dao.EmployeeDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeExample {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

//        System.out.println("GET ALL COUNT :  " + employeeDAO.getCount());
//        System.out.println("GET ALL COUNT BY BEAN :" + employeeDAO.getCountByBean(new Employee()));
//        System.out.println(employeeDAO.getCountByLastName("Shrestha"));
//        System.out.println(employeeDAO.getCountByDepartment("R&D2"));

//        employeeDAO.insertEmployee(new Employee("Binod", "Thapa", 56, 3434343, "R&D2"));


//        employeeDAO.batchInsert(Arrays.asList(new Employee("Binod", "Thapa", 56, 3434343, "R&D2"),
//                new Employee("Kailash", "Shahi", 56, 3434343, "R&D2"),
//                new Employee("Kshitij", "Khanal", 56, 3434343, "R&D2"),
//                new Employee("Dipendra", "Bista", 56, 3434343, "Operations"),
//                new Employee("Nirajan", "Karki", 56, 3434343, "R&D1"),
//                new Employee("Satis", "Tharu", 56, 3434343, "Engineering")));

//        employeeDAO.batchUpdate(Arrays.asList(new Employee(1, 10000), new Employee(2, 10000)));
//        employeeDAO.batchUpdateWithNamed(Arrays.asList(new Employee(3, 10000), new Employee(4, 10000)));

//                employeeDAO.batchUpdateCollection(Arrays.asList(new Employee( 1, 50000),
//                        new Employee( 2, 50000),
//                        new Employee( 3, 50000),
//                        new Employee( 4, 50000),
//                        new Employee( 5, 50000),
//                        new Employee( 6, 50000)));
//


        employeeDAO.getAllEmployees().stream()
                .forEach(System.out::println);


    }
}
