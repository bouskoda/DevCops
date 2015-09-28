package katas.romanNumerals;

public class RomanNumeralsConverter {

    public int convert(String romanNumeral) {
        String[] numerals = romanNumeral.split("");
        int result = 0;
        for (String numeral : numerals) {
            result += evaluateNumeral(numeral);
        }

        return result;
    }

    private int evaluateNumeral(String romanNumeral) {
        switch (romanNumeral) {
            case "X":
                return 10;
            case "V":
                return 5;
            case "I":
                return 1;
            default:
                return 0;
        }
    }
}