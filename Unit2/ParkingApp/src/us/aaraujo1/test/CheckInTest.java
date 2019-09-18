package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.CheckIn;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CheckInTest extends TestCase {
    CheckIn c;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        c = new CheckIn();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
    }


    @Test
    public void testGetDisplayOption() {
        assertEquals(0,c.getDisplayOption());
    }
}