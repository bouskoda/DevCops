package katas.romanNumerals;

public class RomanNumeralsConverter {

    public int convert(String romanNumeral) {
        switch (romanNumeral) {
            case "X":
                return 10;
            case "V":
                return 5;
            default:
                return romanNumeral.length();
        }
    }
}