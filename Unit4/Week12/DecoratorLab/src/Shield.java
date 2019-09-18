/**
 * Shield concrete class that extends CharacterDecorator
 *
 * @author andregaraujo
 * @version 1
 */

public class Shield extends CharacterDecorator {

    /**
     * Constructor for Shield decorator
     * @param tempCharacter of Character type to be used by parent class (wrapping - decorating parent class)
     */
    public Shield(Character tempCharacter) {
        super(tempCharacter);
    }

    /**
     * Method to get character name
     * @return character name as string, with Shield title
     */
    public String getName() {
        return tempCharacter.getName() + " The Shield Wielder";
    }

    /**
     * Method to get character health
     * @return character character as double, with 20 added from Shield
     */
    public double getHealth() {
        return tempCharacter.getHealth() + 20;
    }
}