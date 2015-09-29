package katas.romanNumerals;

public class RomanNumeralsConverter {

    public int convert(String romanNumeral) {
        int result = 0;

        if (romanNumeral.length() >= 1) {
            result += 1;
        }

        if (romanNumeral.length() >= 2) {
            result += 1;
        }

        return result;
    }
}