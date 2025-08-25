package com.okta.placement.MongoDbOAuth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okta.placement.MongoDbOAuth.entity.Placement;
import com.okta.placement.MongoDbOAuth.repository.PlacementRepository;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository placementRepository;

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }
}
