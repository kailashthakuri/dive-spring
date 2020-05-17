package io.ace.springsecurity.casclientapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
    public String getLoginPage() {
        return "login.jsp";
    }
}
