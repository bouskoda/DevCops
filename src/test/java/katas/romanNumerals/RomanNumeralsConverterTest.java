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
    @Parameters({"II,   2",
                "III,   3",
                "IV,    4",
                "VI,    6",
                "VII,   7",
                "VIII,  8",
                "IX,    9",
                "XI,    11",
                "XXII,  22",
                "XXIV,  24",
                "XXVI,  26",
                "XXIX,  29",
                "XXX,  30",
                "XL,  40",
                "LX,  60",
                "LXX,  70",
                "LXXX,  80",
                "XC,  90"})
    public void additionRomanNumeralsConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }
}