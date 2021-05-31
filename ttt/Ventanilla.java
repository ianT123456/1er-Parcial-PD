package ttt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Ventanilla {
    private static Ventanilla instance = null;

    private Map<String, Estudiante> Estudianmap = new HashMap<>();
    private Map<String, String> estudianMap = new HashMap<>();
    private Map<String, Integer> pagoEstudiante = new HashMap<>();
    private int amount = 0;

    private Ventanilla() {
    }

    private synchronized static void makeInstance() {
        if (instance == null)
            instance = new Ventanilla();
    }

    public static Ventanilla getInstance() {
        if (instance == null)
            makeInstance();

        return instance;
    }

    public void anhadirEstudiante(Estudiante estudiante, int pagoMatricula) {
        if (!Estudianmap.containsKey(estudiante.getId())) {
            Estudianmap.put(estudiante.getId(), estudiante);
            estudianMap.put(estudiante.getId(), new Date().toString());
            pagoEstudiante.put(estudiante.getId(), pagoMatricula);
            amount = amount + pagoMatricula;
            System.out.println("Matriculando ...");
            System.out.println("Datos " + estudiante.getId() + "\n" + estudiante.getNombre() + "\n" + pagoMatricula);
        } else {
            System.out.println("Posee Matricula");
            System.out.println("Declined" + estudiante.getId() + "\n" + estudiante.getNombre() + "\n" + pagoMatricula);

        }

    }

    public void consultaDatos() {
        for (String key : Estudianmap.keySet()
        ) {
            System.out.println(" CI:" + Estudianmap.get(key).getId());
            System.out.println(" Nombre:" + Estudianmap.get(key).getId());
            System.out.println(" Matricula " + pagoEstudiante.get(key));
            System.out.println(" Tiempo " + estudianMap.get(key));
        }

        System.out.println("  Total Recaudado " + amount);
    }


}
