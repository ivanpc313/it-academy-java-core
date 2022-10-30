package by.it_academy.lesson13.task2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        states();
    }


    private static void states() throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

            }
        };

        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        Thread.sleep(1000);
        System.out.println(thread.getState());
        thread.join();
        System.out.println(thread.getState());
    }


}
