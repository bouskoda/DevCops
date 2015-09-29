package katas.romanNumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    private static Map<String, Integer> results = new HashMap<>();
    static {
        results.put("", 0);
        results.put("I", 1);
        results.put("II", 2);
        results.put("III", 3);
        results.put("IV", 4);
    }

    public int convert(String romanNumeral) {
        return results.get(romanNumeral);
    }
}