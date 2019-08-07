package Flights;

import java.util.HashMap;
import java.util.Map;

public class FlightScanner {
    public void findFilght(Flight flight){

        Map<Flight> flights = new HashMap<>();
        flights.put("MUC","LHR", "LAX");
        airports.put("MUC", true);
        airports.put("LHR", false);
        airports.put("KBP", true);
        airports.put("BUD", false);

        if (!airports.containsKey(flight.getArrivalAirport()) || !airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getLayoverAirport())) {
            ;
        } else {
            if (airports.get(flight.getArrivalAirport()) && airports.get(flight.getDepartureAirport())) {
                System.out.println("Flight available");
            } else {
                System.out.println("Flight unavailable");
            }
        }

    }
}
