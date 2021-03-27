package TDDShowCasePackage;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimePair {

    private String startTime, endTime;

    public TimePair() { }

    public TimePair(String strStartTime, String strEndTime) {
        setTimeValues(strStartTime, strEndTime);
    }

    public void setTimeValues (String strStartTime, String strEndTime) {
        startTime = strStartTime;
        endTime = strEndTime;
    }

    public double getTimeDifference(String strStartTime, String strEndTime) throws TimePairException {
        setTimeValues(strStartTime, strEndTime);
        return getTimeDifference();
    }

    public double getTimeDifference() throws TimePairException {

        try {
        return (double) (LocalTime.parse(startTime).until(LocalTime.parse(endTime), ChronoUnit.MINUTES)/60.0);
        }
        catch (Exception e) {
            throw new TimePairException(e.getMessage(), 501);
        }
    }

    // Possible Error codes
    // 501: Invalid start time
    // 502: Invalid end time
    // 503: Invalid time period (end time < start time)

 public class TimePairException extends RuntimeException {
        String message = "";
        Long messageNr = 0L;

        public TimePairException (String argMessage, long argMessageNr) {
            super(argMessage);
            message = argMessage;
            messageNr = argMessageNr;
        }
        public String getMessageText() {
            return message;
        }
        public Long getMessageNr() {


            return messageNr;
     }
 }
}
