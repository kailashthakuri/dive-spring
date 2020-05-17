package io.ace.springframework.securityapp.controller.AuthController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/invalidSession")
public class InvalidSessionController {

    @GetMapping
    public String getInvalidSessionPage() {
        return "invalid-session.html";
    }
}
