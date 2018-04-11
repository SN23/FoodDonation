package com.nahal.sukhjinder.fooddonation.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Sukhjinder on 3/19/18.
 */

public class Donation implements Parcelable {

    private String donationStatus;
    private String foodDescription;
    private int foodPicture;
    private String pickupDate;
    private String pickupTime;

    public Donation() {

    }

    public String getDonationStatus() {
        return donationStatus;
    }

    public void setDonationStatus(String donationStatus) {
        this.donationStatus = donationStatus;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodPicture() {
        return foodPicture;
    }

    public void setFoodPicture(int foodPicture) {
        this.foodPicture = foodPicture;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    protected Donation(Parcel in) {
        donationStatus = in.readString();
        foodDescription = in.readString();
        foodPicture = in.readInt();
        pickupDate = in.readString();
        pickupTime = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(donationStatus);
        dest.writeString(foodDescription);
        dest.writeInt(foodPicture);
        dest.writeString(pickupDate);
        dest.writeString(pickupTime);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Donation> CREATOR = new Parcelable.Creator<Donation>() {
        @Override
        public Donation createFromParcel(Parcel in) {
            return new Donation(in);
        }

        @Override
        public Donation[] newArray(int size) {
            return new Donation[size];
        }
    };
}