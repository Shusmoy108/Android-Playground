package com.example.examproapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.examproapplication.databinding.FragmentHomeBinding;
import com.example.examproapplication.ui.donation.Donation;
import com.example.examproapplication.ui.donation.DontionCard;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        List<Donation> donations =new ArrayList<Donation>();
        donations.add(new Donation(
                "Zakat Fund",
                "32000",
                "250",
                70
        ));
        donations.add(new Donation(
                "Zakat Fund",
                "32000",
                "250",
                70
        ));
        donations.add(new Donation(
                "Masjid Operation",
                "35000",
                "450",
                90
        ));
        donations.add(new Donation(
                "Eid Event",
                "400",
                "50",
                20
        ));
        donations.add(new Donation(
                "Food For Homeless",
                "3500",
                "50",
                50
        ));
        donations.add(new Donation(
                "Shelter For Homeless",
                "350",
                "50",
                40
        ));

        // Create an instance of DonationCardView
        LinearLayout donationContainer = binding.donationContainer;

        for (int i = 1; i <= 5; i++) { // Example: Add 5 donation cards dynamically
            DontionCard donationCard = new DontionCard(requireContext());
            donationCard.setId(View.generateViewId()); // Generate unique ID dynamically
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            );
            donationCard.setDonationData(donations.get(i));
            params.setMargins(4, 4, 4, 16);
            donationCard.setLayoutParams(params);
            donationContainer.addView(donationCard);

        }

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}