package katas.romanNumerals;

import java.util.*;

import static java.util.Arrays.asList;

public class RomanNumeralsConverter {

    private static Map<String, Integer> results = new HashMap<>();
    static {
        results.put("", 0);
        results.put("I", 1);
        results.put("V", 5);
        results.put("X", 10);
        results.put("L", 50);
        results.put("C", 100);
        results.put("D", 500);
        results.put("M", 1000);
    }

    public int convert(String romanNumeral) {
        int result = 0;
        int lastResult = 0;

        Iterator<String> numeralsIterator = getRomanNumeralIterator(romanNumeral);
        while (numeralsIterator.hasNext()) {
            int thisResult = results.get(numeralsIterator.next());
            if (thisResult > lastResult) {
                result -= lastResult;
                result += (thisResult - lastResult);
            } else {
                result += thisResult;
            }

            lastResult = thisResult;
        }

        return result;
    }

    private Iterator<String> getRomanNumeralIterator(String romanNumeral) {
        List<String> numerals = asList(romanNumeral.split(""));
        return numerals.iterator();
    }
}