package lab2;

/**
 * This class is responsible for an intro java course.
 * It extends the AdvancedCourse object.
 *
 * @author andregaraujo
 * @version 1.1
 */
public class IntroJavaCourse extends AdvancedCourse{

    /**
     * Constructor for IntroJavaCourse that uses the parent constructor
     * @param courseName name of IntroJavaCourse
     * @param courseNumber number of IntroJavaCourse
     * @param credits number of credits an IntroJavaCourse is worth
     * @param prerequisites courses required to take an IntroJavaCourse
     */
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits, prerequisites);
    }
    /*String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }*/

    
}
