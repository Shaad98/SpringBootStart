package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
public class HomeController {
   

   
    @GetMapping("/contact")
    public String handlefirst()
    {
        return "This is first page in Spring Boot";
    }
    @GetMapping("/home")

    public String handlesecond()
    {
        return "Second Page in Spring Boot";
    }
}
