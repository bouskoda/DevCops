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
        results.put("M", 1000);
    }

    public int convert(String romanNumeral) {
        if (romanNumeral.length() > 2) {
            return  3;
        }

        if (romanNumeral.length() > 1) {
            return 2;
        }

        return results.get(romanNumeral);
    }
}