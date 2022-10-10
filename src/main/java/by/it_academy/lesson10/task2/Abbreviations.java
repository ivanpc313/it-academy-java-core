package by.it_academy.lesson10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Abbreviations {

    Map<String, String> map = new HashMap<>();

    public void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return map.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }

    public void printAbbreviations() {
        System.out.println(map.keySet());
    }

    public void printAbbreviationsWhere(String text) {
        for (Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getKey());
            }
        }

    }

    public void printExplanationOfAbbreviationsWhere(String text) {
        for (Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }

}
