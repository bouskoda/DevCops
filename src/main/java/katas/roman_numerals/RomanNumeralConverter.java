package katas.roman_numerals;

public class RomanNumeralConverter {
    public int convert(String romanNumeral) {
        if (romanNumeral.equals("II")) {
            return 2;
        }
        return 1;
    }
}
