package io.ace.springframework.securityapp.controller;


import io.ace.springframework.securityapp.config.model.AppRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {

    private static Logger LOGGER = LogManager.getLogger(HomeController.class);

    @RequestMapping
    public String getHome(HttpServletRequest request) {
        LOGGER.debug("HomeController#getHome method.");
//        if (request.isUserInRole(AppRole.ADMIN.name())) {
//            return "redirect:/admin";
//        } else if (request.isUserInRole(AppRole.USER.name())) {
//            return "redirect:/user";
//        }
        return "home/home.jsp";
    }
}
