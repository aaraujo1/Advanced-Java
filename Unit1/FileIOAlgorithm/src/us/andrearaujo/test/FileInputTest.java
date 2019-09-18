package us.andrearaujo.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.andrearaujo.FileInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class FileInputTest extends TestCase{

    FileInput fi;

    //to test void method that prints to console
    //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        //using a text file made for testing
        fi = new FileInput("meals_data_test.csv");
        //alter where System.out is
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        //returns System.out back to original
        System.setOut(originalOut);
    }

    @Test
    public void testFileRead() {
        //test void method
        //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
        fi.fileRead();
        //new line needed because fileRead adds one once it hits the end
        assertEquals("Breakfast,test,1000\n",outContent.toString());
    }

    @Test
    public void testFileReadLine() {
        assertEquals("Breakfast,test,1000",fi.fileReadLine());
    }

    @Test
    public void testFileClose() {
        fi.fileClose();
        //file is closed so there is an error, which returns null
        assertNull(fi.fileReadLine());
    }
}