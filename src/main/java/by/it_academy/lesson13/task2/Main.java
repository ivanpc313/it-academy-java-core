package by.it_academy.lesson13.task2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread endless = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
            }
        });
        endless.start();

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                endless.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println(thread.getState()); // New
        thread.start();
        System.out.println(thread.getState()); // Runnable
        Thread.sleep(500);
        System.out.println(thread.getState()); // probably Timed waiting
        Thread.sleep(1000);
        System.out.println(thread.getState()); // probably Waiting
        endless.interrupt();
        thread.join();
        System.out.println(thread.getState()); // Terminated
    }
}
