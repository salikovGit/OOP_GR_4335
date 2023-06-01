package Classes;

import Interfaces.iActorBehaviour;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public Actor getActor() {
        return this;
    }
}