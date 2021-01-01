package com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
@Setter
public class RCASResults {
    private LocalDate raceDate;
    private String raceSeason;
    private Integer raceSeasonYear;
    private Integer totalChampionshipWeeks;
    private Integer countedChampionshipWeeks;
    private RCASBuggyDetails buggyDetails;
    private RCASTouringCarDetails touringCarDetails;

    public RCASResults(LocalDate raceDate, String raceSeason, Integer raceSeasonYear, Integer totalChampionshipWeeks, Integer countedChampionshipWeeks, RCASBuggyDetails buggyDetails, RCASTouringCarDetails touringCarDetails) {
        this.raceDate = raceDate;
        this.raceSeason = raceSeason;
        this.raceSeasonYear = raceSeasonYear;
        this.totalChampionshipWeeks = totalChampionshipWeeks;
        this.countedChampionshipWeeks = countedChampionshipWeeks;
        this.buggyDetails = buggyDetails;
        this.touringCarDetails = touringCarDetails;
    }
}
