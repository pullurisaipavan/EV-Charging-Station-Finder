import java.util.List;
import java.util.stream.Collectors;

public class Filters {
    public static List<ChargingStation> filterByLocation(List<ChargingStation> stations, String location) {
        return stations.stream()
                .filter(station -> station.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public static List<ChargingStation> filterByAvailability(List<ChargingStation> stations) {
        return stations.stream()
                .filter(ChargingStation::hasVacantSlots)
                .collect(Collectors.toList());
    }
}
