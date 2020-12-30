package com.nrcr.nrcrbackend.controller;
import com.nrcr.nrcrbackend.model.raceresults.RaceResultsEntity;
import com.nrcr.nrcrbackend.service.RaceResultsService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RequestMapping("/")
@RestController
public class RaceResultsController {

    @Autowired
    private final RaceResultsService resultsService;

    public RaceResultsController(RaceResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<RaceResultsEntity> getAllRaces() {
        return resultsService.getAllRaces();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public RaceResultsEntity getRaceById(@PathVariable("id") ObjectId id) {
        return resultsService.getRaceById(id);
    }

    // Example usage: http://localhost:8080/race-date/2018-04-23T00:00:00.000+00:00 or http://localhost:8080/race-date/2018-04-23
    @GetMapping
    @RequestMapping(value = "/race-date/{raceDate}", method = RequestMethod.GET)
    public RaceResultsEntity getRaceByDate(@PathVariable("raceDate")
                                    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date raceDate){
        return resultsService.getRaceByDate(raceDate);
    }

    @PostMapping("/create-race-entity/")
    public RaceResultsEntity newRaceEntity(@RequestBody RaceResultsEntity newRaceEntity) {
        return resultsService.postNewRace(newRaceEntity);
    }

    @DeleteMapping("/delete-race-entity/{id}")
    void deleteRaceEntity(@PathVariable ObjectId id) {
        String idString = id.toString();
        resultsService.deleteRace(idString);
    }

}
