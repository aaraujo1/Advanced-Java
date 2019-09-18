/**
 * Abstract class that creates Decorator and implements the Character interface
 *
 * @author andregaraujo
 * @version 1
 */

abstract class CharacterDecorator implements Character {
    protected Character tempCharacter;

    /**
     * Constructor of CharacterDecorator
     * @param tempCharacter of type Character
     */
    public CharacterDecorator(Character tempCharacter) {
        this.tempCharacter = tempCharacter;
    }

    /**
     * Method to get name
     * @return name as string
     */
    public String getName() {
        return tempCharacter.getName();
    }

    /**
     * Method to get health
     * @return health as double
     */
    public double getHealth() {
        return tempCharacter.getHealth();
    }
}