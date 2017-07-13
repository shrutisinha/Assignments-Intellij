package JavaAssignmentDay5.strings_problem.test;

import JavaAssignmentDay5.strings_problem.solution.Regex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**test class
 * Created by zemoso on 13/7/17.
 */
public class RegexTest {
    private Regex r;
    @Before
    public  void init(){
        r = new Regex();
    }
    @Test
    public void checkPattern1() throws Exception {
        assertTrue(r.checkPattern("My name is Sinha."));
        assertFalse(r.checkPattern("#$^%$^."));
        assertTrue(r.checkPattern("A."));
        assertFalse(r.checkPattern("^Whats in name."));
        assertFalse(r.checkPattern("W.$"));
        assertTrue(r.checkPattern("Empty."));
        assertFalse(r.checkPattern(null));
         assertFalse(r.checkPattern(""));
    }
}