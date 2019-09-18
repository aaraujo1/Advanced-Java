import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.TicketCostStrategy.SpecialTicketCostStrategy;

import static org.junit.Assert.*;

public class SpecialTicketCostStrategyTest extends TestCase {

    SpecialTicketCostStrategy s;

    @Before
    public void setUp() throws Exception {
        s = new SpecialTicketCostStrategy();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetCostAmount() {
        assertEquals(20, s.getCostAmount());
    }
}