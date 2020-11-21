package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.HeroeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HeroeEntityRepository extends JpaRepository<HeroeEntity, Integer>, JpaSpecificationExecutor<HeroeEntity> {

}