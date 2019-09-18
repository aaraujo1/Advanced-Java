package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Startup;

import static org.junit.Assert.*;

public class StartupTest extends TestCase {
    Startup s;

    @Before
    public void setUp() throws Exception {
        s=new Startup();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testStartup() {
        assertEquals(3, s.startup().length);
        assertEquals("Bobby Wood is 25 years old", s.startup()[0].toString());
    }
}