package us.aaraujo1;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This class is for the Student object that inherits the Person object and Talkable interface
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * The Student constructor initializes a student's age and name
     *
     * @param age  is the student's age as an integer
     * @param name is the student's name as a String from the Person class
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     * This method gets the age of the student
     *
     * @return age of student as an integer
     */
    public int getAge() {
        return age;
    }

    /**
     * This method sets the private variable age
     *
     * @param age the age of the student as an integer
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Overrides the talk method inherited from the Talkable interface
     *
     * @return the string "Can we talk about my grade."
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
