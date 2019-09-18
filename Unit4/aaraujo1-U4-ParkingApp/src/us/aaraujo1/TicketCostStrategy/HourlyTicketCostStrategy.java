package us.aaraujo1.TicketCostStrategy;

/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class to define a Hourly Ticket cost
 */

public class HourlyTicketCostStrategy implements TicketCostStrategy {

    private int hourlyTicket;

    private long hours;

    private final int initialFee = 5;

    private final int intialHours = 3;

    private final int perHour = 1;

    private final int maxCharge = 15;

    /*public HourlyTicketCostStrategy(long hours){
        this.hours = hours;
    }*/

    /**
     * Method to get hourly ticket cost
     *
     * @return lost hourly cost as int
     */
    @Override
    public int getCostAmount() {
        int cost = initialFee;

        if (getHours() >= intialHours) {
            //$5.00 minimum fee to park for up to three hours
            //After that
            // there is an additional $1.00 per hour charge for each hour or part of an hour parked
            // * perHour is not needed, but could be if prices change
            cost += (getHours() - intialHours) * perHour;


        }

        //if cost is greater than max charge, bring the cost back down to max
        if (cost >= maxCharge) {
            cost = maxCharge;
        }


        return cost;
    }

    /**
     * Method to get duration between check in and check out time
     *
     * @return hours as long
     */
    public long getHours() {
        return hours;
    }

    /**
     * Method to set duration between check in and check out time
     *
     * @param hours between check in and check out time
     */
    public void setHours(long hours) {
        this.hours = hours;
    }
}
