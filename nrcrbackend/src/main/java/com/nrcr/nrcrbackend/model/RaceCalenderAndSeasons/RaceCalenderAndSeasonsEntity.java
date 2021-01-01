package com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "raceCalenderAndSeasons")

@Getter @Setter
@Data
public class RaceCalenderAndSeasonsEntity {
    @Id
    private String _id;
    private List<RCASResults> raceCalendarAndSeasons;


    public RaceCalenderAndSeasonsEntity(String _id, List<RCASResults> raceCalendarAndSeasons) {
        this._id = _id;
        this.raceCalendarAndSeasons = raceCalendarAndSeasons;
    }
}
