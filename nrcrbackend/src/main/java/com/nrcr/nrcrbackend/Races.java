package com.nrcr.nrcrbackend;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;


@Document(collection = "A_Collection")
public @Data class Races {

    @Id
    public String _id;
    @Field("Driver Name")
    public String driverName;
    @Field("Race Date")
    public LocalDate raceDate;
    @Field("Qual Result Laps")
    public String qualifyingResultLap;
    @Field("Qual Result Time")
    public String qualifyingResultTime;
    @Field("Race Results Time")
    public String raceResultTime;
    @Field("Round or Leg")
    public String roundOrLeg;
    @Field("Race Lap Time")
    public String raceLapTime;
    @Field("Race Lap Number")
    public String raceLapNumber;

    public Races() {
    }

}
