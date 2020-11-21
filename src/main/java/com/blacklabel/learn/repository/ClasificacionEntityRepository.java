package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.ClasificacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClasificacionEntityRepository extends JpaRepository<ClasificacionEntity, String>, JpaSpecificationExecutor<ClasificacionEntity> {

}