package net.cgweb.tracksquared.database.journeyPart;

import net.cgweb.tracksquared.database.trainEvent.TrainEvent;

import java.util.ArrayList;

public class JourneyPart { //todo make database and converter
    private ArrayList<TrainEvent> trainEvents;

    public ArrayList<TrainEvent> getTrainEvents() {
        return trainEvents;
    }

    public void setTrainEvents(ArrayList<TrainEvent> trainEvents) {
        this.trainEvents = trainEvents;
    }
}
