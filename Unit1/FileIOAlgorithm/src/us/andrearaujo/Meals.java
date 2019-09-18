package us.andrearaujo;

/**
 * Created by mgreen14 on 12/29/17.
 * Taken over by aaraujo1 on 9/05/18
 */
public class Meals {
    private MealType mealType;
    private String item;
    private int calories;

    /**
     * This constructor initializes the Meals class with a mealtype, a string, and int
     *
     * @param mealType an enum constant of a meal type
     * @param item the meal
     * @param calories calories
     */
    public Meals(MealType mealType, String item, int calories) {
        this.mealType = mealType;
        this.item = item;
        this.calories = calories;
    }

    /**
     * Getter to return the meal's mealtype
     * @return the mealtype enum
     */
    public MealType getMealType() {
        return mealType;
    }

    /**
     * Getter to return the meal item
     * @return the meal item as a string
     */
    public String getItem() {
        return item;
    }

    /**
     * Getter to return the meal's calories
     * @return the calories of the meal as an integer
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Equals override method to test if object equals a meal object
     *
     * @param o an object
     * @return meal item name
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meals meals = (Meals) o;

        if (getCalories() != meals.getCalories()) return false;
        if (getMealType() != meals.getMealType()) return false;
        return getItem().equals(meals.getItem());
    }

    /**
     * hashCode override method to return the total hash code of the three variables in a meal object
     *
     * @return the total hash code of the three variables in a meal object
     */
    @Override
    public int hashCode() {
        int result = getMealType().hashCode();
        result = 31 * result + getItem().hashCode();
        result = 31 * result + getCalories();
        return result;
    }

    /**
     * toString override method to print out meal object
     *
     * @return a meal object as a string to console
     */
    @Override
    public String toString() {
        return "Meals{" +
                "mealType=" + mealType +
                ", item='" + item + '\'' +
                ", calories=" + calories +
                '}';
    }

}
