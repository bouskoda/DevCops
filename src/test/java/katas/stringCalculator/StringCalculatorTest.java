package katas.stringCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void emptyStringGivesResultZero() {
        assertThat(stringCalculator.add(""), is(0));
    }

    @Test
    public void addingStringWithSingleNumberGivesCorrectResult() {
        assertThat(stringCalculator.add("1"), is(1));
    }

    @Test
    public void addingStringWithDifferentNumberGivesCorrectResult() {
        assertThat(stringCalculator.add("2"), is(2));
    }
}