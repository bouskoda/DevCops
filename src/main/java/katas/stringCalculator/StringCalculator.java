package katas.stringCalculator;

import java.util.List;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class StringCalculator {

    private static final String DELIMITER = "\n|,";

    public int add(String stringToAdd) {
        int total = 0;

        if (!stringToAdd.isEmpty()) {
            String[] numbers = stringToAdd.split(DELIMITER);

            List<String> result = doesOptionalDelimiterExist(numbers);

            if (result.size() > 1) {
                String delimiter = result.get(0);
                String stringToSplit = result.get(1);
                numbers = stringToSplit.split(delimiter);
            }

            for (String digit : numbers) {
                total += parseInt(digit);
            }
        }
        return total;
    }

    private List<String> doesOptionalDelimiterExist(String[] input) {
        if (input[0].startsWith("//")) {
            StringTokenizer tokenizer = new StringTokenizer(input[0], "/");
            if (tokenizer.hasMoreElements()) {
                String delimiter = tokenizer.nextElement().toString();
                return asList(delimiter, input[1]);
            }
        }
        return emptyList();
    }
}