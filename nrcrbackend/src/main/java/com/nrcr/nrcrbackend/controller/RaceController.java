package com.nrcr.nrcrbackend.controller;

import com.nrcr.nrcrbackend.entity.RaceEntity;
import com.nrcr.nrcrbackend.repository.RaceRepository;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
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
//    @RequestMapping(value = "/RaceDate", method = RequestMethod.GET)
//    public List<Races> getRaceByDate(@RequestParam("raceDate")
//                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate raceDate){
//        return repository.findByRaceDate(raceDate);
//    }
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
