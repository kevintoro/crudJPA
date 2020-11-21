package co.blacklabel.learn.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "liquidacion")
@Data
public class Liquidacion implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "codmodelo", nullable = false)
  private Integer codmodelo;

  @Column(name = "codconcepto", nullable = false)
  private String codconcepto;

  @Column(name = "codempleado", nullable = false)
  private String codempleado;

  @Column(name = "numproceso", nullable = false)
  private Integer numproceso;

  @Column(name = "valor")
  private BigDecimal valor;

  @Column(name = "fecha")
  private Date fecha;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;

}
