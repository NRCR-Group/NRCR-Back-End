package com.nrcr.nrcrbackend.model.RaceResults;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.List; //Represents an ordered sequence of objects. 'List' is preferred to arraylist when an order is not given.

@Document(collection = "raceResults")

@Getter @Setter
public @Data class RaceResultsEntity {
    @Id
    private String _id;
    private LocalDate raceDate;
    private String raceClass;
    private String raceName;
    private String raceLeg;
    private List<RRByDriver> raceResultbyDriver;

    public RaceResultsEntity(@JsonProperty("_id") String _id, @JsonProperty("raceDate") LocalDate raceDate, @JsonProperty("raceClass") String raceClass, @JsonProperty("raceName") String raceName, @JsonProperty("raceLeg") String raceLeg, @JsonProperty("raceResultbyDriver") List<RRByDriver> raceResultbyDriver) {
        this._id = _id;
        this.raceDate = raceDate;
        this.raceClass = raceClass;
        this.raceName = raceName;
        this.raceLeg = raceLeg;
        this.raceResultbyDriver = raceResultbyDriver;
    }
}
