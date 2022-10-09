package by.it_academy.lesson9.task2;

import java.sql.SQLOutput;

public class Card {

    private int cost;
    private String suit;

    public Card(String suit, int cost) {
        this.suit = suit;
        this.cost = cost;
    }

    @Override
    public String toString() {

        switch (suit) {
            case "CLUB":
                System.out.println(Suit.CLUB.name());
                break;
            case "DIAMOND":
                System.out.println(Suit.DIAMOND.name());
                break;
            case "HEART":
                System.out.println(Suit.HEART.name());
                break;
            case "SPADE":
                System.out.println(Suit.SPADE.name());
                break;
            default:
                System.out.println("Enter the suit");

        }

        switch (cost) {
            case 11:
                System.out.println(" J");
                break;
            case 12:
                System.out.println(" Q");
                break;
            case 13:
                System.out.println(" K");
                break;
            case 14:
                System.out.println(" A");
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println(" " + cost);
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
        return suit;
    }
}
