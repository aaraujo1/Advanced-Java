

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.CheckOut;
import us.aaraujo1.TicketFactory.OldTicket;
import us.aaraujo1.TicketFactory.Ticket;

import java.util.ArrayList;
import java.util.TreeMap;

import static org.junit.Assert.assertNotEquals;

public class CheckOutTest extends TestCase {
    CheckOut c;



    @Before
    public void setUp() throws Exception {
        c = new CheckOut();

    }

    @After
    public void tearDown() throws Exception {
    }




    @Test
    public void testGetDisplayOption() {
        c.setDisplayOption(1);
        assertEquals(1,c.getDisplayOption());
    }
}