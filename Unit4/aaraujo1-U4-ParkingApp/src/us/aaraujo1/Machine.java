package us.aaraujo1;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Abstract class to define attributes of a Machine
 */

public abstract class Machine {
    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/

    //Scanner to talk to user
    protected static Scanner scanner = new Scanner(System.in);

    //a machine will call to a single Calculate class
    protected Calculate calculate = Calculate.getInstance();

    //format number to money
    protected NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();

    //format time to string
    protected DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");

    //int to collect user option
    protected int displayOption = 0;

    //a machine will connect to a single TicketServer Class
    protected TicketServer ticketServer = TicketServer.getInstance();

    //a machine will have a time
    protected Time time = Time.getInstance();

}
