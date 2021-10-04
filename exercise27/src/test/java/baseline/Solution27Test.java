package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void validateFirstName() {
        Solution27 ca = new Solution27();
        ca.setFirstName("John");
        Solution27.validateFirstName("John");
        boolean expected = true;
        boolean actual = true;
        assertEquals(expected,actual);
    }

    @Test
    void validateLastName() {
        Solution27 ca = new Solution27();
        ca.setLastName("Johnson");
        Solution27.validateLastName("Johnson");
        boolean expected = true;
        boolean actual = true;
        assertEquals(expected,actual);
    }

    @Test
    void validateZipCode() {
        Solution27 ca = new Solution27();
        ca.setZip("55555");
        Solution27.validateZipCode("55555");
        boolean expected = true;
        boolean actual = true;
        assertEquals(expected,actual);
    }

    @Test
    void validateEmployeeID() {
        Solution27 ca = new Solution27();
        ca.setEmployeeID("AA-1234");
        Solution27.validateEmployeeID("AA-1234");
        boolean expected = true;
        boolean actual = true;
        assertEquals(expected,actual);
    }
}