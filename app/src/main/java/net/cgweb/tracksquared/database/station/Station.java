package net.cgweb.tracksquared.database.station;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Station {
    @PrimaryKey
    private long stationId;
    private String stationName;
    private String stationCode;

    public Station(long stationId, String stationName, String stationCode) {
        this.stationId = stationId;
        this.stationName = stationName;
        this.stationCode = stationCode;
    }

    public long getStationId() {
        return stationId;
    }

    public void setStationId(long stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }
}
