package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "empleado")
@Data
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "codigo", nullable = false)
  private String codigo;

  @Column(name = "cedula")
  private String cedula;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "fechanacimiento")
  private Date fechanacimiento;

  @Column(name = "fechaingreso")
  private Date fechaingreso;

  @Column(name = "fecharetiro")
  private Date fecharetiro;

  @Override
  public String toString(){
    return codigo+" - "+cedula+" - "+nombre;
  }
}
