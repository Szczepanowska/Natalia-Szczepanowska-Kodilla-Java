package Flights;

import java.util.Map;

public class FlightScanner {

    public void findFlightFromAirport(String departureAirport, Map<Integer, Flight> mapOfAvailableFlights) {
        System.out.println("Flights found from: " + departureAirport + " ");
        mapOfAvailableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightToAirport(String arrivalAirport, Map<Integer, Flight> mapOfAvailableFlights) {
        System.out.println("Flights found to: " + arrivalAirport + " ");
        mapOfAvailableFlights.entrySet().stream()
                .filter(entry -> entry.getValue().getDepartureAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightWithLayover(Flight flight, Map<Integer, Flight> mapOfAvailableFlights) {
        System.out.println("Available flights from: " + flight.getDepartureAirport() + " through " + flight.getLayoverAirport() + " to: " + flight.getArrivalAirport() + " ");
        mapOfAvailableFlights.entrySet().stream()
                .filter(entry -> (entry.getValue().equals(flight)))
                .forEach(System.out::println);
    }
}
