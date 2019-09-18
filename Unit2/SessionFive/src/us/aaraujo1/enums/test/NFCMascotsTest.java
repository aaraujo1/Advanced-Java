package us.aaraujo1.enums.test;

import junit.framework.TestCase;
import us.aaraujo1.enums.NFCMascots;


public class NFCMascotsTest extends TestCase {
    NFCMascots m;

    @org.junit.Before
    public void setUp() throws Exception {
        m = NFCMascots.PAC;
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGetMascot() {
        assertEquals("Green Bay Packers",m.getMascot());
    }
}