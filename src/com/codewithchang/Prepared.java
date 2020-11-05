package com.codewithchang;

public class Prepared extends Meal{
    private boolean pack;
    private int calories;

    public Prepared(boolean vegetarian, String protein, String mealName, boolean isHot, boolean pack, int calories) {
        super(vegetarian, protein, mealName, isHot);
        this.pack = pack;
        this.calories = calories;

    }
}
