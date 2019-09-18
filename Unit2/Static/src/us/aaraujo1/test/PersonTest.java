package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Person;

import static org.junit.Assert.*;

public class PersonTest extends TestCase {

    Person p;

    @Before
    public void setUp() throws Exception {
        p = new Person("Tim","Weah", 18, 145);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetSpecies() {
        assertEquals(p.getSpecies(), "Human");
    }

    @Test
    public void testGetAlive() {
        assertTrue(p.getAlive());
        assertFalse(!p.getAlive());
    }

    @Test
    public void testToString() {
        assertEquals(p.toString(),"Tim Weah is 18 years old");
    }

    @Test
    public void testAddWeight() {
        assertEquals(p.addWeight(15),160.0);
        assertNotEquals(p.addWeight(15),145.0);
    }

    @Test
    public void testLoseWeight() {

        assertEquals(p.loseWeight(15),130.0);
        assertNotEquals(p.loseWeight(15),145.0);
    }
}