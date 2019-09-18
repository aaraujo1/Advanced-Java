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

    /*
     * Method to remove a decorator
     * SOURCE: https://stackoverflow.com/questions/12239784/how-to-remove-decorated-object-from-decorator-pattern-in-java
     * @param toRemove
     */

    /*public void removeDecorator(CharacterDecorator toRemove) {
        if (tempCharacter == null) {
            return;
        } else if (tempCharacter.equals(toRemove)) {
            tempCharacter = tempCharacter;
        } else {
            this.removeDecorator(toRemove);
        }
    }*/

}