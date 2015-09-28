package katas.romanNumerals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RomanNumeralsConverterTest {
    private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void emptyStringConvertsToZero() {
        assertThat(romanNumeralsConverter.convert(""), is(equalTo(0)));
    }

    @Test
    public void romanNumeralIConvertsToOne() {
        assertThat(romanNumeralsConverter.convert("I"), is(equalTo(1)));
    }

    @Test
    public void romanNumeralIIConvertsToTwo() {
        assertThat(romanNumeralsConverter.convert("II"), is(equalTo(2)));
    }
}