
/**
 *
 * @author logan
 */
public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;
    
    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }
    
    public void add(Type value) {
        if (firstFreeIndex == this.values.length - 1) {
            this.grow();
        }
        
        this.values[firstFreeIndex] = value;
        firstFreeIndex++;
    }
    
    public boolean contains(Type value) {
        return indexOfValue(value) >= 0;
    }
    
    public Type value(int index) {
        if (index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + firstFreeIndex + "]");
        }
        return this.values[index];
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        
        moveToTheLeft(indexOfValue);
        firstFreeIndex--;
    }
    
    public int size() {
        return this.firstFreeIndex;
    }
    
    private void grow() {
        int newSize = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i <= this.values.length; i++) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }
    
    private int indexOfValue(Type value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (value.equals(this.values[i])) {
                return i;
            }
        }
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
}
