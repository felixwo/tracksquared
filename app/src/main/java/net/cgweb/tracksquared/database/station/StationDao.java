package net.cgweb.tracksquared.database.station;

import android.arch.persistence.room.*;
import net.cgweb.tracksquared.database.journey.Journey;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface StationDao {
    @Query("SELECT * FROM Station")
    List<Station> getJourneys();

    @Insert(onConflict = REPLACE)
    Long insertStation(Station station);

    @Delete
    void deleteStation(Station station);
}
