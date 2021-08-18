package org.launchcode.Secretrestaurantreview.models;


import javax.persistence.Entity;

@Entity
public class Review extends org.launchcode.Secretrestaurantreview.models.AbstractEntity {

    private String restaurantName;

    public Review (String restaurantName){
        this.restaurantName = restaurantName;
    }

    public Review (){}


    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}