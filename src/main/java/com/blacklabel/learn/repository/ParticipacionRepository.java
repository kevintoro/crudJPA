package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Participacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ParticipacionRepository extends JpaRepository<Participacion, Integer>, JpaSpecificationExecutor<Participacion> {

}