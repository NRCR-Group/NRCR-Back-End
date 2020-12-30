package com.nrcr.nrcrbackend.model.raceresults;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter @Setter
public class ResultByDriver {
    private String driverName;
    private Integer bestQualifyingLaps;
    private Float bestQualifyingTime;
    private Integer raceLaps;
    private Float raceTime;
    private List<String> raceLapTimes;

    public ResultByDriver(@JsonProperty("driverName") String driverName, @JsonProperty("bestQualifyingLaps") Integer bestQualifyingLaps, @JsonProperty("bestQualifyingTime") Float bestQualifyingTime, @JsonProperty("raceLaps") Integer raceLaps, @JsonProperty("raceTime") Float raceTime, @JsonProperty("raceLapTimes") List<String> raceLapTimes) {
        this.driverName = driverName;
        this.bestQualifyingLaps = bestQualifyingLaps;
        this.bestQualifyingTime = bestQualifyingTime;
        this.raceLaps = raceLaps;
        this.raceTime = raceTime;
        this.raceLapTimes = raceLapTimes;
    }
}
