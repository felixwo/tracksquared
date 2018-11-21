package net.cgweb.tracksquared.database.train;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Train {
    public enum TrainType {ICE, IC, RE, RB, S, NE, X}; //x = nicht zuordorbar

    @PrimaryKey
    private long TrainId;
    private String trainNumber;
    private TrainType trainType;
    private double fillState; //wie voll der zug ist

    public Train(long trainId, String trainNumber, TrainType trainType, double fillState) {
        TrainId = trainId;
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.fillState = fillState;
    }

    public long getTrainId() {
        return TrainId;
    }

    public void setTrainId(long trainId) {
        TrainId = trainId;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getFillState() {
        return fillState;
    }

    public void setFillState(double fillState) {
        this.fillState = fillState;
    }
}
