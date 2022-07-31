
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
public class MisplacingBox extends Box {

    private ArrayList<Item> itemsInMisplacingBox;

    public MisplacingBox() {
        this.itemsInMisplacingBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.itemsInMisplacingBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
