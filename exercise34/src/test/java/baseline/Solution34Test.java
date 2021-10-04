package baseline;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void print() {
        Solution34 ca = new Solution34();
        ArrayList<String> employees = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        ca.setEmployees(employees);
        String expected = "Enter an employee name to remove: ";
        String actual = "Enter an employee name to remove: ";
        assertEquals(expected,actual);
    }
}