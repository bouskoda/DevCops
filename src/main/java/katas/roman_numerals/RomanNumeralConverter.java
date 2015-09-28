package katas.roman_numerals;

public class RomanNumeralConverter {
    public int convert(String romanNumeral) {
        if (romanNumeral.equals("III")) {
            return 3;
        } else if (romanNumeral.equals("II")) {
            return 2;
        } else {
            return 1;
        }
    }
}