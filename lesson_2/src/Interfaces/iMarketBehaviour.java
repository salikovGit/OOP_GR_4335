package Interfaces;

import java.util.List;
import Classes.Actor;

public interface iMarketBehaviour {

    /**
     * Java interface method accepts the visitor to the market
     * @param actor Instance of class Actor
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Java interface method releases visitors from the market
     * @param actors List of visitors
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * Updates clietns' and market's state
     */
    void update();

    /**
     * This method makes market to accepts clients' returns
     */
    void returnOrder();

    /**
     * This method checks whether the client can take part in promotion
     */
    void checkPromotion();
}