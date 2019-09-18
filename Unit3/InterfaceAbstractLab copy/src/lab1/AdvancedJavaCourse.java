package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author andregaraujo
 * @version 1.1
 * <p>
 * This class is responsible for an advanced java course
 * It extends the Course object
 */
public class AdvancedJavaCourse extends Course {
    //String courseName;
    //private String courseNumber;
    //private double credits;
    private String prerequisites;

    /**
     * Constructor for AdvancedJavaCourse that uses the parent constructor
     * @param courseName name of AdvancedJavaCourse
     * @param courseNumber number of AdvancedJavaCourse
     * @param credits number of credits an AdvancedJavaCourse is worth
     * @param prerequisites courses required to take an AdvancedJavaCourse
     */
    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.setPrerequisites(prerequisites);
    }

    /*public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }*/

    /*public String getCourseName() {
        return courseName;
    }*/

    /*public void setCourseName(String courseName) {
        this.courseName = courseName;
    }*/

    /*public String getCourseNumber() {
        return courseNumber;
    }*/

    /*public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }*/

    /**
     * Method to get the courses required
     * @return courses required as a String
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Method to set the courses required
     * @param prerequisites courses required as a String
     */
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be null or empty string");
        }
        this.prerequisites = prerequisites;
    }

    /**
     * Override method to convert a AdvancedJavaCourse object to a String
     * @return a AdvancedJavaCourse object as a String
     */
    @Override
    public String toString() {
        return this.getCourseName() + " is course #" + this.getCourseNumber() + ". It is worth " + this.getCredits() + " credits. You need to take " + this.getPrerequisites() + " first.";
    }
}
