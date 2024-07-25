package MCO2;

public class ExecutiveRoom extends Room{

    public ExecutiveRoom(int name, double bPrice){
        super(name,bPrice,3);
    }

    public double getPrice(){
        return super.getbPrice()+(super.getbPrice()*0.35);
    }

    public void setPrice(double bPrice){
        super.setbPrice(bPrice*0.35);
    }
}
