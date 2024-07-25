package MCO2;


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
     */
    public Reservation(String name, Time time, Room room){
        this.name = name;
        this.time = time;
        this.room = room;
        this.totalCost = 0;

        int n = time.getCheckOut() - time.getCheckIn();
        for (int i = 0; i < n; i++){
            totalCost += this.room.getbPrice();
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

    public void setDiscount(String DiscountCode){
        int n = time.getCheckOut() - time.getCheckIn();

        switch (DiscountCode) {
            case "I_WORK_HERE":
                this.totalCost -= (0.10 * totalCost);
                this.Discount=1;
                break;
            case "STAY4_GET1":
                if (n >= 5) {
                    this.totalCost -= this.room.getbPrice();
                    this.Discount=2;
                }
                break;
            case "PAYDAY":
                if ((time.getCheckIn() == 15 || time.getCheckIn() == 30) && (time.getCheckOut() != 15 || time.getCheckOut() != 30)) {
                    this.totalCost -= (0.07 * totalCost);
                    this.Discount=3;
                }
                break;
        }
    }

    /**
     * Gets the total cost.
     *
     * @return the total cost
     */
    public double getTotalCost() {
        return this.totalCost;
    }

    public int getDiscount() {
        return this.Discount;
    }
}
