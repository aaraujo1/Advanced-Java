/**
 * Sword concrete class that extends CharacterDecorator
 *
 * @author andregaraujo
 * @version 1
 */

public class Sword extends CharacterDecorator {

    /**
     * Constructor for Sword decorator
     * @param tempCharacter of Character type to be used by parent class (wrapping - decorating parent class)
     */
    public Sword(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Method to get character name
     * @return character name as string, with Sword title
     */
    public String getName() {
        return tempCharacter.getName() + " The Sword Handler";
    }

    /**
     * Method to get character health
     * @return character character as double, with 10 added from Sword
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 10;
    }
}