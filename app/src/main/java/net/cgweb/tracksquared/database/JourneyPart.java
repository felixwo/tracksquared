package net.cgweb.tracksquared.database;

import java.util.ArrayList;

public class JourneyPart {
    private ArrayList<TrainEvent> trainEvents;

    public ArrayList<TrainEvent> getTrainEvents() {
        return trainEvents;
    }

    public void setTrainEvents(ArrayList<TrainEvent> trainEvents) {
        this.trainEvents = trainEvents;
    }
}
