package us.aaraujo1.bignums;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * The following In-Class Activity was completed and is visible in GitHub in the project SessionFive
 *
 * Create a class in a package called us.username.bignums (where username is your username)
 * that includes a main method that calculates how many letters there would be
 * if everyone in Wisconsin wrote everyone in California a letter.
 *
 * It should also calculate how many copies of those letters would have to be made for everyone in Texas to have a copy.
 *
 * Print the number of copies that would have to be made for Texas and how much it would cost at $3.23 each to copy them.
 * Populations:
 *
 * Wisconsin Total  5,726,398
 * California      38,041,430
 * Texas           26,059,203
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        BigInteger WI = new BigInteger("5726398");
        BigInteger CA = new BigInteger("38041430");
        BigInteger TX = new BigInteger("26059203");
        BigDecimal cost = new BigDecimal("3.23");

        //BigInteger WI2CA = new BigInteger(WI.multiply(CA));

        //show numbers I'm working with
        System.out.println("Totals:\n" +
                "Wisconsin\t5,726,398\n" +
                "California\t38,041,430\n" +
                "Texas\t\t26,059,203\n" +
                "----------------------");

        System.out.println("\nNumber of letter if everyone in Wisconsin wrote everyone in California a letter:");
        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(WI.multiply(CA)));

        System.out.println("\nNumber of letters if those copies were made for everyone in Texas to have a copy:");
        System.out.println(NumberFormat.getNumberInstance(Locale.US).format(WI.multiply(CA).multiply(TX)));

        System.out.println("\nCost of letters for Texas copies:");
        //convert BigInteger to BigDecimal
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(
                new BigDecimal(WI.multiply(CA).multiply(TX)).multiply(cost)));


    }
}
