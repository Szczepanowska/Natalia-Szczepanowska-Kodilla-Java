
package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){



        Calculator Calculator = new Calculator();
        int result2 = Calculator.subtractAFromB(10,3);
        int result = Calculator.addAToB(5, 5);



        System.out.println(result2);
        System.out.println(result);

    }
}