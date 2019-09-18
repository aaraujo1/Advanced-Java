package us.andrearaujo;

import java.util.ArrayList;

/**
 * Created by mgreen14 on 12/29/17.
 * Taken over by aaraujo1 on 9/05/18
 *
 * This class is for input and output of a list
 */
public class MealsArray {
    //private Meals[] meals = new Meals[100];
    private ArrayList<Meals> meals = new ArrayList<>();
    private int i = 0;
    private int calories;

    /**
     * This adds elements as a meal object to the array list based on the 3 columns of the csv file
     *
     *
     * @param arg1 string: meal type - if spelled incorrectly, defaults to "Dinner"
     * @param arg2 string: meal
     * @param arg3 string: calories - if invalid, defaults to "100"
     */
    public void addElementWithStrings(String arg1, String arg2, String arg3) {
        MealType mealType;
        //if (i < meals.length) {
        if (i < meals.size()+1) {
            switch (arg1) {
                case "Breakfast":
                    mealType = MealType.BREAKFAST;
                    break;
                case "Lunch":
                    mealType = MealType.LUNCH;
                    break;
                case "Dinner":
                    mealType = MealType.DINNER;
                    break;
                case "Dessert":
                    mealType = MealType.DESSERT;
                    break;
                default:
                    mealType = MealType.DINNER;
                    System.out.println("Invalid Meal Type " + arg1 + ", defaulted to Dinner.");
            }

            if (arg3.matches("-?\\d+(\\.\\d+)?")) {
                calories = Integer.parseInt(arg3);
            } else {
                calories = 100;
                System.out.println("Invalid Calories " + arg3 + ", defaulted to 100.");
            }
            //meals[i++] = new Meals(mealType, arg2, calories);
            //meals.set(i++,new Meals(mealType, arg2, calories));
            //meals.get(i++) = new Meals(mealType, arg2, calories);
            meals.add(i,new Meals(mealType, arg2, calories));
            i++;
        }
        else {
            System.out.println("Items exceeded system size.  File has " + i + ", while the system can only handle " + meals.size() + ".");
        }
    }

    /**
     * Returns array list
     *
     * @return returns the array list
     */
    public ArrayList<Meals> getMeals() {
        return meals;
    }

    /**
     * void method that loops through array list and prints out each item to the console
     */
    public void printAllMeals() {
        for (Meals item: meals) {
            if (item != null) {
                System.out.println(item);
            }

        }
    }

    /**
     * void method that loops through array list and prints out lines to the console
     * where the mealtype equals the user input
     *
     * @param mealType enum constant of a meal type from user input
     */
    public void printMealsByType(MealType mealType) {
        for (Meals item: meals) {
            if (item != null && item.getMealType() == mealType) {
                System.out.println(item);
            }

        }
    }

    /**
     * void method that loops through array list and prints out lines to the console
     * where the user input is found in the meal name
     *
     * @param s a string to search from user input
     */
    public void printByNameSearch(String s) {
        for (Meals item: meals) {
            if (item != null && item.getItem().indexOf(s) >= 0) {
                System.out.println(item);
            }

        }
    }
}
