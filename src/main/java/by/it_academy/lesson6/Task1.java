package by.it_academy.lesson6;

public class Task1 {

    public static void main(String[] args) {

        String someText = "I love Java!";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = someText.length() - 1; i >= 0; i--) {

            stringBuilder.append(someText.charAt(i));
        }
        System.out.println(stringBuilder);
    }
}
