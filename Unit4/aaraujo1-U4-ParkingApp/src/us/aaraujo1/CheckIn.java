package us.aaraujo1;

import us.aaraujo1.TicketFactory.Ticket;
import us.aaraujo1.TicketFactory.TicketFactory;
import us.aaraujo1.TicketFactory.TicketType;
import us.aaraujo1.TicketCostStrategy.LostTicketCostStrategy;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class to define a CheckIn Machine
 */

public class CheckIn extends Machine implements Displayable {

    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/

    private boolean garageOpen = true;

    /*---------------------------------------------------------------------*/
    /*-------------------------- FACTORY PATTERN --------------------------*/
    /*---------------------------------------------------------------------*/


    TicketFactory ticketFactory = new TicketFactory();

    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/

    /**
     * Method to begin interacting with check in machine
     */
    public void checkInStart() {
        //enter garage
        welcomeOutput();

        //int checkInOption = checkin.displayOption;

        if (getDisplayOption() == 1) {
            //1 – Check/In
            newTicket(ticketServer.getTodayTicketsList(), TicketType.HOURLY);
        } else if (getDisplayOption() == 2) {
            //2 – Special Event
            newTicket(ticketServer.getTodayTicketsList(), TicketType.SPECIAL);
        } else {
            //3 – Close Garage
            //Assume that no vehicle parks for longer than 24 hours
            //for simulation purposes, ensure all ticket are closed


            for (Ticket t : ticketServer.getTodayTicketsList()
            ) {
                if (t.getCost() == 0) {
                    System.out.println(t.getId() + " is lost.");
                    //give time
                    t.setCheckOutTime(time.randomCheckOutTime());
                    //ticket lost
                    t.setCost(new LostTicketCostStrategy().getCostAmount());
                    //set flag
                    t.setLost(true);
                }
            }

            //close garage
            closeGarage(ticketServer.getAllTicketsList(), ticketServer.getTodayTicketsList());

            //open file to output
            FileOutput outdata = new FileOutput("tickets.csv");


            //write to file
            for (Map.Entry<Integer, Ticket> entry : ticketServer.getAllTicketsList().entrySet()) {
                int key = entry.getKey();

                Ticket t = entry.getValue();

                outdata.fileWrite(key + "," +
                        t.getId() + "," +
                        time.localDateTimeToString(t.getCheckInTime()) + "," +
                        time.localDateTimeToString(t.getCheckOutTime()) + "," +
                        t.getCost() + "," +
                        t.getTicketType().toString() + "," +
                        String.valueOf(t.isLost())

                );

            }

            //close file
            outdata.fileClose();

            //option = 3;
            setGarageOpen(false);

        }
    }

    /**
     * Method to display welcome screen
     */
    @Override
    public void welcomeOutput() {

        //displayOption = 0;

        do {
            //display
            System.out.println("\nBest Value Parking Garage\n" +
                    "=========================\n" +
                    "1 – Check/In\n" +
                    "2 – Special Event\n" +
                    "3 – Close Garage");
            System.out.print("=>");

            //capture option as an integer
            try {
                setDisplayOption(scanner.nextInt());
            } catch (Exception e) {
                //warn user if they did not enter an integer
                System.out.println("You did not enter a number.");
                //clear Scanner
                scanner.nextLine();
            }

            //if user DID enter an integer, but not a valid one
            if (getDisplayOption() < 1 || getDisplayOption() > 3) {
                System.out.println("Please enter 1 or 3.");
            }

        } while (getDisplayOption() < 1 || getDisplayOption() > 3);

        //return checkInOption;

    }

    /**
     * Method to get user option
     *
     * @return user's choice of option
     */
    @Override
    public int getDisplayOption() {
        return displayOption;
    }

    /**
     * Method to set user's option from the display
     *
     * @param displayOption as int
     */
    @Override
    public void setDisplayOption(int displayOption) {
        this.displayOption = displayOption;
    }


    /**
     * Method to create a ticket and put it into a Collection of today's tickets
     *
     * @param todayTicketsList Collection of today's tickets
     * @param ticketType type of ticket
     */
    public void newTicket(ArrayList<Ticket> todayTicketsList, TicketType ticketType) {
        System.out.println("\n====Car entering garage====");
        //create new ticket
        //Ticket_OLD t;


        int id;

        //get ticket ID
        try {
            //get ID of most recently added ticket from the todayTicketsList
            id = (todayTicketsList.get(todayTicketsList.size() - 1).getId()) + 1;
            //add 1 to id and create Ticket_OLD
            //t = new Ticket_OLD(id + 1);
            //ticketFactory.getTicket(TicketType.HOURLY, id + 1);
        } catch (Exception e) {
            //first ticket of the day, so it is 1
            //t = new Ticket_OLD(101);
            //ticketFactory.getTicket(TicketType.HOURLY, 101);
            id = 101;
        }

        ticketServer.addToTodayTicketsList(ticketFactory.getTicket(ticketType, id, time.randomCheckInTime()));

        //output ticket info
        System.out.println("Ticket issued with vehicle ID " + id);
        System.out.println("Ticket issued at " + ticketServer.getTicketFromToday(id).getCheckInTime());

        //add ticket to list of open tickets
        //todayTicketsList.add(t);

    }


    /**
     * Method to close the garage
     * It will calculate totals
     *
     * @param allTicketsList   Collection of all tickets
     * @param todayTicketsList Collection of today's tickets
     */
    public void closeGarage(TreeMap<Integer, Ticket> allTicketsList, ArrayList<Ticket> todayTicketsList) {

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

        //display hourly totals of the day
        System.out.println(
                numberFormatter.format(calculate.totalHourlyTodayTickets(todayTicketsList)[0]) +
                        " was collected from " +
                        calculate.totalHourlyTodayTickets(todayTicketsList)[1] +
                        " Check Ins");

        //display special totals of the day
        System.out.println(
                numberFormatter.format(calculate.totalSpecialTodayTickets(todayTicketsList)[0]) +
                        " was collected from " +
                        calculate.totalSpecialTodayTickets(todayTicketsList)[1] +
                        " Special");

        //display totals of lost tickets
        System.out.println(
                numberFormatter.format(calculate.totalLostTickets(todayTicketsList)[0]) +
                        " was collected from " +
                        calculate.totalLostTickets(todayTicketsList)[1] +
                        " Lost Tickets");

        int lastKey;
        try {
            lastKey = allTicketsList.lastKey();
        } catch (Exception e) {
            lastKey = -1;
        }

        //add all of today's tickets to the list of all tickets
        for (Ticket t : todayTicketsList
        ) {
            lastKey++;
            allTicketsList.put(lastKey, t);
        }

        //display totals
        System.out.println("\n" + numberFormatter.format(calculate.totalTickets(allTicketsList)) + " was collected overall");

        //set garage to garageOpen
        setGarageOpen(false);

    }


    /**
     * Method to get if garage is open or not
     *
     * @return boolean
     */
    public boolean isGarageOpen() {
        return garageOpen;
    }

    /**
     * Method to set garage open or not
     *
     * @param garageOpen boolean
     */
    public void setGarageOpen(boolean garageOpen) {
        this.garageOpen = garageOpen;
    }
}

