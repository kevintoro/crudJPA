package com.blacklabel.learn.repository;

import com.blacklabel.learn.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EstadoRepository extends JpaRepository<Estado, String>, JpaSpecificationExecutor<Estado> {

}