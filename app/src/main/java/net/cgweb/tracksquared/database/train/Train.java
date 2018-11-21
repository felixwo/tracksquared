package net.cgweb.tracksquared.database.train;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Train {
    public static final int ICE = 0;
    public static final int IC = 1;
    public static final int RE = 2;
    public static final int RB = 3;
    public static final int S = 4;
    public static final int NE = 5;
    public static final int X = 6;

    @PrimaryKey
    private long TrainId;
    private String trainNumber;
    private int trainType;
    private double fillState; //wie voll der zug ist

    public Train() {}

    public Train(long trainId, String trainNumber, int trainType, double fillState) {
        TrainId = trainId;
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.fillState = fillState;
    }

    public int getTrainType() {
        return trainType;
    }

    public void setTrainType(int trainType) {
        this.trainType = trainType;
    }

    public long getTrainId() {
        return TrainId;
    }

    public void setTrainId(long trainId) {
        TrainId = trainId;
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
