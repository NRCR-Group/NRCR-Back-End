package com.nrcr.nrcrbackend.controller;

import com.nrcr.nrcrbackend.entity.RaceEntity;
import com.nrcr.nrcrbackend.repository.RaceRepository;
import org.bson.types.ObjectId;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/")
public class RaceController {
@Autowired
    private RaceRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<RaceEntity> getAllRace() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RaceEntity getRaceById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

//    @RequestMapping(value = "/Driver/{driverName}", method = RequestMethod.GET)
//    public List<Races> getRaceByDriverName(@PathVariable("driverName") String driverName) {
//        return repository.findByDriverName(driverName);
//    }
//

    // Example usage: http://localhost:8080/race-date/2018-04-23T00:00:00.000+00:00 or http://localhost:8080/race-date/2018-04-23
    @RequestMapping(value = "/race-date/{raceDate}", method = RequestMethod.GET)
    public RaceEntity getRaceByDate(@PathVariable("raceDate")
                                    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date raceDate){
        return repository.findByRaceDate(raceDate);
    }


//
//    @RequestMapping(value = "/Season", method = RequestMethod.GET)
//    public List<Races> getRaceBySeason(@RequestParam("season") String season){
//        return repository.findBySeason(season);
//        }
//
//    @RequestMapping(value = "/RaceDateBetween", method = RequestMethod.GET)
//    public List<Races> getRaceByDates(@RequestParam("startDate")
//                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
//                                      @RequestParam("endDate")
//                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){
//        return repository.findByRaceDateBetween(startDate.minusDays(1), endDate.plusDays(1));
}
