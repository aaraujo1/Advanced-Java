package dip.lab2.student.solution1;

// An useful import if you need it.

// Another useful import if you need it.


import java.text.NumberFormat;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author your name goes here
 */
public class Startup {

    private static NumberFormat numberFormat = NumberFormat.getCurrencyInstance();


    public static void main(String[] args) {
        
        TipCalculator calc1 = new FoodServiceTipCalculator(ServiceQuality.GOOD, 10.00);
        TipCalculator calc2 = new BaggageServiceTipCalculator(ServiceQuality.FAIR,5,0.20);
        TipCalculator calc3 = new FoodServiceTipCalculator(ServiceQuality.POOR, 5.00);

        TipCalculator[] tipServices = {calc1, calc2, calc3};

        for (TipCalculator tc: tipServices
             ) {
            TipCalculatorService tipService = new TipCalculatorService(tc);

            Double tipAmount = tipService.getTip();

            System.out.println(tc.toString());

            System.out.println("Tip: " + numberFormat.format(tipAmount));

            System.out.println();
        }

    }

}
