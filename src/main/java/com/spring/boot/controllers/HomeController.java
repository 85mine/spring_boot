package com.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/", method = RequestMethod.GET)
public class HomeController {

    @RequestMapping(value = "")
    public ModelAndView get() {
        return new ModelAndView("home");
    }
}