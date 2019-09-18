package us.aaraujo1;

/**
 * Created by mgreen14 on 12/27/17.
 * Taken over by aaraujo1 on 8/29/18
 *
 * @author andregaraujo
 * @version 2018 0822 .3
 * This class is for the Cat object that inherits the Pet object and Talkable interface
 */
public class Cat extends Pet implements Talkable {



    private int mousesKilled;

    /**
     * The Cat constructor initializes the number of mouses killed and the name of the cat
     *
     * @param mousesKilled is the number of mouses killed
     * @param name         the name of the Cat
     */

    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }


    /**
     * This method gets the number of mouses killed
     *
     * @return returns the number of mouses kiled
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * This method is to add to the number of mouses killed
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     * This inherited method overrides the talk method from Talkable interface
     *
     * @return returns what the Cat says
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     * This inherited method overrides the toString method
     *
     * @return returns the cat's name and the number of mouses killed
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

