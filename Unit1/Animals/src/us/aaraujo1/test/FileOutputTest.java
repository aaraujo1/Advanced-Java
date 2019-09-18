package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.*;
import us.aaraujo1.FileOutput;

import java.io.*;


public class FileOutputTest extends TestCase {
    FileOutput fo;

    //to test void method that prints to console
    //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        fo = new FileOutput("testFileOutput.txt");
        //alter where System.out is
        fo.out = new BufferedWriter(new OutputStreamWriter(outContent));
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        //returns System.out back to original
        fo.out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("testFileOutput.txt")));
        System.setOut(originalOut);
    }

    @Test
    public void testFileWrite() {
        fo.fileWrite("test");
        fo.fileClose();
        //new line because fileWrite adds one after the string
        assertEquals("test\n",outContent.toString());

    }

    @Test
    public void testFileClose() {
        fo.fileClose();
        fo.fileWrite("Test closed");
        //if file is closed, should throw this error
        assertEquals("File Write Error: testFileOutput.txt java.io.IOException: Stream closed\n",outContent.toString());
    }

    //test for filename that does not exist
    //this won't work because if a file does not exist, it will create it
    /*
    @Test
    public void testFileOutputError() {
        String badFileName = "error.txt";
        new FileOutput(badFileName);
        //should print out error
        assertEquals("File Open Error: error.txt java.io.FileNotFoundException: " + badFileName + " (No such file or directory)\n", outContent.toString());
    }
    */
}