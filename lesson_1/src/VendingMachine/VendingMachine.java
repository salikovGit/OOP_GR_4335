package VendingMachine;

import Domen.Product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int volume;
    private ArrayList<Product> products;

    /**
     * Java Class 'VendingMachine' constructor
     * @param volume sets Vending machine capacity
     */
    public VendingMachine(int volume) {
        this.volume = volume;
        this.products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "VendingMachine contains products \n" + products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
