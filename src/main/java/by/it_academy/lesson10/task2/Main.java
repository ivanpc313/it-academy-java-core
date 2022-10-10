package by.it_academy.lesson10.task2;

public class Main {

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("СССР", "Союз Советский Социалистичских Республик");
        abbreviations.addAbbreviation("МИД", "Министерство инностранных дел");
        abbreviations.addAbbreviation("ГЭС", "Гидроэлектростанция");
        System.out.println("abbreviations.hasAbbreviation(\"ГЭСc\") = " + abbreviations.hasAbbreviation("ГЭСc"));
        System.out.println("abbreviations.findExplanationFor(\"МИД\") = " + abbreviations.findExplanationFor("МИД"));
        abbreviations.printAbbreviations();
        abbreviations.printAbbreviationsWhere("ССсс");
        abbreviations.printAbbreviationsWhere("ССС");
        abbreviations.printExplanationOfAbbreviationsWhere("ИД");

    }
}
