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
                "II, 2"})
    public void romanNumeralConvertsToExpectedArabicNumber(String romanNumeral, int expectedNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedNumber);
    }
}