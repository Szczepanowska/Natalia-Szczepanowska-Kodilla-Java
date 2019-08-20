package com.kodilla.exception.com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2.1, 3.5);
        } catch (Exception e) {
            System.out.println("Problem with numbers " + e);

        } finally {
            System.out.println("End of challenge");
        }
    }

}
