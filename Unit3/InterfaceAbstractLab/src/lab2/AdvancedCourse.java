package lab2;

/**
 * This is an abstract class responsible for defining an AdvancedCourse object.
 * It implements a Course interface
 *
 * @author andregaraujo
 * @version 1.1
 */

public abstract class AdvancedCourse implements Course{

    protected String courseName;
    protected String courseNumber;
    protected double credits;
    private String prerequisites;




    /**
     * Constructor for AdvancedCourse that uses the parent constructor
     * @param courseName name of AdvancedCourse
     * @param courseNumber number of AdvancedCourse
     * @param credits number of credits an AdvancedCourse is worth
     * @param prerequisites courses required to take an AdvancedCourse
     */
    public AdvancedCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    /**
     * Method to get AdvancedCourse name
     * @return the name of the AdvancedCourse as a String
     */
    public final String getCourseName() {
        return courseName;
    }

    /**
     * Method to set a AdvancedCourse name
     * @param courseName the name of the AdvancedCourse as a String
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    /**
     * Method to get the AdvancedCourse number
     * @return the AdvancedCourse number as a String
     */
    public final String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Method to set the AdvancedCourse number
     * @param courseNumber the AdvancedCourse number as a String
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Method to get the number of credits a AdvancedCourse is worth
     * @return the number of credits a AdvancedCourse is worth as a double
     */
    public final double getCredits() {
        return credits;
    }

    /**
     * Method to set the number of credits a AdvancedCourse is worth
     * @param credits the number of credits a AdvancedCourse is worth as a double
     */
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException("Error: credits must be in the range " + MIN_CREDITS + " to " + MAX_CREDITS);
        }
        this.credits = credits;
    }

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
     * Override method to convert a AdvancedCourse object to a String
     * @return a Course object as a String
     */
    @Override
    public String toString(){
        return this.getCourseName() + " is course #" + this.getCourseNumber() + ". It is worth " + this.getCredits() + " credits. You need to take " + this.getPrerequisites() + " first.";
    }
}
