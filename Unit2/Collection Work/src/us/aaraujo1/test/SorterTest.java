package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import us.aaraujo1.Sorter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SorterTest extends TestCase {
    Sorter s;

    @Before
    public void setUp() throws Exception {
        s = new Sorter();
        Map<String, Integer> m = new HashMap<>();
        m.put("test1",1);
        m.put("test0",0);
        s.setTreeMap(m);
        s.setList(s.getTreeMap());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetTreeMap() {
        assertEquals("test0=0", s.getTreeMap().firstEntry().toString());
    }

    @Test
    public void testGetList() {
        assertEquals("test0=0", s.getList().get(0).toString());
    }

    @Test
    public void testSortListByValue() {
        s.sortListByValue();
        assertEquals("test1=1", s.getList().get(0).toString());
    }
}