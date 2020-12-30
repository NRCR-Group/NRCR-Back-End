package com.nrcr.nrcrbackend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDate;
import java.util.ArrayList;
//Represents an ordered sequence of objects. Linked is preferred to arraylist when an order is not given (Linkedlist)
import java.util.List;

@Document(collection = "raceResults")

@Getter @Setter
public @Data class RaceEntity {
    @Id
    private ObjectId _id;
    private LocalDate raceDate;
    private String raceClass;
    private String raceName;
    private String raceLeg;
    private List<RaceDetailEntity> raceResultbyDriver;

    public RaceEntity(@JsonProperty("_id") ObjectId _id, @JsonProperty("raceDate") LocalDate raceDate, @JsonProperty("raceClass") String raceClass, @JsonProperty("raceName") String raceName, @JsonProperty("raceLeg") String raceLeg, @JsonProperty("raceResultbyDriver") List<RaceDetailEntity> raceResultbyDriver) {
        this._id = _id;
        this.raceDate = raceDate;
        this.raceClass = raceClass;
        this.raceName = raceName;
        this.raceLeg = raceLeg;
        this.raceResultbyDriver = raceResultbyDriver;
    }

}
