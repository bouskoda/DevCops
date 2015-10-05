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
                "IX,    9"})
    public void romanNumeralAdditionBelowTenConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }

    @Test
    @Parameters({"XXI,  21",
                "XXII,  22",
                "XXIV,  24",
                "XXVI,  26",
                "XXIX,  29"})
    public void romanNumeralAdditionOfTwentiesConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }

    @Test
    @Parameters({"XXX,  30",
                "XL,    40",
                "LX,    60",
                "LXX,   70",
                "LXXX,  80",
                "XC,    90"})
    public void romanNumeralMultiplesOfTenConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }

    @Test
    @Parameters({"CC,   200",
                "CCC,   300",
                "CD,    400",
                "DC,    600",
                "DCC,   700",
                "DCCC,  800",
                "CM,    900"})
    public void romanNumeralHundredsConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }

    @Test
    @Parameters({"DCCCXLVI, 846",
                "MCMXCIX,   1999",
                "MMVIII,    2008"})
    public void largeRomanNumeralsConvertToExpectedArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertThat(romanNumeralsConverter.convert(romanNumeral)).isEqualTo(expectedArabicNumber);
    }
}