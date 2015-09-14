package katas.roman_numerals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RomanNumeralConverterTest {
    private RomanNumeralConverter romanNumeralConverter = new RomanNumeralConverter();

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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

    @Test
    public void incorrectFormatForRomanNumeralIIII() throws InvalidInputException {
        expectedException.expect(InvalidInputException.class);
        expectedException.expectMessage("Invalid input for roman numeral I: IIII");

        romanNumeralConverter.convert("IIII");
    }
}