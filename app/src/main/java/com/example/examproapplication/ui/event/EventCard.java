package com.example.examproapplication.ui.event;

public class EventCard {
    private String imageResId;
    private String day;
    private String time;
    private String title;
    private String masjidName;
    private String goingCount;

    public EventCard(String imageResId, String day, String time, String title, String masjidName, String goingCount) {
        this.imageResId = imageResId;
        this.day = day;
        this.time = time;
        this.title = title;
        this.masjidName = masjidName;
        this.goingCount = goingCount;
    }

    public String getImageResId() { return imageResId; }
    public String getDay() { return day; }
    public String getTime() { return time; }
    public String getTitle() { return title; }
    public String getMasjidName() { return masjidName; }
    public String getGoingCount() { return goingCount; }
}
