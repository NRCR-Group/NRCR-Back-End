package com.nrcr.nrcrbackend;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDate;
import java.util.ArrayList;

@Document(collection = "raceResults")

public @Data
class Races {

    @Id
    public String _id;
    @Field("raceDate")
    public LocalDate raceDate;
    @Field("raceClass")
    public String raceClass;
    @Field("raceName")
    public String raceName;
    @Field("raceLeg")
    public String raceLeg;
    @Field("raceResultbyDriver") //ToDo Fix by as should be By
    public ArrayList<RaceResultByDriver> raceResultByDriver;

    public Races() {
    }

}
