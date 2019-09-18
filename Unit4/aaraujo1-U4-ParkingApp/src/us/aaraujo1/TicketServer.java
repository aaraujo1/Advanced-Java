package us.aaraujo1;

import us.aaraujo1.TicketFactory.OldTicket;
import us.aaraujo1.TicketFactory.Ticket;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * @author andregaraujo
 * @version 2.0
 *
 * Class to define a Ticket Server
 *
 * SINGLETON
 */
public class TicketServer {

    /*-----------------------------------------------------------------------*/
    /*-------------------------- SINGLETON PATTERN --------------------------*/
    /*-----------------------------------------------------------------------*/
    //null instance of class
    private static TicketServer instance = null;

    /**
     * private constructor of class
     */
    private TicketServer() {
        //setFilename(filename);
        setIndata(new FileInput(getFilename()));
        loadAllTickets();
        setOutdata(new FileOutput(filename));
    }

    /**
     * check instance of class
     * @return instance
     */
    public static TicketServer getInstance() {
        if (instance == null) {
            instance = new TicketServer();
        }
        return instance;
    }

    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/


    private final static String filename = "tickets.csv";

    //file input of tickets
    private static FileInput indata;

    //file output of tickets
    private static FileOutput outdata;

    //ArrayList to hold all tickets
    private static TreeMap<Integer, Ticket> allTicketsList = new TreeMap<>();

    //ArrayList to hold all tickets of the day
    private static ArrayList<Ticket> todayTicketsList = new ArrayList<>();




    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/


    /**
     * Method to get FileOutput object
     * @return FileOutput object
     */
    public static FileOutput getOutdata() {
        return outdata;
    }

    /**
     * Method to set FileOutput object
     * @param outdata FileOutput object
     */
    public static void setOutdata(FileOutput outdata) {
        TicketServer.outdata = outdata;
    }


    /**
     * Method to get filename for i/o
     * @return filename as strinfg
     */
    public static String getFilename() {
        return filename;
    }

    /**
     * Method to get FileInput object
     * @return FileInput object
     */
    public FileInput getIndata() {
        return indata;
    }

    /**
     * Method to set FileInput object
     * @param indata FileInput object
     */
    public static void setIndata(FileInput indata) {
        TicketServer.indata = indata;
    }


    /**
     * Method to get all tickets in server
     * @return TreeMap of all Tickets
     */
    public TreeMap<Integer, Ticket> getAllTicketsList() {
        return allTicketsList;
    }

    /**
     * Method to set all tickets in server (file)
     * @param allTicketsList TreeMap of all Tickets
     */
    public void setAllTicketsList(TreeMap<Integer, Ticket> allTicketsList) {
        TicketServer.allTicketsList = allTicketsList;
    }

    /**
     * Method to set all tickets in server (file)
     * @return list of today's tickets
     */
    public ArrayList<Ticket> getTodayTicketsList() {
        return todayTicketsList;
    }

    /**
     * Method to set all tickets today (current run)
     * @param todayTicketsList list of today's tickets
     */
    public void setTodayTicketsList(ArrayList<Ticket> todayTicketsList) {
        TicketServer.todayTicketsList = todayTicketsList;
    }

    /**
     * Method to load tickets from file into list
     */
    public void loadAllTickets() {
        //The application needs to store all of the tickets in a file.
        //When the application is opened, that file needs to load all of the tickets in a collection.
        String line;
        String[] fields;

        //read file and put existing tickets into an array
        while ((line = getIndata().fileReadLine()) != null) {
            fields = line.split(",");
            getAllTicketsList().put(Integer.parseInt(fields[0]), new OldTicket(
                    fields[1],
                    fields[2],
                    fields[3],
                    fields[4],
                    fields[5],
                    fields[6]));
        }

        //done with file so close it
        getIndata().fileClose();

    }

    /**
     * Method to get a Ticket object from list
     * @param id of Ticket
     * @return Ticket
     */
    public Ticket getTicketFromToday(int id){
        Ticket ticket = null;


        for (Ticket t: todayTicketsList
             ) {
            if(t.getId() == id){
                ticket = t;
            }
        }
        return ticket;
    }

    /**
     * Method to add a ticket to a list
     * @param t Ticket
     */
    public void addToTodayTicketsList(Ticket t){
        getTodayTicketsList().add(t);
    }

}
