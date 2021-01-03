package com.nrcr.nrcrbackend.service;
import com.nrcr.nrcrbackend.dao.RaceResultsDAO;
import com.nrcr.nrcrbackend.model.RaceResults.RaceResultsEntity;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class RaceResultsService {
    private RaceResultsDAO raceResultsDao;

    @Autowired
    public RaceResultsService(RaceResultsDAO raceResultsDao) {

        this.raceResultsDao = raceResultsDao;
    }

    public List<RaceResultsEntity> getAllRaces() {

        return raceResultsDao.findAll();
    }

    public RaceResultsEntity getRaceById(ObjectId _id) {

        return raceResultsDao.findBy_id(_id);
    }

    public RaceResultsEntity getRaceByDate(LocalDate raceDate) {

        return raceResultsDao.findByRaceDate(raceDate);
    }

    public RaceResultsEntity postNewRace(RaceResultsEntity newRace) {

        return raceResultsDao.insert(newRace);
    }

    public void deleteRace(String _id) {

        raceResultsDao.deleteById(_id);
    }

}
