package katas.romanNumerals;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConverter {

    private static Map<String, Integer> results = new HashMap<>();
    static {
        results.put("", 0);
        results.put("I", 1);
        results.put("IV", 4);
        results.put("V", 5);
        results.put("IX", 9);
        results.put("X", 10);
        results.put("XL", 40);
    }

    public int convert(String romanNumeral) {
        if (results.containsKey(romanNumeral)) {
            return results.get(romanNumeral);
        }

        return results.get(romanNumeral.substring(0,1))
                + convert(romanNumeral.substring(1));
    }
}