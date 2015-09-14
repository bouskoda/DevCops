package katas.roman_numerals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RomanNumeralConverterTest {
    private RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

    @Test
    public void romanNumeralIConvertsToOne() throws InvalidInputException {
        assertThat(romanNumeralConverter.convert("I"), is(equalTo(1)));
    }

    @Test
    public void romanNumeralIIConvertsToTwo() throws InvalidInputException {
        assertThat(romanNumeralConverter.convert("II"), is(equalTo(2)));
    }

    @Test
    public void romanNumeralIIIConvertsToThree() throws InvalidInputException {
        assertThat(romanNumeralConverter.convert("III"), is(equalTo(3)));
    }

    @Test(expected = InvalidInputException.class)
    public void incorrectFormatForRomanNumeralIIII() throws InvalidInputException {
        romanNumeralConverter.convert("IIII");
    }
}