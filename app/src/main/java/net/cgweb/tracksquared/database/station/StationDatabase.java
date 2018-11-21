package net.cgweb.tracksquared.database.station;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import net.cgweb.tracksquared.database.journey.JourneyDao;

@Database(entities = {Station.class},version = 1)
public abstract class StationDatabase extends RoomDatabase {
    public static final String STATIONDBNAME = "stationDBName";
    public abstract StationDao stationDao();
}
