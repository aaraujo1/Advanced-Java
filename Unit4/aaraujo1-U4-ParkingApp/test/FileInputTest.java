

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.FileInput;

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
        fi = new FileInput("ticketsTest.csv");
        //alter where System.out is
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        //returns System.out back to original
        System.setOut(originalOut);
    }


    @Test
    public void testFileReadLine() {
        assertEquals("1,101,October 01 2018 - 10:52,October 01 2018 - 14:07,6",fi.fileReadLine());
    }


}