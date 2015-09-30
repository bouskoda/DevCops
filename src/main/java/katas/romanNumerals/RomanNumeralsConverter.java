package katas.romanNumerals;

public class RomanNumeralsConverter {

    public int convert(String romanNumeral) {
        int result = 0;

        if (romanNumeral.equals("I")) {
            result = 1;
        }

        if (romanNumeral.equals("V")) {
            result = 5;
        }
        return result;
    }
}