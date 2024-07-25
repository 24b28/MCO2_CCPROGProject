package MCO2;

/**
 * The room class refers to the rooms in a hotel.
 * It has a name and a price.
 * The rooms can also be reserved/booked.
 */
public abstract class Room {
    private int name;
    private double bPrice;
    private int type;

    /**
     * Constructs the Room with a unique name and a base price.
     *
     * @param name the unique name of the room
     * @param bPrice the base price of the room
     */
    public Room(int name, double bPrice, int type){
        this.name = name;
        this.bPrice = bPrice;
        this.type = type;
    }

    /**
     * Gets the name of the room.
     *
     * @return the name of the room
     */
    public int getName(){
        return this.name;
    }

    /**
     * Gets the base price of the room.
     *
     * @return the base price
     */
    public double getbPrice(){
        return this.bPrice;
    }

    /**
     * Sets the base price of the room.
     *
     * @param bPrice the new base price
     */
    public void setbPrice(double bPrice){
        this.bPrice = bPrice;
    }

    public int getId(){
        return this.type;
    }
}
