package Flights;

import java.util.Optional;

public class Flight {
    private String departureAirport;
    private Optional <String> layoverAirport;
    private String arrivalAirport;

    public Flight(String departureAirport, Optional<String> layoverAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.layoverAirport = layoverAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public Optional<String> getLayoverAirport() {
        return layoverAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

}
