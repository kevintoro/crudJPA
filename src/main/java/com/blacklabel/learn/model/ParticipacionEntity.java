package com.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "participacion")
public class ParticipacionEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "idheroe", nullable = false)
  private Integer idheroe;

  @Id
  @Column(name = "idpelicula", nullable = false)
  private Integer idpelicula;

}
