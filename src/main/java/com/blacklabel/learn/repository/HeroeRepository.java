package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Heroe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface HeroeRepository extends JpaRepository<Heroe, Integer>, JpaSpecificationExecutor<Heroe> {

}