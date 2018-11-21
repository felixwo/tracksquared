package net.cgweb.tracksquared.database.journey;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import net.cgweb.tracksquared.database.journeyPart.JourneyPart;

@Entity
public class Journey {
    @PrimaryKey
    private long id;
    private long startJourneyPartId;
    private long endJourneyPartId;
    @Ignore
    private JourneyPart startPart;
    @Ignore
    private JourneyPart endPart;
    private int duration; //minuten

    public Journey(long id, long startJourneyPartId, long endJourneyPartId, int duration) {
        this.id = id;
        this.startJourneyPartId = startJourneyPartId;
        this.endJourneyPartId = endJourneyPartId;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getStartJourneyPartId() {
        return startJourneyPartId;
    }

    public void setStartJourneyPartId(long startJourneyPartId) {
        this.startJourneyPartId = startJourneyPartId;
    }

    public long getEndJourneyPartId() {
        return endJourneyPartId;
    }

    public void setEndJourneyPartId(long endJourneyPartId) {
        this.endJourneyPartId = endJourneyPartId;
    }

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