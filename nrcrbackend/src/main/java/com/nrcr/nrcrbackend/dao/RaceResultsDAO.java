package com.nrcr.nrcrbackend.dao;

import com.nrcr.nrcrbackend.model.raceresults.RaceResultsEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;

public interface RaceResultsDAO extends MongoRepository<RaceResultsEntity, String> {
    RaceResultsEntity findBy_id(ObjectId _id);
    RaceResultsEntity findByRaceDate(Date raceDate);

}
