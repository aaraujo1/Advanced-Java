package us.aaraujo1.TicketReceiptStrategy;

import us.aaraujo1.TicketFactory.Ticket;

import java.text.NumberFormat;


/**
 * @author andregaraujo
 * @version 2.0
 * <p>
 * Class for a ticket receipt
 */
public class Receipt {

    //ticket to print
    private Ticket ticket;

    //common header for all receipts
    private final String header =   "Best Value Parking Garage" + "\n" +
                                    "=========================";

    protected NumberFormat numberFormatter = NumberFormat.getCurrencyInstance();

    private ReceiptStrategy receiptStrategy;



    public Receipt(Ticket ticket) {
        setTicket(ticket);
    }


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ReceiptStrategy getReceiptStrategy() {
        return receiptStrategy;
    }

    public void setReceiptStrategy(ReceiptStrategy receiptStrategy) {
        this.receiptStrategy = receiptStrategy;
    }


    public void print(){
        //header
        System.out.println(header);

        //vehicle id
        System.out.println("Receipt for a vehicle id " + getTicket().getId() + "\n");

        //line for ticket type
        System.out.println(getReceiptStrategy().getType());

        //cost of ticket
        System.out.println(numberFormatter.format(ticket.getCost()));
    }


}
