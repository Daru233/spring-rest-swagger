package com.daru.springrest.response;

public class Food {

    String toppings;
    int rating;

    public Food(String toppings, int rating) {
        this.toppings = toppings;
        this.rating = rating;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
