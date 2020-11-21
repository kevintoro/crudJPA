package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.UbicacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UbicacionEntityRepository extends JpaRepository<UbicacionEntity, Integer>, JpaSpecificationExecutor<UbicacionEntity> {

}