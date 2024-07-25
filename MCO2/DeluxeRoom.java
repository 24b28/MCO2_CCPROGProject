package MCO2;

public class DeluxeRoom extends Room{

    public DeluxeRoom(int name, double bPrice){
        super(name,bPrice,2);
    }

    public double getPrice(){
        return super.getbPrice()+(super.getbPrice()*0.20);
    }

    public void setPrice(double bPrice){
        super.setbPrice(bPrice*0.20);
    }
}
