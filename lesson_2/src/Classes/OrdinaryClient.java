package Classes;

public class OrdinaryClient extends Actor {

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder();
    }

    @Override
    public void setReturnOrder(boolean isReturnOrder) {
        super.setReturnOrder(isReturnOrder);
    }

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isOrderMade = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isOrderTaken = pikUpOrder;
    }

    public boolean isOrderTaken() {
        return super.isOrderTaken;
    }

    public boolean isOrderMade() {
        return super.isOrderMade;
    }

    public Actor getActor() {
        return this;
    }

}