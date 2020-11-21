package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PlanetaRepository extends JpaRepository<Planeta, Integer>, JpaSpecificationExecutor<Planeta> {

}