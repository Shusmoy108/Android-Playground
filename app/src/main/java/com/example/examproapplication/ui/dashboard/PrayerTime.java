package com.example.examproapplication.ui.dashboard;


public class PrayerTime {
    private final String name;
    private final String adhanTime;
    private final String iqamahTime;

    public PrayerTime(String name, String adhanTime, String iqamahTime) {
        this.name = name;
        this.adhanTime = adhanTime;
        this.iqamahTime = iqamahTime;
    }

    public String getPrayerName() {
        return name;
    }

    public String getAdhanTime() {
        return adhanTime;
    }

    public String getIqamahTime() {
        return iqamahTime;
    }
}

