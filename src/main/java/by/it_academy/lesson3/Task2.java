package by.it_academy.lesson3;

public class Task2 {

    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {

            case 'A':
                System.out.println("Distinction");
                break;
            case 'B':
            case 'C':
                System.out.println("First class");
                break;
            case 'D':
                System.out.println("You have passed");
                break;
            case 'F':
                System.out.println("Fail. Try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

    }
}
