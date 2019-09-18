package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.*;
import us.aaraujo1.FileInput;

import java.io.*;


public class FileInputTest extends TestCase {

    FileInput fi;

    //to test void method that prints to console
    //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @Before
    public void setUp()  {
        //using a text file made for testing
        fi = new FileInput("testFileInput.txt");
        //alter where System.out is
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown()  {
        //returns System.out back to original
        System.setOut(originalOut);
    }


    @Test
    public void testFileRead() {
        //test void method
        //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
        fi.fileRead();
        //new line needed because fileRead adds one once it hits the end
        assertEquals("testName|testTalk\n",outContent.toString());
    }

    @Test
    public void testFileReadLine() {
        assertEquals("testName|testTalk",fi.fileReadLine());
    }

    @Test
    public void testFileClose() {
        fi.fileClose();
        //file is closed so there is an error, which returns null
        assertNull(fi.fileReadLine());
    }

    //test for filename that does not exist
    @Test
    public void testFileInputError() {
        String badFileName = "error.txt";
        new FileInput(badFileName);
        //should print out error
        assertEquals("File Open Error: error.txt java.io.FileNotFoundException: " + badFileName + " (No such file or directory)\n", outContent.toString());
    }
}