package katas.stringCalculator;

public class StringCalculator {

	private static final String SEPARATOR = ",|;";

	public int add(String numbers) {
		int result = 0;
		
		if (numbers.isEmpty()) {
			return result;
		}
		
		for (String number : numbers.split(SEPARATOR)) {
			result += Integer.parseInt(number);
		}
		
		return result;
	}
}