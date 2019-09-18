import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.TicketFactory.HourlyTicket;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class HourlyTicketTest extends TestCase {
    HourlyTicket t;

    @Before
    public void setUp() throws Exception {
        t = new HourlyTicket(1, LocalDateTime.parse("2018-12-04T07:49"));

    }
    
    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetId() {
        assertEquals(1, t.getId());
    }

    @Test
    public void testGetCheckInTime() {

        assertEquals(LocalDateTime.parse("2018-12-04T07:49"), t.getCheckInTime());
    }

    @Test
    public void testGetCheckOutTime() {
        t.setCheckOutTime(LocalDateTime.parse("2018-12-04T07:49"));
        assertEquals(LocalDateTime.parse("2018-12-04T07:49"), t.getCheckOutTime());
    }

    @Test
    public void testGetCost() {
        t.setCost(1);
        assertEquals(1, t.getCost());
    }

    @Test
    public void testGetTicketType() {
        assertEquals("HOURLY", t.getTicketType().toString());
    }

    @Test
    public void isLost() {
        assertTrue(!t.isLost());
    }
}