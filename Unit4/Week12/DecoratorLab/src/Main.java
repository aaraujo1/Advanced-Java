/**
 * Decorator Pattern Lab
 *
 * Build the Character Project from the code in the slides for the Decorator pattern.
 * Add a Shield Class and a Starving Class (negative points) and test each.
 * Include JUnit tests and JavaDoc where appropriate.
 * Upload a Class diagram, including your new classes, in response to this question.
 * Load your project into a GitHub repository named DecoratorLab.
 *
 * Main Driver class
 * @author andregaraujo
 * @version 1
 */

public class Main {
    public static void main(String[] args) {
        Character basicCharacter = new Spear(new Sword(new BasicCharacter("Bilbo")));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Heath: " + basicCharacter.getHealth());

        System.out.println();

        Character sidekickCharacter = new Sword( new Shield( new Starving( new BasicCharacter("Merry"))));
        System.out.println("Name: " + sidekickCharacter.getName());
        System.out.println("Heath: " + sidekickCharacter.getHealth());
    }
}