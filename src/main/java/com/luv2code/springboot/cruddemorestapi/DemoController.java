package com.luv2code.springboot.cruddemorestapi;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class DemoController {



    @GetMapping("/hello")
    public String sayHello(Model theModel){

        theModel.addAttribute("theDate",java.time.LocalDateTime.now());


        return "helloworld";



    }


}
