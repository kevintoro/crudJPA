package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Ubicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UbicacionRepository extends JpaRepository<Ubicacion, Integer>, JpaSpecificationExecutor<Ubicacion> {

}