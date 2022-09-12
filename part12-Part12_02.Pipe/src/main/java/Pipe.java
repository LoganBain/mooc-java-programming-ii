
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author logan
 */
public class Pipe<T> {
    
    private List<T> values;
    
    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        if (values.isEmpty()) {
            return null;
        }
        T value = values.get(0);
        values.remove(0);
        return value;
    }
    
    public boolean isInPipe() {
        if (values.isEmpty()) {
            return false;
        }
        return true;
    }
}
