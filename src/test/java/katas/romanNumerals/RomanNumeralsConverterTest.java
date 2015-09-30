package katas.romanNumerals;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.StrictAssertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralsConverterTest {

    @Test
    @Parameters({", 0",
                "I, 1",
                "V, 5",
                "X, 10"})
    public void romanNumeralConvertsToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }
}