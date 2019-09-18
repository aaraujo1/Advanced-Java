import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubjectTest  {
    Subject s;

    @Before
    public void setUp() throws Exception {
        s = new Subject();
        s.setState(100);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getState() {
        assertEquals(100, s.getState());
    }
}