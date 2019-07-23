package com.kodilla.exception.com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }


    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

       try ( double result = firstChallenge.divide(3, 0)) {
           System.out.println(result);
       } catch (IOException e){
           System.out.println("Dividing by zero does not work" + e);
       } finally {
           System.out.println("Thanks for using Calculator");
       }
    }
}

