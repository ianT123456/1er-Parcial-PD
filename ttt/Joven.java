package ttt;

public class Joven {
    private String nombre;
    private String id;
    private String cargo;

    public  Joven() {}
    public Joven(String nombre, String id,String cargo){
        this.nombre=nombre;
        this.id=id;
        this.cargo=cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}


