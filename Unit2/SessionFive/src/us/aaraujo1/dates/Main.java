package us.aaraujo1.dates;

import java.text.DateFormat;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
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
 *
 * This is main driver for this assignments.
 * I will use JavaDoc comments in addition to other comments. Not sure if this is the correct use of JavaDoc
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        Date today = new Date();
        Date joshuaTree = new GregorianCalendar(1987,2,9).getTime();
        Date rattleAndHum = new GregorianCalendar(1988,9,10).getTime();

        /**
         * Below are different tests and code that did not work
         */
        //to test month value
        //Date yesterday = new GregorianCalendar(2018,8,23).getTime();
//        long yesterDays = (today.getTime()-yesterday.getTime())/ (1000 * 60 * 60 * 24);
//        System.out.println(yesterDays + " total days");


//        long jtDiff = today.getTime()-joshuaTree.getTime(); //in seconds
//        System.out.println(jtDiff);


        //calculating did not yield accurate results
//        long years = (jtDiff/ (1000 * 60 * 60 * 24) / 365);
//        long months = (long) (jtDiff/ (1000 * 60 * 60 * 24) % 365 / 30.436875);
//        long days = (long) (jtDiff/ (1000 * 60 * 60 * 24) % 365 % 30.436875);

        // .getYear() .getMonth() and .getDay() are deprecated
//        int years = today.getYear() - joshuaTree.getYear();
//        int months = today.getMonth() - joshuaTree.getMonth();
//        int days = today.getDay() - joshuaTree.getDay();

        /**
         * I moved the below code to its own class because I will reuse the code
         */
        //SOURCE: https://stackoverflow.com/questions/7182996/java-get-month-integer-from-date
//        LocalDate todayLD = today.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate joshuaTreeLD = joshuaTree.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        LocalDate rattleAndHumLD = rattleAndHum.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//        int years = todayLD.getYear() - joshuaTreeLD.getYear();
//        int months = todayLD.getMonthValue() - joshuaTreeLD.getMonthValue();
//        int days = todayLD.getDayOfMonth() - joshuaTreeLD.getDayOfMonth();
//
//        System.out.println(years + " years");
//        System.out.println(months + " months");
//        System.out.println(days + " days");

        /**
         * PART 1
         */

        //Calculate time since the release of Joshua Tree
        System.out.println("Difference between today and Joshua Tree:");

        //DateCalculator object
        DateCalculator dc = new DateCalculator();

        //method to calculate difference between two Date objects
        dc.dateDiff(today,joshuaTree);

        //method to output difference as units
        dc.dateUnitsOutput();

        /**
         * PART 2
         *
         * I debated about instantiating a new DateCalculator object.
         * I was unsure of best practices here.
         */

        //Calculate time from the release of Joshua Tree to the release of Rattle and Hum
        System.out.println("\nDifference between Joshua Tree and Rattle and Hum:");

        //another call to DateDiff method with two other dates to get the difference values
        dc.dateDiff(rattleAndHum,joshuaTree);

        //method to output difference
        //not necessary, but called for clarity
        dc.dateUnitsOutput();

        //a DateFormat object to display today's date clearly
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, Locale.US);
        String todayOut = dateFormatter.format(today);

        //Calculate time until the release of Rattle and Hum
        System.out.println("\nIf Joshua Tree is released today, on " + todayOut + ", Rattle and Hum will be released on:");

        //method to add values to today
        dc.dateAddDifference(today);

        //output date
        dc.dateOutput();


    }



}


