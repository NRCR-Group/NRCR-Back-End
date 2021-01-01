package com.nrcr.nrcrbackend.model.ChampionshipPosition;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "championshipPosition")

@Getter @Setter
public class ChampionshipPositionEntity {

    @Id
    private String _id;
    private LocalDate seasonStartDate;
    private LocalDate seasonEndDate;
    private String raceSeason;
    private String raceClass;
    private String totalChampionshipWeeks;
    private String countedChampionshipWeeks;
    private List<CPByDriver> championshipPointsbyDriver;

    public ChampionshipPositionEntity(String _id, LocalDate seasonStartDate, LocalDate seasonEndDate, String raceSeason, String raceClass, String totalChampionshipWeeks, String countedChampionshipWeeks, List<CPByDriver> championshipPointsbyDriver ) {
        this._id = _id;
        this.seasonStartDate = seasonStartDate;
        this.seasonEndDate = seasonEndDate;
        this.raceSeason = raceSeason;
        this.raceClass = raceClass;
        this.totalChampionshipWeeks = totalChampionshipWeeks;
        this.countedChampionshipWeeks = countedChampionshipWeeks;
        this.championshipPointsbyDriver = championshipPointsbyDriver;
    }

}