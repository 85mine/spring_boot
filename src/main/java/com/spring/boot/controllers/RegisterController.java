package com.spring.boot.controllers;

import com.spring.boot.models.User;
import com.spring.boot.services.register.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController {

    @Autowired
    public RegisterService registerService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView mav = new ModelAndView("/register");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView post(@ModelAttribute("user") User user) {
        registerService.register(user);
        ModelAndView mav = new ModelAndView("/home");
        return mav;
    }
}