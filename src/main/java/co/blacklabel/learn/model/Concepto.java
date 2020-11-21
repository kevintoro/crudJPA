package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "concepto")
@Data
public class Concepto implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "codconcepto", nullable = false)
  private String codconcepto;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "tipo")
  private Integer tipo;

  @Column(name = "codtercero")
  private String codtercero;

}
