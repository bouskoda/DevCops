package katas.romanNumerals;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class RomanNumeralsConverterTest {
    private RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();

    @Test
    public void emptyStringConvertsToZero() {
        assertThat(romanNumeralsConverter.convert("")).isEqualTo(0);
    }

    @Test
    public void romanNumeralIConvertsToOne() {
        assertThat(romanNumeralsConverter.convert("I")).isEqualTo(1);
    }
}