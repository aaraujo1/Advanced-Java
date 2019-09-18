package us.aaraujo1;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * Abstract class to define attributes of a Machine
 */

public abstract class Machine {
    //Scanner to talk to user
    protected static Scanner k = new Scanner(System.in);

    //call to Calculate class
    protected Calculate c = new Calculate();

    //format number to money
    protected NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();

    //format time to string
    protected DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");

    //int to collect user option
    protected int displayOption = 0;


}
