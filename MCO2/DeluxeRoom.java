
/**
 * The DeluxeRoom class refers to the deluxe rooms in a hotel.
 * Inherits from the abstract Room class
 */
public class DeluxeRoom extends Room{

    /**
     * Constructs the Room with a unique name and a base price.
     *
     * @param name the unique name of the room
     * @param bPrice the base price of the room
     */
    public DeluxeRoom(int name, double bPrice){
        super(name,bPrice+(bPrice*0.20),2);
    }

    /**
     * Gets the base price of the room.
     *
     * @return the base price
     */
    public double getPrice(){
        return super.getbPrice();
    }

    /**
     * Sets the base price of the room.
     *
     * @param bPrice the base price of the room
     */
    public void setPrice(double bPrice){
        super.setbPrice(bPrice+(bPrice*0.20));
    }
}
