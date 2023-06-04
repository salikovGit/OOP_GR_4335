package Classes;

public class PromotionClient extends OrdinaryClient{

    private int promotionClintId;
    private static int clientsMaxQuantity = 10;
    private String promotionName;

    /**
     * Java class PromotionClint extends OrdinaryClient
     * @param name - Promotion's client name
     * @param promotionName - name of promotion
     */
    public PromotionClient(String name, String promotionName) {
        super(name);
        this.promotionName = promotionName;
        ++promotionClintId;
    }

    /**
     * This method sets limit of participants in this promotion
     * @param clientsMaxQuantity - max clients quantity in this promo
     */
    public static void setClientsMaxQuantity(int clientsMaxQuantity) {
        PromotionClient.clientsMaxQuantity = clientsMaxQuantity;
    }


    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isOrderMade = makeOrder;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder();
    }

    @Override
    public void setReturnOrder(boolean isReturnOrder) {
        super.setReturnOrder(isReturnOrder);
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isOrderTaken = pickUpOrder;
    }

    /**
     * PromotionClient method
     * @return ID of this promotion client
     */
    public int getPromotionClintId() {
        return promotionClintId;
    }

    /**
     * PromotionClient method
     * @return Limit of participants in this promotion
     */
    public static int getClientsMaxQuantity() {
        return clientsMaxQuantity;
    }

    /**
     * PromotionClient method
     * @return Name of promotion
     */
    public String getPromotionName() {
        return promotionName;
    }
}
