package net.cgweb.tracksquared.database.journey;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Journey.class},version = 1)
public abstract class JourneyDatabase extends RoomDatabase {
    public static final String JOURNEYDBNAME = "journeyDBName";
    public abstract JourneyDao journeyDao();
}
