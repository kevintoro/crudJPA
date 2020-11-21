package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.ParticipacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ParticipacionEntityRepository extends JpaRepository<ParticipacionEntity, Integer>, JpaSpecificationExecutor<ParticipacionEntity> {

}