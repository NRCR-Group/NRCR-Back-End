package com.nrcr.nrcrbackend;

import lombok.Data;

public @Data
class RaceResultsByDriverLapTimes {
    public String[] lapTimes;
    //ToDo validate array if length = 0?
}
