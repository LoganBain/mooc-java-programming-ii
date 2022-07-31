
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */
public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> itemsInMaxBox;
    private int maxWeight;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.itemsInMaxBox = new ArrayList<>();
    }
    
    public int currentWeight() {
        int weight = 0;
        for (Item item : this.itemsInMaxBox) {
            weight += item.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Item item) {
        if (currentWeight() + item.getWeight() > this.maxWeight) {
            return;
        }
        this.itemsInMaxBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        if (!this.itemsInMaxBox.contains(item)) {
            return false;
        }
        return true;
    }
    
    
}
