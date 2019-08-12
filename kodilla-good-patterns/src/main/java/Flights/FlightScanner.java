package Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightScanner {

    private List<Flight> listOfAvailableFlights;
    public FlightScanner(List<Flight> listOfAvailableFlights) {
        this.listOfAvailableFlights = listOfAvailableFlights;
    }

    public void findFlighFromAirport(String departureAirport) {
        System.out.println("Flights found from: " + departureAirport + " ");
       listOfAvailableFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .forEach(System.out::println);
    }

    public void findFlightToAirport(String arrivalAirport) {
        System.out.println("Flights found to: " + arrivalAirport + " ");
        listOfAvailableFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightWithLayover(String departureAirport, String arrivalAirport) {
        listOfAvailableFlights.stream()
                .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        for (String departureAirport: listOfAvailableFlights){
            

        }




    }
}
