package com.example.delivery.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class CustomErrorController implements ErrorController, com.example.delivery.controller.ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        return "error-page"; // Name of your custom error view (e.g., error-page.html in templates)
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
