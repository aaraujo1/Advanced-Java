package us.aaraujo1;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This is an abstract class for a pet object
 */
public abstract class Pet {


    protected String name;

    /**
     * The Pet constructor initializes a pets's name
     *
     * @param name a String of a pet's name
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     * A method to get a pet's name
     *
     * @return a String of a pet's name
     */
    public String getName() {
        return name;
    }


}