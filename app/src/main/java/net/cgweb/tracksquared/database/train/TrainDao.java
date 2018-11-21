package net.cgweb.tracksquared.database.train;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface TrainDao {
    @Query("SELECT * FROM Train")
    List<Train> getTrains();

    @Insert(onConflict = REPLACE)
    Long insertTrain(Train Train);

    @Delete
    void deleteTrain(Train Train);
}
