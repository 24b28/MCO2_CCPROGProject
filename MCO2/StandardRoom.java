package MCO2;

public class StandardRoom extends Room{

    public StandardRoom(int name, double bPrice){
        super(name,bPrice,1);
    }

    public double getPrice(){
        return super.getbPrice();
    }

    public void setPrice(double bPrice){
        super.setbPrice(bPrice);
    }
}
