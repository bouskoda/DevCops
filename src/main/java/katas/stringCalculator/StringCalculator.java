package katas.stringCalculator;

public class StringCalculator {
	private StringSplitter splitter = new StringSplitter();

	public int add(String numbers) {
		int result = 0;
		
		if (numbers.isEmpty()) {
			return result;
		}
		
		for (String number : splitter.split(numbers)) {
			result += Integer.parseInt(number);
		}
		
		return result;
	}
}