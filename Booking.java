public class Booking {
    private String bookingId;
    private String stationId;
    private String userId;
    private String bookingTime;

    public Booking(String bookingId, String stationId, String userId, String bookingTime) {
        this.bookingId = bookingId;
        this.stationId = stationId;
        this.userId = userId;
        this.bookingTime = bookingTime;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getStationId() {
        return stationId;
    }

    public String getUserId() {
        return userId;
    }

    public String getBookingTime() {
        return bookingTime;
    }
}
