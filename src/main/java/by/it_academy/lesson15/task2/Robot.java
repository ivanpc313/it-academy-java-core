package by.it_academy.lesson15.task2;

import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class Robot implements Runnable {

    private final String name;
    private final int delay;
    private final String actions;


    public Robot(String name, int delay, String actions) {
        this.name = name;
        this.delay = delay;
        this.actions = actions;
    }


    @Override
    public void run() {
        int[] cordinates = new int[]{0, 0};
        Vector vector = new Vector();
        for (int i = 0; i < actions.length(); i++) {
            switch (actions.charAt(i)) {
                case 'L':
                    System.out.println(name + " turns L");
                    vector = vector.left();
                    break;
                case 'R':
                    System.out.println(name + " turns R");
                    vector = vector.right();
                    break;
                case 'F':
                    System.out.println(name + " moves");
                    vector.apply(cordinates);  //как метод apply меняет координаты, если он не принимает цифры
                    break;
                default:
            }
            try {
                TimeUnit.SECONDS.sleep(delay);  //зачем переменная delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " " + Arrays.toString(cordinates));
    }

    private static final class Vector { // не понятно как работает класс, если L и R поворачивают робота на 90 градусов одна
        //из координат всегда будет 0

        private final int x;
        private final int y;

        public Vector(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private Vector() {
            this(0, 1);
        }

        Vector left() {
            return new Vector(-y, x); // не пойму как это соответствует координатам y=0, x = -x
        }

        Vector right() {
            return new Vector(y, -x);
        }

        void apply(int[] cordinates) {
            cordinates[0] += x;
            cordinates[1] += y;
        }
    }
}
