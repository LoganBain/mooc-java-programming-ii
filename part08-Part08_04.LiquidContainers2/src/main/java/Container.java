/**
 *
 * @author logan
 */
public class Container {
 
    private int contains;
 
    public Container() {
        this.contains = 0;
    }
 
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
 
        this.contains = this.contains + amount;
        if (this.contains > 100) {
            this.contains = 100;
        }
    }
 
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
 
        this.contains = this.contains - amount;
        if (this.contains < 0) {
            this.contains = 0;
        }
    }
 
    public int contains() {
        return this.contains;
    }
 
    @Override
    public String toString() {
        return "" + this.contains + "/100";
    }
 
}
