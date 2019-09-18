package us.andrearaujo.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.andrearaujo.MealType;

import static org.junit.Assert.*;

public class MealTypeTest extends TestCase {

    MealType mt;
    @Before
    public void setUp() throws Exception {
        mt = MealType.DINNER;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetMeal() {
        assertEquals("Dinner",mt.getMeal());
    }

    @Test
    public void testName() {
    }

    @Test
    public void testOrdinal() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testClone() {
    }

    @Test
    public void testCompareTo() {
    }

    @Test
    public void testGetDeclaringClass() {
    }

    @Test
    public void testValueOf() {
    }

    @Test
    public void testFinalize() {
    }
}