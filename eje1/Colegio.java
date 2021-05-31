package eje1;

public class Colegio {
    private String nombreColegio;

    public Colegio(){}

    public Colegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public void Matricularse(Estudiante estudiante, int pagoMatricula){
        Ventanilla.getInstance().anhadirEstudiante(estudiante,pagoMatricula);
    }

    public void consultarListaEstudiantes(Joven joven){
        if (joven.getCargo().equals("nnnn")){
            Ventanilla.getInstance().consultaDatos();
        }else{
            System.out.println("Sin permisos");
        }
    }
}
