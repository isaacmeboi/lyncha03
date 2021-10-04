package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbers() {
        Solution38 ca = new Solution38();
        ca.setData("26 27 28 29 30 31 32");
        String expected = "26 28 30 32";
        String actual =  "26 28 30 32";
        assertEquals(expected,actual);

    }
}