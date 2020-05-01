package io.ace.springframework.springjpa.entity;

import io.ace.springframework.springjpa.SearchDTO;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_employee")
public class Employee {
    @Id
    @GeneratedValue
    private Long id;

    private String firstName, lastName;

    private Integer age;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "temporary_address_id")
    private Address temporaryAddress;


    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "permanent_address_id")
    private Address permanentAddress;

    @Column(name = "DOB", columnDefinition = "DATE")
    private LocalDate dateOfBirth;

    private Double salary;

    public Employee() {
    }

    public Long getId() {
        return id;
    }

    public static Employee getEmployeeBySearchDTO(SearchDTO searchDTO) {
        Employee employee = new Employee();
        employee.setFirstName(searchDTO.getName());
        employee.setLastName(searchDTO.getName());
        if (null == searchDTO.getAge() || searchDTO.getAge().isEmpty()) {
            employee.setAge(0);
        } else {
            employee.setAge(Integer.valueOf(searchDTO.getAge()));
        }
        return employee;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getTemporaryAddress() {
        return temporaryAddress;
    }

    public void setTemporaryAddress(Address temporaryAddress) {
        this.temporaryAddress = temporaryAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
