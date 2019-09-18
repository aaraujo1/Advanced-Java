import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StuffedTest {
    Character c;

    @Before
    public void setUp() throws Exception {
        c = new Stuffed( new BasicCharacter("Tester"));
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals("Tester The Stuffed", c.getName());
        assertNotEquals("Tester", c.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(3, c.getHealth(), 0);
        assertNotEquals(0, c.getHealth(), 0);
    }
}