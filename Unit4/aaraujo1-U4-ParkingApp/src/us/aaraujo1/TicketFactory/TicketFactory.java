package us.aaraujo1.TicketFactory;

import java.time.LocalDateTime;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class for creating tickets
 */
public class TicketFactory {
    /**
     * Step #4 - Use the Factory to get object of concrete class by passing an information such as type.
     *
     * @param ticketType passing an information such as type
     * @param ticketId as in
     * @param checkInTime as LocalDateTime
     *
     *
     * @return to get object of concrete class
     */
    public Ticket getTicket(TicketType ticketType, int ticketId, LocalDateTime checkInTime) {
        switch (ticketType) {
            case HOURLY:
                return new HourlyTicket(ticketId, checkInTime);
            case SPECIAL:
                return new SpecialTicket(ticketId, checkInTime);
            default:
                return null;
        }
    }
}


