package io.ace.springframework.securityapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping
    public String getPage() {
        return "admin/admin.jsp";
    }
}
