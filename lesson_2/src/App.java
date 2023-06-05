import Classes.*;

public class App {
    public static void main(String[] args) {
        Market market = new Market();

        Actor client1 = new OrdinaryClient("Boris");
        Actor client2 = new OrdinaryClient("Dasha");
        PromotionClient promClient1 = new PromotionClient("Petr", "Black friday");
        PromotionClient promClient2 = new PromotionClient("Alex", "Black friday");
        PromotionClient promClient3 = new PromotionClient("Andy", "Black friday");

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(new TaxService("Audit"));
        market.acceptToMarket(promClient1);
        market.acceptToMarket(promClient2);
        market.acceptToMarket(promClient3);
        PromotionClient.setClientsMaxQuantity(2);

        client1.setReturnOrder(true);
        client2.setReturnOrder(true);
        promClient2.setReturnOrder(true);
        market.update();
    }
}