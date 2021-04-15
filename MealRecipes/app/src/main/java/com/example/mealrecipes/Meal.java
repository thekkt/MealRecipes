package com.example.mealrecipes;

public class Meal {
    String header, description, time, ingredients, method,kcal,servers;
    boolean favorite = false;
    int mealImage;


    public Meal(String header, String description, String time, String ingredients, String method, boolean favorite,String kcal, String servers, int mealImage) {
        this.header = header;
        this.description = description;
        this.time = time;
        this.ingredients = ingredients;
        this.method = method;
        this.favorite = favorite;
        this.kcal = kcal;
        this.servers = servers;
        this.mealImage = mealImage;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public String getTime() {
        return time;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getMethod() {
        return method;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public String getKcal() {
        return kcal;
    }

    public String getServers() {
        return servers;
    }

    public int getMealImage() {
        return mealImage;
    }
}
