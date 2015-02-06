package katas.stringCalculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {
    public int add(String stringToAdd) {
        if (stringToAdd.isEmpty()) {
            return 0;
        }

        String[] numbers = stringToAdd.split(",");
        int total = 0;
        for(String digit : numbers) {
            total += parseInt(digit);
        }
        return total;
    }
}