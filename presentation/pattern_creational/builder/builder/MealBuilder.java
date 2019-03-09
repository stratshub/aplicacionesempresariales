package builder;

import concrete_classes.Meal;
import concrete_classes.VegBurger;
import concrete_classes.Coke;
import concrete_classes.ChickenBurger;
import concrete_classes.Pepsi;

public class MealBuilder {

    public Meal prepareVegMeal (){
       Meal meal = new Meal();
       meal.addItem(new VegBurger());
       meal.addItem(new Coke());
       return meal;
    }   
 
    public Meal prepareNonVegMeal (){
       Meal meal = new Meal();
       meal.addItem(new ChickenBurger());
       meal.addItem(new Pepsi());
       return meal;
    }
 }