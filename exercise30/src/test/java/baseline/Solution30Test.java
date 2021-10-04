package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {

    @Test
    void math() {
        String expected_output = """
                1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t
                2\t4\t6\t8\t10\t12\t14\t16\t18\t20\t22\t24\t
                3\t6\t9\t12\t15\t18\t21\t24\t27\t30\t33\t36\t
                4\t8\t12\t16\t20\t24\t28\t32\t36\t40\t44\t48\t
                5\t10\t15\t20\t25\t30\t35\t40\t45\t50\t55\t60\t
                6\t12\t18\t24\t30\t36\t42\t48\t54\t60\t66\t72\t
                7\t14\t21\t28\t35\t42\t49\t56\t63\t70\t77\t84\t
                8\t16\t24\t32\t40\t48\t56\t64\t72\t80\t88\t96\t
                9\t18\t27\t36\t45\t54\t63\t72\t81\t90\t99\t108\t
                10\t20\t30\t40\t50\t60\t70\t80\t90\t100\t110\t120\t
                11\t22\t33\t44\t55\t66\t77\t88\t99\t110\t121\t132\t
                12\t24\t36\t48\t60\t72\t84\t96\t108\t120\t132\t145\t
                """;
        String actual_output = """
                1\t2\t3\t4\t5\t6\t7\t8\t9\t10\t11\t12\t
                2\t4\t6\t8\t10\t12\t14\t16\t18\t20\t22\t24\t
                3\t6\t9\t12\t15\t18\t21\t24\t27\t30\t33\t36\t
                4\t8\t12\t16\t20\t24\t28\t32\t36\t40\t44\t48\t
                5\t10\t15\t20\t25\t30\t35\t40\t45\t50\t55\t60\t
                6\t12\t18\t24\t30\t36\t42\t48\t54\t60\t66\t72\t
                7\t14\t21\t28\t35\t42\t49\t56\t63\t70\t77\t84\t
                8\t16\t24\t32\t40\t48\t56\t64\t72\t80\t88\t96\t
                9\t18\t27\t36\t45\t54\t63\t72\t81\t90\t99\t108\t
                10\t20\t30\t40\t50\t60\t70\t80\t90\t100\t110\t120\t
                11\t22\t33\t44\t55\t66\t77\t88\t99\t110\t121\t132\t
                12\t24\t36\t48\t60\t72\t84\t96\t108\t120\t132\t144\t
                """;
        assertEquals(expected_output,actual_output);
    }
}