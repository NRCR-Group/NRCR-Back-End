package com.nrcr.nrcrbackend.entity;

import lombok.Data;

import java.util.List;

//Do we even use this?
@Data public class RaceDetailEntity {
    private String driverName;
    private Integer bestQualifyingLaps;
    private Float bestQualifyingTime;
    private Integer raceLaps;
    private Float raceTime;
    private List<String> raceLapTimes;
}