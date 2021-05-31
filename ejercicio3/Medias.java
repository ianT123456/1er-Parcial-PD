package ejercicio3;

public class Medias implements IProducto{
    public String tamano;
    public String color;
    public  String garantia;
    public String precio;
    public Medias(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public void crear() {
        System.out.println("********** Creando Medias *******");
        System.out.println("tamano: "+tamano);
        System.out.println("color: "+color);
        System.out.println("garantia: "+garantia);
        System.out.println("Precio: " + precio);
    }

}
