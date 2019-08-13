package Flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FlightScanner {

    private List<Flight> listOfAvailableFlights;
    public FlightScanner(List<Flight> listOfAvailableFlights) { this.listOfAvailableFlights = listOfAvailableFlights;
    }

    public void findFlightFromAirport(String departureAirport) {
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
        Set<List<Flight>> resultFlights = new HashSet<>();

        List<Flight> arrivalFlights = listOfAvailableFlights.stream()
                .flatMap(flight -> flight.getDepartureAirport().stream())
               .





        if(listOfAvailableFlights.contains(departureAirport)) {
            resultFlights.add(departureFlights);

        }


        }






