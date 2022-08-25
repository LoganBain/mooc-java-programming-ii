
import java.util.ArrayList;

/**
 *
 * @author logan
 */
public class Herd implements Movable {
    private ArrayList<Movable> movables;
    
    public Herd() {
        movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : movables) {
            movable.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String herd = "";
        for (Movable movable : movables) {
            herd = herd + movable.toString() + "\n";
        }
        return herd;
    }
}
