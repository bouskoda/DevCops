package katas.stringCalculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int add(String stringToAdd) {
        return stringToAdd.isEmpty()? 0 : parseInt(stringToAdd);
    }
}