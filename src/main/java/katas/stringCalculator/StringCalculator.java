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
            List<String> result = splitOnDelimiter(stringToAdd);

            for (int digit : deriveNumbersToAddFrom(result)) {
                total += digit;
            }
        }
        return total;
    }

    private List<String> splitOnDelimiter(String input) {
        if (inputContainsOptionalDelimiter(input)) {
            return splitOnDefinedDelimiter(input);
        }
        return asList(input);
    }

    private boolean inputContainsOptionalDelimiter(String input) {
        return input.startsWith("//");
    }

    private List<String> splitOnDefinedDelimiter(String inputWithDefinedDelimiter) {
        StringTokenizer tokenizer = new StringTokenizer(inputWithDefinedDelimiter, "/\n");

        if (tokenizer.hasMoreElements()) {
            String delimiter = tokenizer.nextElement().toString();
            String stringToSplit = tokenizer.nextElement().toString();
            return asList(delimiter, stringToSplit);
        }
        // should not get to this line
        return emptyList();
    }

    private int[] deriveNumbersToAddFrom(List<String> result) {
        if (result.size() > 1) {
            String delimiter = result.get(0);
            String stringToSplit = result.get(1);
            return extractAsInt(delimiter, stringToSplit);
        }
        return extractAsInt(DELIMITER, result.get(0));
    }

    private int[] extractAsInt(String delimiter, String stringToSplit) {
        String[] splitStrings = stringToSplit.split(delimiter);
        int[] numbersToAdd = new int[splitStrings.length];

        for (int index = 0; index < numbersToAdd.length ; index++) {
            numbersToAdd[index] = parseInt(splitStrings[index]);
        }
        return numbersToAdd;
    }
}