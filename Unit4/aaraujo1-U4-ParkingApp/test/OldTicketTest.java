import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.TicketFactory.OldTicket;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class OldTicketTest extends TestCase {
OldTicket t;

    @Before
    public void setUp() throws Exception {
        t = new OldTicket("103","October 01 2018 - 10:52","October 01 2018 - 14:07","25","HOURLY", "true");

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetId() {
        assertEquals(103, t.getId());
    }

    @Test
    public void testGetCheckInTime() {

        assertEquals(LocalDateTime.parse("2018-10-01T10:52"), t.getCheckInTime());
    }

    @Test
    public void testGetCheckOutTime() {
        t.setCheckOutTime(LocalDateTime.parse("2018-10-01T10:52"));
        assertEquals(LocalDateTime.parse("2018-10-01T10:52"), t.getCheckOutTime());
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