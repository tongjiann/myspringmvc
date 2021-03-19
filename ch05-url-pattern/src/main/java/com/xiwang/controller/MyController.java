package com.xiwang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name, Integer age) {

        System.out.println("doReturnView name:" + name + "  age:" + age);
        ModelAndView mv = new ModelAndView();
        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("show");
        return mv;
    }


    @RequestMapping(value = "/returnStringData.do", produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String doStringData(String name, Integer age) {
        return "Hello SpringMVC 返回对象，表示数据";
    }


}
