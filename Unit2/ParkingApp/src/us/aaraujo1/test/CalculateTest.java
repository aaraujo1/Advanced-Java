package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Calculate;
import us.aaraujo1.Ticket;


import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class CalculateTest extends TestCase {

    Calculate c;
    ArrayList<Ticket> ticketArrayList;
    TreeMap<Integer, Ticket> ticketTreeMap;
    Ticket t1;
    Ticket t2;

    @Before
    public void setUp() throws Exception {
        c = new Calculate();

        t1 = new Ticket("101","October 01 2018 - 10:52","October 01 2018 - 14:07","6");
        t2 = new Ticket("101","October 01 2018 - 10:52","October 01 2018 - 14:07","25");

        ticketArrayList = new ArrayList<>();
        ticketArrayList.add(t1);
        ticketArrayList.add(t2);

        ticketTreeMap = new TreeMap<>();
        ticketTreeMap.put(1, t1);
        ticketTreeMap.put(2, t2);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetDuration() {
        assertEquals(3,c.getDuration(t1.getCheckInTime(),t1.getCheckOutTime()).toHours());
    }

    @Test
    public void testCostPerHour() {
        assertEquals(5,c.costPerHour(2));
    }

    @Test
    public void testLostTicket() {
        assertEquals(25,c.lostTicket());
    }

    @Test
    public void testTotalTodayTickets() {
        assertEquals(6,c.totalTodayTickets(ticketArrayList)[0]);
    }

    @Test
    public void testTotalLostTickets() {
        assertEquals(25,c.totalLostTickets(ticketArrayList)[0]);
    }

    @Test
    public void testTotalTickets() {
        assertEquals(31, c.totalTickets(ticketTreeMap));

    }
}