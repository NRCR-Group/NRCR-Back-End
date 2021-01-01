package com.nrcr.nrcrbackend.service;

import com.nrcr.nrcrbackend.dao.ChampionshipPositionDAO;
import com.nrcr.nrcrbackend.model.ChampionshipPosition.ChampionshipPositionEntity;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampionshipPositionService {
    private ChampionshipPositionDAO champPositionDao;

    @Autowired
    public ChampionshipPositionService(ChampionshipPositionDAO champPositionDao) {

        this.champPositionDao = champPositionDao;
    }

    public List<ChampionshipPositionEntity> getAllPositions() {

        return champPositionDao.findAll();
    }

    public ChampionshipPositionEntity getPositionsById(ObjectId _id) {

        return champPositionDao.findBy_id(_id);
    }

}
