package com.spring.boot.controllers;

import com.spring.boot.models.User;
import com.spring.boot.services.register.RegisterService;
import com.spring.boot.validators.register.PostValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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
    public ModelAndView post(@ModelAttribute("user") User user, @Valid PostValidator register, BindingResult result) {
        ModelAndView mav= new ModelAndView("/register");
        if (result.hasErrors()) {
            mav.addObject("errors",result.getAllErrors());
            return mav;
        }

        registerService.register(user);
        mav = new ModelAndView("/home");
        return mav;
    }
}