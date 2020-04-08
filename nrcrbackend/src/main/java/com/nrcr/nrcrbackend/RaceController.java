package com.nrcr.nrcrbackend;

import org.bson.types.ObjectId;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/")
public class RaceController {
@Autowired
    private RaceRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Races> getAllRace() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Races getRaceById(@PathVariable("id") ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/Driver/{driverName}", method = RequestMethod.GET)
    public List<Races> getRaceByDriverName(@PathVariable("driverName") String driverName) {
        return repository.findByDriverName(driverName);
    }

    @RequestMapping(value = "/Season", method = RequestMethod.GET)
    public List<Races> getRaceBySeason(@RequestParam("raceDate")
                                      @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate raceDate){
        return repository.findByRaceDate(raceDate);
    }

}
