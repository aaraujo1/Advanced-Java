package lab2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is responsible to test an AdvancedJavaCourse object.
 *
 * @author andregaraujo
 * @version 1.1
 */

public class AdvancedJavaCourseTest extends TestCase {
AdvancedJavaCourse ajc;

    @Before
    public void setUp() throws Exception {
        ajc = new AdvancedJavaCourse("test", "123", 1.0, "testIntro");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetPrerequisites() {
        assertEquals("testIntro", ajc.getPrerequisites());
    }

    @Test
    public void testSetPrerequisites() {
        ajc.setPrerequisites("testIntro2");

        assertEquals("testIntro2", ajc.getPrerequisites());
        assertNotEquals("testIntro", ajc.getPrerequisites());
    }

    @Test
    public void testSetPrerequisitesError() {
        try{
            ajc.setPrerequisites("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: prerequisites cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCourseName() {
        assertEquals("test", ajc.getCourseName());
    }

    @Test
    public void testSetCourseName() {
        ajc.setCourseName("test2");

        assertEquals("test2", ajc.getCourseName());
        assertNotEquals("test", ajc.getCourseName());
    }

    @Test
    public void testSetCourseNameError() {
        try{
            ajc.setCourseName("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: courseName cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals("123", ajc.getCourseNumber());
    }

    @Test
    public void testSetCourseNumber() {
        ajc.setCourseNumber("456");

        assertEquals("456", ajc.getCourseNumber());
        assertNotEquals("123", ajc.getCourseNumber());
    }

    @Test
    public void testSetCourseNumberError() {
        try{
            ajc.setCourseNumber("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: courseNumber cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCredits() {
        assertEquals(1.0, ajc.getCredits());
    }

    @Test
    public void testSetCredits() {
        ajc.setCredits(4.0);
        assertEquals(4.0, ajc.getCredits());
        assertNotEquals(1.0, ajc.getCredits());
    }

    @Test
    public void testSetCreditsError() {
        try{
            ajc.setCredits(6.0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Error: credits must be in the range 0.5 to 4.0",e.getMessage());
        }
    }

    @Test
    public void testToString() {
        assertEquals("test is course #123. It is worth 1.0 credits. You need to take testIntro first.", ajc.toString());
    }

}