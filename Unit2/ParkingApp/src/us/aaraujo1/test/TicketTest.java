package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Ticket;

import static org.junit.Assert.*;

public class TicketTest extends TestCase {
    Ticket t;

    @Before
    public void setUp() throws Exception {
        t = new Ticket("102","October 01 2018 - 10:52","October 01 2018 - 14:07","25");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetID() {
        assertEquals(102,t.getID());
    }

    @Test
    public void testGetCheckInTime() {
        assertEquals("October 01 2018 - 10:52",t.getCheckInTime().toString());
    }

    @Test
    public void testGetCheckOutTime() {
        assertEquals("October 01 2018 - 14:07",t.getCheckOutTime().toString());
    }

    @Test
    public void testGetCost() {
        assertEquals(25,t.getCost());
    }

    @Test
    public void testToString() {
        assertEquals("Ticket ID: 102 In: October 01 2018 - 10:52",t.toString());
    }
}