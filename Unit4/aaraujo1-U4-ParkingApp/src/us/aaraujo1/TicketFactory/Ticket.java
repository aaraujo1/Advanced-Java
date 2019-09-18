package us.aaraujo1.TicketFactory;

import java.time.LocalDateTime;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Interface for a ticket
 */
public interface Ticket {

    /*----- HAS ID -----*/

    /**
     * Method to get a Ticket ID
     *
     * @return id as int
     */
    int getId();

    /**
     * Method to set a Ticket ID
     *
     * @param id as int
     */
    void setId(int id);


    /*----- HAS CHECKIN TIME -----*/

    /**
     * Method to get Ticket check in time
     *
     * @return check in Time of Ticket
     */
    LocalDateTime getCheckInTime();

    /**
     * Method to set check in time of Ticket to a random Time
     *
     * @param checkInTime as LocalDateTime
     */
    void setCheckInTime(LocalDateTime checkInTime);

    /*----- HAS CHECKOUT TIME -----*/

    /**
     * Method to get Ticket check in time
     *
     * @return check out Time of Ticket
     */
    LocalDateTime getCheckOutTime();

    /**
     * Method to set check out time of Ticket to a random Time
     *
     * @param checkOutTime as LocalDateTime
     */
    void setCheckOutTime(LocalDateTime checkOutTime);

    /*----- HAS COST -----*/

    /**
     * Method to set cost of Ticket
     *
     * @param cost the cost of the ticket
     */
    void setCost(int cost);

    /**
     * Method to get the cost of a Ticket
     *
     * @return the cost of a Ticket as an int
     */
    int getCost();

    /*----- HAS TICKET TYPE -----*/

    /**
     * Method to get the TicketType
     *
     * @return the type of ticket as enum
     */
    TicketType getTicketType();


    /**
     * Method to set the  TicketType
     *
     * @param ticketType the type of ticket as enum
     */
    void setTicketType(TicketType ticketType);

    /*----- HAS FLAG IF LOST -----*/

    /**
     * Method to get lost if ticket is lost
     *
     * @return lost as boolean
     */
    boolean isLost();

    /**
     * Method to set if ticket is lost
     *
     * @param lost set if ticket is lost as boolean
     */
    void setLost(boolean lost);
}
