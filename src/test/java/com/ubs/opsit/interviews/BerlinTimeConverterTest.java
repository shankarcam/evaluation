package com.ubs.opsit.interviews;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinTimeConverterTest {

    @Test
    public void testMidNight() {
        String berlinTime = "Y\nOOOO\nOOOO\nOOOOOOOOOOO\nOOOO";
        BerlinTimeConverter berlinTimeConverter = new BerlinTimeConverter();
        assertThat(berlinTimeConverter.convertTime("00:00:00")).isEqualTo(berlinTime);
    }

    @Test
    public void testAfterNoon() {
        String berlinTime = "Y\nRROO\nRROO\nOOOOOOOOOOO\nOOOO";
        BerlinTimeConverter berlinTimeConverter = new BerlinTimeConverter();
        assertThat(berlinTimeConverter.convertTime("12:00:00")).isEqualTo(berlinTime);
    }

    @Test
    public void testAfterNoonInvalid() {
        String berlinTime = "Y\nRROO\nRROO\nOOOOOOOOOOO\nOOOO";
        BerlinTimeConverter berlinTimeConverter = new BerlinTimeConverter();
        assertThat(berlinTimeConverter.convertTime("00:00")).isNotEqualTo(berlinTime);
    }
}
