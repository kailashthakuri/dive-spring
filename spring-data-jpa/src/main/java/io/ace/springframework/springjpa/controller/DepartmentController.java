package io.ace.springframework.springjpa.controller;


import io.ace.springframework.springjpa.entity.Department;
import io.ace.springframework.springjpa.service.DepartmentService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    static Logger LOGGER = LogManager.getLogger(DepartmentController.class);

    @Autowired
    DepartmentService departmentService;

    @RequestMapping
    @ResponseBody
    public String root() {
        LOGGER.debug("Inside DepartmentController#root method.");
        return "This is Department Page";
    }

    @RequestMapping("/save")
    @ResponseBody
    public ResponseEntity save() {
        LOGGER.debug("Inside DepartmentController#save method.");
        Department department = new Department("IT", "IT description");
        return ResponseEntity.ok(department);
    }
}
