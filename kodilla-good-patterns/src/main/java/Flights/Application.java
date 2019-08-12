package Flights;

import java.util.List;

import static Flights.ListOfAvailableFlights.getListOfAvailableFlights;

public class Application {
    public static void main(String args[]) {

        String departureAirport = "POZ";
        String arrivalAirport = "KRK";

        Flight flight = new Flight(departureAirport, arrivalAirport);
        FlightScanner flightScanner = new FlightScanner(getListOfAvailableFlights());

        List<Flight> listOfAvailableFlights = getListOfAvailableFlights();

        flightScanner.findFlightWithLayover(flight, listOfAvailableFlights);
        flightScanner.findFlighFromAirport(departureAirport, listOfAvailableFlights);
        flightScanner.findFlightToAirport(arrivalAirport, listOfAvailableFlights);
    }
}
