package com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RCASBuggyDetails {
    private String format;
    private String roundNo;

    public RCASBuggyDetails(String format, String roundNo) {
        this.format = format;
        this.roundNo = roundNo;
    }
}
