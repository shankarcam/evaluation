package com.ubs.opsit.interviews;

import com.ubs.opsit.interviews.model.BerlinClockHour;
import com.ubs.opsit.interviews.model.BerlinClockMinutes;

public class BerlinTimeConverter implements TimeConverter {

    @Override
    public String convertTime(String aTime) {

        try {
            BerlinClockHour berlinClockHour = new BerlinClockHour();
            BerlinClockMinutes berlinClockMinutes = new BerlinClockMinutes();

            /*
            //This will throw exception for last test case as the scenario has invalid time
            LocalTime localTime = LocalTime.parse(aTime);
            berlinClockHour.setHour(localTime.getHour());
            berlinClockMinutes.setMinutes(localTime.getMinute());
            return (localTime.getSecond() %2 == 0 ? "Y": "O" )+ "\n"+
                    berlinClockHour.toString() + "\n"+
                    berlinClockMinutes.toString();
            */

            String [] time = aTime.split(":");

            if ( time.length == 3 ) {

                berlinClockHour.setHour(Integer.valueOf(time[0]));
                berlinClockMinutes.setMinutes(Integer.valueOf(time[1]));

                return (Integer.valueOf(time[2]) %2  == 0 ? "Y": "O") + "\n"+
                        berlinClockHour.toString() +"\n" +
                        berlinClockMinutes.toString();

            }
            else return "";
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
