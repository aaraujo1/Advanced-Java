import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCharacterTest  {
    Character c;

    @Before
    public void setUp() throws Exception {
        c = new BasicCharacter("Tester");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertEquals("Tester", c.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(0, c.getHealth(), 0);
    }
}