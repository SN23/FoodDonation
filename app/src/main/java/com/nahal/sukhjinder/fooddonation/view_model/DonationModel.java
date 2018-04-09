package com.nahal.sukhjinder.fooddonation.view_model;

import com.nahal.sukhjinder.fooddonation.model.Donation;

/**
 * Created by Sukhjinder on 3/19/18.
 */

public class DonationModel {

    private String donationStatus;
    private String foodDonation;
    private int foodPicture;
    private String donationDate;
    private boolean accepted;
    private Donation donation;

    public String getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    public String getFoodDonation() {
        return foodDonation;
    }

    public void setFoodDonation(String foodDonation) {
        this.foodDonation = foodDonation;
    }

    public int getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(int foodPicture) {
        this.foodPicture = foodPicture;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }
}
