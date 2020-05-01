package io.ace.springframework.springjpa.controller;

import io.ace.springframework.springjpa.SearchDTO;
import io.ace.springframework.springjpa.entity.Employee;
import io.ace.springframework.springjpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    public static String ROOT_JSP_PATH = "employee/";

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public String root(@ModelAttribute SearchDTO searchDTO, Model model) {
        if ((null == searchDTO.getName() || searchDTO.getName().isEmpty()) &&
                (null == searchDTO.getAge() || searchDTO.getAge().isEmpty())) {
            model.addAttribute("employees", employeeService.findAll());
        } else {
            model.addAttribute("employees", employeeService.search(searchDTO));
        }
        return ROOT_JSP_PATH + "employee";
    }

    @GetMapping("/create")
    public String getCreateForm(Model model) {
        model.addAttribute("employee", new Employee());
        return ROOT_JSP_PATH + "create";
    }

    @GetMapping("/edit/{id}")
    public String getEditForm(@PathVariable Long id, Model model) {
        model.addAttribute("employee", employeeService.findById(id));
        return ROOT_JSP_PATH + "create";
    }

    @PostMapping("/create")
    public String saveOrUpdate(@ModelAttribute Employee employee) {
        employeeService.save(employee);
        return "redirect:/employee";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        employeeService.deleteById(id);
        return "redirect:/employee";
    }
}
