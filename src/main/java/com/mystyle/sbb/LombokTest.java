package com.mystyle.sbb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@Controller
public class LombokTest {
    private String hello;
    private int lombok;

    public static void main(String[] args) {
        LombokTest lombokTest = new LombokTest();
        lombokTest.setHello("hello");
        lombokTest.setLombok(5);

        System.out.println(lombokTest.getHello());
        System.out.println(lombokTest.getLombok());
    }
}
