package ejercicio3;

public class CreatorCamiseta extends CreatorProductos{
    @Override
    public Camiseta create() {
        Camiseta camiseta = new Camiseta();
        camiseta.setColor("Roja");
        camiseta.setGarantia("2 meses");
        camiseta.setTamano("M");
        camiseta.setPrecio("XXXXXX");
        return camiseta;
    }
}
