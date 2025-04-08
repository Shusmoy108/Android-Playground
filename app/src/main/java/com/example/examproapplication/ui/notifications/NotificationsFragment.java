package com.example.examproapplication.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.examproapplication.databinding.FragmentNotificationsBinding;
import com.example.examproapplication.ui.donation.Donation;
import com.example.examproapplication.ui.event.EventCard;
import com.example.examproapplication.ui.event.EventCardAdapter;

import java.util.ArrayList;
import java.util.List;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NotificationsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        List<EventCard> cards = new ArrayList<>();
        cards.add(new EventCard(
                "https://example.com/quran.jpg",
                "Weekly Monday",
                "7:00 pm – 8:00 pm",
                "KHATAM UL QURAN - General Events - Frisco Masjid",
                "Frisco Masjid",
                "60 going"
        ));
        cards.add(new EventCard(
                "https://example.com/quran.jpg",
                "Weekly Monday",
                "7:00 pm – 8:00 pm",
                "KHATAM UL QURAN - General Events - Frisco Masjid",
                "Frisco Masjid",
                "60 going"
        ));
        cards.add(new EventCard(
                "https://example.com/quran.jpg",
                "Weekly Monday",
                "7:00 pm – 8:00 pm",
                "KHATAM UL QURAN - General Events - Frisco Masjid",
                "Frisco Masjid",
                "60 going"
        ));
        cards.add(new EventCard(
                "https://example.com/quran.jpg",
                "Weekly Monday",
                "7:00 pm – 8:00 pm",
                "KHATAM UL QURAN - General Events - Frisco Masjid",
                "Frisco Masjid",
                "60 going"
        )); cards.add(new EventCard(
                "https://example.com/quran.jpg",
                "Weekly Monday",
                "7:00 pm – 8:00 pm",
                "KHATAM UL QURAN - General Events - Frisco Masjid",
                "Frisco Masjid",
                "60 going"
        )); cards.add(new EventCard(
                "https://example.com/quran.jpg",
                "Weekly Monday",
                "7:00 pm – 8:00 pm",
                "KHATAM UL QURAN - General Events - Frisco Masjid",
                "Frisco Masjid",
                "60 going"
        ));
        RecyclerView recyclerView = binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        EventCardAdapter adapter = new EventCardAdapter(getContext(), cards);
        recyclerView.setAdapter(adapter);



//        final TextView textView = binding.textNotifications;
//        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}