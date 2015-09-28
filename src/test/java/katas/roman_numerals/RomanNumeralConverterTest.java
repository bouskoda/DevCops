package katas.roman_numerals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RomanNumeralConverterTest {

    @Test
    public void romanNumeralIConvertsToOne() {
        RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

        assertThat(romanNumeralConverter.convert("I"), is(equalTo(1)));
    }
}
