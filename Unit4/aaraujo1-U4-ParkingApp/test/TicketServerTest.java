import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.TicketFactory.OldTicket;
import us.aaraujo1.TicketFactory.Ticket;
import us.aaraujo1.TicketServer;

import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TicketServerTest extends TestCase {
    TicketServer ticketServer;
    ArrayList<Ticket> ticketArrayList;
    TreeMap<Integer, Ticket> ticketTreeMap;
    Ticket t1;
    Ticket t2;
    Ticket t3;

    @Before
    public void testSetUp() throws Exception {
        t1 = new OldTicket("101","October 01 2018 - 10:52","October 01 2018 - 14:07","6","HOURLY", "false");
        t2 = new OldTicket("102","October 01 2018 - 10:52","October 01 2018 - 14:07","20","SPECIAL", "false");
        t3 = new OldTicket("103","October 01 2018 - 10:52","October 01 2018 - 14:07","25","HOURLY", "true");

        ticketArrayList = new ArrayList<>();
        ticketArrayList.add(t1);
        ticketArrayList.add(t2);
        //ticketArrayList.add(t3);

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
        assertNotNull(ticketServer.getInstance());
    }

    @Test
    public void testGetOutdata() {
    }

    @Test
    public void testSetOutdata() {
    }

    @Test
    public void testGetFilename() {
    }

    @Test
    public void testGetIndata() {
    }

    @Test
    public void testSetIndata() {
    }

    @Test
    public void testGetAllTicketsList() {
    }

    @Test
    public void testSetAllTicketsList() {
    }

    @Test
    public void testGetTodayTicketsList() {
    }

    @Test
    public void testSetTodayTicketsList() {
    }

    @Test
    public void loadAllTickets() {
    }

    @Test
    public void testGetTicketFromToday() {
    }

    @Test
    public void addToTodayTicketsList() {

    }
}