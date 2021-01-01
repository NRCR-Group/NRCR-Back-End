package com.nrcr.nrcrbackend.controller;

import com.nrcr.nrcrbackend.model.RaceCalenderAndSeasons.RaceCalenderAndSeasonsEntity;
import com.nrcr.nrcrbackend.service.RaceCalenderAndSeasonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/calender-and-seasons/")
@RestController
public class RaceCalenderAndSeasonsController {

    @Autowired
    private final RaceCalenderAndSeasonsService calenderService;

    public RaceCalenderAndSeasonsController(RaceCalenderAndSeasonsService calenderService) {
        this.calenderService = calenderService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<RaceCalenderAndSeasonsEntity> AllCalender() {
        return calenderService.getAllCalender();
    }
}
