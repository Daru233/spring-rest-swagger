package com.daru.springrest.response;

public class ResponseJson {

    String food;
    int rating;

    public ResponseJson(String food, int rating) {
        this.food = food;
        this.rating = rating;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
