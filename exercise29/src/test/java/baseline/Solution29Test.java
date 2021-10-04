package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void loop() {
        Solution29 ca = new Solution29();
        ca.setR(4);
        int expected = 18;
        int actual = ca.math();
        assertEquals(expected,actual);
    }
}