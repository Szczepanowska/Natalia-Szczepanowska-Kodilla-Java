package Flights;

import java.util.List;

public class FlightScanner {

    private List<Flight> listOfAvailableFlights;
    public FlightScanner(List<Flight> listOfAvailableFlights) {
        this.listOfAvailableFlights = listOfAvailableFlights;
    }

    public void findFlighFromAirport(String departureAirport, List<Flight> listOfAvailableFlights) {
        System.out.println("Flights found from: " + departureAirport + " ");
       listOfAvailableFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightToAirport(String arrivalAirport, List<Flight> listOfAvailableFlights) {
        System.out.println("Flights found to: " + arrivalAirport + " ");
        listOfAvailableFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightWithLayover(Flight flight, List<Flight> listOfAvailableFlights) {
        System.out.println("Available flights from: " + flight.getDepartureAirport() + " to: " + flight.getArrivalAirport() + " ");
        listOfAvailableFlights.stream()
                .filter(entry -> (entry.equals(flight)))
                .forEach(System.out::println);
    }
}
