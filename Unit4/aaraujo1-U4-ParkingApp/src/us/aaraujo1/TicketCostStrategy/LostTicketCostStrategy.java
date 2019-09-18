package us.aaraujo1.TicketCostStrategy;
/**
 * @author andregaraujo
 * @version 2.0
 *
 * Class to define a Lost Ticket cost
 */

public class LostTicketCostStrategy implements TicketCostStrategy{

    private final int lostTicket = 25;


    /**
     * Method to get lost ticket cost
     * @return lost ticket cost as int
     */
    @Override
    public int getCostAmount() {
        return lostTicket;
    }
}
