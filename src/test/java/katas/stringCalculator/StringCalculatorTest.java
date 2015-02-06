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
    public void addingCommaSeparatedStringGivesCorrectResult() {
        assertThat(stringCalculator.add("1,2"), is(3));
    }

    @Test
    public void addingNewLineSeparatedStringGivesCorrectResult() {
        assertThat(stringCalculator.add("1\n2"), is(3));
    }

    @Test
    public void addingCommaAndNewLineSeparatedStringGivesCorrectResult() {
        assertThat(stringCalculator.add("1\n2,3\n6"), is(12));
    }
}