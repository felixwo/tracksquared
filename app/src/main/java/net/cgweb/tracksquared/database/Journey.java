package net.cgweb.tracksquared.database;

public class Journey {
    private JourneyPart startPart;
    private JourneyPart endPart;
    private int duration; //minuten

    public JourneyPart getStartPart() {
        return startPart;
    }

    public void setStartPart(JourneyPart startPart) {
        this.startPart = startPart;
    }

    public JourneyPart getEndPart() {
        return endPart;
    }

    public void setEndPart(JourneyPart endPart) {
        this.endPart = endPart;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}