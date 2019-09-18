import java.util.ArrayList;
import java.util.Scanner;

/**
 * Adventure Pattern Lab
 *
 * Hungry Story
 *
 * Main Driver class
 * @author andregaraujo
 * @version 1
 */


public class MountainStory {
    public static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
        Character frodo = new BasicCharacter("Frodo");
        System.out.println("Name: " + new Sword(frodo).getName());
        System.out.println("Heath: " + new Sword(frodo).getHealth());

        System.out.println();

        Character sam =  new BasicCharacter("Sam");
        System.out.println("Name: " + new Spear(sam).getName());
        System.out.println("Heath: " + new Spear(sam).getHealth());

        /*STORY*/
        System.out.println(new Sword(frodo).getName() + " and " + new Spear(sam).getName() + " have been travelling for hours. Their health is " + new Sword(frodo).getHealth() + " and " + new Spear(sam).getHealth() + ", respectively.");
        System.out.println("They approach a mountain.");


        /*CHOICE*/
        System.out.println();

        int choice = 0;
        do{
            System.out.println("What would you like to do?");
            System.out.println("1. You're in a rush! Take the shortcut.");
            System.out.println("2. You're not in any rush. Take the long way.");

            //should be in try/catch block for error handling
            choice = k.nextInt();
            //flush
            System.out.println();

        }while (choice != 1 && choice != 2);

        switch (choice) {
            case 1:
                //decide to take the shortcut
                System.out.println("You decided to take the shortcut. " + new Sword(frodo).getName() + " loses his footing and nearly falls. " + new Spear(sam).getName() + " saves " + new Sword(frodo).getName() + " but loses his sword.");
                System.out.println(new Sword(frodo).getName() + " is now " + frodo.getName() + " and his health is " + frodo.getHealth());

                break;
            case 2:
                //decide to take the long way
                System.out.println("You decided to take the long way. " + new Spear(sam).getName() + " comes across a corpse clutching a shield. " + new Spear(sam).getName() + " takes the shield.");
                System.out.println(new Spear(sam).getName() + " is now " + new Shield(new Spear(sam)).getName() + " and his health is " + new Shield(new Spear(sam)).getHealth());
                break;
        }
    }
}