package by.it_academy.lesson11.task2;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {

    private boolean isOn = false;

    @Override
    public boolean isOn() {
        return false;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {
        if (!isOn) {
            throw new IllegalStateException();
        } else {
            return ThreadLocalRandom.current().nextInt(-30, 31);
        }
    }
}
