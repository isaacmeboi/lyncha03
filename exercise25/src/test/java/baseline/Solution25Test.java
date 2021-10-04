package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    @Test
    void passwordValidator() {
        Solution25 ca = new Solution25();
        String input = "peepee";
        String i = "peepee";
        String expected = ca.setI(i);
        String actual = ca.passwordValidator(input);
        assertEquals(expected,actual);

    }
}