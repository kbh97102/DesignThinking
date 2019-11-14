package com.example.designthinkingprototype;

public class FoodInfo {

    private int food_iamge;
    private String food_name;
    private String food_cost;

    public FoodInfo(int food_iamge, String food_name, String food_cost) {
        this.food_iamge = food_iamge;
        this.food_name = food_name;
        this.food_cost = food_cost;
    }

    public int getFood_iamge() {
        return food_iamge;
    }

    public void setFood_iamge(int food_iamge) {
        this.food_iamge = food_iamge;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_cost() {
        return food_cost;
    }

    public void setFood_cost(String food_cost) {
        this.food_cost = food_cost;
    }
}
