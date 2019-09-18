package us.aaraujo1;

import java.util.*;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * This is the main driver class
 *
 * <p>
 * You are going to design and program a software application for automating the parking and exit functions at a commercial parking garage.
 * Name this project: ParkingApp.
 * <p>
 * Most people are familiar with commercial parking facilities, but for those who aren’t, here’s how it works:
 * <p>
 * Many, but not all commercial parking garages, use two automated teller machines – one for checkin and one for checkout.
 * The process begins when you drive your vehicle up to the automated checkin machine
 * It issues a ticket which indicates your checkin time and date.
 * This ticket is kept in the vehicle until you checkout.
 * <p>
 * When you are ready to leave the garage you drive your vehicle to the automated checkout machine and insert your ticket into the machine.
 * The machine then reads the checkin time and date
 * and based on this calculates (using a special formula) how long you parked your vehicle in the garage and how much you owe.
 * These values are displayed on an electronic display on the automated checkout machine.
 * You then must pay this fee by cash or credit card, which you insert in the machine.
 * At that point a bill is provided and the system will assume you paid before you are allowed to exit the garage.
 * <p>
 * Those are the basics of how it works.
 * Remember, this is an automated system, so there are no clerks or other people at the machines.
 * <p>
 * The fee charged for parked vehicles is based on a $5.00 minimum fee to park for up to three hours.
 * After that there is an additional $1.00 per hour charge for each hour or part of an hour parked.
 * The maximum charge for any given 24-hour period is $15.00. Assume that no vehicle parks for longer than 24 hours.
 * Lost tickets have a $25.00 fee.
 * <p>
 * The application needs to store all of the tickets in a file.
 * When the application is opened, that file needs to load all of the tickets in a collection.
 */
public class Main {

    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/

    //Scanner to talk to user
    private static Scanner k = new Scanner(System.in);

    //file input of tickets
    //private final static FileInput indata = new FileInput("tickets.csv");

    //file output of tickets
    //moved into main
    //private final static FileOutput outdata = new FileOutput("tickets.csv");

    //ArrayList to hold all tickets
    //private static ArrayList<Ticket_OLD> allTicketsList = new ArrayList();
    //private static TreeMap<Integer, Ticket_OLD> allTicketsList = new TreeMap<>( );

    //ArrayList to hold all tickets of the day
    //private static ArrayList<Ticket_OLD> todayTicketsList = new ArrayList();

    //A checkin machine object
    private static CheckIn checkin = new CheckIn();

    //A checkout machine object
    private static CheckOut checkout = new CheckOut();

    //variable to keep track of user options
    private static int option = 0;

    //variable to keep track of user options for the simulation
    private static int simOption = 0;

    /*------------------------------------------------------------------*/
    /*-------------------------- MAIN PROGRAM --------------------------*/
    /*------------------------------------------------------------------*/

    public static void main(String[] args) {
        // write your code here

        //The application needs to store all of the tickets in a file.
        //When the application is opened, that file needs to load all of the tickets in a collection.
        /*String line;
        String[] fields;

        //read file and put existing tickets into an array
        while ((line = indata.fileReadLine()) != null) {
            fields = line.split(",");
            allTicketsList.put(Integer.parseInt(fields[0]),new Ticket_OLD(
                    (fields[1]),
                    fields[2],
                    fields[3],
                    fields[4]));
        }

        //done with file so close it
        indata.fileClose();*/

        //begin interaction by entering garage
        checkin.checkInStart();


        do {
            //simulationMenu();

            option = simulationMenu();

            if (option == 1) {
                checkin.checkInStart();
            } else if (option == 2) {
                checkout.checkOutStart();
            } else {
                option = 3;
            }
        } while (option != 3 && checkin.isGarageOpen());


    }

    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/

    /**
     * Method for user to run a simulation of the two machines
     *
     * @return int of user selection
     */
    public static int simulationMenu() {
        simOption = 0;

        do {

            System.out.println("\n=========================\n" +
                    "Best Value Parking Garage SIMULATION\n" +
                    "=========================\n" +
                    "1 – Interact with Check-In/Close Machine\n" +
                    "2 – Interact with Check-Out Machine\n" +
                    "3 - Exit Program");
            System.out.print("=>");

            //capture option as an integer
            try {
                simOption = k.nextInt();

                //if user DID enter an integer, but not a valid one
                if (simOption < 1 || simOption > 3) {
                    System.out.println("Please enter 1, 2 or 3.");
                }
            } catch (Exception e) {
                //warn user if they did not enter an integer
                System.out.println("You did not enter a number.");
                //clear Scanner
                k.nextLine();
            }

            //make sure there are tickets available to checkout
            //TODO: Move to other part
                /*if (simOption == 2){

                int ticketsAvailable = 0;


                //loop through array of today's tickets
                for (Ticket_OLD t : todayTicketsList) {
                    //if there is a ticket that does not have a calculated cost...
                    if (t.getCost() == 0) {
                        //...add to ticketsAvailable counter
                        ticketsAvailable++;
                    }
                }

                //if nothing was added to the ticketsAvailable counter...
                if (ticketsAvailable == 0){
                    //...there are no tickets to interact with
                    System.out.println("Sorry. There are no tickets for you to interact with the Check-Out Machine");
                    System.out.println("Please enter 1 or 3.");
                    simOption = 0;
                }
            }*/

        } while (simOption < 1 || simOption > 3);

        return simOption;
    }


}
