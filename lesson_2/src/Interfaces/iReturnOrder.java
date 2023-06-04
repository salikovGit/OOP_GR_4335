package Interfaces;

public interface iReturnOrder {

    /**
     * Java interface iReturnOrder method shows whether the client want to return hid order
     * @return "true" if client want to return his order and "false" if he doesn't
     */
    boolean isReturnOrder ();


    void setReturnOrder(boolean isReturnOrder);

}
