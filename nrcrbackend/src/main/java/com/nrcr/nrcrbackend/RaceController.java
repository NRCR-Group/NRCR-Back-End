package com.nrcr.nrcrbackend;


import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
