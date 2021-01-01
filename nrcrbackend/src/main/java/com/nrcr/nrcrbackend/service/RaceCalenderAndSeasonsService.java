package com.nrcr.nrcrbackend.service;

import com.nrcr.nrcrbackend.dao.RaceCalenderAndSeasonsDAO;
import com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons.RaceCalenderAndSeasonsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaceCalenderAndSeasonsService {
    private RaceCalenderAndSeasonsDAO RCASDao;

    @Autowired
    public RaceCalenderAndSeasonsService(RaceCalenderAndSeasonsDAO RCASDao) {
        this.RCASDao = RCASDao;
    }

    public List<RaceCalenderAndSeasonsEntity> getAllCalender() {

        return RCASDao.findAll();
    }

}
