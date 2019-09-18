package us.andrearaujo.test;

import junit.framework.TestCase;
import org.junit.*;
import us.andrearaujo.MealType;
import us.andrearaujo.MealsArray;
import java.io.*;

import static org.junit.Assert.*;

public class MealsArrayTest extends TestCase {

    MealsArray ma;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        ma = new MealsArray();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(originalOut);
    }

    @Test
    public void testAddElementWithStrings() {
        ma.addElementWithStrings("Dinner", "test", "100");
        assertEquals(ma.getMeals().size(),1);
    }

    @Test
    public void testGetMeals() {
        ma.addElementWithStrings("Dinner", "testGetMeals", "100");
        assertEquals(ma.getMeals().toString(),"[Meals{mealType=DINNER, item='testGetMeals', calories=100}]" );

    }

    @Test
    public void testPrintAllMeals() {
        ma.addElementWithStrings("Dinner", "testPrintAllMeals", "100");
        ma.printAllMeals();
        assertEquals("Meals{mealType=DINNER, item='testPrintAllMeals', calories=100}\n",outContent.toString());

    }

    @Test
    public void testPrintMealsByType() {
        ma.addElementWithStrings("Dinner", "testPrintMealsByType", "100");
        ma.printMealsByType(MealType.DINNER);
        assertEquals("Meals{mealType=DINNER, item='testPrintMealsByType', calories=100}\n",outContent.toString());

    }

    @Test
    public void testPrintByNameSearch() {
        ma.addElementWithStrings("Dinner", "testPrintByNameSearch", "100");
        ma.printByNameSearch("test");
        assertEquals("Meals{mealType=DINNER, item='testPrintByNameSearch', calories=100}\n",outContent.toString());

    }
}