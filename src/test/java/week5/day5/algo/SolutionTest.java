package week5.day5.algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void bracket(){
        Solution sol = new Solution();
        //assertTrue(sol.solveBracket("()()"));
        //assertTrue(sol.solveBracket("(())()"));
        //assertFalse(sol.solveBracket(")()("));
        //assertFalse(sol.solveBracket("(()("));
        assertFalse(sol.solveBracket("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));

    }

}