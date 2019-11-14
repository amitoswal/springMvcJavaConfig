package com.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {


    @Autowired
    private ModelAndView mdlView;

    @RequestMapping("/")
    public ModelAndView init(){


        mdlView.setViewName("index");
        mdlView.addObject("majorHeading","Rajesh Khanna Hospitals");

        return mdlView;
    }
}
