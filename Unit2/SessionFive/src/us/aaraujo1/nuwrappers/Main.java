package us.aaraujo1.nuwrappers;

import java.util.Scanner;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * The following In-Class Activity was completed and is visible in GitHub in the project SessionFive
 *
 * Create a class in a package called us.username.nuwrappers (where username is your username)
 * that includes a main method that asks the user for a number.
 *
 * The code should then determine which data type that uses the least amount of memory the number fits into.
 *
 * The name of the data type should be printed out.
 */

public class Main {
    private static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        //to see the max values for testing
            /*
            System.out.println("Float: " + Float.MAX_VALUE);
            System.out.println("Double: " + Double.MAX_VALUE);
            System.out.println("Byte: " + Byte.MAX_VALUE);
            System.out.println("Short: " + Short.MAX_VALUE);
            System.out.println("Integer: " + Integer.MAX_VALUE);
            System.out.println("Long: " + Long.MAX_VALUE);
            */
        //Printed values
            /*
            Float: 3.4028235E38
            Double: 1.7976931348623157E308
            Byte: 127
            Short: 32767
            Integer: 2147483647
            Long: 9223372036854775807
             */


        //ask for user input
        System.out.println("Please enter a number");
        //get user input
        String number = k.nextLine();

        /*-- variables needed --*/
        //hold the data type name
        String dataType = "";
        //the largest non-decimal data type
        long longN = 0;
        //the largest decimal data type
        double doubleN = 0;

        try{
            //try to parse input into a LONG data type
            longN = Long.parseLong(number);

            //if it can, see if it can be a smaller data type
            if (longN < Byte.MAX_VALUE && longN > Byte.MIN_VALUE){
                dataType = "Byte";
            }else if(longN < Short.MAX_VALUE && longN > Short.MIN_VALUE){
                dataType = "Short";
            }else if(longN < Integer.MAX_VALUE && longN > Integer.MIN_VALUE){
                dataType = "Integer";
            }else{
                dataType = "Long";
            }

        }catch (Exception e1){
            try
            {
                //try to parse input into a DOUBLE data type
                doubleN = Double.parseDouble(number);

                //if it can, see if it can be a smaller data type
                if (doubleN < Float.MAX_VALUE && longN > Float.MIN_VALUE){
                    dataType = "Float";
                }else{
                    dataType = "Double";
                }
            }catch(Exception e2){
                //bad user input
                System.out.println("You did not enter a valid number");
            }
        }

        //output result
        System.out.println("Number should be a " + dataType + " data type.");


    }
}
