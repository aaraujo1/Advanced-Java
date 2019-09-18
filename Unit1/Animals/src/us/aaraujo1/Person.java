package us.aaraujo1;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This is an abstract class for a person object
 */
public abstract class Person {
    private String name;

    /**
     * The Person constructor initializes a person's name
     *
     * @param name a String of a person's name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * This method gets a person's name
     *
     * @return a person's name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets a person's name
     *
     * @param name a String of a person's name
     */
    public void setName(String name) {
        this.name = name;
    }


}