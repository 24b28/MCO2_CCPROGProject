

/**
 * The Reservation class is for booking the rooms in a given timeframe.
 * It has a guest name, timeframe, room booked, and total cost.
 */
public class Reservation {
    private String name;
    private Time time;
    private Room room;
    private int Discount = 0;
    private double totalCost;

    /**
     * Constructs the Reservation with the name, timeframe, and room booked.
     *
     * @param name guest name of the reservation
     * @param time timeframe of the reservation
     * @param room room booked
     * @param date the double array containing the rate percentage of each date
     */
    public Reservation(String name, Time time, Room room, double[] date){
        this.name = name;
        this.time = time;
        this.room = room;
        this.totalCost = 0;

        for (int i = time.getCheckIn(); i < time.getCheckOut(); i++){
            totalCost += date[i-1]*this.room.getbPrice();
        }
    }

    /**
     * Gets the guest name of the reservation/booking.
     *
     * @return the guest name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gets the timeframe of the reservation.
     *
     * @return the timeframe
     */
    public Time getTime(){
        return this.time;
    }

    /**
     * Gets the room that is reserved/booked.
     *
     * @return the room
     */
    public Room getRoom(){
        return this.room;
    }

    /**
     *
     * @param DiscountCode the Discount code inputted by the user
     * @return the boolean value to determine if discount code was correct or not.
     */
    public boolean setDiscount(String DiscountCode){
        boolean result = false;
        int n = time.getCheckOut() - time.getCheckIn();

        switch (DiscountCode) {
            case "I_WORK_HERE":
                this.totalCost -= (0.10 * totalCost);
                this.Discount=1;
                result = true;
                break;
            case "STAY4_GET1":
                if (n >= 5) {
                    this.totalCost -= this.room.getbPrice();
                    this.Discount=2;
                    result = true;
                }
                break;
            case "PAYDAY":
                if ((time.getCheckIn() == 15 || time.getCheckIn() == 30) && (time.getCheckOut() != 15 || time.getCheckOut() != 30)) {
                    this.totalCost -= (0.07 * totalCost);
                    this.Discount=3;
                    result = true;
                }
                break;
        }

        return result;
    }

    /**
     * Gets the total cost.
     *
     * @return the total cost
     */
    public double getTotalCost() {
        return this.totalCost;
    }

    /**
     * Gets the value which refers to the discount the reservation has.
     *
     * @return the discount id
     */
    public int getDiscount() {
        return this.Discount;
    }

}
