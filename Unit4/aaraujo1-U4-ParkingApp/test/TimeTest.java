

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class TimeTest extends TestCase {
    Time t;

    @Before
    public void setUp() throws Exception {
        t = Time.getInstance();
        t.setTime(LocalDateTime.parse("December 04 2018 - 07:49", DateTimeFormatter.ofPattern("MMMM dd yyyy - HH:mm")));
        //t.setTime(LocalDateTime.now());
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

        assertEquals(LocalDateTime.parse("2018-12-04T07:49"),  t.stringToLocalDateTime("December 04 2018 - 07:49"));
    }

    @Test
    public void testGetTime() {
        t.stringToLocalDateTime("December 04 2018 - 07:49");
        assertEquals("2018-12-04T07:49", t.getTime().toString());
    }

    @Test
    public void testToString() {
        t.stringToLocalDateTime("December 04 2018 - 07:49");
        assertEquals("December 04 2018 - 07:49",t.toString());
    }

    @Test
    public void testGetInstance() {
        assertNotNull(t.getInstance());
    }


    @Test
    public void testLocalDateTimeToString() {
        assertEquals("December 04 2018 - 07:49", t.localDateTimeToString(LocalDateTime.parse("2018-12-04T07:49")));
    }


}