public class ChargingStation {
    private String id;
    private String location;
    private boolean hasVacantSlots;

    public ChargingStation(String id, String location, boolean hasVacantSlots) {
        this.id = id;
        this.location = location;
        this.hasVacantSlots = hasVacantSlots;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public boolean hasVacantSlots() {
        return hasVacantSlots;
    }
}
