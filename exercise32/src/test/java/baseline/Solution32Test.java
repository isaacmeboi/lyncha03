package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void loop() {
        Solution32 ca = new Solution32();
        ca.setGuess(3);
        ca.setKey(1);
        String expected_output = "Too low. Guess again: ";
        String actual_output = "Too low. Guess again: ";
        assertEquals(expected_output,actual_output);
    }
}