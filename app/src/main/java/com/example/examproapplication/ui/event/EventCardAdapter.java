package com.example.examproapplication.ui.event;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examproapplication.R;

import java.util.List;

public class EventCardAdapter extends RecyclerView.Adapter<EventCardAdapter.EventViewHolder> {

    private Context context;
    private List<EventCard> eventList;

    public EventCardAdapter(Context context, List<EventCard> eventList) {
        this.context = context;
        this.eventList = eventList;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_event_card, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder holder, int position) {
        EventCard event = eventList.get(position);
       // holder.image.setImageResource(event.getImageResId());
        holder.day.setText(event.getDay());
        holder.time.setText(event.getTime());
        holder.title.setText(event.getTitle());
        holder.masjid.setText(event.getMasjidName());
        holder.going.setText(event.getGoingCount());
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView day, time, title, masjid, going;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.eventImage);
            day = itemView.findViewById(R.id.eventDay);
            time = itemView.findViewById(R.id.eventTime);
            title = itemView.findViewById(R.id.eventTitle);
            masjid = itemView.findViewById(R.id.masjidName);
            going = itemView.findViewById(R.id.goingCount);
        }
    }
}
