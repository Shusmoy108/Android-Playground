package com.example.examproapplication.ui.donation;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

import com.example.examproapplication.R;

public class DontionCard extends LinearLayout {
    private TextView donationTitle;
    private TextView donationAmount;
    private TextView donationPeople;
    private ProgressBar progressBar;

    public DontionCard(Context context) {
        super(context);
        init(context);
    }
    public DontionCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        // Inflate the custom layout
        LayoutInflater.from(context).inflate(R.layout.donation_card, this, true);

        // Initialize the views
        donationTitle = findViewById(R.id.donationTitle);
        donationAmount = findViewById(R.id.donationAmount);
        donationPeople = findViewById(R.id.donationPeople);
        progressBar = findViewById(R.id.progressBar);
    }

    // Method to set the donation data dynamically using the Donation model
    public void setDonationData(Donation donation) {
        donationTitle.setText(donation.getEventName());
        donationAmount.setText("USD " + donation.getDonationAmount()+" raised of USD 30,000");
        donationPeople.setText(donation.getNumberOfDonors()+" people donated");
        progressBar.setProgress(donation.getProgressPercentage());
    }
}
