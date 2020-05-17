package io.ace.springframework.securityapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping
    public String getPage(HttpServletRequest request) {
        return "user/user.jsp";
    }
}
