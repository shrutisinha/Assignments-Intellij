package JavaAssignmentDay5.strings_problem.test;

import JavaAssignmentDay5.strings_problem.solution.Regex;
import org.junit.Test;

import static org.junit.Assert.*;

/**test class
 * Created by zemoso on 13/7/17.
 */
public class RegexTest {
    private Regex r = new Regex();
    @Test
    public void checkPattern1() throws Exception {
        assertTrue(r.checkPattern("My name is Sinha."));
    }
    @Test
    public void checkPattern2() throws Exception {
        assertFalse(r.checkPattern("#$^%$^."));
    }
    @Test
    public void checkPattern3() throws Exception {
        assertTrue(r.checkPattern("A."));
    }
    @Test
    public void checkPattern4() throws Exception {
        assertFalse(r.checkPattern("^Whats in name."));
    }
    @Test
    public void checkPattern5() throws Exception {
        assertFalse(r.checkPattern("W.$"));
    }
    @Test
    public void checkPattern6() throws Exception {
        assertTrue(r.checkPattern("Empty."));
    }
    @Test
    public void checkPattern7() throws Exception {
        assertFalse(r.checkPattern(null));
    }
    @Test
    public void checkPattern8() throws Exception {
        assertFalse(r.checkPattern(""));
    }
}