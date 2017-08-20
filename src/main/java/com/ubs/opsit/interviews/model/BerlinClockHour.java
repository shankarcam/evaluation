package com.ubs.opsit.interviews.model;

import org.apache.commons.lang.ArrayUtils;


public class BerlinClockHour {

    private char[] fiveHourIndicator = {'O','O','O','O'};
    private char[] oneHourIndicator = {'O','O','O','O'};

    public void setHour ( Integer hour) {
        if ( hour < 0 || hour > 24 ) {
            throw new RuntimeException("Invalid Hour. Expecting hour between 0 and 24");
        }

        //Turn on R indicator for every 5 hour elapsed
        for ( int i = 0 ; i < hour / 5; i++) {
            fiveHourIndicator[i] = 'R';
        }

        //Turn on R indicator for every  1 hour elapsed
        for ( int i = 0 ; i < hour % 5 ; i ++) {
            oneHourIndicator[i] = 'R';
        }
    }

    @Override
    public String toString() {
        return  String.valueOf(fiveHourIndicator) +
                "\n" +
                String.valueOf(oneHourIndicator);
    }
}
