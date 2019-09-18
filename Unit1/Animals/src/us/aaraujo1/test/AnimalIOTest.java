package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.*;

import us.aaraujo1.AnimalIO;
import us.aaraujo1.Cat;
import us.aaraujo1.Dog;
import us.aaraujo1.Student;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AnimalIOTest extends TestCase {

    AnimalIO aIO;

    @Before
    public void setUp() throws Exception {
        aIO = new AnimalIO();
    }

    @After
    public void tearDown() throws Exception {
        //System.setIn(System.in);
    }

    //TODO: I can't test these because I can't interact with the console. Instead of doing a weird work around, I will change the add methods to have parameters
    //test to see mousesKilled is an int
    @Test

    public void testAddCat() {
        //String number = "7";
        //System.setIn(new ByteArrayInputStream(number.getBytes()));
        assertTrue(aIO.addCat() instanceof Cat);
    }


    @Test
    public void testAddDog() {
        //String bool = "y";
        //System.setIn(new ByteArrayInputStream(bool.getBytes()));
        assertTrue(aIO.addDog() instanceof Dog);
    }

    //test to see age is an int
    @Test
    public void testAddStudent() {
        //String number = "7";
        //System.setIn(new ByteArrayInputStream(number.getBytes()));
        //String number2 = "7";
        //System.setIn(new ByteArrayInputStream(number2.getBytes()));
        assertTrue(aIO.addStudent() instanceof Student);
    }
}