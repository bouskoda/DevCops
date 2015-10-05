package katas.romanNumerals;

import java.util.*;

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
        List<String> numerals = Arrays.asList(romanNumeral.split(""));
        Iterator<String> numeralsIterator = numerals.iterator();

        int result = 0;
        int lastResult = 0;

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
}