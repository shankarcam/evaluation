package com.ubs.opsit.interviews;


/*
    Unit test cases for BerlinClcokHourTest
 */

import com.ubs.opsit.interviews.model.BerlinClockHour;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BerlinClockHourTest {

    @Test
    public void testZeroHour() {
        String berlinHour = "OOOO\nOOOO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(0);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testOneHour() {
        String berlinHour = "OOOO\nROOO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(1);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testTwoHour() {
        String berlinHour = "OOOO\nRROO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(2);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testThreeHour() {
        String berlinHour = "OOOO\nRRRO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(3);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testFourHour() {
        String berlinHour = "OOOO\nRRRR";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(4);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testFiveHour() {
        String berlinHour = "ROOO\nOOOO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(5);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testSixHour() {
        String berlinHour = "ROOO\nROOO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(6);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testSevenHour() {
        String berlinHour = "ROOO\nRROO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(7);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testEightHour() {
        String berlinHour = "ROOO\nRRRO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(8);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }
    @Test
    public void testNineHour() {
        String berlinHour = "ROOO\nRRRR";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(9);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }
    @Test
    public void testTenHour() {
        String berlinHour = "RROO\nOOOO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(10);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }
    @Test
    public void testElevenHour() {
        String berlinHour = "RROO\nROOO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(11);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testTwelveHour() {
        String berlinHour = "RROO\nRROO";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(12);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }

    @Test
    public void testTwentyFourHour() {
        String berlinHour = "RRRR\nRRRR";
        BerlinClockHour berlinClockHour = new BerlinClockHour();
        berlinClockHour.setHour(24);
        assertThat(berlinClockHour.toString()).isEqualTo(berlinHour);

    }
}
