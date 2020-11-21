package com.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "clasificacion")
public class ClasificacionEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "descripcion")
  private String descripcion;

  @Id
  @Column(name = "id", nullable = false)
  private String id;

}
