package com.codewithchang;

public class Meal {
    private boolean vegetarian;
    private String protein;
    private String mealName;
    private boolean isHot;

    public Meal(boolean vegetarian, String protein, String mealName, boolean isHot) {
        this.vegetarian = vegetarian;
        this.protein = protein;
        this.mealName = mealName;
        this.isHot = isHot;
    }
}
