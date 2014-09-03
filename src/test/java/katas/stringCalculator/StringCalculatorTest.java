package katas.stringCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void addingNumbersInStringGivesExpectedResult() {
		assertAdditionOfInputValuesIsExpectedResult("", 0);
		assertAdditionOfInputValuesIsExpectedResult("1", 1);
		assertAdditionOfInputValuesIsExpectedResult("2", 2);
	}

	private void assertAdditionOfInputValuesIsExpectedResult(String input, int result) {
		StringCalculator stringCalculator = new StringCalculator();
		assertThat(stringCalculator.add(input), is(result));
	}
}