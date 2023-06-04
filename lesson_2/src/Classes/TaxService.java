package Classes;

import Interfaces.iActorBehaviour;

public class TaxService extends Actor  {

    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Abstract Java class constructor for Market visitors
     *
     * @param name - Name of visitor
     */
    public TaxService(String name) {
        super(name);
    }


    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public boolean isOrderMade() {
        return isMakeOrder;
    }

    @Override
    public boolean isOrderTaken() {
        return isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}