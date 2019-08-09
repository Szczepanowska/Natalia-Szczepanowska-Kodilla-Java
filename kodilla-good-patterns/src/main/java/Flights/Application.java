package Flights;

import java.util.Map;
import java.util.Optional;

import static Flights.MapOfAvailableFlights.getMapOfAvailableFlights;

public class Application {
    public static void main(String args[]) {

        String departureAirport = "POZ";
        Optional<String> intermediateAirport = Optional.ofNullable("WAW");
        String arrivalAirport = "KRK";

        Flight flight = new Flight(departureAirport, intermediateAirport, arrivalAirport);
        FlightScanner flightScanner = new FlightScanner();

        Map<Integer, Flight> mapOfAvailableFlights = getMapOfAvailableFlights();

        flightScanner.findFlightWithLayover(flight, mapOfAvailableFlights);
        flightScanner.findFlightFromAirport(departureAirport, mapOfAvailableFlights);
        flightScanner.findFlightToAirport(arrivalAirport, mapOfAvailableFlights);
    }
}
