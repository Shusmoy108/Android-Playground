package com.example.examproapplication.ui.masjidcard;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.examproapplication.R;


public class MasjidCard extends LinearLayout {

    private TextView openingHours;
    private TextView contactUs;
    private Button changeMosqueBtn;

    public MasjidCard(Context context) {
        super(context);
        init(context);
    }

    public MasjidCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public MasjidCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.masjid_card, this, true);

        openingHours = findViewById(R.id.openingHours);
        contactUs = findViewById(R.id.contactUs);
        changeMosqueBtn = findViewById(R.id.changeMosqueBtn);

        openingHours.setOnClickListener(v ->
                Toast.makeText(context, "Opening Hours clicked", Toast.LENGTH_SHORT).show()
        );

        contactUs.setOnClickListener(v ->
                Toast.makeText(context, "Contact Us clicked", Toast.LENGTH_SHORT).show()
        );

        changeMosqueBtn.setOnClickListener(v ->
                Toast.makeText(context, "Change Mosque clicked", Toast.LENGTH_SHORT).show()
        );
    }
}
