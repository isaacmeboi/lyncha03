package baseline;

import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    @Test
    void TestEmployeeMap() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Solution40.employees.put(101, new Solution40("John","Johnson","Manager", LocalDate.parse("2016-12-31")));
        Solution40.employees.put(102, new Solution40("Tou","Xiong","Software Engineer",LocalDate.parse("2016-10-05")));
        Solution40.employees.put(103, new Solution40("Michaela","Michaelson","District Manager",LocalDate.parse("2015-12-19")));
        Solution40.employees.put(104, new Solution40("Jake","Jacobson","Programmer"));
        Solution40.employees.put(105, new Solution40("Jacquelyn","Jackson","DBA"));
        Solution40.employees.put(106, new Solution40("Sally","Webber","Web Developer",LocalDate.parse("2015-12-18")));

        assertEquals(6, Solution40.employees.size());
        assertEquals(1, Solution40.search("John"));
    }

    @Test
    void TestEmployeeMap2() {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Solution40.employees.put(101, new Solution40("John","Johnson","Manager",LocalDate.parse("2016-12-31")));
        Solution40.employees.put(102, new Solution40("Tou","Xiong","Software Engineer",LocalDate.parse("2016-10-05")));
        Solution40.employees.put(103, new Solution40("Michaela","Johnson","District Manager",LocalDate.parse("2015-12-19")));
        Solution40.employees.put(104, new Solution40("Johnson","Jacobson","Programmer"));

        assertEquals(4, Solution40.employees.size());
        assertEquals(3, Solution40.search("Johnson"));
    }
}