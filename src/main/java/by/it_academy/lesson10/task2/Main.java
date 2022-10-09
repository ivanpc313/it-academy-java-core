package by.it_academy.lesson10.task2;

public class Main {

    public static void main(String[] args) {

        Abbreviations var1 = new Abbreviations();
        var1.addAbbreviation("СССР", "Союз Советский Социалистичских Республик");
        var1.addAbbreviation("МИД", "Министерство инностранных дел");
        var1.addAbbreviation("ГЭС", "Гидроэлектростанция");
        var1.hasAbbreviation("ГЭСc");
        var1.findExplanationFor("МИД");
        var1.printAbbreviations();
        var1.printAbbreviationsWhere("ССсс");
        var1.printExplanationOfAbbreviationsWhere("ИД");

    }
}
