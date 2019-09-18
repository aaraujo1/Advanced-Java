package factory.work;

public class Supper implements Meal {
    String description;
    boolean isDelicious;

    public Supper() {
        description = "Beef Brisket";
        isDelicious = true;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + (isDelicious?"delicious":"discusting"));
    }
}
