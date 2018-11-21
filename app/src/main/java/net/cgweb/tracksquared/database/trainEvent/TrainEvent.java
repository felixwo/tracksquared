package net.cgweb.tracksquared.database.trainEvent;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.IdRes;
import net.cgweb.tracksquared.database.station.Station;

@Entity
public class TrainEvent { //enter or leave a train
    @PrimaryKey
    private long trainEventId;
    private long stationId;
    @Ignore
    private Station station;
    //convert to calendar to use it
    private long time; //time of entering or leaving the train
    private long scheduledTime;

    public TrainEvent(long trainEventId, long stationId, long time, long scheduledTime) {
        this.trainEventId = trainEventId;
        this.stationId = stationId;
        this.time = time;
        this.scheduledTime = scheduledTime;
    }

    public long getTrainEventId() {
        return trainEventId;
    }

    public void setTrainEventId(long trainEventId) {
        this.trainEventId = trainEventId;
    }

    public long getStationId() {
        return stationId;
    }

    public void setStationId(long stationId) {
        this.stationId = stationId;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(long scheduledTime) {
        this.scheduledTime = scheduledTime;
    }
}
