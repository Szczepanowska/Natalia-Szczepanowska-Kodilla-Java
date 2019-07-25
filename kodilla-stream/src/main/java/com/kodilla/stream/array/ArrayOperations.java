package com.kodilla.stream.array;


import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){

       IntStream.range(0, numbers.length)
               .map(n -> numbers[n])
               .forEach(number -> System.out.println("number: " + number));
       double result = IntStream.range(0, numbers.length)
               .map(n -> numbers[n])
               .average().getAsDouble();
       System.out.println("Result equals: " + result);
       return result;





}
}
