
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
public class OneItemBox extends Box {
    private ArrayList<Item> itemInBox;
    private int maxWeight;
    
    public OneItemBox() {
        this.maxWeight = 1;
        this.itemInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.itemInBox.isEmpty()) {
            this.itemInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (!this.itemInBox.contains(item)) {
            return false;
        }
        return true;
    }
}
