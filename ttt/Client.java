package ttt;

public class Client {
    public static void main(String [] args){
        Colegio utasawa = new Colegio();

        utasawa.Matricularse(new Estudiante("Martin","0000"),100 );

        utasawa.Matricularse(new Estudiante("nicolas","6666"),200 );

        utasawa.Matricularse(new Estudiante("Tilin","999"),300 );

        utasawa.Matricularse(new Estudiante("anuel","5555"),400 );

        utasawa.consultarListaEstudiantes(new Joven("anuel","5555","nnnn"));
    }
}
