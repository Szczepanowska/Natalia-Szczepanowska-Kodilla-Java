package Flights;

import static Flights.ListOfAvailableFlights.getListOfAvailableFlights;

public class Application {
    public static void main(String args[]) {

        String departureAirport = "GDN";
        String arrivalAirport = "KRK";


        FlightScanner flightScanner = new FlightScanner(getListOfAvailableFlights());


        flightScanner.findFlightWithLayover(departureAirport, arrivalAirport);
        flightScanner.findFlightFromAirport(departureAirport);
        flightScanner.findFlightToAirport(arrivalAirport);
    }
}
