package com.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionController {
    @RequestMapping(value = "/403", method = RequestMethod.GET)
    public String accesssDenied() {
        return "/errors/403";
    }
}