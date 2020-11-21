package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@Table(name = "proceso")
public class Proceso implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;

  @Column(name = "descripcion")
  private String descripcion;

  @Column(name = "fechainicio")
  private Date fechainicio;

  @Column(name = "fechafin")
  private Date fechafin;

}
