package com.example.examproapplication.ui.eventcard;


public class Event {
    private String eventTitle;
    private String eventTimes;
    private String eventLocation;
    private String eventTag;

    public Event(String eventTitle, String eventTimes, String eventLocation, String eventTag) {
        this.eventTitle = eventTitle;
        this.eventTimes = eventTimes;
        this.eventLocation = eventLocation;
        this.eventTag=eventTag;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public String getEventTimes() {
        return eventTimes;
    }

    public String getEventLocation() {
        return eventLocation;
    }
    public String getEventTag() {
        return eventTag;
    }
}
