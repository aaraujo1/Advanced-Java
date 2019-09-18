package us.aaraujo1.enums.test;

import junit.framework.TestCase;
import us.aaraujo1.enums.NFCTeam;


public class NFCTeamTest extends TestCase {
    NFCTeam t;

    @org.junit.Before
    public void setUp() throws Exception {
        t = NFCTeam.GRE;
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testGetTeam() {
        assertEquals("Green Bay Packers",t.getTeam());
    }
}