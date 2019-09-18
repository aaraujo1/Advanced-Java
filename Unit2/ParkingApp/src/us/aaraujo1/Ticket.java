package us.aaraujo1;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * Class to handle a Ticket object
 */

public class Ticket {

    //a ticket object will have a check in date & time
    private Time checkInTime = new Time();
    //a ticket object will have a check out date & time
    private Time checkOutTime = new Time();


    //a ticket will have a vehicle id
    private int id = 0;

    //a ticket will have a cost
    private int cost;


    /**
     * Constructor for new ticket
     * @param id the ID of the ticket
     */
    public Ticket(int id){
        //when ticket is generated, it should:
        //get id
        this.id = id;
        //get check in time
        checkInTime.randomCheckInTime();
    }

    /**
     * constructor for old ticket
     * @param id the ID of the ticket
     * @param checkInTime ticket check in time
     * @param checkOutTime ticket check out time
     * @param cost ticket cost
     */
    public Ticket(String id, String checkInTime, String checkOutTime, String cost){
        //when ticket is generated, it should:
        //get id
        this.id = Integer.parseInt(id);
        //get check in time
        this.checkInTime.stringToLocalDateTime(checkInTime);
        //get check out time
        this.checkOutTime.stringToLocalDateTime(checkOutTime);
        //get check in time
        this.cost = Integer.parseInt(cost);
    }

    /**
     * Method to get a Ticket ID
     * @return id as int
     */
    public int getID(){
        return id;
    }

    /**
     * Method to get Ticket check in time
     * @return check in Time of Ticket
     */
    public Time getCheckInTime() {
        return checkInTime;
    }

    /**
     * Method to get Ticket check in time
     * @return check out Time of Ticket
     */
    public Time getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Method to set check out time of Ticket to a random Time
     */
    public void setCheckOutTime(){
        checkOutTime.randomCheckOutTime();
    }

    /**
     * Method to set cost of Ticket
     * @param cost the cost of the ticket
     */
    public void setCost(int cost){
        this.cost = cost;
    }

    /**
     * Method to get the cost of a Ticket
     * @return the cost of a Ticket as an int
     */
    public int getCost(){
        return (cost);
    }

    /**
     * Method to return Ticket as a String
     * @return Ticket as a String
     */
    @Override
    public String toString(){
        return "Ticket ID: " + id + " In: " + checkInTime;
    }



}
