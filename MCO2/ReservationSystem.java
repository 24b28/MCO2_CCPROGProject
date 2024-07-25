package MCO2;

import java.util.ArrayList;

/**
 * The ReservationSystem class is responsible for the overall managing of the Hotel/s.
 */
public class ReservationSystem {
    private ArrayList<Hotel> hotelList;
    private int index;

    /**
     * Constructs the ReservationSystem with the Hotel array.
     */
    public ReservationSystem(){
        this.hotelList = new ArrayList<Hotel>();
    }

    /**
     * Creates a Hotel based on the unique name.
     *
     * @param name the unique name of the hotel
     * @return the success/failure of the process through the use of boolean values.
     */
    public boolean CreateHotel(String name){
        boolean result = true;

        if (!this.hotelList.isEmpty())
            for (Hotel h : this.hotelList) {
                if (h.getName().equals(name)) {
                    result = false;
                    break;
                }
            }

        if (result){
            this.hotelList.add(new Hotel(name));
        }

        return result;
    }

    /**
     * Creates a Hotel based on the unique name and the base Price.
     *
     * @param name the unique name of the hotel
     * @param bPrice the base Price of each of the rooms
     * @return the success/failure of the process through the use of boolean values.
     */
    public boolean CreateHotel(String name, double bPrice){
        boolean result = true;

        if (!this.hotelList.isEmpty()) {
            for (Hotel h : this.hotelList) {
                if (h.getName().equals(name)) {
                    result = false;
                    break;
                }
            }
        }

        if (result){
            this.hotelList.add(new Hotel(name, bPrice));
        }

        return result;
    }

    /**
     * Displays the High-Level Information of the selected Hotel.
     *
     * @param index the index of the selected hotel
     */
    public String viewHighLevel(int index){
        Hotel hotel = this.hotelList.get(index);
        String text = "";
        text+="=======\n";
        text+="Hotel Name: " + hotel.getName() + "\n";
        text+="=======\n";
        text+="Number of Rooms: " +  hotel.numRoom() + "\n";
        text+="Number of Standard Rooms: " +  hotel.getSroomList().size() + "\n";
        text+="Number of Deluxe Rooms: " +  hotel.getDroomList().size() + "\n";
        text+="Number of Executive Rooms: " +  hotel.getEroomList().size() + "\n";
        text+="Estimated Earnings for this month: " + hotel.gettPrice() + "\n";

        return text;

    }

    /**
     * Display number of available rooms and number of booked rooms.
     *
     * @param index the index of the selected hotel
     * @param date the date to identify rooms booked on that date
     */
    public String AvailableSRooms(int index, int date){
        Hotel hotel = this.hotelList.get(index);
        String text = "";
        text+=("=======\n");
        text+=("Rooms on: " + date + "\n");
        text+=("=======\n");
        text+=("Available Rooms:        Booked Rooms: \n");
        String text1 ="Standard Rooms: " + (hotel.numSroom() - hotel.numSBooked(date));
        String text2 ="Deluxe Rooms: " + (hotel.numDroom() - hotel.numSBooked(date));
        String text3 ="Executive Rooms: " + (hotel.numEroom() - hotel.numSBooked(date));
        text+=text1;
        for (int i=0;i<21-text1.length();i++)
            text+=(" ");
        text+=("Standard Rooms: " + hotel.numSSbooked(date) + "\n");
        text+=text2;
        for (int i=0;i<23-text2.length();i++)
            text+=(" ");
        text+=("Deluxe Rooms: " + hotel.numSDbooked(date) + "\n");
        text+=text3;
        for (int i=0;i<22-text3.length();i++)
            text+=(" ");
        text+=("Executive Rooms: " + hotel.numSEbooked(date) + "\n");

        return text;
    }

