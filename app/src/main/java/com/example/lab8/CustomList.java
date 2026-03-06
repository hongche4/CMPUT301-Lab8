package com.example.lab8;

import java.util.ArrayList;

public class CustomList {
    private ArrayList<City> cities;

    public CustomList() {
        cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public boolean hasCity(City city) {
        return cities.contains(city);
    }
}