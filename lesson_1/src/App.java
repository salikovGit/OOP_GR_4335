import Domen.BottleOfWater;
import Domen.HotDrink;
import Domen.Product;
import VendingMachine.VendingMachine;

import java.util.ArrayList;

public class App {
    public static ArrayList<Product> Start () {
        Product chips = new Product("Chips", 100.0);
        Product water = new BottleOfWater("Aqua Minerale", 80.0, 500);
        System.out.println(chips);
        System.out.println(water);

        VendingMachine vm = new VendingMachine(10);
        vm.addProduct(chips);
        vm.addProduct(water);
        Product coffee = new HotDrink("Latte", 120.0, 85, 200);
        Product tea = new HotDrink("Earl Gray", 80.0, 90, 400);
        vm.addProduct(coffee);
        vm.addProduct(tea);
        System.out.println(vm);
        return vm.getProducts();
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize(Start());
    }
}
