package com.example.examproapplication.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examproapplication.databinding.FragmentDashboardBinding;
import com.example.examproapplication.ui.eventcard.Event;
import com.example.examproapplication.ui.eventcard.EventCard;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        EventCard eidEventCard = binding.eidEventCard;

        // Create sample Eid event data
        Event event = new Event("Eid-ul Fitr", "8:00 AM, 10:00 AM, 11:30 AM", "Plano, TX 75074", "Ongoing");
        eidEventCard.setEventData(event);

        final TextView prayerTitle = binding.prayerTitle;
        prayerTitle.setText("Prayer Time");
        final TextView jumuaTitle = binding.jumuaTitle;
        jumuaTitle.setText("Jumua Time");
//        RecyclerView recyclerView =binding.recyclerView;
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//        final TextView titleView = binding.title;
//        titleView.setText("Prayer");
//
//        final TextView column1View = binding.column1;
//        column1View.setText("Adhan");
//
//        final TextView column2View = binding.column2;
//        column2View.setText("Iqamah");
//
//        List<PrayerTime> prayerTimes = new ArrayList<>();
//        prayerTimes.add(new PrayerTime("Prayer", "Adhan", "Iqamah"));
//        prayerTimes.add(new PrayerTime("Fajr", "6:00 AM", "6:30 AM"));
//        prayerTimes.add(new PrayerTime("Dhuhr", "12:30 PM", "1:30 PM"));
//        prayerTimes.add(new PrayerTime("Asr", "4:00 PM", "4:30 PM"));
//        prayerTimes.add(new PrayerTime("Maghrib", "6:00 PM", "6:10 PM"));
//        prayerTimes.add(new PrayerTime("Isha", "8:00 PM", "8:30 PM"));
//
//        PrayerTimeAdapter adapter = new PrayerTimeAdapter(prayerTimes);
//        //recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
//
//        recyclerView.setAdapter(adapter);

        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}