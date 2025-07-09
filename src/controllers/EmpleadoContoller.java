package controllers;
import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller() {
        this.empleadoDAO = new EmpleadoDAOTreeMap();
    }

    public void add(Empleado empleado) {
        empleadoDAO.add(empleado);
    }

    public Empleado obtenerEmpleado(int id) {
        return null;
    }

    public void actualizarEmpleado(Empleado empleado) {
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }

    public void listarEmpleados() {
        empleadoDAO.list();
    }
}
