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
                "V, 5",
                "X, 10",
                "L, 50",
                "C, 100",
                "D, 500",
                "M, 1000"})
    public void romanNumeralConvertsToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }

    @Test
    @Parameters({"II, 2",
                "III, 3",
                "IV, 4"})
    public void additionRomanNumeralsConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }
}