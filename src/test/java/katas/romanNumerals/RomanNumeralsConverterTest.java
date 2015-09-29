package katas.romanNumerals;

import org.junit.Test;

import static org.assertj.core.api.StrictAssertions.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

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

    @Test
    public void romanNumeralIIConvertsToTwo() {
        assertThat(romanNumeralsConverter.convert("II")).isEqualTo(2);
    }

    @Test
    public void romanNumeralIIIConvertsToThree() {
        assertThat(romanNumeralsConverter.convert("III")).isEqualTo(3);
    }
}