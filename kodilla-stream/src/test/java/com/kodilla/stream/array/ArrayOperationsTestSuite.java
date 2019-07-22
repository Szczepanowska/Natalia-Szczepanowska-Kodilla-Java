package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
   public void testGetAverage(){
int numbers[] = new int[20];
numbers[0] = 1;
numbers[1] = 1;
numbers[2] = 1;
numbers[3] = 1;
numbers[4] = 1;
numbers[5] = 1;
numbers[6] = 1;
numbers[7] = 1;
numbers[8] = 1;
numbers[9] = 1;
numbers[10] = 11;
numbers[11] = 11;
numbers[12] = 11;
numbers[13] = 11;
numbers[14] = 11;
numbers[15] = 11;
numbers[16] = 11;
numbers[17] = 11;
numbers[18] = 11;
numbers[19] = 11;

OptionalDouble result = ArrayOperations.getAverage(numbers);

        Assert.assertEquals(6.0, result);


    }
}
