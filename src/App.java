import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        runMapExamlpe();
        runEmpleadoExample();
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {

    EmpleadoContoller controller = new EmpleadoContoller();

    controller.add(new Empleado(3, "Pedro"));
    controller.add(new Empleado(1, "Juan"));
    controller.add(new Empleado(2, "Pedro"));
    controller.add(new Empleado(5, "Pedro"));
    controller.add(new Empleado(4, "Luis"));

    System.out.println("Empleados ordenados por ID:");
    controller.listarEmpleados();
}


    }

