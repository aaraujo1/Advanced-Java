

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.CheckIn;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CheckInTest extends TestCase {
    CheckIn checkIn;

    @Before
    public void setUp() throws Exception {
        checkIn = new CheckIn();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testGetDisplayOption() {
        checkIn.setDisplayOption(1);
        assertEquals(1, checkIn.getDisplayOption());

    }

    @Test
    public void testIsGarageOpen() {
        assertTrue(checkIn.isGarageOpen());
    }
}