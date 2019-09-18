/**
 * Adventure Pattern Lab
 *
 * 1. Build a project that is a simple game based on the Character class.
 * 2. Build two of your own characters and then two short “Adventures”, involving a series of questions and results based upon the responses.
 *      1. Each Adventure should be a 'startable' class, that is, having a main() method.
 *          Upload a description of how you would create other characters using the Observer pattern,
 *          that would could be notified when something happens to a main character and change the dynamics of the game.
 *          You don't have to implement it - just describe how you would design it using the pattern.
 *      2. Upload the description in response to this question.
 *      3. Make sure to account for the change of state that is triggers the notification;what the observers would do when triggered (besides System.out.println() )
 *          and how it would make the game more interesting.
 * 3. Load your project into a GitHub repository named AdventureLab.
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