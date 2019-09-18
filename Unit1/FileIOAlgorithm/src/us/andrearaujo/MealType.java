package us.andrearaujo;

/**
 * Created by mgreen14 on 12/29/17.
 * Taken over by aaraujo1 on 9/05/18
 *
 * This enum creates meal type constants for listing by meal type
 */
public enum MealType {
    BREAKFAST("Breakfast"), DESSERT("Dessert"), DINNER("Dinner"), LUNCH("Lunch");

    private String meal;

    /**
     * The constructor initializes MealType with a string
     *
     * @param meal a string for the meal type
     */
    MealType(String meal) {
        this.meal = meal;
    }

    /**
     * This method returns the constant value as a string
     * @return the meal type constant as a string
     */
    public String getMeal() {
        return meal;
    }
}
