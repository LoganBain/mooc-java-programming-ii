
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author logan
 */
public class Hand {
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = hand.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
