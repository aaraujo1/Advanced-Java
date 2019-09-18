package dip.lab2.student.solution1;

import java.text.NumberFormat;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private static NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR = "Error: bill must be greater than or equal to " + MIN_BILL;

    private double bill;
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceQuality(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables


        tip = getBill() * getServiceQuality().getV();


        return tip;
    }

    public double getBill() {
        return bill;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }


    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }


    public final void setServiceQuality(ServiceQuality serviceQuality) {
        // No need to validate because enums provide type safety!
        this.serviceQuality = serviceQuality;
    }

    @Override
    public String toString(){
        return "A bill of " + numberFormat.format(getBill()) + " with a " + (int)(serviceQuality.getV()*100) + "% tip";
    }
}
