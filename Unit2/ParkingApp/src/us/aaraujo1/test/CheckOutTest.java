package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.CheckOut;
import us.aaraujo1.Ticket;

import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class CheckOutTest extends TestCase {
    CheckOut c;

    ArrayList<Ticket> ticketArrayList;
    TreeMap<Integer, Ticket> ticketTreeMap;
    Ticket t1;
    Ticket t2;


    @Before
    public void setUp() throws Exception {
        c = new CheckOut();

        t1 = new Ticket("101","October 01 2018 - 10:52","October 01 2018 - 14:07","0");
        t2 = new Ticket("101","October 01 2018 - 10:52","October 01 2018 - 14:07","0");



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
    public void testGetTicketSimulation(){
        //the object should be null
        assertNull(c.getTicketSimulation());
    }

    @Test
    public void testCheckOutTicket() {
        c.checkOutTicket(t1);
        assertEquals(15,t1.getCost());
        assertNotEquals(0,t1.getCost());
    }

    @Test
    public void testLostTicket() {
        c.lostTicket(t2);
        assertEquals(25,t2.getCost());
        assertNotEquals(0,t2.getCost());
    }

    @Test
    public void testGetDisplayOption() {
        assertEquals(0,c.getDisplayOption());
    }
}