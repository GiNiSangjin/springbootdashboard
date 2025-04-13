package com.mystyle.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/Hello")
    @ResponseBody
    public String hello() {
        return "Hello Live server! Spring Boot Devtools Test1 Test2 Test3 Test4 Test5 Test6 Test7";
    }
}
