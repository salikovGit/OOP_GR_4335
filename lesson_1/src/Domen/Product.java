package Domen;

public class Product {
    private String name;
    private Double price;

    /**
     * Java Class 'Product' constructor
     * @param name Product name
     * @param price Product price
     */
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n Product " +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}
