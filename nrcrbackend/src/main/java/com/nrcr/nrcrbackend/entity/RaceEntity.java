package com.nrcr.nrcrbackend.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "A_Collection")

public @Data class RaceEntity {
    @Id
    private String _id;
    private LocalDate raceDate;
    private String raceClass;
    private String raceName;
    private String raceLeg;
    private List<RaceDetailEntity> raceResultbyDriver;

    public RaceEntity() {
    }

}
