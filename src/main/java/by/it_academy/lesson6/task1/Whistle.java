package by.it_academy.lesson6.task1;

public class Whistle {

    final private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        System.out.println(sound);
    }
}
