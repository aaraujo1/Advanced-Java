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
public class BaggageServiceTipCalculator implements TipCalculator{
    private static NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    /*private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR = "Error: bill must be between " + MIN_BILL + " and " + MAX_BILL;*/

    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;




    public BaggageServiceTipCalculator(ServiceQuality q, int bags, double baseTip) {
        this.setServiceQuality(q); // perform validation
        this.setBagCount(bags);

        //setBaseTipPerBag(1.00); // set default value
        this.setBaseTipPerBag(baseTip);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        /*switch(getServiceQuality()) {
            case GOOD:
                tip = getBaseTipPerBag() * getBagCount() * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = getBaseTipPerBag() * getBagCount() * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = getBaseTipPerBag() * getBagCount() * (1 + POOR_RATE);
                break;
        }*/

        tip = getBaseTipPerBag() * getBagCount() * (1 + getServiceQuality().getV());

        return tip;
    }


    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        // No need to validate because enums provide type safety!
        this.serviceQuality = serviceQuality;
    }

    @Override
    public String toString(){
        return getBagCount() + " bags with a " + (int)(getBaseTipPerBag()*100) + "% base tip per bag and an extra " + (int)(serviceQuality.getV()*100) + "% tip";
    }
}
