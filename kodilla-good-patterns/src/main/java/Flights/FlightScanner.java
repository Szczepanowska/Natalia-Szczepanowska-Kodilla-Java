package Flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class FlightScanner {

    private List<Flight> listOfAvailableFlights;

    public FlightScanner(List<Flight> listOfAvailableFlights) {
        this.listOfAvailableFlights = listOfAvailableFlights;
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
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .forEach(System.out::println);
    }

    public void findFlightWithLayover(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> resultFlights = new HashSet<>();

        List<Flight> arrivalFlights = listOfAvailableFlights.stream()
                .filter(entry -> entry.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
        List<Flight> departureFlights = listOfAvailableFlights.stream()
    .filter(entry -> entry.getDepartureAirport().equals(departureAirport))
         .collect(Collectors.toList());

        System.out.println("arrival flights ");

        arrivalFlights.stream().forEach(f -> System.out.println(f.getDepartureAirport() + " " + f.getArrivalAirport()));

System.out.println("departure flights ");

        departureFlights.stream().forEach(f -> System.out.println(f.getDepartureAirport() + " " + f.getArrivalAirport()));


        for (Flight flightD : departureFlights) {
            for (Flight flightA : arrivalFlights) {
                if (flightD.getArrivalAirport().equals(flightA.getDepartureAirport())) {
                    List<Flight> layoverFlights = new ArrayList<>();
                    layoverFlights.add(flightD);
                    layoverFlights.add(flightA);
                    resultFlights.add(layoverFlights);

                }
            }
        }
        System.out.println("layover flights");
        for (List<Flight> flights : resultFlights){
            System.out.println("new connection: " + flights.get(0) +" " + flights.get(1));

        }


    }
}






