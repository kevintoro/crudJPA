package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.PlanetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlanetaEntityRepository extends JpaRepository<PlanetaEntity, Integer>, JpaSpecificationExecutor<PlanetaEntity> {

}