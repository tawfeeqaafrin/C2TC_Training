package com.okta.placement.MongoDbOAuth.controller;

import com.okta.placement.MongoDbOAuth.entity.Placement;
import com.okta.placement.MongoDbOAuth.service.PlacementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @PostMapping
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.addPlacement(placement);
    }

    }


