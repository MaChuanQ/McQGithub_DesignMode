import base.Meal;
import builder.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.prepareVegMeal1();
        meal1.showItem();
        meal1.getCost();

        Meal meal2 = mealBuilder.prepareVegMeal2();
        meal2.showItem();
        meal2.getCost();
    }
}
