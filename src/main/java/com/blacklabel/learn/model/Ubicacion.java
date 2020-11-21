package com.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ubicacion")
@Data
public class Ubicacion implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "idpelicula", nullable = false)
  private Integer idpelicula;

  @Id
  @Column(name = "idplaneta", nullable = false)
  private Integer idplaneta;

}
