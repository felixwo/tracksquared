package net.cgweb.tracksquared.database;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import net.cgweb.tracksquared.database.journey.JourneyDatabase;
import net.cgweb.tracksquared.database.station.Station;
import net.cgweb.tracksquared.database.station.StationDatabase;
import net.cgweb.tracksquared.database.train.TrainDao;
import net.cgweb.tracksquared.database.train.TrainDatabase;
import net.cgweb.tracksquared.frontend.ConfigureActivity;

import java.util.ArrayList;

public class DatabaseCreator {
    public static JourneyDatabase getJourneyDB(Context context){
        return Room.databaseBuilder(context,JourneyDatabase.class,JourneyDatabase.JOURNEYDBNAME).build();
    }

    public static StationDatabase getStationDB(Context context){
        return Room.databaseBuilder(context, StationDatabase.class, StationDatabase.STATIONDBNAME).build();
    }

    public static TrainDatabase getTrainDB(Context context){
        return Room.databaseBuilder(context,TrainDatabase.class,TrainDatabase.TRAINDBNAME).build();
    }
}
