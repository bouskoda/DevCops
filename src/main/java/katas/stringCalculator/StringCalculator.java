package katas.stringCalculator;

public class StringCalculator {

	public int add(String numbers) {
		int result = 0;
		
		if (numbers.isEmpty()) {
			return result;
		}
		
		for (String number : numbers.split(",|;")) {
			result += Integer.parseInt(number);
		}
		
		return result;
	}
}