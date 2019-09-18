/**
 * Starving concrete class that extends CharacterDecorator
 *
 * @author andregaraujo
 * @version 1
 */

public class Starving extends CharacterDecorator {

    /**
     * Constructor for Starving decorator
     * @param tempCharacter of Character type to be used by parent class (wrapping - decorating parent class)
     */
    public Starving(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Method to get character name
     * @return character name as string, with Starving title
     */
    public String getName() {
        return tempCharacter.getName() + " The Starving";
    }

    /**
     * Method to get character health
     * @return character character as double, with 2.5 subtracted from Starving
     */
    public double getHealth() {
        return tempCharacter.getHealth() - 2.5;
    }
}