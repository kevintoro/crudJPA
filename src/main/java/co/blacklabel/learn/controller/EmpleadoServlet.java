package co.blacklabel.learn.controller;

import co.blacklabel.learn.dao.EmpleadoDAO;
import co.blacklabel.learn.model.Empleado;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "EmpleadoServlet", urlPatterns = {"/"})
public class EmpleadoServlet extends HttpServlet {

  private final EmpleadoDAO empleadoDAO;
  public EmpleadoServlet() {
    super();
    empleadoDAO = new EmpleadoDAO();
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
    doGet(request, response);
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
    String action = request.getServletPath();
    try {
      switch (action){
        case "/new":
          showNewForm(request, response);
          break;
        case "/insert":
          insertEmpleado(request, response);
          break;
        case "/delete":
          deleteEmpleado(request, response);
          break;
        case "/edit":
          showEditForm(request, response);
          break;
        case "/update":
          updateEmpleado(request, response);
          break;
        case "/search":
          searchEmpleado(request, response);
          break;
        default:
          listEmpleados(request, response);
          break;
      }
    } catch (IOException e) {
      throw new ServletException(e);
    }
  }

  private void listEmpleados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Empleado> empleados = empleadoDAO.list();
    request.setAttribute("empleados", empleados);
    RequestDispatcher rd = request.getRequestDispatcher("empleado-list.jsp");
    rd.forward(request, response);
  }

  private void searchEmpleado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String codigo = request.getParameter("codigo");
    Empleado empleado = empleadoDAO.find(codigo);
    request.setAttribute("empleado", empleado);
    RequestDispatcher rd = request.getRequestDispatcher("empleado.jsp");
    rd.forward(request, response);
  }

  private void updateEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String codigo = request.getParameter("codigo");
    Empleado empleado = empleadoDAO.find(codigo);
    empleado.setCedula(request.getParameter("cedula"));
    empleado.setNombre(request.getParameter("nombre"));
    empleado.setCodigo(request.getParameter("codigo"));
    Date fechaNac=Date.valueOf(request.getParameter("fechaNacimiento"));
    empleado.setFechanacimiento(fechaNac);
    Date fechaIng=Date.valueOf(request.getParameter("fechaIngreso"));
    empleado.setFechaingreso(fechaIng);
    Date fechaRet=Date.valueOf(request.getParameter("fechaRetiro"));
    empleado.setFecharetiro(fechaRet);
    empleadoDAO.update(empleado);
    response.sendRedirect("list");
  }

  private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String codigo = request.getParameter("codigo");
    Empleado empleado = empleadoDAO.find(codigo);
    request.setAttribute("empleado", empleado);
    RequestDispatcher rd = request.getRequestDispatcher("empleado-form.jsp");
    rd.forward(request, response);
  }

  private void deleteEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String codigo = request.getParameter("codigo");
    Empleado empleado = empleadoDAO.find(codigo);
    empleadoDAO.delete(empleado);
    response.sendRedirect("list");
  }

  private void insertEmpleado(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Empleado empleado = new Empleado();
    empleado.setCedula(request.getParameter("cedula"));
    empleado.setNombre(request.getParameter("nombre"));
    empleado.setFechaingreso(Date.valueOf(request.getParameter("fechaIngreso")));
    empleado.setFechanacimiento(Date.valueOf(request.getParameter("fechaNacimiento")));
    empleado.setFecharetiro(Date.valueOf(request.getParameter("fechaRetiro")));
    empleado.setCodigo(request.getParameter("codigo"));
    empleadoDAO.insert(empleado);
    response.sendRedirect("list");
  }

  private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher rd = request.getRequestDispatcher("empleado-form.jsp");
    rd.forward(request, response);
  }
}
