

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.FileOutput;

import java.io.*;

import static org.junit.Assert.*;

public class FileOutputTest extends TestCase {

    FileOutput fo;

    //to test void method that prints to console
    //SOURCE: https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() throws Exception {
        fo = new FileOutput("ticketsTest copy.csv");
        //alter where System.out is
        fo.out = new BufferedWriter(new OutputStreamWriter(outContent));
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        //returns System.out back to original
        fo.out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("ticketsTest copy.csv")));
        System.setOut(originalOut);
    }

    @Test
    public void testFileWrite() {
        fo.fileWrite("test,test,100");
        fo.fileClose();
        //new line because fileWrite adds one after the string
        assertEquals("test,test,100\n",outContent.toString());
    }

    @Test
    public void testFileClose() {
        fo.fileClose();
        fo.fileWrite("Test closed");
        //if file is closed, should throw this error
        assertEquals("File Write Error: ticketsTest copy.csv java.io.IOException: Stream closed\n",outContent.toString());
    }
}