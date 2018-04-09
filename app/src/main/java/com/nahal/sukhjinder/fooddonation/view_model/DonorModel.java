package com.nahal.sukhjinder.fooddonation.view_model;

/**
 * Created by Sukhjinder on 3/20/18.
 */

public class DonorModel {

    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private String donorType;
    private String cuisineType;
    private int numOfDonations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public int getNumOfDonations() {
        return numOfDonations;
    }

    public void setNumOfDonations(int numOfDonations) {
        this.numOfDonations = numOfDonations;
    }
}
