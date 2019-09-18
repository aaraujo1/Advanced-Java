package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.*;
import us.aaraujo1.Dog;


public class DogTest extends TestCase {
    Dog dog1;

    @Before
    public void setUp() throws Exception {
        dog1 = new Dog (true, "Doggy");
    }

    @Test
    public void testIsFriendly() {
        assertTrue("Dog is friendly", dog1.isFriendly());

    }

    @Test
    public void testTalk() {
        assertEquals("Dogs should bark","Bark",dog1.talk());
    }

    @Test
    public void testToString() {
        assertEquals("Dog's disposition and name are incorrect.", "Dog: name=Doggy friendly=true", dog1.toString());
    }
}