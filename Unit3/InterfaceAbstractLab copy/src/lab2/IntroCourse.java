package lab2;

public abstract class IntroCourse implements Course{

    protected String courseName;
    protected String courseNumber;
    protected double credits;
    protected final String prerequisites = "none";


    /**
     * Constructor for a IntroCourse
     * @param courseName name of IntroCourse
     * @param courseNumber number of IntroCourse
     * @param credits number of credits an IntroCourse is worth
     */
    public IntroCourse(String courseName, String courseNumber, double credits){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
    }

    /**
     * Method to get IntroCourse name
     * @return the name of the IntroCourse as a String
     */
    public final String getCourseName() {
        return courseName;
    }

    /**
     * Method to set a IntroCourse name
     * @param courseName the name of the IntroCourse as a String
     */
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Error: courseName cannot be null or empty string");
        }
        this.courseName = courseName;
    }

    /**
     * Method to get the IntroCourse number
     * @return the IntroCourse number as a String
     */
    public final String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Method to set the IntroCourse number
     * @param courseNumber the IntroCourse number as a String
     */
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            throw new IllegalArgumentException("Error: courseNumber cannot be null or empty string");
        }
        this.courseNumber = courseNumber;
    }

    /**
     * Method to get the number of credits a IntroCourse is worth
     * @return the number of credits a IntroCourse is worth as a double
     */
    public final double getCredits() {
        return credits;
    }

    /**
     * Method to set the number of credits a IntroCourse is worth
     * @param credits the number of credits a IntroCourse is worth as a double
     */
    public final void setCredits(double credits) {
        if(credits < MIN_CREDITS || credits > MAX_CREDITS) {
            throw new IllegalArgumentException("Error: credits must be in the range " + MIN_CREDITS + " to " + MAX_CREDITS);
        }
        this.credits = credits;
    }

    /**
     * Method to get the courses required
     * IntroCourse should always return "none" for the value of prerequisites
     * @return courses required as a String
     */
    public String getPrerequisites() {
        return prerequisites;
    }

    /**
     * Method to set the courses required
     * IntroCourse should always return "none" for the value of prerequisites
     * @param prerequisites courses required as a String
     */
    public void setPrerequisites(String prerequisites) {
        if (!prerequisites.equals("none")) {
            //throw new IllegalArgumentException("Error: prerequisites cannot be null or empty string");
            throw new IllegalArgumentException("Error: intro courses cannot have prerequisites");
        }
        //this.prerequisites = prerequisites;
    }

    /**
     * Override method to convert a Course object to a String
     * @return a Course object as a String
     */
    @Override
    public String toString(){
        return this.getCourseName() + " is course #" + this.getCourseNumber() + ". It is worth " + this.getCredits() + " credits. There are no prerequisites.";
    }
}
