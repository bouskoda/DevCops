package katas.romanNumerals;

public class RomanNumeralsConverter {

    public int convert(String romanNumeral) {
        if (romanNumeral.equals("V")) {
            return 5;
        } else {
            return romanNumeral.length();
        }
    }
}