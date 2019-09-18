package us.aaraujo1;


import us.aaraujo1.TicketFactory.Ticket;
import us.aaraujo1.TicketCostStrategy.HourlyTicketCostStrategy;
import us.aaraujo1.TicketCostStrategy.LostTicketCostStrategy;
import us.aaraujo1.TicketCostStrategy.SpecialTicketCostStrategy;
import us.aaraujo1.TicketCostStrategy.TicketCostStrategy;

import java.util.ArrayList;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class to define a CheckOut Machine
 */
public class CheckOut extends Machine implements Displayable {

    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/

    //ONLY NEEDED FOR SIMULATION
    private Ticket ticketSimulation;



    /*-----------------------------------------------------------------------*/
    /*-------------------------- STRATEGY PATTERN --------------------------*/
    /*-----------------------------------------------------------------------*/

    private TicketCostStrategy ticketCostStrategy;

    /**
     * Method to get ticket cost strategy
     *
     * @return ticket cost strategy
     */
    public TicketCostStrategy getTicketCostStrategy() {
        return ticketCostStrategy;
    }

    /*public void setTicketCostStrategy(TicketType tt) {
        TicketCostStrategy tcs;
        switch (tt) {
            case HOURLY:
                tcs = new HourlyTicketCostStrategy();
                break;
            case SPECIAL:
                tcs = new SpecialTicketCostStrategy();
                break;
            //case LOST: tcs = new LostTicketCostStrategy(); break;
            default:
                tcs = null;
        }
        this.ticketCostStrategy = tcs;
    }*/

    /**
     * Method to set ticket cost strategy
     *
     * @param t Ticket object
     */
    public void setTicketCostStrategy(Ticket t) {
        TicketCostStrategy tcs;

        if (t.isLost()) {
            tcs = new LostTicketCostStrategy();

        } else {
            switch (t.getTicketType()) {
                case HOURLY:
                    tcs = new HourlyTicketCostStrategy();
                    break;
                case SPECIAL:
                    tcs = new SpecialTicketCostStrategy();
                    break;

                default:
                    tcs = null;

            }

        }
            this.ticketCostStrategy = tcs;

    }


    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/

    /**
     * Method to begin interacting with check out machine
     */
    public void checkOutStart() {
        //exit garage
        welcomeOutput();


        //only do this if ticket not lost
        //show list of tickets
        checkOutTicketSimulation(ticketServer.getTodayTicketsList());

        //set cost of ticket based on option


        checkOutTicket(getTicketSimulation());
    }

