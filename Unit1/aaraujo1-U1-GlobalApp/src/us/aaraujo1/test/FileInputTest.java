package us.aaraujo1.test;

import junit.framework.TestCase;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.FileInput;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by andrearaujo on 9/10/18
 *
 * This class is for file input
 */

public class FileInputTest extends TestCase {

    FileInput fi;

    //to test void method that prints to console
    //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        //using a text file made for testing
        fi = new FileInput("testInput.csv");
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
        assertEquals("test,test,test,test\n",outContent.toString());
    }

    @Test
    public void testFileReadLine() {
        assertEquals("test,test,test,test",fi.fileReadLine());
    }

    @Test
    public void testFileClose() {
        fi.fileClose();
        //file is closed so there is an error, which returns null
        assertNull(fi.fileReadLine());
    }

    @Test
    public void testFileToArrayList(){
        ArrayList<String[]> test = new ArrayList<>(fi.fileToArrayList());
        assertNotNull(test);
        assertEquals("test",test.get(0)[0]);

    }
}