package com.nrcr.nrcrbackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Data public class RaceDetailEntity {
    private String driverName;
    private Integer bestQualifyingLaps;
    private Float bestQualifyingTime;
    private Integer raceLaps;
    private Float raceTime;
    private List<String> raceLapTimes;

    public RaceDetailEntity(@JsonProperty("driverName") String driverName, @JsonProperty("bestQualifyingLaps") Integer bestQualifyingLaps, @JsonProperty("bestQualifyingTime") Float bestQualifyingTime, @JsonProperty("raceLaps") Integer raceLaps, @JsonProperty("raceTime") Float raceTime, @JsonProperty("raceLapTimes") List<String> raceLapTimes) {
        this.driverName = driverName;
        this.bestQualifyingLaps = bestQualifyingLaps;
        this.bestQualifyingTime = bestQualifyingTime;
        this.raceLaps = raceLaps;
        this.raceTime = raceTime;
        this.raceLapTimes = raceLapTimes;
    }
}