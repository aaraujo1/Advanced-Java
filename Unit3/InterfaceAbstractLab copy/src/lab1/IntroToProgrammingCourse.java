package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      andregaraujo
 * @version     1.1
 *
 * This class is responsible for an intro to programming course
 * It extends the Course object
 */
public class IntroToProgrammingCourse extends Course {
    //private String courseName;
    //String courseNumber;
    //private double credits;

    /**
     * Constructor for IntroToProgrammingCourse that uses the parent constructor
     * @param courseName name of IntroToProgrammingCourse
     * @param courseNumber number of IntroToProgrammingCourse
     * @param credits number of credits an IntroToProgrammingCourse is worth
     */
    public IntroToProgrammingCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    /*public String getCourseNumber() {
        return courseNumber;
    }*/

    /*public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null of empty string");
            *//*JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");*//*
            //System.exit(0);
        }
        this.courseNumber = courseNumber;
    }*/

    /*public double getCredits() {
        return credits;
    }*/

    /*public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
            *//*JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");*//*
            //System.exit(0);
        }
        this.credits = credits;
    }*/

    /*public String getCourseName() {
        return courseName;
    }*/


    /*public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null of empty string");
            *//*JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");*//*
            //System.exit(0);
        }
        this.courseName = courseName;
    }*/

    
}
