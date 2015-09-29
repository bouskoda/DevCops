package katas.romanNumerals;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class RomanNumeralsConverterTest {

    @Test
    public void emptyStringConvertsToZero() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertThat(romanNumeralsConverter.convert("")).isEqualTo(0);
    }

    @Test
    public void romanNumeralIConvertsToOne() {
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        assertThat(romanNumeralsConverter.convert("I")).isEqualTo(1);
    }
}