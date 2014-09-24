package katas.stringCalculator;

public class StringSplitter {
	private static final String SEPARATOR = ",|;";

	public String[] split(String input) {
		return input.split(SEPARATOR);
	}
}