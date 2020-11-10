package com.codewithchang;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String year;
    private String color;
    private List<GasEngine> gasEngines = new ArrayList<>();
    private List<ElectricEngine> electricEngines = new ArrayList<>();

    public Car(String model, String year, String color) {
        this.model = model;
        this.year = year;
        this. color = color;
    }
}
