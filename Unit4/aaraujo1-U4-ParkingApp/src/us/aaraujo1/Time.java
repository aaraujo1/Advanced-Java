package us.aaraujo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * This class creates a random LocalDateTime for a ticket
 * <p>
 * For the Check/In, the start time should be created by a class that randomly creates a time between 7am and noon. 
 * This class should easily be replaced with a class that would access the real time. 
 * (But that would be harder to test)
 * <p>
 * The second Machine should produce the bill a check-out time between 1pm and 11pm should randomly be created.
 */
public class Time {
    /*-----------------------------------------------------------------------*/
    /*-------------------------- SINGLETON PATTERN --------------------------*/
    /*-----------------------------------------------------------------------*/
    //null instance of class
    private static Time instance = null;

    /**
     * private constructor of class
     */
    private Time() {

    }

    /**
     * check instance of class
     *
     * @return instance
     */
    public static Time getInstance() {
        if (instance == null) {
            instance = new Time();
        }
        return instance;
    }

    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/


    //check in time between 7am and noon. 
    private static int checkInMin = 7;
    private static int checkInMax = 12;

    //check out time between 1pm and 11pm
    private static int checkOutMin = 13;
    private static int checkOutMax = 23;

    //random object
    private static Random rand = new Random();

    //LocalDateTime object
    private static LocalDateTime time;

    //DateTimeFormatter object to format LocalDateTime object
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy - HH:mm");

    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/

    /**
     * Method to create a random check in time
     *
     * @return LocalDateTime of a random check in time
     */
    public static LocalDateTime randomCheckInTime() {
        setTime(LocalDateTime.of(
                LocalDate.now(),
                LocalTime.of(rand.nextInt(checkInMax - checkInMin) + checkInMin, rand.nextInt(60))));

        return getTime();
    }

    /**
     * Method to create a random check out time
     *
     * @return LocalDateTime of a random check out time
     */
    public static LocalDateTime randomCheckOutTime() {
        setTime(LocalDateTime.of(
                LocalDate.now(),
                LocalTime.of(rand.nextInt(checkOutMax - checkOutMin) + checkOutMin, rand.nextInt(60))));

        return getTime();
    }

    /**
     * Method to create a LocalDateTime from a String
     *
     * @param s a String of a date and time of the pattern MMMM dd yyyy - HH:mm
     * @return LocalDateTime from String
     */
    public static LocalDateTime stringToLocalDateTime(String s) {
        return LocalDateTime.parse(s, dateTimeFormatter);
    }

    /**
     * Method to create a LocalDateTime from a String
     *
     * @param localDateTime a localDateTime
     * @return string of a date and time of the pattern MMMM dd yyyy - HH:mm
     */
    public static String localDateTimeToString(LocalDateTime localDateTime) {
        return localDateTime.format(dateTimeFormatter);
    }


    /**
     * Method to get LocalDateTime
     *
     * @return LocalDateTime of Time
     */
    public static LocalDateTime getTime() {
        return time;
    }

    /**
     * Method to set time
     *
     * @param time to set
     */
    public static void setTime(LocalDateTime time) {
        Time.time = time;
    }

    /**
     * Method to return Time as a String
     *
     * @return String of Time
     */
    @Override
    public String toString() {
        return getTime().format(dateTimeFormatter);
    }

}
