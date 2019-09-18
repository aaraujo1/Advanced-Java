package lab1;

/**
 * This class is responsible for an intro to java course.
 * It extends the Course object.
 *
 * @author andregaraujo
 * @version 1.1
 */
public class IntroJavaCourse extends Course {
    //String courseName;
    //private String courseNumber;
    //double credits;
    private String prerequisites;

    /**
     * Constructor for IntroJavaCourse that uses the parent constructor
     * @param courseName name of IntroJavaCourse
     * @param courseNumber number of IntroJavaCourse
     * @param credits number of credits an IntroJavaCourse is worth
     * @param prerequisites courses required to take an IntroJavaCourse
     */
    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        super(courseName, courseNumber, credits);
        this.setPrerequisites(prerequisites);
    }

    /*public String getCourseNumber() {
        return courseNumber;
    }*/

    /*public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }*/

    /*public double getCredits() {
        return credits;
    }*/

    /*public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
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
     * Override method to convert a IntroJavaCourse object to a String
     * @return a IntroJavaCourse object as a String
     */
    @Override
    public String toString() {
        return this.getCourseName() + " is course #" + this.getCourseNumber() + ". It is worth " + this.getCredits() + " credits. You need to take " + this.getPrerequisites() + " first.";
    }

}
