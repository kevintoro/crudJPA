package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tercero")
@Data
public class Tercero implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "codtercero", nullable = false)
  private String codtercero;

  @Column(name = "descripcion", nullable = false)
  private String descripcion;

}
