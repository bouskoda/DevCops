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
    public void emptyInputGivesResultZero() {
        assertThat(stringCalculator.add(""), is(0));
    }

    @Test
    public void inputWithSingleNumberGivesExpectedResult() {
        assertThat(stringCalculator.add("1"), is(1));
    }

    @Test
    public void commaDelimitedInputAddsValuesCorrectly() {
        assertThat(stringCalculator.add("1,2"), is(3));
    }

    @Test
    public void newLineDelimitedInputAddsValuesCorrectly() {
        assertThat(stringCalculator.add("1\n2"), is(3));
    }

    @Test
    public void commaAndNewLineDelimitedInputAddsValuesCorrectly() {
        assertThat(stringCalculator.add("1\n2,3\n6"), is(12));
    }

    // “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
    @Test
    public void delimiterDefinedInInputAddsValuesCorrectly() {
        assertThat(stringCalculator.add("//:\n1:2:3"), is(6));
    }
}