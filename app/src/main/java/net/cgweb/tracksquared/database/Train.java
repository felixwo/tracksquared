package net.cgweb.tracksquared.database;

public class Train {
    public enum TrainType {ICE, IC, RE, RB, S, NE, X}; //x = nicht zuordorbar

    private String trainNumber;
    private TrainType trainType;
    private double fillState; //wie voll der zug ist

    public Train(String trainNumber, TrainType trainType, double fillState) {
        this.trainNumber = trainNumber;
        this.trainType = trainType;
        this.fillState = fillState;
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
