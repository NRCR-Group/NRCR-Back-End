package com.nrcr.nrcrbackend;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

public @Data
class RaceResultByDriver {
    @Field("driverName")
    public String driverName;
    @Field("bestQualifyingLaps")
    public Integer bestQualifyingLaps;
    @Field("bestQualifyingTime")
    public Float bestQualifyingTime;
    @Field("raceLaps")
    public Integer raceLaps;
    @Field("raceTime")
    public Float raceTime;
    @Field("raceLapTimes")
    public ArrayList<RaceResultsByDriverLapTimes> raceResultsByDriverLapTimes;
}