package by.it_academy.lesson10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Abbreviations {

    Map<String, String> map = new HashMap<>();

    public void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);

    }

    public void hasAbbreviation(String abbreviation) {
        System.out.println(map.containsKey(abbreviation));
    }

    public void findExplanationFor(String abbreviation) {
        System.out.println(map.get(abbreviation));
    }

    public void printAbbreviations() {
        System.out.println(map.keySet());
    }

    public void printAbbreviationsWhere(String text) {

        for (Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getKey());
            } else {
                System.out.println("The entered text is not in the collection");
                break;
            }

        }

    }

    public void printExplanationOfAbbreviationsWhere(String text){
        for (Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }

        }
    }

}
