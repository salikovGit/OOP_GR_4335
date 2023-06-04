package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isOrderTaken;
    protected boolean isOrderMade;
    protected boolean isReturnOrder;


     public boolean isReturnOrder() {
//            if (this.isReturnOrder()) {
//                System.out.println("Client " + this.getName() + " want to return his order");
//            } else {
//                System.out.println("Client " + this.getName() + " doesn't want to return his order");
//            }
        return this.isReturnOrder;
    }

    public void setReturnOrder(boolean isReturnOrder) {
        this.isReturnOrder = isReturnOrder;
    }

    /**
     * Abstract Java class constructor for Market visitors
     * @param name - Name of visitor
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Java class method
     * @return Visitor's name
     */
    abstract public String getName();
}