package com.nrcr.nrcrbackend;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "test")
public class Races {

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

    public Races(String _id, String driverName, LocalDate raceDate) {
        this._id = _id;
        this.driverName = driverName;
        this.raceDate = raceDate;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public LocalDate getRaceDate() {
        return raceDate;
    }

    public void setRaceDate(LocalDate raceDate) {
        this.raceDate = raceDate;
    }

    public String getQualifyingResultLap() {
        return qualifyingResultLap;
    }

    public void setQualifyingResultLap(String qualifyingResultLap) {
        this.qualifyingResultLap = qualifyingResultLap;
    }

    public String getQualifyingResultTime() {
        return qualifyingResultTime;
    }

    public void setQualifyingResultTime(String qualifyingResultTime) {
        this.qualifyingResultTime = qualifyingResultTime;
    }

    public String getRaceResultTime() {
        return raceResultTime;
    }

    public void setRaceResultTime(String raceResultTime) {
        this.raceResultTime = raceResultTime;
    }

    public String getRoundOrLeg() {
        return roundOrLeg;
    }

    public void setRoundOrLeg(String roundOrLeg) {
        this.roundOrLeg = roundOrLeg;
    }

    public String getRaceLapTime() {
        return raceLapTime;
    }

    public void setRaceLapTime(String raceLapTime) {
        this.raceLapTime = raceLapTime;
    }

    public String getRaceLapNumber() {
        return raceLapNumber;
    }

    public void setRaceLapNumber(String raceLapNumber) {
        this.raceLapNumber = raceLapNumber;
    }
}