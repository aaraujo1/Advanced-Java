package us.aaraujo1;

/**
 * @author andregaraujo
 * @version 2018 0912.1
 *
 * The following In-Class Activity was completed and is visible Statics.
 *
 * For full credit, the project must include JavaDoc comments and JUnit tests for non-void methods.
 *
 * 1. Create a “Person” class with 3 instance properties: firstName (a String), lastName (a String) and age (an int).
 *
 * 2. In addition to a default constructor, how may additional, overloaded constructors can you think of to create? Create them.
 *
 * 3. Class properties (declared static) are shared by all object instances created from that class.
 * Can you think of a Person property that should be shared? Add that to your Person class.
 * Then write a method that retrieves that data. How should this method be written?
 *
 * 4. From a separate “Startup” class, create several Person objects and store them in an array.
 *
 * 5. Now write a for-loop to iterate over that array and output the full name and age of each of the Person objects stored in that array.
 *
 * 6. Using the Person Class, create a Weighable Interface.
 * The Interface should define the following methods:addWeight(double pounds)loseWeight(double pounds)
 *
 * 7. Modify the Person Class to implement the Class.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Startup s = new Startup();
        Person[] p = new Startup().startup();

        for (int i = 0; i < p.length; i++){
            System.out.println(p[i].toString());
        }
    }
}
