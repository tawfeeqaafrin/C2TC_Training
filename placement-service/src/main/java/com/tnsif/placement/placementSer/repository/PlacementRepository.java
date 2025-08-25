package com.okta.placement.MongoDbOAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.okta.placement.MongoDbOAuth.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {
}

