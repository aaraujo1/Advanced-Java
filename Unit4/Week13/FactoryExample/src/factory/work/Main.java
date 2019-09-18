package factory.work;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MealFactory mealFactory = new MealFactory();
        ArrayList<Meal> meals = new ArrayList<>();

        meals.add(mealFactory.getMeal(MealType.BREAKFAST));
        meals.add(mealFactory.getMeal(MealType.LUNCH));
        meals.add(mealFactory.getMeal(MealType.SUPPER));
        meals.add(mealFactory.getMeal(MealType.BREAKFAST));

        for (Meal m:meals) {
            m.displayMeal();
        }
    }
}
