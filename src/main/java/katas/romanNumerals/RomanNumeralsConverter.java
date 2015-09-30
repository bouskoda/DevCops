package katas.romanNumerals;

import java.util.HashMap;
import java.util.Map;

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
    }

    public int convert(String romanNumeral) {
        return results.get(romanNumeral);
    }
}