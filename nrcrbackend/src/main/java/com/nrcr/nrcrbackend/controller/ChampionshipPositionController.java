package com.nrcr.nrcrbackend.controller;

import com.nrcr.nrcrbackend.model.ChampionshipPosition.ChampionshipPositionEntity;
import com.nrcr.nrcrbackend.service.ChampionshipPositionService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/championship-position/")
@RestController
public class ChampionshipPositionController {
    @Autowired
    private final ChampionshipPositionService positionService;

    public ChampionshipPositionController(ChampionshipPositionService positionService) {
        this.positionService = positionService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ChampionshipPositionEntity> AllPositions() {
        return positionService.getAllPositions();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public ChampionshipPositionEntity getPositionById(@PathVariable("id") ObjectId id) {
        return positionService.getPositionsById(id);
    }
}
