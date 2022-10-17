package by.it_academy.lesson11.task2;

import java.util.ArrayList;
import java.util.Collection;

public class AverageSensor implements Sensor {

    private Collection<Sensor> sensors = new ArrayList<>();

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (sensors.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int sum = 0;
            int activeSensors = 0;
            for (Sensor sensor : sensors) {
                if(sensor.isOn()){
                    sum += sensor.read();
                    activeSensors++;
                }
            }
            if (activeSensors == 0){
                throw new IllegalStateException();
            } else {
                return sum/activeSensors;
            }
        }
    }
}
