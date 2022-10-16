package by.it_academy.lesson11.task2;

import java.util.concurrent.ThreadLocalRandom;

public class StandartSensor implements Sensor {

    private final int value;

    public StandartSensor(int value) {
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return value;
    }
}
