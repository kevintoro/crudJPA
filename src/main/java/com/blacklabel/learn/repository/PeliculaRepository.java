package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>, JpaSpecificationExecutor<Pelicula> {

}