package us.aaraujo1.TicketFactory;

import us.aaraujo1.Time;

import java.time.LocalDateTime;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class for to read older tickets from TicketServer
 */
public class OldTicket implements Ticket {
    /*----------------------------------------------------------------*/
    /*-------------------------- ATTRIBUTES --------------------------*/
    /*----------------------------------------------------------------*/

    //a ticket object will have a check in date & time
    //private Time checkInTime = Time.getInstance();
    //a ticket object will have a check out date & time
    //private Time checkOutTime = Time.getInstance();

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;


    //a ticket will have a vehicle id
    private int id;

    //a ticket will have a cost
    private int cost;

    //ticket will retain its type, though this can be replaced by instanceof
    private TicketType ticketType = TicketType.SPECIAL;

    //flag to check if ticket is lost
    private boolean lost = false;

    /*---------------------------------------------------------------*/
    /*-------------------------- FUNCTIONS --------------------------*/
    /*---------------------------------------------------------------*/

    /**
     * constructor for old ticket
     * 6 attributes
     *
     * @param id           the ID of the ticket
     * @param checkInTime  ticket check in time
     * @param checkOutTime ticket check out time
     * @param cost         ticket cost
     * @param ticketType   ticket type
     * @param isLost       boolean if lost
     */
    public OldTicket(String id, String checkInTime, String checkOutTime, String cost, String ticketType, String isLost) {
        //when ticket is generated, it should:
        //get id
        setId(Integer.parseInt(id));
        //get check in time
        setCheckInTime(Time.stringToLocalDateTime(checkInTime));
        //get check out time
        setCheckOutTime(Time.stringToLocalDateTime(checkOutTime));
        //get check in time
        setCost(Integer.parseInt(cost));
        //get TicketType
        setTicketType(TicketType.valueOf(ticketType));
        //get lost flag
        setLost(Boolean.parseBoolean(isLost));
    }


    /**
     * Method to get a HourlyTicket ID
     *
     * @return id as int
     */
    public int getId() {
        return id;
    }

    /**
     * Method to set a Ticket ID
     *
     * @param id int
     */
    @Override
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Method to get HourlyTicket check in time
     *
     * @return check in Time of HourlyTicket
     */
    public LocalDateTime getCheckInTime() {
        return checkInTime;
    }

    /**
     * Method to set check in time of Ticket to a random Time
     *
     * @param checkInTime as LocalDateTime
     */
    public void setCheckInTime(LocalDateTime checkInTime) {
        //checkInTime = Time.randomCheckInTime();
        this.checkInTime = checkInTime;
    }

    /**
     * Method to get HourlyTicket check in time
     *
     * @return check out Time of HourlyTicket
     */
    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Method to set check out time of HourlyTicket to a random Time
     *
     * @param checkOutTime as LocalDateTime
     */
    public void setCheckOutTime(LocalDateTime checkOutTime) {
        //checkOutTime = Time.randomCheckOutTime();
        this.checkOutTime = checkOutTime;
    }

    /**
     * Method to set cost of HourlyTicket
     *
     * @param cost the cost of the ticket
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Method to get the cost of a HourlyTicket
     *
     * @return the cost of a HourlyTicket as an int
     */
    public int getCost() {
        return (cost);
    }

    /**
     * Method to return HourlyTicket as a String
     *
     * @return HourlyTicket as a String
     */
    @Override
    public String toString() {
        return "Ticket ID: " + getId() + " In: " + checkInTime;
    }

    /**
     * Method to get the TicketType
     *
     * @return the type of ticket as enum
     */
    @Override
    public TicketType getTicketType() {
        return ticketType;
    }

    /**
     * Method to set the  TicketType
     *
     * @param ticketType the type of ticket as enum
     */
    @Override
    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    /**
     * Method to get lost if ticket is lost
     *
     * @return lost as boolean
     */
    @Override
    public boolean isLost() {
        return lost;
    }

    /**
     * Method to set if ticket is lost
     *
     * @param lost set if ticket is lost as boolean
     */
    @Override
    public void setLost(boolean lost) {
        this.lost = lost;
    }


}
