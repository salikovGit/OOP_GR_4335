package Classes;

public class PromotionClient extends OrdinaryClient{

    private static int promotionClintId;
    private static int ClientsQuantity;
    private String promotionName;

    public PromotionClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        ++promotionClintId;
    }


    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }


    public static int getPromotionClintId() {
        return promotionClintId;
    }

    public static int getClientsQuantity() {
        return ClientsQuantity;
    }

    public String getPromotionName() {
        return promotionName;
    }
}
