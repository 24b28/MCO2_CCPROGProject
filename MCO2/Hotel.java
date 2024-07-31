
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
    private double[] date;
    private double bPrice;
    private double tPrice;

    /**
     * Constructs the Hotel with the name, pre-defined bPrice, roomList, and reservationList.
     *
     * @param name the name of the Hotel
     */
    public Hotel(String name) {
        this.name = name;
        this.bPrice = 1299.00;
        this.EroomList = new ArrayList<ExecutiveRoom>();
        this.SroomList = new ArrayList<StandardRoom>();
        this.DroomList = new ArrayList<DeluxeRoom>();
        this.reservationList = new ArrayList<Reservation>();
        date = new double[31];
        for (int i = 1; i<=31;i++){
            date[i-1]=1;
        }
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
        this.reservationList = new ArrayList<Reservation>();
        date = new double[31];
        for (int i = 1; i<=31;i++){
            date[i-1]=1;
        }
    }

    /**
     * Gets the number of rooms within the hotel.
     *
     * @return the number of rooms in the hotel
     */
    public int numRoom(){
        return SroomList.size() + DroomList.size() + EroomList.size();
    }

    /**
     * Gets the number of Standard rooms within the hotel.
     *
     * @return the number of Standard rooms in the hotel
     */
    public int numSroom(){
        return SroomList.size();
    }

    /**
     * Gets the number of Deluxe rooms within the hotel.
     *
     * @return the number of Deluxe rooms in the hotel
     */
    public int numDroom(){
        return DroomList.size();
    }

    /**
     * Gets the number of Executive rooms within the hotel.
     *
     * @return the number of Executive rooms in the hotel
     */
    public int numEroom(){
        return EroomList.size();
    }

    /**
     * Gets the StandardRoom ArrayList.
     *
     * @return the StandardRoom roomList
     */

    public ArrayList<StandardRoom> getSroomList(){
        return this.SroomList;
    }

    /**
     * Gets the DeluxeRoom ArrayList.
     *
     * @return the DeluxeRoom roomList
     */
    public ArrayList<DeluxeRoom> getDroomList(){
        return this.DroomList;
    }

    /**
     * Gets the ExecutiveRoom ArrayList.
     *
     * @return the ExecutiveRoom roomList
     */
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
     * Adds Standard room in the hotel.
     *
     * @param name the name of the new room
     */
    public void addStandardRoom(int name){
        this.SroomList.add(new StandardRoom(name, this.bPrice));
    }

    /**
     * Adds Deluxe room in the hotel.
     *
     * @param name the name of the new room
     */
    public void addDeluxeRoom(int name){
        this.DroomList.add(new DeluxeRoom(name, this.bPrice));
    }

    /**
     * Adds Executive room in the hotel.
     *
     * @param name the name of the new room
     */
    public void addExecutiveRoom(int name){
        this.EroomList.add(new ExecutiveRoom(name, this.bPrice));
    }

    /**
     * Removes Standard room in the hotel.
     *
     * @param room the room to be removed
     */
    public void removeSroom(Room room){
        this.SroomList.remove(room);
    }

    /**
     * Removes Deluxe room in the hotel.
     *
     * @param room the room to be removed
     */
    public void removeDroom(Room room){
        this.DroomList.remove(room);
    }

    /**
     * Removes a Deluxe room in the hotel.
     *
     * @param room the room to be removed
     */
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
            this.SroomList.get(i).setPrice(price);
        }
        for (int i = 0; i<this.DroomList.size(); i++){
            this.DroomList.get(i).setPrice(price);
        }
        for (int i = 0; i<this.EroomList.size(); i++){
            this.EroomList.get(i).setPrice(price);
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
            for (int i = r.getTime().getCheckIn();i<r.getTime().getCheckOut();i++) {
                if (date == i) {
                    result += 1;
                }
            }
        }

        return result;
    }

    /**
     * Counting the number of booked Standard rooms in a given date.
     *
     * @param date the date of booking
     * @return the number of booked rooms
     */
    public int numSSbooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<r.getTime().getCheckOut();i++) {
                if (date == i && r.getRoom().getId()==1) {
                    result += 1;
                }
            }
        }
        return result;
    }

    /**
     * Counting the number of booked Deluxe rooms in a given date.
     *
     * @param date the date of booking
     * @return the number of booked rooms
     */
    public int numSDbooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<r.getTime().getCheckOut();i++) {
                if (date == i && r.getRoom().getId()==2) {
                    result += 1;
                }
            }
        }
        return result;
    }

    /**
     * Counting the number of booked Executive rooms in a given date.
     *
     * @param date the date of booking
     * @return the number of booked rooms
     */
    public int numSEbooked(int date) {
        int result = 0;

        for (Reservation r : this.reservationList){
            for (int i = r.getTime().getCheckIn();i<r.getTime().getCheckOut();i++) {
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
     * Adds a Standard room reservation in the hotel.
     *
     * @param name the name of the reservation
     * @param time the timeframe of the reservation
     * @param room the room to be booked
     */
    public void addSreservation(String name, Time time, Room room) {
        for (int i = 0; i < this.SroomList.size(); i++) {
            if (room.getName()==this.SroomList.get(i).getName()) {
                this.reservationList.add(new Reservation(name, time, this.SroomList.get(i), this.date));
            }
        }
    }

    /**
     * Adds a Deluxe room reservation in the hotel.
     *
     * @param name the name of the reservation
     * @param time the timeframe of the reservation
     * @param room the room to be booked
     */
    public void addDreservation(String name, Time time, Room room) {
        for (int i = 0; i < this.DroomList.size(); i++) {
            if (room.getName()==this.DroomList.get(i).getName()) {
                this.reservationList.add(new Reservation(name, time, this.DroomList.get(i), this.date));
            }
        }
    }

    /**
     * Adds a Executive room reservation in the hotel.
     *
     * @param name the name of the reservation
     * @param time the timeframe of the reservation
     * @param room the room to be booked
     */
    public void addEreservation(String name, Time time, Room room) {
        for (int i = 0; i < this.EroomList.size(); i++) {
            if (room.getName()==this.EroomList.get(i).getName()) {
                this.reservationList.add(new Reservation(name, time, this.EroomList.get(i), this.date));
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

    /**
     * Adds a Standard room reservation in the hotel.
     *
     * @param index the index of the selected date
     * @param percent the percentage indicated by the user
     * @return the boolean value of the price was modified
     */
    public boolean DatePriceModifier(int index, double percent){
        boolean result = false;
        if (percent>=50 && percent<=150) {
            this.date[index] = percent / 100;
            result = true;
        }
        return result;
    }
}
