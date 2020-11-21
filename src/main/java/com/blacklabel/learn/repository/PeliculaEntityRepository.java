package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PeliculaEntityRepository extends JpaRepository<PeliculaEntity, Integer>, JpaSpecificationExecutor<PeliculaEntity> {

}