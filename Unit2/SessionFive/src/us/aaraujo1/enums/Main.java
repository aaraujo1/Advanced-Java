package us.aaraujo1.enums;

import java.util.Scanner;

/**
 * @author andregaraujo
 * @version 2018-09-19.1
 *
 * The following In-Class Activity was completed and is visible in GitHub in the project SessionFive
 *
 * Create a class in a package called us.username.enums (where username is your username)
 * that includes a main method that asks the user their favorite NFC team.
 *
 * Based upon the first three letters, the method should be able to identify the team based upon mascot or city.
 *
 * There should be a second method with an argument of the enum type Team and should printout the name of the team with the name.
 * City Mascot (Ex: Green Bay Packers, Chicago Bears)
 *
 * Create the enum type Team.
 */
public class Main {
    private static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        //ask for user input
        System.out.println("What's your favorite NFC team?");
        //get user input and only the first three characters
        String abbreviation = k.nextLine().substring(0,3).toUpperCase();


        try{
            //try to call an NFCTeam enum using user input
            NFCTeam t = NFCTeam.valueOf(abbreviation);
            //if it can, output result
            System.out.println("Your favorite team is the " + t.getTeam());
        }catch (Exception e){
            try{
                //try to call an NFCMascots enum using user input
                NFCMascots m = NFCMascots.valueOf(abbreviation);
                //if it can, output result
                System.out.println("Your favorite team is the " + m.getMascot());
            }catch (Exception ee){
                //bad user input
                System.out.println("Your input is invalid.");
            }

        }

    }
}
