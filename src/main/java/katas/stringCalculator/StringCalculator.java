package katas.stringCalculator;

import static java.lang.Integer.parseInt;

public class StringCalculator {

    private static final String DELIMITER = "\n";

    public int add(String stringToAdd) {
        int total = 0;

        if (! stringToAdd.isEmpty()) {
            String[] numbers = stringToAdd.split(DELIMITER);
            for(String digit : numbers) {
                total += parseInt(digit);
            }
        }
        return total;
    }
}