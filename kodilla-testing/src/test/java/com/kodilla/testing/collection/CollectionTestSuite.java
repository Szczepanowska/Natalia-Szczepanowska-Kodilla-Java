package com.kodilla.testing.collection;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorNormalList() {
        // step 1 - create array list with sample data
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //step 2 - call method exterminate and assign result to collection List<Integer> result
        ArrayList<Integer> result = numbers.exterminate();


        //step 3 - check if result collection contains only even numbers - use assertion's
    }


}

