package lab1;

/**
 * This is an abstract class responsible for defining a Course object.
 *
 * @author andregaraujo
 * @version 1.1
 */
public abstract class Course {

    protected String courseName;
    protected String courseNumber;
    protected double credits;

    private final double MIN_CREDITS = 0.5;
    private final double MAX_CREDITS = 4.0;

    /**
     * Constructor for a Course
     * @param courseName name of Course
     * @param courseNumber number of Course
     * @param credits number of credits a Course is worth
     */
    public Course(String courseName, String courseNumber, double credits){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    /**
     * Method to get Course name
     * @return the name of the Course as a String
     */
    public final String getCourseName() {
        return courseName;
    }

    /**
     * Method to set a Course name
     * @param courseName the name of the Course as a String
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    /**
     * Method to get the Course number
     * @return the Course number as a String
     */
    public final String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Method to set the Course number
     * @param courseNumber the Course number as a String
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Method to get the number of credits a Course is worth
     * @return the number of credits a Course is worth as a double
     */
    public final double getCredits() {
        return credits;
    }

    /**
     * Method to set the number of credits a Course is worth
     * @param credits the number of credits a Course is worth as a double
     */
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException("Error: credits must be in the range " + MIN_CREDITS + " to " + MAX_CREDITS);
        }
        this.credits = credits;
    }

    /**
     * Override method to convert a Course object to a String
     * @return a Course object as a String
     */
    @Override
    public String toString(){
        return this.getCourseName() + " is course #" + this.getCourseNumber() + ". It is worth " + this.getCredits() + " credits.";
    }


}
