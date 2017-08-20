package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.model.BerlinClockMinutes;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockMinutesTest {

    @Test
    public void testZeroMinutes() {
        String berlinMinutes = "OOOOOOOOOOO\nOOOO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(0);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testOneMinutes() {
        String berlinMinutes = "OOOOOOOOOOO\nYOOO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(1);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testTwoMinutes() {
        String berlinMinutes = "OOOOOOOOOOO\nYYOO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(2);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testThreeMinutes() {
        String berlinMinutes = "OOOOOOOOOOO\nYYYO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(3);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testFourMinutes() {
        String berlinMinutes = "OOOOOOOOOOO\nYYYY";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(4);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testFiveMinutes() {
        String berlinMinutes = "YOOOOOOOOOO\nOOOO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(5);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testSixMinutes() {
        String berlinMinutes = "YOOOOOOOOOO\nYOOO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(6);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testSixteenMinutes() {
        String berlinMinutes = "YYROOOOOOOO\nYOOO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(16);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testThirtyThreeMinutes() {
        String berlinMinutes = "YYRYYROOOOO\nYYYO";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(33);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }

    @Test
    public void testFortyNineMinutes() {
        String berlinMinutes = "YYRYYRYYROO\nYYYY";
        BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();
        berlinClockMinutes.setMinutes(49);
        assertThat(berlinClockMinutes.toString()).isEqualTo(berlinMinutes);
    }
}
