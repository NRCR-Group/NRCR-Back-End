package com.nrcr.nrcrbackend.model.RaceResults;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List; //Represents an ordered sequence of objects. 'List' is preferred to arraylist when an order is not given.

@Document(collection = "raceResults")

@Getter @Setter
public @Data class RaceResultsEntity {
    @Id
    private String _id;
    //@NotNull(message = "Date cannot be null")
    private LocalDate raceDate;
    //@NotBlank(message = "raceClass is mandatory") @NotNull(message = "raceClass cannot be null")
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
