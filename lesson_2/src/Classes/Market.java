package Classes;

import java.util.List;
import java.util.ArrayList;

import Classes.PromotionClient;
import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour,iQueueBehaviour {

    private final List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        checkPromotion();
        takeOrder();
        giveOrder();
        returnOrder();
        releaseFromQueue();
    }

    @Override
    public void returnOrder() {
        for(iActorBehaviour client: queue){
            if(((Actor)(client)).isReturnOrder()){
                System.out.println("Return from client " + client.getActor().getName() + " accepted");
                ((Actor)(client)).setReturnOrder(false);
            }
        }
    }

    @Override
    public void checkPromotion() {
        for(iActorBehaviour client:queue){
            if (client.getClass() == PromotionClient.class) {
                if (((PromotionClient)(client)).getPromotionClintId() <= PromotionClient.getClientsMaxQuantity()){
                    System.out.println(((PromotionClient) client).getName() + " takes part in promotion");
                } else {
                    client = (OrdinaryClient)(client);
                }
            }
        }
    }

    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isOrderMade())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
            if(actor.isOrderTaken())
            {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }



    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isOrderMade())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");
            }
        }

    }

}