    /**
     * Method to display welcome screen
     */
    @Override
    public void welcomeOutput() {

        setDisplayOption(0);

        do {

            System.out.println("Best Value Parking Garage\n" +
                    "=========================\n" +
                    "1 – Check/Out\n" +
                    "2 – Lost Ticket");
            System.out.println("=>");

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
     */
    @Override
    public void setDisplayOption(int displayOption) {
        this.displayOption = displayOption;
    }


    /**
     * Method to simulate a vehicle wanting to checkout
     *
     * @param todayTicketsList Collection of tickets available to checkout
     */
    public void checkOutTicketSimulation(ArrayList<Ticket> todayTicketsList) {
        /*--- FOR SIMULATION PURPOSES ---*/

        //I understand that the array size may be larger than it needs to be, but ok for simulation purposes
        int[] ticketIds = new int[todayTicketsList.size()];
        //display possible tickets
        //need to show which tickets are available to checkout for simulation
        System.out.println("Please insert ticket.\n");

        System.out.println("Tickets on file:\n" +
                "=========================");

        for (int i = 0; i < todayTicketsList.size(); i++) {
            if (todayTicketsList.get(i).getCost() == 0) {
                System.out.println(todayTicketsList.get(i).getId());
                ticketIds[i] = todayTicketsList.get(i).getId();
            }
        }

        int id = 0;
        boolean idFound = false;
        int ticketIndex = -1;

        do {

            System.out.println("\nEnter the ID of the ticket you would like to check out");


            //capture option as an integer
            try {
                id = scanner.nextInt();

                //if user DID enter an integer, but not a valid one
                for (int i = 0; i < ticketIds.length; i++)
                    if (ticketIds[i] == id) {
                        idFound = true;
                        ticketIndex = i;
                    }
//                    else {
//
//
//                    System.out.println("You did not enter a valid id.");
                //display array again instead of recreating it
//                    for (int i : ticketIds
//                    ) {
//                        System.out.println(i);
//                    }

            } catch (Exception e) {
                //warn user if they did not enter an integer
                System.out.println("You did not enter a number.");
                //clear Scanner
                scanner.nextLine();

                //display array again instead of recreating it
//            for (int i:ticketIds
//                 ) {
//                System.out.println(i);
//            }
            }

            if (ticketIndex == -1) {
                System.out.println("You did not enter a valid id.");
            }


        } while (!idFound);

        //get ticket to check out
        setTicketSimulation(todayTicketsList.get(ticketIndex));

    }

    /**
     * Method to get ticket from checkOutTicketSimulation
     *
     * @return ticket object
     */
    public Ticket getTicketSimulation() {
        return ticketSimulation;
    }

    /**
     * Method to set ticket from checkOutTicketSimulation
     *
     * @param ticketSimulation ticket object to set
     */
    public void setTicketSimulation(Ticket ticketSimulation) {
        this.ticketSimulation = ticketSimulation;
    }

    /**
     * Method for a ticket that is checking out
     *
     * @param t Ticket_OLD that is checking out
     * @return the Ticket_OLD with checkOut time and cost
     */
    public Ticket checkOutTicket(Ticket t) {
        //method to simulate ticket submission
        //Ticket_OLD t = checkOutTicketSimulation(todayTicketsList);

        /*
        Best Value Parking Garage
        =========================
        Receipt for a vehicle id 105

        4 hours parked  11am – 3pm
        $6.00
        */

        System.out.println("Best Value Parking Garage\n" +
                "=========================");

        System.out.println("Receipt for a vehicle id " + t.getId() + "\n");

        //get checkout time
        t.setCheckOutTime(time.randomCheckOutTime());


        //calculate cost & print
        /*if (getDisplayOption() == 2) {
            //ticket lost
            t.setCost(new LostTicketCostStrategy().getCostAmount());
            //set flag
            t.setLost(true);

            //TODO: display method in ticket with strategy pattern??
            //Receipt line
            System.out.println("Lost Ticket");
        } else if (t.getTicketType() == TicketType.HOURLY) {
            ticketCostStrategy = new HourlyTicketCostStrategy();
            //first get hours
            long hours = calculate.getDuration(t).toHours() + 1;

            ((HourlyTicketCostStrategy) ticketCostStrategy).setHours(hours);
            //set cost
            t.setCost(ticketCostStrategy.getCostAmount());

            //TODO: display method in ticket with strategy pattern??
            //Receipt line
            System.out.println(hours + " hours parked \t" +
                    t.getCheckInTime().format(timeFormatter) + "am"
                    + "–" +
                    t.getCheckOutTime().format(timeFormatter) + "pm");

        } else if (t.getTicketType() == TicketType.SPECIAL) {
            //set cost
            t.setCost(new SpecialTicketCostStrategy().getCostAmount());

            //TODO: display method in ticket with strategy pattern??
            //Receipt line
            System.out.println("Special Event");
        }*/

        //check if ticket is lost
        if (getDisplayOption() == 2) {
            //set to lost
            t.setLost(true);

            System.out.println("Lost Ticket");
        }

        //run ticket cost strategy
        setTicketCostStrategy(t);

        //calculate hours if needed
        if (getTicketCostStrategy() instanceof HourlyTicketCostStrategy) {
            //first get hours
            long hours = calculate.getDuration(t).toHours() + 1;

            //set hours
            ((HourlyTicketCostStrategy) ticketCostStrategy).setHours(hours);
            if (!t.isLost()){
                System.out.println(hours + " hours parked \t" +
                        t.getCheckInTime().format(timeFormatter) + "am"
                        + "–" +
                        t.getCheckOutTime().format(timeFormatter) + "pm");
            }
        }else{
            if (!t.isLost()) {
                System.out.println("Special Event");
            }
        }



        //set cost of Ticket
        t.setCost(ticketCostStrategy.getCostAmount());












        //display cost
        System.out.println(numberFormatter.format(t.getCost()));

        //add to list
        //todayTicketsList.add(t);

        return t;

    }


}
