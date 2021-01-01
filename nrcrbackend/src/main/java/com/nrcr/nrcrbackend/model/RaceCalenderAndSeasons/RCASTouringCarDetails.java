package com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class RCASTouringCarDetails {
    private String format;
    private String roundNo;

    public RCASTouringCarDetails(String format, String roundNo) {
        this.format = format;
        this.roundNo = roundNo;
    }
}
