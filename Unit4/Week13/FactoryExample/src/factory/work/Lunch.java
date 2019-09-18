package factory.work;

public class Lunch implements Meal {
    String description;

    public Lunch() {
        description = "Currywurst";
    }

    @Override
    public void displayMeal() {
        System.out.println(description);
    }
}
