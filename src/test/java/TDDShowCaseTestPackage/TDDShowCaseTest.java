package TDDShowCaseTestPackage;

import TDDShowCasePackage.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TDDShowCaseTest {

    TimePair aTimePair = new TimePair();

    @Test
    public void timeDifferenceTest_1Std() {
        aTimePair.setTimeValues("10:00", "11:00");
        assertEquals(1.0, aTimePair.getTimeDifference(), 0.0);
    }

    //@Test
    //public void timeDifferenceTest_0Std() {
    //    aTimePair.setTimeValues("11:00", "11:00");
    //    assertEquals(0.0, aTimePair.getTimeDifference(), 0.0);
    //}

}