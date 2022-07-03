package com.demo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(String num) {
        return num;
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public ModelAndView index2(String num) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
