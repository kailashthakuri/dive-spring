package io.ace.springframework.springmvcbasic.controller;


import io.ace.springframework.springmvcbasic.dao.EmployeeDAO;
import io.ace.springframework.springmvcbasic.exception.DataException;
import io.ace.springframework.springmvcbasic.model.Employee;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/employee")
public class EmployeeController {

    static Logger logger = LogManager.getLogger(EmployeeController.class);

    @Autowired
    EmployeeDAO employeeDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String getEmployee(Model model) {
        logger.info("Inside EmployeeController#getEmployee method.");
        model.addAttribute("employees", employeeDAO.getAll());
        return "employee/employee";
    }


    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String getEmployeeCreateForm(Model model) {
        logger.info("Inside EmployeeController#getEmployeeCreateForm method.");
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ExceptionHandler(Exception.class)
    public String save(@ModelAttribute("employee") Employee employee, Model model) {
        logger.info("Inside EmployeeController#save method.");
        if (employee.getAge() < 20) {
            throw new DataException("Age should be Greater than 20.");
        }
        if (employeeDAO.insert(employee) > 0) {
            return "redirect:/employee";
        }
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

}
