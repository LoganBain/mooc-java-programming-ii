package application;

/**
 *
 * @author logan
 */
public class StandardSensor implements Sensor {
    private int value;
    
    public StandardSensor(int sensorValue) {
        this.value = sensorValue;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {} // StandardSensor always on

    @Override
    public void setOff() {} // StandardSensor always on

    @Override
    public int read() {
        return this.value;
    }
    
}
