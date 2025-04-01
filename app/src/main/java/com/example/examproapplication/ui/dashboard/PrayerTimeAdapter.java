package com.example.examproapplication.ui.dashboard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import com.example.examproapplication.R;


public class PrayerTimeAdapter extends RecyclerView.Adapter<PrayerTimeAdapter.ViewHolder> {
    private final List<PrayerTime> prayerTimes;

    public PrayerTimeAdapter(List<PrayerTime> prayerTimes) {
        this.prayerTimes = prayerTimes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_prayer_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PrayerTime prayerTime = prayerTimes.get(position);
        holder.prayerName.setText(prayerTime.getPrayerName());
        holder.adhanTime.setText(prayerTime.getAdhanTime());
        holder.iqamahTime.setText(prayerTime.getIqamahTime());

        // Hide divider for last item
        if (position == prayerTimes.size() - 1) {
            holder.rowDivider.setVisibility(View.GONE);
        } else {
            holder.rowDivider.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return prayerTimes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView prayerName, adhanTime, iqamahTime;
        View rowDivider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            prayerName = itemView.findViewById(R.id.prayerName);
            adhanTime = itemView.findViewById(R.id.adhanTime);
            iqamahTime = itemView.findViewById(R.id.iqamahTime);
            rowDivider = itemView.findViewById(R.id.rowDivider);
        }
    }
}
