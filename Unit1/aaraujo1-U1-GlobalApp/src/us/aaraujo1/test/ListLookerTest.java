package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.ListLooker;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListLookerTest extends TestCase {
    ListLooker ll;
    ArrayList<String[]> a = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
        ll = new ListLooker();

        String[] s1 = {"1","2"};
        String[] s2 = {"1","1"};
        String[] s3 = {"2","2"};
        String[] s4 = {"2","2"};
        String[] s5 = {"3","2"};

        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetStringCount() {
        //ll.getStringCount("1", a);
        assertEquals(2, ll.getStringCount("1", a));
    }

    @Test
    public void testGetUniqueStrings() {
        ll.getUniqueStrings(a);
        ArrayList<String> s = new ArrayList<>(ll.getUniqueStrings(a));
        assertEquals("[1, 2, 3]", s.toString());
    }

    @Test
    public void testGetUniqueArrays() {
        ll.getUniqueArrays(a);
        ArrayList<String[]> s = new ArrayList<>(ll.getUniqueArrays(a));
        assertEquals(4, s.size());
    }
}