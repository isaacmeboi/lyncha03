package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {

    @Test
    void calculateMonthsUntilPaidOff() {
        Solution26 ca = new Solution26();
        ca.setApr(.12);
        ca.setB(5000);
        ca.setP(100);
        int expected = 70;
        int actual = ca.calculateMonthsUntilPaidOff(5000,.12,100);
        assertEquals(expected,actual);
    }
}