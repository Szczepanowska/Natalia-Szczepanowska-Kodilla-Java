package com.kodilla.testing.collection;

import java.util.ArrayList;



public class OddNumbersExterminator {


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();


    public ArrayList<Integer> exterminate() {
        for (int i=0; i<numbers.size(); i++){
        if ((numbers.get(i)%2==0)) {
            evenNumbers.add(numbers.get(i));
        }
        }
    return evenNumbers;
    }
}
