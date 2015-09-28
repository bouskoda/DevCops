package katas.roman_numerals;

public class RomanNumeralConverter {
    public int convert(String romanNumeral) {
        return convertMultiplesOfNumeralI(romanNumeral);
    }

    private int convertMultiplesOfNumeralI(String romanNumeral) {
        return romanNumeral.length();
    }
}