package katas.stringCalculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class StringCalculatorTest {
	
	@Test
	public void addingEmptyStringResultsInZero() {
		StringCalculator stringCalculator = new StringCalculator();
		assertThat(stringCalculator.add(""), is(0));
	}
	
	@Test
	public void addingStringWithOneNumberGivesCorrectResult() {
		StringCalculator stringCalculator = new StringCalculator();
		assertThat(stringCalculator.add("1"), is(1));
	}
}