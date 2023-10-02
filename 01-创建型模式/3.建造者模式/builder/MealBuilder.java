package builder;

import base.*;
import base.bottle.Bottle_ColdDrink_Coke;
import base.bottle.Bottle_ColdDrink_Pepsi;
import base.wrapper.Wrapper_Burger_Chicken;
import base.wrapper.Wrapper_Burger_Veg;

public class MealBuilder {
    public Meal prepareVegMeal1(){
        Meal meal = new Meal();
        meal.addItem(new Bottle_ColdDrink_Coke());
        meal.addItem(new Wrapper_Burger_Chicken());
        return meal;
    }

    public Meal prepareVegMeal2(){
        Meal meal = new Meal();
        meal.addItem(new Bottle_ColdDrink_Pepsi());
        meal.addItem(new Wrapper_Burger_Veg());
        return meal;
    }
}
