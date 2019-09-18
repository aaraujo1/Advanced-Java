package us.aaraujo1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * This class creates a random LocalDateTime for a ticket
 *
 * For the Check/In, the start time should be created by a class that randomly creates a time between 7am and noon. 
 * This class should easily be replaced with a class that would access the real time. 
 * (But that would be harder to test) 
 *
 * The second Machine should produce the bill a check-out time between 1pm and 11pm should randomly be created.
 */
public class Time {

    //check in time between 7am and noon. 
    private int checkInMin = 7;
    private int checkInMax = 12;

    //check out time between 1pm and 11pm
    private int checkOutMin = 13;
    private int checkOutMax = 23;

    //random object
    private Random rand = new Random();

    //LocalDateTime object
    private LocalDateTime time;

    //DateTimeFormatter object to format LocalDateTime object
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM dd yyyy - HH:mm");


    /**
     * Method to create a random check in time
     * @return LocalDateTime of a random check in time
     */
    public LocalDateTime randomCheckInTime() {
        time = LocalDateTime.of(
                LocalDate.now(),
                LocalTime.of(rand.nextInt(checkInMax - checkInMin) + checkInMin, rand.nextInt(60)));

        return time;
    }

    /**
     * Method to create a random check out time
     * @return LocalDateTime of a random check out time
     */
    public LocalDateTime randomCheckOutTime() {
        time = LocalDateTime.of(
                LocalDate.now(),
                LocalTime.of(rand.nextInt(checkOutMax - checkOutMin) + checkOutMin, rand.nextInt(60)));

        return time;
    }

    /**
     * Method to create a LocalDateTime from a String
     * @param s a String of a date and time of the pattern MMMM dd yyyy - HH:mm
     * @return LocalDateTime from String
     */
    public LocalDateTime stringToLocalDateTime(String s){
        time = LocalDateTime.parse(s,dateTimeFormatter);
        return time;
    }

    /**
     * Method to get LocalDateTime
     * @return LocalDateTime of Time
     */
    public LocalDateTime getTime(){
        return time;
    }

    /**
     * Method to return Time as a String
     * @return String of Time
     */
    @Override
    public String toString(){
        return time.format(dateTimeFormatter);
    }

}
