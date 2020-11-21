package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface GeneroRepository extends JpaRepository<Genero, String>, JpaSpecificationExecutor<Genero> {

}