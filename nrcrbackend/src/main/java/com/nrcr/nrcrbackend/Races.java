package com.nrcr.nrcrbackend;

import com.fasterxml.jackson.databind.JsonSerializable;
import org.springframework.data.annotation.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Document(collection = "A_Collection")
public class Races {

    @Id
    public ObjectId _id;
    @Field("Driver Name")
    public String driverName;
    @Field("Race Date")
    public LocalDate raceDate;

    public Races() {}

    public Races(ObjectId _id, String driverName){
        this._id = _id;
        this.driverName = driverName;
        this.raceDate = raceDate;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
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
}