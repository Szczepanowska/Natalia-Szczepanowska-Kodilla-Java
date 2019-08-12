package Flights;

import java.util.*;

public class ListOfAvailableFlights {
    public static List<Flight> getListOfAvailableFlights() {

        List<Flight> listOfAvailableFlights = new ArrayList<>();
        listOfAvailableFlights.add(new Flight("GDN", "WAW"));
        listOfAvailableFlights.add(new Flight("WRO", "RZE"));
        listOfAvailableFlights.add(new Flight("KRK", "POZ"));
        listOfAvailableFlights.add(new Flight("WAW", "KRK"));


        return listOfAvailableFlights;
    }
}