    /**
     * Displays the Information of a selected reservation.
     *
     * @param index the index of the selected hotel
     * @param i the index of the selected reservation
     */
    public void ReservationInfo(int index, int i){
        System.out.println("=======");
        System.out.println("Reservation Guest Name: " + this.hotelList.get(index).getReservationList().get(i).getName());
        System.out.println("=======\n");
        System.out.println("Room Name: " + this.hotelList.get(index).getReservationList().get(i).getRoom().getName());
        if (this.hotelList.get(index).getReservationList().get(i).getRoom().getId()==1)
            System.out.println("Room Type: Standard");
        else if (this.hotelList.get(index).getReservationList().get(i).getRoom().getId()==2)
            System.out.println("Room Type: Deluxe");
        else if (this.hotelList.get(index).getReservationList().get(i).getRoom().getId()==3)
            System.out.println("Room Type: Executive");
        if (this.hotelList.get(index).getReservationList().get(i).getDiscount()==1){
            System.out.println("Discount: 10%");
        }
        else if (this.hotelList.get(index).getReservationList().get(i).getDiscount()==2){
            System.out.println("Discount: 1 day off");
        }
        else if (this.hotelList.get(index).getReservationList().get(i).getDiscount()==3){
            System.out.println("Discount: 7&");
        }
        System.out.println("Check-in Date: " + this.hotelList.get(index).getReservationList().get(i).getTime().getCheckIn());
        System.out.println("Check-out Date: " + this.hotelList.get(index).getReservationList().get(i).getTime().getCheckOut());
        System.out.println("Total Price of Booking: " + this.hotelList.get(index).getReservationList().get(i).getTotalCost());
        System.out.println("Price Breakdown:");
        System.out.println("Days Reserved: " + (this.hotelList.get(index).getReservationList().get(i).getTime().getCheckOut()-this.hotelList.get(index).getReservationList().get(i).getTime().getCheckIn()));
        System.out.println("Base Price: " + this.hotelList.get(index).getReservationList().get(i).getRoom().getbPrice());
        System.out.println(this.hotelList.get(index).getReservationList().get(i).getRoom().getbPrice() + "*" + (this.hotelList.get(index).getReservationList().get(i).getTime().getCheckOut()-this.hotelList.get(index).getReservationList().get(i).getTime().getCheckIn()) + "=" + this.hotelList.get(index).getReservationList().get(i).getTotalCost());
    }

    /**
     * Displays the Selected Room Information
     *
     * @param index the index of the selected hotel
     * @param name the name of the room
     */
    public String RoomInfo(int index, int name){
        String text = "";
        Hotel hotel = this.hotelList.get(index);
        Room room = null;
        int id=0;
        for (Room r : hotel.getSroomList()){
            if (r.getName()==name) {
                room = r;
                id=1;
                break;
            }
        }
        for (Room r : hotel.getDroomList()){
            if (r.getName()==name) {
                room = r;
                id=2;
                break;
            }
        }
        for (Room r : hotel.getEroomList()){
            if (r.getName()==name) {
                room = r;
                id=3;
                break;
            }
        }
        text+="Room Name: " + room.getName() + "\n";
        if (id==1) {
            text+="Standard Room\n";
        }
        else if (id==2) {
            text+="Deluxe Room\n";
        }
        else {
            text+="Executive Room\n";
        }
        text+="Price per Night: " + room.getbPrice() + "\n";

        return text;
    }

    /**
     * Displays the available dates of the selected room.
     *
     * @param index the index of the selected hotel
     * @param name the room to show the availability.
     */
    public String[] RoomAvailability(int index, int name){

        Hotel hotel = this.hotelList.get(index);
        Room room = null;
        String[] Booked = new String[31];
        for (int i=0; i<31; i++){
            Booked[i] = "Available";
        }

        int id=0;
        for (Room r : hotel.getSroomList()){
            if (r.getName()==name) {
                room = r;
                id=1;
                break;
            }
        }
        for (Room r : hotel.getDroomList()){
            if (r.getName()==name) {
                room = r;
                id=2;
                break;
            }
        }
        for (Room r : hotel.getEroomList()){
            if (r.getName()==name) {
                room = r;
                id=3;
                break;
            }
        }


        for(Reservation rs : this.hotelList.get(index).getReservationList()){
            if (rs.getRoom().getName()==room.getName()){
                for(int i = 1;i<=31;i++){
                    if (i<rs.getTime().getCheckIn() || i>=rs.getTime().getCheckOut()) {
                        Booked[i-1]="Not Available";
                    }
                }
            }
        }

        return Booked;
    }

    /**
     * Changes the selected Hotel Name
     *
     * @param index the index of the selected hotel
     * @param name the new unique name of the selected hotel
     * @return the boolean value to determine if hotel name was changed or not
     */
    public boolean changeHotelName(int index, String name){
        boolean result = true;

        if (!this.hotelList.isEmpty()) {
            for (Hotel h : this.hotelList) {
                if (h.getName().equals(name)) {
                    result = false;
                    break;
                }
            }
        }

        if (result) {
            this.hotelList.get(index).setName(name);
        }

        return result;
    }

