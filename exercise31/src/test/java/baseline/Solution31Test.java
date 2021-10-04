package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void math() {
        Solution31 ca = new Solution31();
        ca.setAge(22);
        ca.setIntensity(55);
        ca.setRestingHR(65);
        ca.math();
        double expected = 191.0;
        double actual = ca.Target;
        assertEquals(expected,actual);
    }
}