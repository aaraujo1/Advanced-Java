import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.TicketCostStrategy.LostTicketCostStrategy;

import static org.junit.Assert.*;

public class LostTicketCostStrategyTest extends TestCase {

    LostTicketCostStrategy s;

    @Before
    public void setUp() throws Exception {
        s = new LostTicketCostStrategy();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetCostAmount() {
        assertEquals(25, s.getCostAmount());
    }

}