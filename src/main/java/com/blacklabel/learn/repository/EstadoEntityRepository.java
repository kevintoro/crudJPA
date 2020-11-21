package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.EstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoEntityRepository extends JpaRepository<EstadoEntity, String>, JpaSpecificationExecutor<EstadoEntity> {

}