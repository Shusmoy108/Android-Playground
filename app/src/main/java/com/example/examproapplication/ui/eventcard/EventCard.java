package com.example.examproapplication.ui.eventcard;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.examproapplication.R;

public class EventCard extends LinearLayout {
    private TextView eventTitle, eventTimes, eventLocation,eventTag;

    public EventCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.event_card, this, true);
        eventTitle = findViewById(R.id.eventTitle);
        eventTimes = findViewById(R.id.eventTimes);
        eventLocation = findViewById(R.id.eventLocation);
        eventTag = findViewById(R.id.eventTag);
    }

    public void setEventData(Event eidEvent) {
        eventTitle.setText(eidEvent.getEventTitle());
        eventTimes.setText(eidEvent.getEventTimes());
        eventLocation.setText(eidEvent.getEventLocation());
        eventTag.setText(eidEvent.getEventTag());
    }
}
