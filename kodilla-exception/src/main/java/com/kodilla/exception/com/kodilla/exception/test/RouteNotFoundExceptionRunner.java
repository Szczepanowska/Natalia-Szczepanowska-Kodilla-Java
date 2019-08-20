package com.kodilla.exception.com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("GDN", "MSQ");
        FlightsScanner flightsScanner = new FlightsScanner();

        try {
            flightsScanner.findFilght(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(flight.getArrivalAirport() + " airport does not exist in our map");
        }


    }
}

