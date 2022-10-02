package by.it_academy.lesson7.task2;

public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }

    public int value() {
        System.out.println(value);
        return 0;
    }

    public void increase() {
        this.value = value + 1;
    }

    public void decrease() {
        this.value = value - 1;
    }

    public void increase(int increaseBy) {
        this.value = value + increaseBy;
    }

    public void decrease(int decreaseBy){
        this.value = value - decreaseBy;
    }
}
