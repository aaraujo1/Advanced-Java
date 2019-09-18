package us.aaraujo1.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * This class handles all the calculation of dates
 *
 * The following In-Class Activity was completed and is visible in GitHub in the project SessionFive
 *
 * Create a class in a package called us.username.dates (where username is your username)
 * that includes a main method that calculates how many days, months and years since U2 released the Joshua Tree album.
 *
 * Rattle and Hum was produced the next year.
 * Print out when would be released if The Joshua Tree was released today
 * and it took U2 the same amount of time to release the next album.
 *
 * U2:
 *
 * The Joshua Tree     9 March 1987
 * Rattle and Hum      10 October 1988
 */

public class DateCalculator {

    private LocalDate d1LD;
    private LocalDate d2LD;

    //SOURCE: https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

    private int years;
    private int months;
    private int days;

    /**
     * Calculates the difference of two dates
     * @param d1 first date to calculate: the newest date
     * @param d2 the second date to calculate: the oldest date
     */
    public void dateDiff (Date d1, Date d2){
        d1LD = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        d2LD = d2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        years = d1LD.getYear() - d2LD.getYear();
        months = d1LD.getMonthValue() - d2LD.getMonthValue();
        days = d1LD.getDayOfMonth() - d2LD.getDayOfMonth();

//        String dayString = days==1 ?  "day" : "days";
//
//        System.out.println(years + " years, " + months + " months, and " + days + " " + dayString + ".");
    }

    /**
     * Output the date units
     * Should be defined from dateDiff()
     * Output is its own method because it is not always necessary to give output of the dateDiff() method
     */
    public void dateUnitsOutput(){
        //to change singularity and plurality of measurements
        String yearString = days==1 ?  "year" : "years";
        String monthString = days==1 ?  "month" : "months";
        String dayString = days==1 ?  "day" : "days";

        System.out.println(years + " " + yearString + ", " + months + " " + monthString + ", and " + days + " " + dayString + ".");
    }

    /**
     * Adds values from dateDiff() to a date
     *
     * Not sure if this is the best way to construct this method
     *
     * Another thought is to have three parameters
     * 2 Dates that will call the dateDiff() method in the method
     * 1 Date that will be added to
     *
     * @param d1 the date to add to
     */
    public void dateAddDifference(Date d1){
        d1LD = d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        //add values based on the values from dateDiff()
        d1LD = d1LD.plusYears(years);
        d1LD = d1LD.plusMonths(months);
        d1LD = d1LD.plusDays(days);
    }

    /**
     * Output LocalDate object formatted as a date
     */
    public void dateOutput(){
        //format out
        System.out.println(d1LD.format(dateFormatter));
    }
}
