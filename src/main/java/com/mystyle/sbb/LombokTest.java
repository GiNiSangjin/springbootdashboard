package com.mystyle.sbb;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@RequiredArgsConstructor
public class LombokTest {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        LombokTest lombokTest = new LombokTest("헬로", 5);

        System.out.println(lombokTest.getHello());
        System.out.println(lombokTest.getLombok());
    }
}
