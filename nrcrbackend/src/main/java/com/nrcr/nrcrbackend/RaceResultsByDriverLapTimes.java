package com.nrcr.nrcrbackend;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

public @Data
class RaceResultsByDriverLapTimes {
    @Field("raceLapTimes")
    public ArrayList<RaceResultsByDriverLapTimes> raceResultsByDriverLapTimes;
    //public String[] raceLapTimes;
    //ToDo validate array if length = 0?
}
