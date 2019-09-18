package lab2;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntroJavaCourseTest extends TestCase {
    IntroJavaCourse ijc;

    @Before
    public void setUp() throws Exception {
        ijc = new IntroJavaCourse("test", "123", 1.0, "testIntro");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetPrerequisites() {
        assertEquals("testIntro", ijc.getPrerequisites());
    }

    @Test
    public void testSetPrerequisites() {
        ijc.setPrerequisites("testIntro2");

        assertEquals("testIntro2", ijc.getPrerequisites());
        assertNotEquals("testIntro", ijc.getPrerequisites());
    }

    @Test
    public void testSetPrerequisitesError() {
        try{
            ijc.setPrerequisites("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: prerequisites cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCourseName() {
        assertEquals("test", ijc.getCourseName());
    }

    @Test
    public void testSetCourseName() {
        ijc.setCourseName("test2");

        assertEquals("test2", ijc.getCourseName());
        assertNotEquals("test", ijc.getCourseName());
    }

    @Test
    public void testSetCourseNameError() {
        try{
            ijc.setCourseName("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: courseName cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCourseNumber() {
        assertEquals("123", ijc.getCourseNumber());
    }

    @Test
    public void testSetCourseNumber() {
        ijc.setCourseNumber("456");

        assertEquals("456", ijc.getCourseNumber());
        assertNotEquals("123", ijc.getCourseNumber());
    }

    @Test
    public void testSetCourseNumberError() {
        try{
            ijc.setCourseNumber("");
        }catch (IllegalArgumentException e){
            assertEquals("Error: courseNumber cannot be null or empty string",e.getMessage());
        }
    }

    @Test
    public void testGetCredits() {
        assertEquals(1.0, ijc.getCredits());
    }

    @Test
    public void testSetCredits() {
        ijc.setCredits(4.0);
        assertEquals(4.0, ijc.getCredits());
        assertNotEquals(1.0, ijc.getCredits());
    }

    @Test
    public void testSetCreditsError() {
        try{
            ijc.setCredits(6.0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Error: credits must be in the range 0.5 to 4.0",e.getMessage());
        }
    }

    @Test
    public void testToString() {
        assertEquals("test is course #123. It is worth 1.0 credits. You need to take testIntro first.", ijc.toString());
    }
}