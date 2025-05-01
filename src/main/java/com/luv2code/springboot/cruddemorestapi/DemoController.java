package com.luv2code.springboot.cruddemorestapi;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class DemoController {



    @GetMapping("/")
    public String sayHello(Model model){
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss"));
        model.addAttribute("currentDate", formattedDate);
        return "helloworld";



    }


}
