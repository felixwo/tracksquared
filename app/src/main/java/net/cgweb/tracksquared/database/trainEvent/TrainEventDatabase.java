package net.cgweb.tracksquared.database.trainEvent;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {TrainEvent.class},version = 1)
public abstract class TrainEventDatabase extends RoomDatabase {
    public static final String TRAINEVENTDBNAME = "trainEventDBName";
    public abstract TrainEventDao trainEventDao();
}