    /**
     * Adds hotel rooms with unique names.
     *
     * @param index the index of the selected Hotel
     * @param qty the quantity of rooms to be added.
     * @return the boolean value to determine if rooms were added or not
     */
    public boolean addHotelRoom(int index, int qty, int type){
        boolean result = false;
        int i = 100;
        i+=this.hotelList.get(index).numRoom();

        if ((this.hotelList.get(index).numRoom()+qty)<=50) {
            if (type==1) {
                if (!this.hotelList.get(index).getSroomList().isEmpty()) {
                    int LastElem = this.hotelList.get(index).numSroom() - 1;
                    i = this.hotelList.get(index).getSroomList().get(LastElem).getName() + 1;
                    for (int j = 0; j < qty; j++) {
                        if (i != this.hotelList.get(index).getSroomList().get(LastElem).getName()) {
                            this.hotelList.get(index).addStandardRoom(i);
                            i++;
                            LastElem++;
                        }
                    }
                } else {
                    for (int j = 0; j < qty; j++) {
                        this.hotelList.get(index).addStandardRoom(i);
                        i++;
                    }
                }
            }
            else if (type==2) {
                if (!this.hotelList.get(index).getDroomList().isEmpty()) {
                    int LastElem = this.hotelList.get(index).numDroom() - 1;
                    i = this.hotelList.get(index).getDroomList().get(LastElem).getName() + 1;
                    for (int j = 0; j < qty; j++) {
                        if (i != this.hotelList.get(index).getDroomList().get(LastElem).getName()) {
                            this.hotelList.get(index).addDeluxeRoom(i);
                            i++;
                            LastElem++;
                        }
                    }
                } else {
                    for (int j = 0; j < qty; j++) {
                        this.hotelList.get(index).addDeluxeRoom(i);
                        i++;
                    }
                }
            }
            else {
                if (!this.hotelList.get(index).getEroomList().isEmpty()) {
                    int LastElem = this.hotelList.get(index).numEroom() - 1;
                    i = this.hotelList.get(index).getEroomList().get(LastElem).getName() + 1;
                    for (int j = 0; j < qty; j++) {
                        if (i != this.hotelList.get(index).getEroomList().get(LastElem).getName()) {
                            this.hotelList.get(index).addExecutiveRoom(i);
                            i++;
                            LastElem++;
                        }
                    }
                } else {
                    for (int j = 0; j < qty; j++) {
                        this.hotelList.get(index).addExecutiveRoom(i);
                        i++;
                    }
                }
            }
        }
        else
            result = true;

        return result;
    }

    /**
     * Displays the rooms that are removable.
     *
     * @param index the index of the selected hotel
     */
    public Integer[] showRemovableRoom(int index) {
        boolean result = true;
        ArrayList<Integer> rooms = new ArrayList<>();
        if (!this.hotelList.get(index).getReservationList().isEmpty()){
            for (Room r : this.hotelList.get(index).getSroomList()) {
                for (Reservation rs : this.hotelList.get(index).getReservationList()) {
                    if (rs.getRoom().getName() == r.getName()) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    rooms.add(r.getName());
                }
                result = true;
            }
            for (Room r : this.hotelList.get(index).getDroomList()) {
                for (Reservation rs : this.hotelList.get(index).getReservationList()) {
                    if (rs.getRoom().getName() == r.getName()) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    rooms.add(r.getName());
                }
                result = true;
            }
            for (Room r : this.hotelList.get(index).getEroomList()) {
                for (Reservation rs : this.hotelList.get(index).getReservationList()) {
                    if (rs.getRoom().getName() == r.getName()) {
                        result = false;
                        break;
                    }
                }
                if (result) {
                    rooms.add(r.getName());
                }
                result = true;
            }
        }
        else{
            for (Room r : this.hotelList.get(index).getSroomList()){
                rooms.add(r.getName());
            }
            for (Room r : this.hotelList.get(index).getDroomList()){
                rooms.add(r.getName());
            }
            for (Room r : this.hotelList.get(index).getEroomList()){
                rooms.add(r.getName());
            }
        }
        Integer[] rRoom = new Integer[rooms.size()];
        for (int i = 0 ; i<rooms.size(); i++)
            rRoom[i]=rooms.get(i);

        return rRoom;
    }

    /**
     * Removes the Selected Hotels' Room.
     *
     * @param index the index of the selected hotel
     * @param name the name of the room to be removed
     */
    public boolean removeHotelRoom(int index, int name){
        boolean result = false;
        for (Room r : this.hotelList.get(index).getSroomList()){
            if (r.getName() == name){
                this.hotelList.get(index).removeSroom(r);
                result = true;
                break;

            }
        }
        for (Room r : this.hotelList.get(index).getDroomList()){
            if (r.getName() == name){
                this.hotelList.get(index).removeDroom(r);
                result = true;
                break;

            }
        }
        for (Room r : this.hotelList.get(index).getEroomList()){
            if (r.getName() == name){
                this.hotelList.get(index).removeEroom(r);
                result = true;
                break;

            }
        }

        return result;
    }

    /**
     * Changes the base prices of the selected Hotel.
     *
     * @param index the index of the selected hotel
     * @param bPrice the base new base price
     */
    public void updateHotelPrice(int index, double bPrice){
        if (this.hotelList.get(index).numBooked()==0) {
            this.hotelList.get(index).changePrice(bPrice);
        }
    }

