package com.kodilla.exception.com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsScanner {

    public void findFilght(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("GDN", true);
        airports.put("MUC", true);
        airports.put("LHR", false);
        airports.put("KBP", true);
        airports.put("BUD", false);

        if (!airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        } else {
            if (airports.get(flight.getArrivalAirport())) {
                System.out.println("Flight available");
            } else {
                System.out.println("Flight unavailable");
            }
        }

    }
}
