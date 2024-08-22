import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ChargingStation> stations = Database.getChargingStations();
        
        // Ask user for input to filter by location
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter location to find charging stations:");
        String location = scanner.nextLine();
        
        List<ChargingStation> filteredByLocation = Filters.filterByLocation(stations, location);
        if (filteredByLocation.isEmpty()) {
            System.out.println("No charging stations found in the specified location.");
        } else {
            System.out.println("Charging stations available in " + location + ":");
            for (ChargingStation station : filteredByLocation) {
                System.out.println("ID: " + station.getId() + ", Vacant Slots: " + station.hasVacantSlots());
            }
        }

        // Further logic for booking can be added here
    }
}
