package katas.romanNumerals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RomanNumeralsConverterTest {

    @Test
    public void emptyStringConvertsToZero() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertThat(romanNumeralsConverter.convert(""), is(equalTo(0)));
    }

    @Test
    public void romanNumeralIConvertsToOne() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertThat(romanNumeralsConverter.convert("I"), is(equalTo(1)));
    }
}