package by.it_academy.lesson8.task2;

public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

   public Counter(){
        this(0);
   }

    public int value() {
        return value;
    }

    public void increase() {
       increase(1);
    }

    public void decrease() {
        decrease(1);
    }

    public void increase(int increaseBy) {
        this.value = value + increaseBy;
    }

    public void decrease(int decreaseBy){
        this.value = value - decreaseBy;
    }
}
