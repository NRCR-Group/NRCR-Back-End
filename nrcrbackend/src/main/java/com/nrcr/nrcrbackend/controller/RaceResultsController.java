package com.nrcr.nrcrbackend.controller;
import com.nrcr.nrcrbackend.exception.ApiRequestException;
import com.nrcr.nrcrbackend.model.RaceResults.RaceResultsEntity;
import com.nrcr.nrcrbackend.service.RaceResultsService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
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

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<RaceResultsEntity> getAllRaces() {
        List<RaceResultsEntity> allRaces = resultsService.getAllRaces();
        if(allRaces == null) {
            throw new ApiRequestException("No Race Results found.");
        }
        return allRaces;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public RaceResultsEntity getRaceById(@PathVariable("id") ObjectId id) {
        RaceResultsEntity raceById = resultsService.getRaceById(id);
        if(raceById == null) {
            throw new ApiRequestException("Cannot find race with given ID.");
        }
        return raceById;
    }

    // Example usage: http://localhost:8080/race-date/2018-04-23
    @GetMapping
    @RequestMapping(value = "race-date/{raceDate}", method = RequestMethod.GET)
    public RaceResultsEntity getRaceByDate(@PathVariable("raceDate")
                                               @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate raceDate) {
        RaceResultsEntity raceByDate = resultsService.getRaceByDate(raceDate);
        if(raceByDate == null) {
           throw new ApiRequestException("Cannot find race with given Date.");
       }
        return raceByDate;
    }

    @PostMapping("create-race-entity/")
    public RaceResultsEntity newRaceEntity(@Valid @RequestBody RaceResultsEntity newRaceEntity)  {
       return resultsService.postNewRace(newRaceEntity);
    }

    @DeleteMapping("delete-race-entity/{id}")
    void deleteRaceEntity(@PathVariable ObjectId id) {
        String idString = id.toString();
        resultsService.deleteRace(idString);
    }

}
