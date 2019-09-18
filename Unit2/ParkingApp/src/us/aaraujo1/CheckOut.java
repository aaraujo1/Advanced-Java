package us.aaraujo1;


import java.util.ArrayList;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * Class to define a CheckOut Machine
 */
public class CheckOut extends Machine implements Display{

    //ONLY NEEDED FOR SIMULATION
    private Ticket ticketSimulation;

    /**
     * Method to display welcome screen
     *
     */
    @Override
    public void welcomeOutput() {

        displayOption = 0;

        do {

            System.out.println("Best Value Parking Garage\n" +
                    "=========================\n" +
                    "1 – Check/Out\n" +
                    "2 – Lost Ticket");
            System.out.println("=>");

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
     * Method to simulate a vehicle wanting to checkout
     * @param todayTicketsList Collection of tickets available to checkout
     */
    public void checkOutTicketSimulation(ArrayList<Ticket> todayTicketsList){
        /*--- FOR SIMULATION PURPOSES ---*/

        //I understand that the array size may be larger than it needs to be, but ok for simulation purposes
        int[] ticketIds = new int [todayTicketsList.size()];
        //display possible tickets
        //need to show which tickets are available to checkout for simulation
        System.out.println("Please insert ticket.\n");

        System.out.println("Tickets on file:\n"+
                "=========================");

        for (int i = 0; i < todayTicketsList.size(); i++) {
            if (todayTicketsList.get(i).getCost() == 0) {
                System.out.println(todayTicketsList.get(i).getID());
                ticketIds[i] = todayTicketsList.get(i).getID();
            }
        }

        int id = 0;
        boolean idFound = false;
        int ticketIndex = -1;

        do{

        System.out.println("\nEnter the ID of the ticket you would like to check out");


        //capture option as an integer
        try {
            id = k.nextInt();

            //if user DID enter an integer, but not a valid one
            for (int i = 0; i < ticketIds.length; i++)
                if (ticketIds[i] == id){
                    idFound = true;
                    ticketIndex = i;}
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
            k.nextLine();

            //display array again instead of recreating it
//            for (int i:ticketIds
//                 ) {
//                System.out.println(i);
//            }
        }

        if (ticketIndex == -1){
            System.out.println("You did not enter a valid id.");}


    } while (!idFound);

        //get ticket to check out
        ticketSimulation =  todayTicketsList.get(ticketIndex);

    }

    /**
     * Method to get ticket from checkOutTicketSimulation
     * @return ticket object
     */
    public Ticket getTicketSimulation(){
        return ticketSimulation;
    }


    /**
     * Method for a ticket that is checking out
     * @param t Ticket that is checking out
     * @return the Ticket with checkOut time and cost
     */
    public Ticket checkOutTicket(Ticket t){
        //method to simulate ticket submission
        //Ticket t = checkOutTicketSimulation(todayTicketsList);

        /*
        Best Value Parking Garage
        =========================
        Receipt for a vehicle id 105

        4 hours parked  11am – 3pm
        $6.00
        */

        System.out.println("Best Value Parking Garage\n" +
                "=========================");

        System.out.println("Receipt for a vehicle id " + t.getID() + "\n");

        //get checkout time
        t.setCheckOutTime();


        long hours = c.getDuration(t.getCheckInTime(), t.getCheckOutTime()).toHours()+1;

        System.out.println(hours + " hours parked \t" +
                t.getCheckInTime().getTime().format(timeFormatter) + "am"
                + "–" +
                t.getCheckOutTime().getTime().format(timeFormatter) + "pm");

        //calculate cost
        t.setCost(c.costPerHour(hours));

        //display cost
        System.out.println(numberFormatter.format(t.getCost()));

        //add to list
        //todayTicketsList.add(t);

        return t;

    }

    /**
     * Method for a lost ticket
     * @param t Ticket that is lost
     * @return the Ticket with checkOut time and cost
     */
    public Ticket lostTicket(Ticket t){
        //method to simulate ticket submission
        //Ticket t = checkOutTicketSimulation(todayTicketsList);

        /*
        Best Value Parking Garage
        =========================
        Receipt for a vehicle id 107

        Lost Ticket
        $25.00
        */

        System.out.println("Best Value Parking Garage\n" +
                "=========================");

        System.out.println("Receipt for a vehicle id " + t.getID() + "\n");

        //get checkout time
        t.setCheckOutTime();


        System.out.println("Lost Ticket");
        //calculate cost
        t.setCost(c.lostTicket());

        //display cost
        System.out.println(numberFormatter.format(t.getCost()));


        return t;

    }
}
