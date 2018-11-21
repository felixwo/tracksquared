package net.cgweb.tracksquared.database.trainEvent;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface TrainEventDao {
    @Query("SELECT * FROM TrainEvent")
    List<TrainEvent> getTrainEvents();

    @Insert(onConflict = REPLACE)
    Long insertTrainEvent(TrainEvent TrainEvent);

    @Delete
    void deleteTrainEvent(TrainEvent TrainEvent);
}
