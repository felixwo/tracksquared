package net.cgweb.tracksquared.database.train;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import net.cgweb.tracksquared.database.station.StationDao;

@Database(entities = {Train.class},version = 1)
public abstract class TrainDatabase extends RoomDatabase {
    public static final String TRAINDBNAME = "trainDBName";
    public abstract TrainDao trainDao();
}
