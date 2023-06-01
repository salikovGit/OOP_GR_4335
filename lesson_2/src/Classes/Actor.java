package Classes;

import Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

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