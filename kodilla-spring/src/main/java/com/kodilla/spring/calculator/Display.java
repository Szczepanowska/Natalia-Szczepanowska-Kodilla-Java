package com.kodilla.spring.calculator;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Display {
    public double displayValue(double val) {
        System.out.println("result: " + val);
        return val;
    }
}
