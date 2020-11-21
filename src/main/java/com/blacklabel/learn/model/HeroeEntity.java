package com.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "heroe")
public class HeroeEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "arma")
  private String arma;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "estado")
  private String estado;

  @Column(name = "fechaaparicion")
  private LocalDate fechaaparicion;

  @Column(name = "fechanacimiento")
  private LocalDate fechanacimiento;

  @Column(name = "genero")
  private String genero;

  @Column(name = "heroe")
  private String heroe;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "nombre")
  private String nombre;

}
