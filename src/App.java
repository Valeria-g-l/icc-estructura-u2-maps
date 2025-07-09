import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        runMapExamlpe();
        runEmpleadoExample();
        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHashMap = new controllers.EmpleadoDAOHashMap();
        EmpleadoDAO empleadoDAOTreeMap = new controllers.EmpleadoDAOTreeMap();

        EmpleadoContoller empleadoController1 = new EmpleadoContoller(empleadoDAOHashMap);
        EmpleadoContoller empleadoController2 = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoController1.addEmpleado(emp1);
        empleadoController1.addEmpleado(emp2);
        empleadoController1.addEmpleado(emp3);
        empleadoController1.addEmpleado(emp4);
        empleadoController1.addEmpleado(emp5);

        System.out.println("Empleados en HashMap:");
        empleadoController1.listarEmpleados();

        empleadoController2.addEmpleado(emp1);
        empleadoController2.addEmpleado(emp2);
        empleadoController2.addEmpleado(emp3);
        empleadoController2.addEmpleado(emp4);
        empleadoController2.addEmpleado(emp5);

        System.out.println(" Empleados en TreeMap:");
        empleadoController2.listarEmpleados();
    }

    private static void runMapExamlpe() {
        System.out.println(" Ejemplo de Map (placeholder, por completar si tienes clase Mapa)");
    }

    private static void runEjerccios() {
        Ejercicios ejercicios = new Ejercicios();

        System.out.println(" Ejercicios de lógica:");

        
        System.out.println("¿'listen' y 'silent' son anagramas? " +
                Ejercicios.areAnagrams("listen", "silent"));

        System.out.println("¿'hello' y 'bello' son anagramas? " +
                Ejercicios.areAnagrams("hello", "bello"));

        System.out.println("¿'roma' y 'amor' son anagramas? " +
                ejercicios.sonAnagramas("roma", "amor"));

        System.out.println("¿'cielo' y 'lecio' son anagramas? " +
                ejercicios.sonAnagramas("cielo", "lecio"));

        
        int[] resultadoA = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 5);
        if (resultadoA != null) {
            System.out.println("✔ Índices para objetivo 5: [" + resultadoA[0] + ", " + resultadoA[1] + "]");
        } else {
            System.out.println("✖ No hay suma que dé 5");
        }

        int[] resultadoB = ejercicios.sumatoriaDeDos(new int[]{9, 2, 3, 6}, 10);
        if (resultadoB != null) {
            System.out.println("✔ Índices para objetivo 10: [" + resultadoB[0] + ", " + resultadoB[1] + "]");
        } else {
            System.out.println("✖ No hay suma que de 10");
        }

        
        System.out.print(" Frecuencia de caracteres en 'hola': ");
        ejercicios.contarCaracteres("hola");
    }
}
