package katas.stringCalculator;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalculatorTest {

    @Test
    public void emptyStringResultsInResultZero() {
        StringCalculator stringCalculator = new StringCalculator();
        assertThat(stringCalculator.add(""), is(0));
    }
}