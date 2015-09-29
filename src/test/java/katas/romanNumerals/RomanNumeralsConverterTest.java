package katas.romanNumerals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.StrictAssertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralsConverterTest {

    private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    @Parameters({", 0",
                "I, 1",
                "II, 2",
                "III, 3",
                "IV, 4",
                "V, 5",
                "VI, 6",
                "VII, 7",
                "VIII, 8",
                "IX, 9"})
    public void romanNumeralConvertsToExpectedArabicNumber(String romanNumeral, int expectedNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedNumber);
    }
}