package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Time;

import static org.junit.Assert.*;

public class TimeTest extends TestCase {
    Time t;

    @Before
    public void setUp() throws Exception {
        t = new Time();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRandomCheckInTime() {
        assertNotNull(t.randomCheckInTime());
    }

    @Test
    public void testRandomCheckOutTime() {
        assertNotNull(t.randomCheckOutTime());
    }

    @Test
    public void testStringToLocalDateTime() {
        t.stringToLocalDateTime("October 01 2018 - 14:07");
        assertEquals("October 01 2018 - 14:07", t.toString() );
    }

    @Test
    public void testGetTime() {
        t.stringToLocalDateTime("October 01 2018 - 14:07");
        assertEquals("2018-10-01T14:07", t.getTime().toString());
    }

    @Test
    public void testToString() {
        t.stringToLocalDateTime("October 01 2018 - 14:07");
        assertEquals("October 01 2018 - 14:07",t.toString());
    }
}