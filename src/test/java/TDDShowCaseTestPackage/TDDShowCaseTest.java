package TDDShowCaseTestPackage;

import TDDShowCasePackage.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TDDShowCaseTest {

    TimeDifference aTimeDifference = new TimeDifference();

    @Test
    public void timeDifferenceTest_1Std() {
        aTimeDifference.setTimeValues("10:00", "11:00");
        assertEquals(1.0, aTimeDifference.getTimeDifference(), 0.0);
    }
}