package controllers;

import java.util.TreeSet;
import models.Empleado;

public interface EmpleadoDAO {
    void add(Empleado empleado);

    void remove(int id);

    void list();
}