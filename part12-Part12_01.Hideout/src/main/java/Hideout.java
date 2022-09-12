
/**
 *
 * @author logan
 */
public class Hideout<T> {
    private T hidden;
    
    public Hideout() {}
    
    public void putIntoHideout(T toHide) {
        this.hidden = toHide;
    }  
    
    public T takeFromHideout() {
        T toReturn = this.hidden;
        this.hidden = null;
        return toReturn;
    }
    
    public boolean isInHideout() {
        if (this.hidden == null) {
            return false;
        }
        return true;
    }
    
}
