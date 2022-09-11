
package application;

import java.util.Random;

/**
 *
 * @author logan
 */
public class TemperatureSensor implements Sensor {
    
    private int value;
    
    public TemperatureSensor() {
        this.value = 0;
    }

    @Override
    public boolean isOn() {
        if (this.value == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.value = 1;
    }

    @Override
    public void setOff() {
        this.value = 0;
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }
    
}
