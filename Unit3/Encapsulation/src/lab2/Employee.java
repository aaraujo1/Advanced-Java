package lab2;

//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods.
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code
 *    4. All method parameters should be validated.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * Taken over by André Araujo on 10/3/2018
 * @version     1.03
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    //objects to validate parameters
    private Pattern pattern;
    private Matcher matcher;

    //new DateUtilities object
    private DateUtilities dateUtilities;

    //new Employee constructor
    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.ssn = ssn;
        //instead use private method with validation
        setSsn(ssn);
    }

    //another Employee constructor
    //includes cubeId & orientationDate because they need to be set for hire() to run
    public Employee(String firstName, String lastName, String ssn, String cubeId, Date orientationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        //this.ssn = ssn;
        //instead use private method with validation
        setSsn(ssn);
        this.cubeId = cubeId;
        this.orientationDate = orientationDate;
    }

    //method to call all necessary methods when a new employee is hired
    //cubeID and orienationDay need to be set before this runs
    public void hire(){
        //instantiate Date here.
        //orientationDate = new Date();
        //getOrientationDate();

        //now call methods
        meetWithHrForBenefitAndSalryInfo();
        meetDepartmentStaff();
        reviewDeptPolicies();
        //this should not be a constant
        //moveIntoCubicle("103");
        moveIntoCubicle(getCubeId());
    }

    private  String getStringDate(Date date){
        dateUtilities = new DateUtilities();
        return dateUtilities.getFormattedDate(date);
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        //String fmtDate = sdf.format(orientationDate);
        //dateUtilities = new DateUtilities();
        //dateUtilities.getFormattedDate(orientationDate);
        System.out.println(firstName + " " + lastName + " met with Hr on "
            + getStringDate(orientationDate));
    }

    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        metDeptStaff = true;
        //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        //String fmtDate = sdf.format(orientationDate);
        //dateUtilities = new DateUtilities();
        System.out.println(firstName + " " + lastName + " met with Dept. Staff on "
            + getStringDate(orientationDate));
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    private void reviewDeptPolicies() {
        reviewedDeptPolicies = true;
        //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        //String fmtDate = sdf.format(orientationDate);
        //dateUtilities = new DateUtilities();

        System.out.println(firstName + " " + lastName + " reviewed Dept policies on "
            + getStringDate(orientationDate));
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    private void moveIntoCubicle(String cubeId) {
        this.cubeId = cubeId;
        this.movedIn = true;
        //SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        //String fmtDate = sdf.format(orientationDate);

        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + getStringDate(orientationDate));
    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.

    //allow to set if name change
    //name could be anything...
    public void setFirstName(String firstName) {
       //...but can't be empty
        if(firstName != "") {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    //allow to set if name change
    //name could be anything, including empty... if I'm hiring Cher or Pelé
    public void setLastName(String lastName) {
       this.lastName = lastName;
    }

    //should not be able to get an employee's SSN
    private String getSsn() {
        return ssn;
    }

    //only set ssn when constructing new employee
    //validate correct ssn string
    private void setSsn(String ssn) {
        //https://howtodoinjava.com/regex/java-regex-validate-social-security-numbers-ssn/
        //regex for ssn
        String regex = "^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$";

        try {
            //Pattern object based on regex
            pattern = Pattern.compile(regex);

            //Matcher object to match String parameter to regex Pattern
            matcher = pattern.matcher(ssn);

            //conditional if string matches regex pattern
            if (matcher.matches()){
                this.ssn = ssn;}
        }catch (Exception e){
            System.out.println("Not a correct SSN");
        }

    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    // boolean parameters need no validation
    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    // boolean parameters need no validation
    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    // boolean parameters need no validation
    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    // boolean parameters need no validation
    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    private String getCubeId() {
        return cubeId;
    }

    //should follow a pattern, but that pattern could also change
    public void setCubeId(String cubeId) {
        //can be string, int, or mix
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    //validate Date object
    public void setOrientationDate(Date orientationDate) {
        try{
            //if this passes...
            getStringDate(orientationDate);
            ///...set orientationDate
            this.orientationDate = orientationDate;
        }
        catch (Exception e){
            System.out.println("Not a correctly formatted date");
        }

    }}
