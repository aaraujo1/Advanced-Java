package us.aaraujo1;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * Class to define a CheckIn Machine
 */

public class CheckIn extends Machine implements Display{


    /**
     * Method to display welcome screen
     *
     */
    @Override
    public void welcomeOutput() {

        displayOption = 0;

        do {
            //display
            System.out.println("\nBest Value Parking Garage\n" +
                    "=========================\n" +
                    "1 – Check/In\n" +
                    "3 – Close Garage");
            System.out.print("=>");

            //capture option as an integer
            try {
                displayOption = k.nextInt();
            } catch (Exception e) {
                //warn user if they did not enter an integer
                System.out.println("You did not enter a number.");
                //clear Scanner
                k.nextLine();
            }

            //if user DID enter an integer, but not a valid one
            if (displayOption < 1 || displayOption > 3) {
                System.out.println("Please enter 1 or 3.");
            }

        } while (displayOption < 1 || displayOption > 3);

        //return checkInOption;

    }

    /**
     * Method to get user option
     * @return user's choice of option
     */
    @Override
    public int getDisplayOption(){
        return displayOption;
    }



    /**
     * Method to create a ticket and put it into a Collection of today's tickets
     * @param todayTicketsList Collection of today's tickets
     */
    public void newTicket(ArrayList<Ticket> todayTicketsList) {
        System.out.println("\n====Car entering garage====");
        //create new ticket
        Ticket t;
        //get ticket ID
        try {
            //get ID of most recently added ticket from the todayTicketsList
            int id = todayTicketsList.get(todayTicketsList.size() - 1).getID();
            //add 1 to id and create Ticket
            t = new Ticket(id + 1);
        } catch (Exception e) {
            //first ticket of the day, so it is 1
            t = new Ticket(101);
        }

        //output ticket info
        System.out.println("Ticket issued with vehicle ID " + t.getID());
        System.out.println("Ticket issued at " + t.getCheckInTime());

        //add ticket to list of open tickets
        todayTicketsList.add(t);

    }


    /**
     * Method to close the garage
     * It will calculate totals
     * @param allTicketsList Collection of all tickets
     * @param todayTicketsList Collection of today's tickets
     */
    public void closeGarage(TreeMap<Integer,Ticket> allTicketsList, ArrayList<Ticket> todayTicketsList) {

        /*
        Best Value Parking Garage
        =========================
        Activity to Date

        $120 was collected from 13 Check Ins
        $50 was collected from 2 Lost Tickets

        $230 was collected overall
        */
        System.out.println("\nBest Value Parking Garage\n" +
                "=========================\n" +
                "Activity to Date\n");

        //display totals of the day
        System.out.println(
                        numberFormatter.format(c.totalTodayTickets(todayTicketsList)[0]) +
                        " was collected from " +
                        c.totalTodayTickets(todayTicketsList)[1] +
                        " Check Ins");

        //display totals of lost tickets
        System.out.println(
                numberFormatter.format(c.totalLostTickets(todayTicketsList)[0]) +
                        " was collected from " +
                        c.totalLostTickets(todayTicketsList)[1] +
                        " Lost Tickets");

        int lastKey = allTicketsList.lastKey();

        //add all of today's tickets to the list of all tickets
        for (Ticket t:todayTicketsList
             ) {
            lastKey++;
            allTicketsList.put(lastKey, t);
        }

        //display totals
        System.out.println( "\n" + numberFormatter.format(c.totalTickets(allTicketsList)) +" was collected overall");


    }


}

