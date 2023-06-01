package Classes;

import Interfaces.iActorBehaviour;

public class SpecialClient extends Actor {
    private final int vipId;
    public SpecialClient(String name, int id) {
        super(name);
        this.vipId = id;
    }

    public int getVipId() {
        return vipId;
    }

    public void setTakeOrder(boolean takeOrder) {super.isTakeOrder = takeOrder;}

    public void setMakeOrder(boolean makeOrder){
        super.isMakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {return super.isMakeOrder;}

    @Override
    public boolean isTakeOrder() {return super.isTakeOrder;}

    @Override
    public Actor getActor() {return this;}

    @Override
    public String getName() {
        return super.name;
    }
}