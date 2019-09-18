package factory.work;

public class Breakfast implements Meal {
    String description;
    int calories;

    public Breakfast() {
        description = "Rashers, Pancakes and Fruit Bowl";
        calories = 355;
    }

    @Override
    public void displayMeal() {
        System.out.println(description + " is " + calories + " calories.");
    }
}
