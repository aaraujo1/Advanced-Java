/**
 * Spear concrete class that extends CharacterDecorator
 *
 * @author andregaraujo
 * @version 1
 */

public class Spear extends CharacterDecorator {

    /**
     * Constructor for Spear decorator
     * @param tempCharacter of Character type to be used by parent class (wrapping - decorating parent class)
     */
    public Spear(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Method to get character name
     * @return character name as string, with Spear title
     */
    public String getName() {
        return tempCharacter.getName() + " The Spear Thrower";
    }

    /**
     * Method to get character health
     * @return character character as double, with 5 added from Spear
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 5;
    }
}