    /**
     * Removes the hotel reservation.
     *
     * @param index the index of the selected hotel
     * @param in the index of the selected reservation to be removed
     */
    public void removeHotelRoomReservation(int index, int in){
        if (this.hotelList.get(index).numBooked()!=0) {
            this.hotelList.get(index).removeReservation(this.hotelList.get(index).getReservationList().get(in-1));
        }
    }

    /**
     * Removes a hotel.
     *
     * @param index the index of the hotel to be removed
     */
    public void removeHotel(int index){
        this.hotelList.remove(this.hotelList.get(index-1));
    }

    /**
     * A getter for the Hotel ArrayList.
     *
     * @return the Hotel ArrayList
     */
    public ArrayList<Hotel>  getHotelList(){
        return this.hotelList;
    }

    /**
     * Adds a booking/reservation to the selected Hotel
     *
     * @param index the index of the selected hotel
     * @param time the time of the new booking
     * @param name the name of the new booking
     */
    public void addBooking(int index, Time time, String name, int type){
        boolean result = true;
        int count = 0;

        if (time.getCheckIn()<31 && time.getCheckIn()>=1 && time.getCheckOut()>1 && time.getCheckOut()<=31 && time.getCheckOut()>time.getCheckIn()) {
            if (type==1) {
                for (Room r : this.hotelList.get(index).getSroomList()) {
                    for (Reservation rs : this.hotelList.get(index).getReservationList()) {
                        if (r.getName() == rs.getRoom().getName() && count == 0) {
                            result = false;
                            if ((time.getCheckIn() < rs.getTime().getCheckIn() && time.getCheckOut() < rs.getTime().getCheckIn()) || time.getCheckIn() >= rs.getTime().getCheckOut()) {
                                this.hotelList.get(index).addSreservation(name, time, r);
                                count = 1;
                            }
                        } else {
                            result = true;
                        }
                        break;
                    }
                    if (result && count == 0) {
                        this.hotelList.get(index).addSreservation(name, time, r);
                        break;
                    }
                }
            }
            else if (type==2) {
                for (Room r : this.hotelList.get(index).getDroomList()) {
                    for (Reservation rs : this.hotelList.get(index).getReservationList()) {
                        if (r.getName() == rs.getRoom().getName() && count == 0) {
                            result = false;
                            if ((time.getCheckIn() < rs.getTime().getCheckIn() && time.getCheckOut() < rs.getTime().getCheckIn()) || time.getCheckIn() >= rs.getTime().getCheckOut()) {
                                this.hotelList.get(index).addDreservation(name, time, r);
                                count = 1;
                            }
                        } else {
                            result = true;
                        }
                        break;
                    }
                    if (result && count == 0) {
                        this.hotelList.get(index).addDreservation(name, time, r);
                        break;
                    }
                }
            }
            else if (type==3) {
                for (Room r : this.hotelList.get(index).getEroomList()) {
                    for (Reservation rs : this.hotelList.get(index).getReservationList()) {
                        if (r.getName() == rs.getRoom().getName() && count == 0) {
                            result = false;
                            if ((time.getCheckIn() < rs.getTime().getCheckIn() && time.getCheckOut() < rs.getTime().getCheckIn()) || time.getCheckIn() >= rs.getTime().getCheckOut()) {
                                this.hotelList.get(index).addEreservation(name, time, r);
                                count = 1;
                            }
                        } else {
                            result = true;
                        }
                        break;
                    }
                    if (result && count == 0) {
                        this.hotelList.get(index).addEreservation(name, time, r);
                        break;
                    }
                }
            }
        }
    }
    public void addDiscount(int index, String DiscountCode){
        int LastElem=this.hotelList.get(index).getReservationList().size()-1;

        this.hotelList.get(index).getReservationList().get(LastElem).setDiscount(DiscountCode);
    }

    public Integer[] getRoomNames(int index){
        int num1 = this.hotelList.get(index).getEroomList().size();
        int num2 = this.hotelList.get(index).getDroomList().size();
        int num3 = this.hotelList.get(index).getSroomList().size();
        Integer[] names = new Integer[num1+num2+num3];
        int i = 0;
        for (Room r : hotelList.get(index).getSroomList()){
            names[i] = r.getName();
            i++;
        }
        for (Room r : hotelList.get(index).getDroomList()){
            names[i] = r.getName();
            i++;
        }
        for (Room r : hotelList.get(index).getEroomList()){
            names[i] = r.getName();
            i++;
        }

        return names;
    }

    public String[] getReservationNames(int index){
        int num = hotelList.get(index).getReservationList().size();
        String[] names = new String[num];
        int i = 0;
        for (Reservation rs : hotelList.get(index).getReservationList()){
            names[i] = rs.getName();
        }

        return names;
    }
}
