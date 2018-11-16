package net.cgweb.tracksquared.database;

public class TrainEvent { //enter or leave a train
    private Station station;
    //convert to calendar to use it
    private long time; //time of entering or leaving the train
    private long scheduledTime;

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
