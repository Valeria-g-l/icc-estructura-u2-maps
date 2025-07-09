package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {

    private Map<Empleado, Empleado> empleados = new TreeMap<>();

    public EmpleadoDAOTreeMap() {}

    public EmpleadoDAOTreeMap(Map<Empleado, Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void list() {
        for (Empleado empleado : empleados.keySet()) {
            System.out.println(empleado);
        }
    }

    @Override
    public void remove(int id) {
        empleados.remove(new Empleado(id));
    }
}
