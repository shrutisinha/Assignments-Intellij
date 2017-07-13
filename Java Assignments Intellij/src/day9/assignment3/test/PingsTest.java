package day9.assignment3.test;

import day9.assignment3.solution.Pings;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PingsTest {
    private Pings p;
    @Before
    public void init(){
     p=new Pings();
    }
    @Test
    public void pingTest(){
        assertFalse(p.ping("HULULULU",1));
        assertTrue(p.ping("google.com",1));
        assertTrue(p.ping("yahoo.com",5));
        assertFalse(p.ping("",1));
        assertFalse(p.ping(null,1));
    }
}