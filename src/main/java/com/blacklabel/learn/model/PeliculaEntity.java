package com.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "pelicula")
@Data
public class PeliculaEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "anolanzamiento")
  private BigDecimal anolanzamiento;

  @Column(name = "anosecuencia")
  private BigDecimal anosecuencia;

  @Column(name = "clasificacion")
  private String clasificacion;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "sinopsis")
  private String sinopsis;

}
