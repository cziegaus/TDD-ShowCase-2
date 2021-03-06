package TDDShowCaseTestPackage;

import static org.junit.Assert.*;

import TDDShowCasePackage.TimePair;
import org.junit.Test;

public class TimePairTest {

    TimePair aTimePair = new TimePair();


    @Test
    public void timeDifferenceTest_1Std() {
        aTimePair.setTimeValues("10:00", "11:00");
        assertEquals(1.0, aTimePair.getTimeDifference(), 0.0);
    }

    @Test
    public void timeDifferenceTest_0Std() {
        aTimePair.setTimeValues("11:00", "11:00");
        assertEquals(0.0, aTimePair.getTimeDifference(), 0.0);
    }

    @Test
    public void timeDifferenceTest_invalidFormat() {
        aTimePair.setTimeValues("33:00", "11:00");

        TimePair.TimePairException aTimePairException = assertThrows(TimePair.TimePairException.class,
                () -> aTimePair.getTimeDifference());

        assertEquals(501, (long) aTimePairException.getMessageNr());
    }
}