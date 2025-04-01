package com.example.examproapplication.ui.prayertimetable;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examproapplication.R;
import com.example.examproapplication.ui.dashboard.PrayerTime;
import com.example.examproapplication.ui.dashboard.PrayerTimeAdapter;

import java.util.ArrayList;
import java.util.List;

public class JumuaTimeTable extends LinearLayout {
    private RecyclerView recyclerView;
    private PrayerTimeAdapter adapter;

    public JumuaTimeTable(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.prayer_time_table, this, true);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        final TextView titleView = findViewById(R.id.title);
        titleView.setText("Jamat");

        final TextView column1View = findViewById(R.id.column1);
        column1View.setText("Adhan");

        final TextView column2View = findViewById(R.id.column2);
        column2View.setText("Khutba");
        List<PrayerTime> prayerTimes = new ArrayList<>();
        prayerTimes.add(new PrayerTime("1st", "6:00 AM", "6:30 AM"));
        prayerTimes.add(new PrayerTime("2nd", "12:30 PM", "1:30 PM"));
        prayerTimes.add(new PrayerTime("3rd", "4:00 PM", "4:30 PM"));

        adapter = new PrayerTimeAdapter(prayerTimes);
        recyclerView.setAdapter(adapter);
    }
}
