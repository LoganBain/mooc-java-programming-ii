
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author logan
 */
public class ShoppingCart {

    private Map<String, Item> products;

    public ShoppingCart() {
        products = new HashMap<>();
    }

    public void add(String product, int price) {
        products.putIfAbsent(product, new Item(product, 0, price));
        products.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;
        for (Item product : products.values()) {
            totalPrice += product.price();
        }
        return totalPrice;
    }

    public void print() {
        for (Item product : products.values()) {
            System.out.println(product);
        }
    }
}
