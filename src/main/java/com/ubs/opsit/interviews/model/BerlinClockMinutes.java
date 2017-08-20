package com.ubs.opsit.interviews.model;

import org.apache.commons.lang.ArrayUtils;

public class BerlinClockMinutes {

    private char[] fiveMinutesIndicator = {'O','O','O','O','O','O','O','O','O','O','O'};
    private char[] oneMinuteIndicator = {'O','O','O','O'};

    public void setMinutes ( Integer minutes) {

        if ( minutes < 0 || minutes > 59 ) {
            throw new RuntimeException("Invalid minutes. Expecting minutes between 0 and 59");
        }

        //Turn on Y indicator for every 5 minutes elapsed.
        for ( int i = 0 ; i < minutes / 5; i++) {
            fiveMinutesIndicator[i] = 'Y';
        }

        //Turn on R indicator for every 15 minutes elapsed
        for ( int i = 1; i <= minutes / 15; i++) {
            fiveMinutesIndicator[ (i * 3) -1] = 'R';
        }

        //Turn on Y indiator for every minute elapsed
        for ( int i = 0 ; i < minutes % 5 ; i ++) {
            oneMinuteIndicator[i] = 'Y';
        }
    }

    @Override
    public String toString() {
        return  String.valueOf(fiveMinutesIndicator) +
                "\n" +
                String.valueOf(oneMinuteIndicator);
    }
}
