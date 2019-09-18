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


public class HungryStory {
    public static Scanner k = new Scanner(System.in);

    public static void main(String[] args) {
        Character pippin = new Spear(new BasicCharacter("Pippin"));
        System.out.println("Name: " + pippin.getName());
        System.out.println("Heath: " + pippin.getHealth());

        System.out.println();

        Character merry =  new Shield( new BasicCharacter("Merry"));
        System.out.println("Name: " + merry.getName());
        System.out.println("Heath: " + merry.getHealth());

        /*STORY*/
        System.out.println(pippin.getName() + " and " + merry.getName() + " have been lost in the forrest for hours. Their health is " + pippin.getHealth() + " and " + merry.getHealth() + ", respectively.");
        System.out.println(pippin.getName() + " is hungry");
        System.out.println(pippin.getName() + " is now " + new Starving(pippin).getName() + " and his health is " + new Starving(pippin).getHealth());

        /*CHOICE*/
        System.out.println();

        int choice = 0;
        do{
        System.out.println("What would you like to do?");
        System.out.println("1. Stop and eat some potatoes.");
        System.out.println("2. Keep going.");

        //should be in try/catch block for error handling
        choice = k.nextInt();
        //flush
        System.out.println();

        }while (choice != 1 && choice != 2);

        switch (choice) {
            case 1:
                //decide to stop
                System.out.println("You decided to stop and eat potatoes. " + merry.getName() + " boils them, mashes them, and sticks them in a stew.");
                System.out.println(new Starving(pippin).getName() + " is now " + new Stuffed(pippin).getName() + " and his health is " + new Stuffed(new Starving(pippin)).getHealth());

                break;
            case 2:
                //decide to keep going
                System.out.println("You decided keep going. " + merry.getName() + " gets sympathy pains.");
                System.out.println(merry.getName() + " is now " + new Starving(merry).getName() + " and his health is " + new Starving(merry).getHealth());
                break;
        }
    }
}