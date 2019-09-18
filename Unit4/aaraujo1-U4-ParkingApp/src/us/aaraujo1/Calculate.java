package us.aaraujo1;

import us.aaraujo1.TicketFactory.Ticket;
import us.aaraujo1.TicketFactory.TicketType;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class to handle all calculations
 * <p>
 * The fee charged for parked vehicles is based on a $5.00 minimum fee to park for up to three hours.
 * After that there is an additional $1.00 per hour charge for each hour or part of an hour parked.
 * The maximum charge for any given 24-hour period is $15.00.
 * Assume that no vehicle parks for longer than 24 hours. 
 * <p>
 * Lost tickets have a $25.00 fee.
 */

public class Calculate {
    /*-----------------------------------------------------------------------*/
    /*-------------------------- SINGLETON PATTERN --------------------------*/
    /*-----------------------------------------------------------------------*/
    //null instance of class
    private static Calculate instance = null;

    //private constructor of class
    private Calculate() {
    }

    //check instance of class
    public static Calculate getInstance() {
        if (instance == null) {
            instance = new Calculate();
        }
        return instance;
    }

    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/

    /*private final int initialFee = 5;

    private final int intialHours = 3;

    private final int perHour = 1;

    private final int maxCharge = 15;

    private final int lostTicket = 25;*/


    private int totalHourly = 0;
    private int totalSpecial = 0;
    private int totalLost = 0;
    private int total = 0;

    private int counter;

    private int[] totals = new int[2];

    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/


    /**
     * Method to calculate duration if ticket
     *
     * @param t ticket
     * @return duration of checkin and checkout
     */
    public Duration getDuration(Ticket t) {

        return Duration.between(t.getCheckInTime(), t.getCheckOutTime());
    }

    /*
     * Method to calculate cost per hour
     *
     * @param hours to calculate
     * @return cost per hour as int
     */
    /*public int costPerHour(long hours) {
        int cost = initialFee;

        if (hours >= intialHours) {
            //$5.00 minimum fee to park for up to three hours
            //After that
            // there is an additional $1.00 per hour charge for each hour or part of an hour parked
            // * perHour is not needed, but could be if prices change
            cost += (hours - intialHours) * perHour;


        }

        //if cost is greater than max charge, bring the cost back down to max
        if (cost >= maxCharge) {
            cost = maxCharge;
        }


        return cost;
    }*/

    /*
     * Method to calculate a lost ticket
     *
     * @return cost of Ticker as int
     */
    /*public int lostTicket() {
        return lostTicket;
    }*/

    /**
     * Method to calculate total of a Collection of Tickets that were Hourly
     *
     * @param todayTicketsList Collection of today's Tickets
     * @return total cost of checked out Tickets
     */
    public int[] totalHourlyTodayTickets(ArrayList<Ticket> todayTicketsList) {
        counter = 0;

        for (Ticket t : todayTicketsList
        ) {
            if (t.getTicketType() == TicketType.HOURLY && !t.isLost()) {
                totalHourly += t.getCost();

                counter++;
            }
        }

        totals[0] = totalHourly;
        totals[1] = counter;

        return totals;
    }

    /**
     * Method to calculate total of a Collection of  Tickets that were Special
     *
     * @param todayTicketsList Collection of today's Tickets
     * @return total cost of checked out Tickets
     */
    public int[] totalSpecialTodayTickets(ArrayList<Ticket> todayTicketsList) {
        counter = 0;

        for (Ticket t : todayTicketsList
        ) {
            if (t.getTicketType() == TicketType.SPECIAL && !t.isLost()) {
                totalSpecial += t.getCost();

                counter++;
            }
        }

        totals[0] = totalSpecial;
        totals[1] = counter;

        return totals;
    }


    /**
     * Method to calculate total of a Collection of Tickets that are lost
     *
     * @param todayTicketsList Collection of today's Tickets
     * @return total cost of lost Tickets
     */
    public int[] totalLostTickets(ArrayList<Ticket> todayTicketsList) {
        counter = 0;

        for (Ticket t : todayTicketsList
        ) {
            if (t.isLost()) {
                totalLost += t.getCost();

                counter++;
            }
        }
        totals[0] = totalLost;
        totals[1] = counter;

        return totals;
    }

    /**
     * Method to calculate total cost of all tickets
     *
     * @param allTicketsList Collection of all Tickets
     * @return total cost of all Tickets
     */
    public int totalTickets(TreeMap<Integer, Ticket> allTicketsList) {
        counter = 0;

        for (Map.Entry<Integer, Ticket> entry : allTicketsList.entrySet()) {


            Ticket t = entry.getValue();

            total += t.getCost();


        }
        return total;
    }


}
