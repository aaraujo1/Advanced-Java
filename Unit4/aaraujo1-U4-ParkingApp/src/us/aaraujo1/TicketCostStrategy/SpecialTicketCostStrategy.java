package us.aaraujo1.TicketCostStrategy;

/**
 * @author andregaraujo
 * @version 2.0
 *
 * Class to define a Special Ticket cost
 */

public class SpecialTicketCostStrategy implements TicketCostStrategy {

    private final int specialTicket = 20;

    /**
     * Method to get special ticket cost
     * @return special ticket cost as int
     */
    @Override
    public int getCostAmount() {
        return specialTicket;
    }

}
