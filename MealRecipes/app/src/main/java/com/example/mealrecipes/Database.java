package com.example.mealrecipes;

import android.content.Context;

import java.util.ArrayList;

public class Database {
   static ArrayList<Meal> meals = new ArrayList<>();
   static ArrayList<Meal> mealsFavorite = new ArrayList<>();
   static Context contextMain;
   static boolean maybe= true;

    public static ArrayList<Meal> getMealsFavorite() {
        return mealsFavorite;
    }

    public static void addMealFavorite(Meal meal) {
        mealsFavorite.add(meal);
    }

    public static void setContext(Context context) {
        Database.contextMain = context;
    }

    public static Context getContext() {
        return contextMain;
    }

    public Database(ArrayList<Meal> meals) {
        Database.meals = meals;
    }

    public static void addMeal(Meal meal) {
        meals.add(meal);
    }

    public static ArrayList<Meal> getMeals() {
        return meals;
    }
}
