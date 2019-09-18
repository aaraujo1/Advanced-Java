

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Calculate;
import us.aaraujo1.TicketFactory.OldTicket;
import us.aaraujo1.TicketFactory.Ticket;


import java.util.ArrayList;
import java.util.TreeMap;

public class CalculateTest extends TestCase {

    Calculate c;
    ArrayList<Ticket> ticketArrayList;
    TreeMap<Integer, Ticket> ticketTreeMap;
    Ticket t1;
    Ticket t2;
    Ticket t3;

    @Before
    public void setUp() throws Exception {
        c = Calculate.getInstance();

        t1 = new OldTicket("101","October 01 2018 - 10:52","October 01 2018 - 14:07","6","HOURLY", "false");
        t2 = new OldTicket("102","October 01 2018 - 10:52","October 01 2018 - 14:07","20","SPECIAL", "false");
        t3 = new OldTicket("103","October 01 2018 - 10:52","October 01 2018 - 14:07","25","HOURLY", "true");

        ticketArrayList = new ArrayList<>();
        ticketArrayList.add(t1);
        ticketArrayList.add(t2);
        ticketArrayList.add(t3);

        ticketTreeMap = new TreeMap<>();
        ticketTreeMap.put(1, t1);
        ticketTreeMap.put(2, t2);
        ticketTreeMap.put(3, t3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetInstance() {
        assertNotNull(c.getInstance());
    }


    @Test
    public void testGetDuration() {
        assertEquals(3,c.getDuration(t1).toHours());
    }


    @Test
    public void testTotalHourlyTodayTickets() {
        assertEquals(6,c.totalHourlyTodayTickets(ticketArrayList)[0]);
    }

    @Test
    public void testTotalSpecialTodayTickets() {
        assertEquals(20,c.totalSpecialTodayTickets(ticketArrayList)[0]);
    }

    @Test
    public void testTotalLostTickets() {
        assertEquals(25,c.totalLostTickets(ticketArrayList)[0]);
    }

    @Test
    public void testTotalTickets() {
        assertEquals(51, c.totalTickets(ticketTreeMap));

    }
}