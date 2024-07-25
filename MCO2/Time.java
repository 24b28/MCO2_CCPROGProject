package MCO2;
/**
 * The Time class refers to the timeframe a given reservation.
 * It has the check-in and check-out dates for each of the reservations.
 */
public class Time {
    private int checkIn;
    private int checkOut;

    /**
     * Constructs the Time with the check-in and check-out values.
     *
     * @param checkIn the check-in date
     * @param checkOut the check-out date
     */
    public Time(int checkIn, int checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    /**
     * Gets the check-in of the Time.
     *
     * @return the check-in of a given timeframe
     */
    public int getCheckIn(){
        return this.checkIn;
    }

    /**
     * Gets the check-out of the Time.
     *
     * @return the check-out of a given timeframe
     */
    public int getCheckOut(){
        return this.checkOut;
    }
}
