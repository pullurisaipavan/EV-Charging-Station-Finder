import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<ChargingStation> getChargingStations() {
        List<ChargingStation> stations = new ArrayList<>();
        stations.add(new ChargingStation("1", "New York", true));
        stations.add(new ChargingStation("2", "Los Angeles", false));
        stations.add(new ChargingStation("3", "Chicago", true));
        return stations;
    }
}
