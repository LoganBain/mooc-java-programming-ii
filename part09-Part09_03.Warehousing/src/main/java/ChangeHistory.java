
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
public class ChangeHistory {
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        this.changeHistory.add(status);
    }
    
    public void clear() {
        this.changeHistory.clear();
    }
    
    public double maxValue() {
        if (this.changeHistory.size() == 0) {
            return 0;
        }
        double largest = 0;
        for (double value : this.changeHistory) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }
    
    public double minValue() {
        if (this.changeHistory.size() == 0) {
            return 0;
        }
        double smallest = Integer.MAX_VALUE;
        for (double value : this.changeHistory) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }
    
    public double average() {
        if (this.changeHistory.size() == 0) {
            return 0;
        }
        double sum = 0;
        for (double value : this.changeHistory) {
            sum += value;
        }
        return (1.0 * sum / this.changeHistory.size());
    }
    
    @Override
    public String toString() {
        return this.changeHistory.toString();
    }
}
