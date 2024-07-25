package MCO2;

import java.util.ArrayList;

/**
 * This is the hotel class which contains the rooms and reservations.
 * Modifies and adds rooms and reservations.
 */
public class Hotel {
    private String name;
    private ArrayList<DeluxeRoom> DroomList;
    private ArrayList<StandardRoom> SroomList;
    private ArrayList<ExecutiveRoom> EroomList;
    private ArrayList<Reservation> reservationList;
    private double bPrice;
    private double bRate;
    private double tPrice;

    /**
     * Constructs the Hotel with the name, pre-defined bPrice, roomList, and reservationList.
     *
     * @param name the name of the Hotel
     */
    public Hotel(String name) {
        this.name = name;
        this.bPrice = 1299.00;
        this.bRate = 1;
        this.EroomList = new ArrayList<ExecutiveRoom>();
        this.SroomList = new ArrayList<StandardRoom>();
        this.DroomList = new ArrayList<DeluxeRoom>();
        this.reservationList = new ArrayList<Reservation>();
    }

    /**
     * Constructs the Hotel with the name, bPrice, roomList, and reservationList.
     *
     * @param name the name of the hotel
     * @param bPrice the new base price
     */
    public Hotel(String name, double bPrice) {
        this.name = name;
        this.bPrice = bPrice;
        this.EroomList = new ArrayList<ExecutiveRoom>();
        this.SroomList = new ArrayList<StandardRoom>();
        this.DroomList = new ArrayList<DeluxeRoom>();
    }

    /**
     * Gets the number of rooms within the hotel.
     *
     * @return the number of rooms in the hotel
     */
    public int numRoom(){
        return SroomList.size() + DroomList.size() + EroomList.size();
    }
    public int numSroom(){
        return SroomList.size();
    }
    public int numDroom(){
        return DroomList.size();
    }
    public int numEroom(){
        return EroomList.size();
    }

    /**
     * Gets the Room ArrayList.
     *
     * @return the roomList
     */

    public ArrayList<StandardRoom> getSroomList(){
        return this.SroomList;
    }

    public ArrayList<DeluxeRoom> getDroomList(){
        return this.DroomList;
    }

    public ArrayList<ExecutiveRoom> getEroomList(){
        return this.EroomList;
    }

    /**
     * Sets the name of the hotel.
     *
     * @param name the new name of the Hotel
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Gets the name of the hotel.
     *
     * @return the name of the hotel
     */
    public String getName(){
        return this.name;
    }

    /**
     * Adds a room in the hotel.
     *
     * @param name the name of the new room
     */
    public void addStandardRoom(int name){
        this.SroomList.add(new StandardRoom(name, this.bPrice));
    }

    public void addDeluxeRoom(int name){
        this.DroomList.add(new DeluxeRoom(name, this.bPrice));
    }

    public void addExecutiveRoom(int name){
        this.EroomList.add(new ExecutiveRoom(name, this.bPrice));
    }

    /**
     * Removes a room in the hotel.
     *
     * @param room the room to be removed
     */
    public void removeSroom(Room room){
        this.SroomList.remove(room);
    }
    public void removeDroom(Room room){
        this.DroomList.remove(room);
    }
    public void removeEroom(Room room){
        this.EroomList.remove(room);
    }

    /**
     * Changes the price of the hotel.
     *
     * @param price the new price of the hotel
     */
    public void changePrice(double price){
        this.bPrice = price;

        for (int i = 0; i<this.SroomList.size(); i++){
            this.SroomList.get(i).setbPrice(price);
        }
        for (int i = 0; i<this.DroomList.size(); i++){
            this.DroomList.get(i).setbPrice(price);
        }
        for (int i = 0; i<this.EroomList.size(); i++){
            this.EroomList.get(i).setbPrice(price);
        }
        if (!this.reservationList.isEmpty()) {
            for (int i = 0; i<this.reservationList.size();i++)   {
                this.reservationList.get(i).getRoom().setbPrice(price);
            }
        }
    }

    /**
     * Gets the total price of the hotel.
     *
     * @return the total price of the hotel
     */
    public double gettPrice(){
        for (Reservation r : this.reservationList)
            this.tPrice += r.getTotalCost();

        return this.tPrice;
    }

    /**
     * Counting the number of booked rooms in a given date.
     *
     * @param date the date of booking
     * @return the number of booked rooms
     */
    public int numSBooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<=r.getTime().getCheckOut();i++) {
                if (date == i) {
                    result += 1;
                }
            }
        }

        return result;
    }

    public int numSSbooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<=r.getTime().getCheckOut();i++) {
                if (date == i && r.getRoom().getId()==1) {
                    result += 1;
                }
            }
        }
        return result;
    }

    public int numSDbooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<=r.getTime().getCheckOut();i++) {
                if (date == i && r.getRoom().getId()==2) {
                    result += 1;
                }
            }
        }
        return result;
    }

    public int numSEbooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<=r.getTime().getCheckOut();i++) {
                if (date == i && r.getRoom().getId()==3) {
                    result += 1;
                }
            }
        }
        return result;
    }

    /**
     * Counts the number of bookings there are in the hotel.
     *
     * @return the number of bookings
     */
    public int numBooked() {
        return this.reservationList.size();
    }

    /**
     * Gets the Reservation ArrayList
     *
     * @return the Reservation ArrayList
     */
    public ArrayList<Reservation> getReservationList(){
        return this.reservationList;
    }

    /**
     * Adds a reservation in the hotel.
     *
     * @param name the name of the reservation
     * @param time the timeframe of the reservation
     * @param room the room to be booked
     */
    public void addSreservation(String name, Time time, Room room) {
        for (int i = 0; i < this.SroomList.size(); i++) {
            if (room.getName()==this.SroomList.get(i).getName()) {
                this.reservationList.add(new Reservation(name, time, this.SroomList.get(i)));
            }
        }
    }

    public void addDreservation(String name, Time time, Room room) {
        for (int i = 0; i < this.DroomList.size(); i++) {
            if (room.getName()==this.DroomList.get(i).getName()) {
                this.reservationList.add(new Reservation(name, time, this.DroomList.get(i)));
            }
        }
    }

    public void addEreservation(String name, Time time, Room room) {
        for (int i = 0; i < this.EroomList.size(); i++) {
            if (room.getName()==this.EroomList.get(i).getName()) {
                this.reservationList.add(new Reservation(name, time, this.EroomList.get(i)));
            }
        }
    }

    /**
     * Removes a reservation in the hotel.
     *
     * @param reservation the reservation to be removed
     */
    public void removeReservation(Reservation reservation){
        this.reservationList.remove(reservation);
    }
}
