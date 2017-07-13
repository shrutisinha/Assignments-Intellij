package JavaAssignmentDay2.vampire_number.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import JavaAssignmentDay2.vampire_number.solution.FindVampireNumbers;
import java.util.ArrayList;

public class FindVampireNumbersTest {
    private FindVampireNumbers mDigits;
    private ArrayList<Integer> mVampList;
    @Before
    public void init(){
        mDigits =  new FindVampireNumbers();
        mVampList = new ArrayList<>();
    }
    @Test
    public void sameCharsTest1(){
        assertTrue(mDigits.sameChars("abc","abc"));
        assertFalse(mDigits.sameChars(null,null));
        assertTrue(mDigits.sameChars("",""));
        assertTrue(mDigits.sameChars("aabdc","cabad"));
        assertFalse(mDigits.sameChars("abc","bcd"));
    }


    @Test
    public void getCount(){
        mDigits.generate(mVampList,1);
        assertEquals(mDigits.getCount(),0);
        mDigits.generate(mVampList,2);
        assertEquals(mDigits.getCount(),0);
        mDigits.generate(mVampList,0);
        assertEquals(mDigits.getCount(),0);
        mDigits.generate(mVampList,4);
        assertEquals(mDigits.getCount(),7);
        mDigits.generate(mVampList,5);
        assertEquals(mDigits.getCount(),7);
    }
}