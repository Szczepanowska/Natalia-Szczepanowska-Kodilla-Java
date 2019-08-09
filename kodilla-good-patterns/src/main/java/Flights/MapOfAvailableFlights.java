package Flights;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapOfAvailableFlights {
    public static Map<Integer, Flight> getMapOfAvailableFlights() {

        Map<Integer, Flight> mapOfAvailableFlights = new HashMap<>();
        mapOfAvailableFlights.put(1, new Flight("GDN", Optional.ofNullable("WAW"), "KRK"));
        mapOfAvailableFlights.put(2, new Flight("WRO", Optional.empty(),"RZE"));
        mapOfAvailableFlights.put(3, new Flight("KRK", Optional.empty(), "POZ"));
        mapOfAvailableFlights.put(4, new Flight("POZ", Optional.ofNullable("WAW"), "KRK"));
      ;

        return mapOfAvailableFlights;
    }
}
