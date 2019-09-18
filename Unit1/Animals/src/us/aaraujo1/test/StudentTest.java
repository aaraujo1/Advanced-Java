package us.aaraujo1.test;

import junit.framework.TestCase;
import org.junit.*;
import us.aaraujo1.Student;


public class StudentTest extends TestCase {
    Student student1;

    @Before
    public void setUp() throws Exception {
        student1 = new Student(30, "Mike");
    }

    @Test
    public void testGetAge() {
        assertEquals("Age: 30",30,student1.getAge());
    }

    @Test
    public void testSetAge() {
        student1.setAge(40);
        assertEquals("Age: 40",40,student1.getAge());

    }

    @Test
    public void testTalk() {
        assertEquals("Student does not respond correctly.", "Can we talk about my grade.", student1.talk());
    }
}