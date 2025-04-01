package com.example.examproapplication.ui.time;



import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.examproapplication.R;

public class TimeCard extends LinearLayout {

    private TextView timeTitleTextView;
    private TextView timeStringTextView;

    public TimeCard(Context context) {
        super(context);
        init(context);
    }

    public TimeCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TimeCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        // Inflate the layout
        LayoutInflater.from(context).inflate(R.layout.time_card, this, true);

        // Bind views
        timeTitleTextView = findViewById(R.id.timeTitle);
        timeStringTextView = findViewById(R.id.timeString);
    }

    public void setTimeTitle(String title) {
        timeTitleTextView.setText(title);
    }

    public void setTimeString(String time) {
        timeStringTextView.setText(time);
    }
}
