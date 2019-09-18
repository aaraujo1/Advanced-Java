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
public class Person implements Weighable{
    private String firstName;
    private String lastName;
    private int age;

    private double weight;

    private static String species = "Human";
    private static boolean alive = true;

    /*----------------------*/
    /*---- CONSTRUCTORS ----*/
    /*----------------------*/

    /*-- 0 Parameters (1) --*/

    /**
     * default constructor
     */
    public Person(){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    /*-- 4 Parameters (1) --*/

    /**
     * overloaded constructor for person with 4 parameters
     * @param firstName first name of person
     * @param lastName last name of person
     * @param age age of person
     * @param weight weight of person
     */
    public Person(String firstName, String lastName, int age, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
    }

    /*-- 3 Parameters (3) --*/

    /**
     * overloaded constructor for person with 3 parameters
     * @param firstName first name of person
     * @param lastName last name of person
     * @param age age of person
     */
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = 0;
    }

    /**
     * overloaded constructor for person with 3 parameters
     * @param firstName first name of person
     * @param age age of person
     * @param weight weight of person
     */
    public Person(String firstName, int age, double weight){
        this.firstName = firstName;
        this.lastName = "";
        this.age = age;
        this.weight = weight;
    }

    /**
     * overloaded constructor for person with 3 parameters
     * @param firstName first name of person
     * @param lastName last name of person
     * @param weight weight of person
     */
    public Person(String firstName, String lastName, double weight){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.weight = weight;
    }


    /*-- 2 Parameters (4) --*/


    /**
     * overloaded constructor for person with 2 parameters
     * @param firstName first name of person
     * @param age age of person
     *            last name set empty
     *            weight set to 0
     */
    public Person(String firstName, int age){
        this.firstName = firstName;
        this.lastName = "";
        this.age = age;
        this.weight = 0;
    }

    /**
     *overloaded constructor for person with 2 parameters
     * @param firstName first name of person
     * @param lastName last name of person
     *                 age set to 0
     *                 weight set to 0
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
        this.weight = 0;
    }

    /**
     *overloaded constructor for person with 2 parameters
     * @param firstName first name of person
     * @param weight weight of person
     *                 age set to 0
     *                 lastName set empty
     */
    public Person(String firstName, double weight){
        this.firstName = firstName;
        this.lastName = "";
        this.age = 0;
        this.weight = weight;
    }

    /**
     *overloaded constructor for person with 2 parameters
     * @param age age of person
     * @param weight weight of person
     *                 firstName set empty
     *                 lastName set empty
     */
    public Person(int age, double weight){
        this.firstName = "";
        this.lastName = "";
        this.age = age;
        this.weight = weight;
    }

    /*-- 1 Parameter (3) --*/



    /**
     * overloaded constructor for person with 1 parameter
     * @param firstName put String in firstName
     *                  empty lastName
     *                  age set to 0
     *                  weight set to 0
     */
    public Person(String firstName){
        this.firstName = firstName;
        this.lastName = "";
        this.age = 0;
        this.weight = 0;

    }

    /**
     * overloaded constructor for person with 1 parameter
     * @param age get age
     *            empty string for first and last name
     *            weight set to 0
     */
    public Person(int age){
        this.firstName = "";
        this.lastName = "";
        this.age = age;
        this.weight = 0;
    }

    /**
     * overloaded constructor for person with 1 parameter
     * @param weight get weight
     *            empty string for first and last name
     *            age set to 0
     */
    public Person(double weight){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.weight = weight;
    }

    /*-- END CONSTRUCTORS --*/

    /*----------------------*/
    /*------ METHODS -------*/
    /*----------------------*/

    /**
     * method to get static property species
     * @return the value of species
     */
    public String getSpecies(){
        return species;
    }

    /**
     * method to get static property alive
     * @return the value of alive
     */
    public boolean getAlive(){
        return alive;
    }

    /**
     * method to get property weight
     * @return the value of weight
     */
    private double getWeight(){
        return weight;
    }

    /**
     * method to set property weight
     * @return the value of weight
     */
    private void setWeight(double weight){
        this.weight = weight;
    }


    /**
     * override toString method
     * @return returns first and last name and age
     */
    @Override
    public String toString(){
        return firstName + " " + lastName + " is " + age + " years old";
    }

    /**
     * override method from interface to add weight
     * @param pounds amount to add to weight
     * @return the new value for weight
     */
    @Override
    public double addWeight(double pounds) {
        weight+=pounds;
        return weight;
    }

    /**
     * override method from interface to lose weight
     * @param pounds amount to subtract to weight
     * @return the new value for weight
     */
    @Override
    public double loseWeight(double pounds) {
        weight-=pounds;
        return weight;
    }
}
