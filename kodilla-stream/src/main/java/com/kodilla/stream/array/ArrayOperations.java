package com.kodilla.stream.array;


import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static OptionalDouble getAverage(int[] numbers){

       IntStream.range(0, numbers.length)
               .map(n -> numbers[n])
               .forEach(number -> System.out.println("number: " + number));
       OptionalDouble result = IntStream.range(0, numbers.length)
               .map(n -> numbers[n])
               .average();
       System.out.println("Result equals: " + result);
       return result;





}
}
