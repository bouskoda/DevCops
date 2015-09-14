package katas.roman_numerals;

public class RomanNumeralConverter {

    public int convert(String romanNumeral) throws InvalidInputException {
        return convertMultiplesOfNumeralI(romanNumeral);
    }

    private int convertMultiplesOfNumeralI(String romanNumeral) throws InvalidInputException {
        if (romanNumeral.length() > 3) {
            throw new InvalidInputException(String.format("Invalid input for roman numeral 1: %s", romanNumeral));
        }
        return romanNumeral.length();
    }
}