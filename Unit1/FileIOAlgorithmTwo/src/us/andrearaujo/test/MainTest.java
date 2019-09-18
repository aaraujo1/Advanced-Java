package us.andrearaujo.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static us.andrearaujo.Main.findAverageRatings;
import static us.andrearaujo.Main.findPurchases;
import static us.andrearaujo.Main.findRatings;

public class MainTest extends TestCase {

    ArrayList<String[]> a = new ArrayList<>();
    int[] test = new int[2];

    @Before
    public void setUp() throws Exception {
        String[] s1 = {"1","2","2"};
        String[] s2 = {"1","1","3"};
        String[] s3 = {"2","2","4"};
        String[] s4 = {"2","2","1"};
        String[] s5 = {"3","2","2"};

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
    public void testFindRatings() {
        findRatings("1", test, a);
        assertEquals("count: ",2, test[1]);
        assertEquals("total: ",3, test[0]);
    }

    @Test
    public void testFindAverageRatings() {
        assertEquals(2,(int)findAverageRatings(10,5));
    }

    @Test
    public void testFindPurchases() {
        findPurchases("1", test, a);
        assertEquals("count: ",2, test[1]);
        assertEquals("total: ",5, test[0]);
    }
}