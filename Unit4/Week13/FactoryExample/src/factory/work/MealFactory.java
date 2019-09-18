package factory.work;

public class MealFactory {

    public Meal getMeal(MealType mealType){
        switch (mealType){
            case BREAKFAST: return new Breakfast();
            case LUNCH: return new Lunch();
            case SUPPER: return new Supper();
            default: return null;
        }


    }
}
