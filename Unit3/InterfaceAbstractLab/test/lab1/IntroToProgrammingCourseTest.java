package lab1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is responsible to test an IntroToProgrammingCourse object.
 *
 * @author andregaraujo
 * @version 1.1
 */
public class IntroToProgrammingCourseTest extends TestCase {
    IntroToProgrammingCourse itp;

    @Before
    public void setUp() throws Exception {
        itp = new IntroToProgrammingCourse("test", "123", 1.0);
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testGetCourseName() {
        assertEquals("test", itp.getCourseName());
    }

    @Test
    public void testSetCourseName() {
        itp.setCourseName("test2");

        assertEquals("test2", itp.getCourseName());
        assertNotEquals("test", itp.getCourseName());
    }

    @Test
    public void testSetCourseNameError() {
        try{
            itp.setCourseName("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: courseName cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals("123", itp.getCourseNumber());
    }

    @Test
    public void testSetCourseNumber() {
        itp.setCourseNumber("456");

        assertEquals("456", itp.getCourseNumber());
        assertNotEquals("123", itp.getCourseNumber());
    }

    @Test
    public void testSetCourseNumberError() {
        try{
            itp.setCourseNumber("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: courseNumber cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCredits() {
        assertEquals(1.0, itp.getCredits());
    }

    @Test
    public void testSetCredits() {
        itp.setCredits(4.0);
        assertEquals(4.0, itp.getCredits());
        assertNotEquals(1.0, itp.getCredits());
    }

    @Test
    public void testSetCreditsError() {
        try{
            itp.setCredits(6.0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Error: credits must be in the range 0.5 to 4.0",e.getMessage());
        }
    }

    @Test
    public void testToString() {
        assertEquals("test is course #123. It is worth 1.0 credits.", itp.toString());
    }
}