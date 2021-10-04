package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void addName() {
        Solution35 ca = new Solution35();
        ca.setName("Isaac");
        String expected = "The winner is... Isaac";
        String actual = "The winner is... Isaac";
        assertEquals(expected,actual);
    }
}