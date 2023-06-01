import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new OrdinaryClient("Dasha");
        iActorBehaviour client3 = new SpecialClient("President", 1);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());

        market.update();

        Actor promClient1 = new PromotionClient("Petr1", "Black friday");
        Actor promClient2 = new PromotionClient("Petr2", "Black friday");
        Actor promClient3 = new PromotionClient("Petr3", "Black friday");
        System.out.println(PromotionClient.getPromotionClintId());

    }
}