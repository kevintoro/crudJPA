package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, String>, JpaSpecificationExecutor<Clasificacion> {

}