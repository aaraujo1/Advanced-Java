import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.TicketCostStrategy.HourlyTicketCostStrategy;
import us.aaraujo1.TicketFactory.HourlyTicket;

import static org.junit.Assert.*;

public class HourlyTicketCostStrategyTest extends TestCase {
    HourlyTicketCostStrategy s;

    @Before
    public void setUp() throws Exception {
        s = new HourlyTicketCostStrategy();
        s.setHours(5);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetCostAmount() {
        assertEquals(7, s.getCostAmount());
    }

    @Test
    public void testGetHours() {
        assertEquals(5,s.getHours());
    }
}