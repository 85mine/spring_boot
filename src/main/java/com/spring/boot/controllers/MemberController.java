package com.spring.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/member", method = RequestMethod.GET)
public class MemberController {

    @RequestMapping(value = "")
    public ModelAndView get() {
        return new ModelAndView("/member");
    }

    @RequestMapping(value = "/{action}")
    public ModelAndView list(@PathVariable("action") String action) {
        return new ModelAndView("/member");
    }
}