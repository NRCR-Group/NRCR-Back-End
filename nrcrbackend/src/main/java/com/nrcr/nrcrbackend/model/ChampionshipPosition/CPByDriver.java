package com.nrcr.nrcrbackend.model.ChampionshipPosition;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class CPByDriver {
    private String driverName;
    private Integer clubNo;
    private Integer rankFromLastSeason;
    private Integer currChampionshipPosition;
    private Integer currChampionshipPointsTotal;
    private List<Integer> pointsByRound;

    public CPByDriver(String driverName, Integer clubNo, Integer rankFromLastSeason, Integer currChampionshipPosition, Integer currChampionshipPointsTotal, List<Integer> pointsByRound ) {
        this.driverName = driverName;
        this.clubNo = clubNo;
        this.rankFromLastSeason = rankFromLastSeason;
        this.currChampionshipPosition = currChampionshipPosition;
        this.currChampionshipPointsTotal = currChampionshipPointsTotal;
        this.pointsByRound = pointsByRound;
    }

}
