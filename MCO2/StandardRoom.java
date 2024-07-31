
/**
 * The StandardRoom class refers to the standard rooms in a hotel.
 * Inherits from the abstract Room class
 */
public class StandardRoom extends Room{

    /**
     * Constructs the Room with a unique name and a base price.
     *
     * @param name the unique name of the room
     * @param bPrice the base price of the room
     */
    public StandardRoom(int name, double bPrice){
        super(name,bPrice,1);
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
        super.setbPrice(bPrice);
    }
}
