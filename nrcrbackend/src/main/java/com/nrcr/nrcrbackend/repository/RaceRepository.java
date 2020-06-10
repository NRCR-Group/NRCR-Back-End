package com.nrcr.nrcrbackend.repository;

import com.nrcr.nrcrbackend.entity.RaceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import java.util.Date;

public interface RaceRepository extends MongoRepository<RaceEntity, String> {
    RaceEntity findBy_id(ObjectId _id);
    RaceEntity findByRaceDate(Date raceDate);
}