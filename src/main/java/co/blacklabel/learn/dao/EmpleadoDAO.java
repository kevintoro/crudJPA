package co.blacklabel.learn.dao;

import co.blacklabel.learn.model.Empleado;
import co.blacklabel.learn.util.ConnectionDB;

public class EmpleadoDAO extends ConnectionDB<Empleado> implements GenericDAO<Empleado>{

  public EmpleadoDAO() {
    super(Empleado.class);
  }

  /**
  public static void main(String[] args){
    EmpleadoDAO empleadoDao = new EmpleadoDAO();
    System.out.print(empleadoDao.list().get(0).getNombre());
  }
   */
}