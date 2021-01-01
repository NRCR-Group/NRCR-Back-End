package com.nrcr.nrcrbackend.dao;

import com.nrcr.nrcrbackend.model.ChampionshipPosition.ChampionshipPositionEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChampionshipPositionDAO extends MongoRepository<ChampionshipPositionEntity, String> {

    ChampionshipPositionEntity findBy_id(ObjectId _id);
}
