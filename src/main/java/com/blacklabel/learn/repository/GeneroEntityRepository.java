package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.GeneroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GeneroEntityRepository extends JpaRepository<GeneroEntity, String>, JpaSpecificationExecutor<GeneroEntity> {

}