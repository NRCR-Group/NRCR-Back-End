package com.nrcr.nrcrbackend.dao;
import com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons.RaceCalenderAndSeasonsEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RaceCalenderAndSeasonsDAO extends MongoRepository<RaceCalenderAndSeasonsEntity, String> {

    RaceCalenderAndSeasonsEntity findBy_id(ObjectId _id);

}
