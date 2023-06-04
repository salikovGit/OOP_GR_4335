package Classes;

public class SpecialClient extends Actor {
    private final int vipId;
    public SpecialClient(String name, int id) {
        super(name);
        this.vipId = id;
    }

    /**
     * SpecialClient class method
     * @return clint's VIP id number
     */
    public int getVipId() {
        return vipId;
    }

    public void setTakeOrder(boolean takeOrder) {super.isOrderTaken = takeOrder;}

    public void setMakeOrder(boolean makeOrder){
        super.isOrderMade = isOrderTaken;
    }

    @Override
    public boolean isOrderMade() {return super.isOrderMade;}

    @Override
    public boolean isOrderTaken() {return super.isOrderTaken;}

    @Override
    public Actor getActor() {return this;}

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder();
    }

    @Override
    public void setReturnOrder(boolean isReturnOrder) {
        super.setReturnOrder(isReturnOrder);
    }

    @Override
    public String getName() {
        return super.name;
    }

}