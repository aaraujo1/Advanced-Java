package us.aaraujo1;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This class is for the Dog object that inherits the Pet object and Talkable interface
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * The Dog constructor initializes the disposition and name of the animal
     *
     * @param friendly an indicator whether the Dog can be approaches
     * @param name     the name of the Dog
     */

    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     * This method returns the disposition of the Dog, whether it is friendly
     *
     * @return boolean indicator or whether the Dog is friendly
     */

    public boolean isFriendly() {
        return friendly;
    }

    /**
     * This inherited method overrides the talk method from Talkable interface
     *
     * @return returns what the Dog says
     */

    @Override
    public String talk() {
        return "Bark";
    }

    /**
     * This inherited method overrides the toString method
     *
     * @return returns the Dog's name and disposition
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}