package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuit {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(1.0, 2.0);
        double subResult = calculator.sub(5.0, 2.0);
        double mulResult = calculator.mul(1.0, 3.0);
        double divResult = calculator.div(9.0, 3.0);
        //Then
        Assert.assertEquals(addResult, 3.0, 0.0);
        Assert.assertEquals(subResult, 3.0, 0.0);
        Assert.assertEquals(mulResult, 3.0, 0.0);
        Assert.assertEquals(divResult, 3.0, 0.0);


    }
}
