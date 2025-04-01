package com.example.examproapplication.ui.donation;

public class Donation {

    private String eventName;
    private String donationAmount;
    private String numberOfDonors;
    private int progressPercentage;

    public Donation(String eventName, String donationAmount, String numberOfDonors, int progressPercentage) {
        this.eventName = eventName;
        this.donationAmount = donationAmount;
        this.numberOfDonors = numberOfDonors;
        this.progressPercentage = progressPercentage;
    }

    // Getter and Setter methods
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(String donationAmount) {
        this.donationAmount = donationAmount;
    }

    public String getNumberOfDonors() {
        return numberOfDonors;
    }

    public void setNumberOfDonors(String numberOfDonors) {
        this.numberOfDonors = numberOfDonors;
    }

    public int getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }
}
