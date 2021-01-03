package com.nrcr.nrcrbackend.dao;

import com.nrcr.nrcrbackend.model.RaceResults.RaceResultsEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.Date;

public interface RaceResultsDAO extends MongoRepository<RaceResultsEntity, String> {
    RaceResultsEntity findBy_id(ObjectId _id);
    RaceResultsEntity findByRaceDate(LocalDate raceDate);

}
