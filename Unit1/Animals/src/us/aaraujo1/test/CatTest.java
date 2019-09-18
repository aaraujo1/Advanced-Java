package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.*;
import us.aaraujo1.Cat;

public class CatTest extends TestCase {
    Cat cat1;

    @Before
    public void setUp() throws Exception {
        cat1 = new Cat(10, "Kitty");
    }

    @Test
    public void testGetMousesKilled() {
        assertEquals("mousesKilled should be 10", 10, cat1.getMousesKilled());
    }

    @Test
    public void testAddMouse() {
        cat1.addMouse();
        assertTrue(cat1.getMousesKilled() == 11);
        cat1.addMouse();
        assertTrue(cat1.getMousesKilled() == 12);
    }

    @Test
    public void testTalk() {
        assertEquals("Cats should meow.", "Meow", cat1.talk());
    }

    @Test
    public void testToString() {
        assertEquals("Cat's name and mouses killed are incorrect.", "Cat: name=Kitty mousesKilled=10", cat1.toString());
    }
}