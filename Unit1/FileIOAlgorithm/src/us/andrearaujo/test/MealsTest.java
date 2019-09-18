package us.andrearaujo.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.andrearaujo.MealType;
import us.andrearaujo.Meals;

import static org.junit.Assert.*;

public class MealsTest extends TestCase {

    Meals m;

    @Before
    public void setUp() throws Exception {
        m = new Meals(MealType.DINNER, "testMeal", 1000);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetMealType() {
        assertEquals("DINNER",m.getMealType().toString());
    }

    @Test
    public void testGetItem() {
        assertEquals("testMeal",m.getItem());
    }

    @Test
    public void testGetCalories() {
        assertEquals(1000,m.getCalories());
    }

    @Test
    public void testEquals() {
        assertEquals(true, m.equals(m));
    }

    @Test
    public void testHashCode() {
        assertEquals(-1781893898, m.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("Meals{mealType=DINNER, item='testMeal', calories=1000}", m.toString());
    }
}