package net.cgweb.tracksquared.database.journey;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface JourneyDao {
    @Query("SELECT * FROM Journey")
    List<Journey> getJourneys();

    @Insert(onConflict = REPLACE)
    Long insertJourney(Journey journey);

    @Delete
    void deleteJourney(Journey journey);
}
