package lab2;

/**
 * @author andregaraujo
 * @version 1.1
 *
 * This is an interface responsible for defining a Course
 */
public interface Course {
    double MIN_CREDITS = 0.5;
    double MAX_CREDITS = 4.0;

    /**
     * Method to get course name
     * @return the name of the Course as a String
     */
    String getCourseName();

    /**
     * Method to set a Course name
     * @param courseName the name of the Course as a String
     */
    void setCourseName(String courseName);

    /**
     * Method to get the Course number
     * @return the Course number as a String
     */
    String getCourseNumber();

    /**
     * Method to set the Course number
     * @param courseNumber the Course number as a String
     */
    void setCourseNumber(String courseNumber);

    /**
     * Method to get the number of credits a Course is worth
     * @return the number of credits a Course is worth as a double
     */
    double getCredits();

    /**
     * Method to set the number of credits a Course is worth
     * @param credits the number of credits a Course is worth as a double
     */
    void setCredits(double credits);

    String getPrerequisites();

    void setPrerequisites(String prerequisites);
}
